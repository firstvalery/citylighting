package ru.smartsarov.citylighting;
//For convenience, always static import your generated tables and jOOQ functions to decrease verbosity:
import static ru.smartsarov.citylighting.sprut.tables.ObjControl.*;
import static ru.smartsarov.citylighting.sprut.tables.Usk.*;
import static ru.smartsarov.citylighting.sprut.tables.GuardPinCurr.*;
import static ru.smartsarov.citylighting.sprut.tables.GuardPin.*;
import static ru.smartsarov.citylighting.sprut.tables.Adress.*;
import static ru.smartsarov.citylighting.sprut.tables.Home.*;
import static ru.smartsarov.citylighting.sprut.tables.Street.*;
import static ru.smartsarov.citylighting.sprut.tables.StreetType.*;
import static ru.smartsarov.citylighting.sprut.tables.GprsCurr.*;
import static ru.smartsarov.citylighting.sprut.tables.GuardPinNetsost.*;
import static ru.smartsarov.citylighting.sprut.tables.Cnt.*;
import static ru.smartsarov.citylighting.sprut.tables.CntMrccurrvalue.*;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

import org.jooq.*;
import org.jooq.JSONFormat.RecordFormat;
import org.jooq.impl.*;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;



public class SprutExchange {
	/**
	* Static Get Connection method.
	* Returns Connection conn. 
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	*/
	private static Connection getConnection() throws ClassNotFoundException, SQLException  {
        String url = "jdbc:firebirdsql:"+"//"+ 
        			Props.get().getProperty("citylighting.bd_servername", "127.0.0.1") +":"+
        				Props.get().getProperty("citylighting.bd_port", "3050") + "/"+
        					Props.get().getProperty("citylighting.bd_path", "C:/firenet.db");
        
        Class.forName("org.firebirdsql.jdbc.FBDriver");
               
        Connection conn = DriverManager.getConnection(url, Props.get());
        conn.setAutoCommit(false);
        
        return conn;
	}
	
	
	
	/**
	 * Common method for UPDATE OR INSERT into OBJ_CONTROL table. 
	 * Provides the USK-Device control by cmd.
	 * Returns number of updated or inserted records.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	
	
	public static String updateOrInsertObjControl(int usk_id, int usk_type, int cmd, int cmd_type, String userComment) throws ClassNotFoundException, SQLException {
		 try (Connection conn = getConnection()) {
	         DSLContext create = DSL.using(conn, SQLDialect.FIREBIRD_2_5);
	            
	         int rs = create.update(OBJ_CONTROL)
	            		.set(OBJ_CONTROL.OBJ_ID, usk_id)
	            			.set(OBJ_CONTROL.OBJ_TYPE, usk_type)
	            				.set(OBJ_CONTROL.OBJ_ACTION, cmd)
	            					.set(OBJ_CONTROL.OBJ_ACTION_TYPE, cmd_type)
	            						.set(OBJ_CONTROL.OBJ_PARAM_INT, 0)
	            							.set(OBJ_CONTROL.OBJ_PARAM_DOUBLE, 0D)
	            								.set(OBJ_CONTROL.OBJ_PARAM_STR, "")
	            									.set(OBJ_CONTROL.OBJ_SYNC, 0)
	            										.set(OBJ_CONTROL.OBJ_COMMENT_USER, userComment)
	            											.set(OBJ_CONTROL.OBJ_COMMENT_DATETIME,  new Timestamp(System.currentTimeMillis()))
	            												.set(OBJ_CONTROL.OBJ_COMMENT_IP,"")
	            													.set(OBJ_CONTROL.OBJ_ACTION_STATE,0)
	            														.set(OBJ_CONTROL.OBJ_ACTION_PROGRESS,0)
													            			.where(OBJ_CONTROL.OBJ_ACTION.eq(cmd))
													            				.and(OBJ_CONTROL.OBJ_ID.eq(usk_id))
													            					.and(OBJ_CONTROL.OBJ_TYPE.eq(usk_type))
													            						.execute();
													            
	         if (rs==0) {
	        	 rs = create.insertInto(OBJ_CONTROL)
		         		.set(OBJ_CONTROL.OBJ_ID, usk_id)
		         			.set(OBJ_CONTROL.OBJ_TYPE, usk_type)
		         				.set(OBJ_CONTROL.OBJ_ACTION, cmd)
		         					.set(OBJ_CONTROL.OBJ_ACTION_TYPE, cmd_type)
		         						.set(OBJ_CONTROL.OBJ_PARAM_INT, 0)
		         							.set(OBJ_CONTROL.OBJ_PARAM_DOUBLE, 0D)
		         								.set(OBJ_CONTROL.OBJ_PARAM_STR, "")
		         									.set(OBJ_CONTROL.OBJ_SYNC, 0)
		         										.set(OBJ_CONTROL.OBJ_COMMENT_USER, userComment)
		         											.set(OBJ_CONTROL.OBJ_COMMENT_DATETIME,  new Timestamp(System.currentTimeMillis()))
		         												.set(OBJ_CONTROL.OBJ_COMMENT_IP,"")
		         													.set(OBJ_CONTROL.OBJ_ACTION_STATE,0)
		         														.set(OBJ_CONTROL.OBJ_ACTION_PROGRESS,0)
		         															.execute();
	         }	         
	            conn.commit();     
	            return "{\"message\":\"The command was send\"}";
	        } 
	}
	
	/**
	 * Shows registered devices in Sprut System
	 * Returns json
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public static String showDevices() throws ClassNotFoundException, SQLException  {
		try (Connection conn = getConnection()) {
	         DSLContext create = DSL.using(conn, SQLDialect.FIREBIRD_2_5);
	         

	          Result<Record8<Integer,Integer,String,String,String,String,Timestamp,String>> result  = create
	             .select(USK.USK_ID.as("device_id"), USK.USK_UID.as("device_uid"), USK.USK_IP.as("device_ip"), HOME.HOME_NUMBER.as("building_num"), STREET.STRT_NAME.as("street_name"), 
	        		  		STREET_TYPE.STREETT_SNAME.as("street_type"), GPRS_CURR.GPRS_CTIME.as("gprs_last_timestamp"), GUARD_PIN_NETSOST.GRDPN_NAME.as("link_state"))
	        		  .from(USK)
	        		  	.leftJoin(ADRESS).on(ADRESS.ADR_ID.eq(USK.USK_ADR_ID))
	        		  		.leftJoin(HOME).on(HOME.HOME_ID.eq(ADRESS.ADR_HOME_ID))
	        		  			.leftJoin(STREET).on(STREET.STRT_ID.eq(HOME.HOME_STRT_ID))
	        		  				.leftJoin(STREET_TYPE).on(STREET_TYPE.STREETT_ID.eq(STREET.STRT_TYPE))
	        		  					.leftJoin(GPRS_CURR).on(GPRS_CURR.GPRS_USK_ID.eq(USK.USK_ID))
	        		  						.leftJoin(GUARD_PIN).on(GUARD_PIN.GPIN_UNK_ID.eq(USK.USK_ID))
	        		  							.leftJoin(GUARD_PIN_CURR).on(GUARD_PIN_CURR.GPCR_PIN_ID.eq(GUARD_PIN.GPIN_ID))
	        		  								.leftJoin(GUARD_PIN_NETSOST).on(GUARD_PIN_NETSOST.GRDPN_ID.eq(GUARD_PIN_CURR.GPCR_STATE))
	        		  									.where(GUARD_PIN.GPIN_ENTRY.eq(1))
	        		  										.fetch();
	         
	         return result.formatJSON(new JSONFormat().header(false).recordFormat(RecordFormat.OBJECT));
		}
	}
	
	
	/**
	 * Shows electrical parameters for the device
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public static String showElectricParams(int device_id) throws ClassNotFoundException, SQLException{
	try (Connection conn = getConnection()) {
        DSLContext create = DSL.using(conn, SQLDialect.FIREBIRD_2_5);
        

         Result<Record17<Integer,Integer,String,Double,Double,Double,Double,Double,Double,Double,Double,Double,Double,Double,Double,Double,Timestamp>> result  = create
            .select(CNT.CNT_UNK_ID.as("device_id"),
            		CNT.CNT_ID.as("cntr_id"),
            		CNT.CNT_NAME.as("cntr_nm"), 
            		CNT_MRCCURRVALUE.CNTMCV_AP.as("act_nrgy"), 
            		CNT_MRCCURRVALUE.CNTMCV_RP.as("react_nrgy"),
            		CNT_MRCCURRVALUE.CNTMCV_P.as("pwr"), 
            		CNT_MRCCURRVALUE.CNTMCV_PA.as("pwr_a"),
            		CNT_MRCCURRVALUE.CNTMCV_PB.as("pwr_b"),
            		CNT_MRCCURRVALUE.CNTMCV_PC.as("pwr_c"), 
            		CNT_MRCCURRVALUE.CNTMCV_VA.as("vltg_a"),
            		CNT_MRCCURRVALUE.CNTMCV_VB.as("vltg_b"),
            		CNT_MRCCURRVALUE.CNTMCV_VC.as("vltg_c"), 
            		CNT_MRCCURRVALUE.CNTMCV_IA.as("crr_a"),
            		CNT_MRCCURRVALUE.CNTMCV_IB.as("crr_b"),
            		CNT_MRCCURRVALUE.CNTMCV_IC.as("crr_c"), 
            		CNT_MRCCURRVALUE.CNTMCV_COS_FI.as("cos_ph"), 
            		CNT_MRCCURRVALUE.CNTMCV_DATE.as("cnt_tm")) 
            			.from(CNT)
            				.leftJoin(CNT_MRCCURRVALUE).on(CNT_MRCCURRVALUE.CNTMCV_CID.eq(CNT.CNT_ID))
            					.where(CNT.CNT_UNK_ID.eq(device_id))
       		  						.fetch();
         
        
        return result.formatJSON(new JSONFormat().header(false).recordFormat(RecordFormat.OBJECT));
	}
}
	

	/**
	 * Shows device state.
	 * Returns json
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public static String showStateById(int device_id) throws ClassNotFoundException, SQLException  {
		try (Connection conn = getConnection()) {
	         DSLContext create = DSL.using(conn, SQLDialect.FIREBIRD_2_5);
	         
	         Result<Record2<Integer,Integer>> records = create
	        		 .select(GUARD_PIN.GPIN_ENTRY, GUARD_PIN_CURR.GPCR_DVALUE)
					    .from(GUARD_PIN_CURR)	
					       .join(GUARD_PIN).on(GUARD_PIN.GPIN_ID.eq(GUARD_PIN_CURR.GPCR_PIN_ID))

		        			//BETWEEN(this statement)	
					        	.where(GUARD_PIN_CURR.GPCR_PIN_ID
					        		.between(create.select(GUARD_PIN.GPIN_ID)
					        		 	 .from(GUARD_PIN)					 							  
					        		 		.where(GUARD_PIN.GPIN_ENTRY.eq(1)								  
					        		 			.and(GUARD_PIN.GPIN_UNK_ID.eq(device_id)))//                  
					        		 				.fetchAny()
					        		 					.value1())
					        								//AND (this statement)
					        		 						.and(create.select(GUARD_PIN.GPIN_ID)
					        		 							.from(GUARD_PIN)
					        		 								.where(GUARD_PIN.GPIN_ENTRY.eq(12)
					        		 									.and(GUARD_PIN.GPIN_UNK_ID.eq(device_id)))
					        		 										.fetchAny()
					        		 											.value1()))//end of BETWEEN								
					        		 												.fetch();
	         
	         Gson gs = new Gson();
	         Map<Integer, Integer> retMap = gs.fromJson(
	        		 records.formatJSON(new JSONFormat().header(false).recordFormat(RecordFormat.ARRAY)),
	        		 	new TypeToken<HashMap<Integer, Integer>>() {}.getType());  
    																			
	         UspdState u = new UspdState();
	         if (!records.isEmpty()) {
	        	 u.setDevice_id(device_id);
	        	 u.setPh_a(retMap.get(1)==0);
	        	 u.setPh_b(retMap.get(2)==0);
	        	 u.setPh_c(retMap.get(3)==0);
	        	 u.setRelay1(retMap.get(8)==0);
	        	 u.setRelay2(retMap.get(12)==0);
	         }
	        
	         return gs.toJson(u);
		}
		catch(NullPointerException e) {
			return "{}";
		}
	}
	
	

	

	
}
