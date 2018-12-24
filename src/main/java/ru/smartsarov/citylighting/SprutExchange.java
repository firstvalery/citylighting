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
import static ru.smartsarov.citylighting.sprut.tables.UskCoor.*;
import static ru.smartsarov.citylighting.sprut.tables.LightLine.*;
import static ru.smartsarov.citylighting.sprut.tables.Cntv.*;
import static ru.smartsarov.citylighting.sprut.tables.CntLstate.*;
import static ru.smartsarov.citylighting.sprut.tables.LightBlock.*;
import static ru.smartsarov.citylighting.sprut.tables.GetGuardPinLastEventAll.*;
import static ru.smartsarov.citylighting.sprut.tables.GuardPinEventDesrc.*;


import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


import org.jooq.DSLContext;
import org.jooq.JSONFormat;
import org.jooq.JSONFormat.RecordFormat;
import org.jooq.Record1;
import org.jooq.Record17;
import org.jooq.Record5;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import com.google.gson.Gson;

import ru.smartsarov.citylighting.sprut.tables.records.LightBlockRecord;




public class SprutExchange {
	/**
	* Static Get Connection method.
	* Returns Connection conn. 
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	*/
	public static Connection getConnection() throws ClassNotFoundException, SQLException  {
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
	         DSLContext dsl = DSL.using(conn, SQLDialect.FIREBIRD_2_5);
	            
	         int rs = dsl.update(OBJ_CONTROL)
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
	        	 rs = dsl.insertInto(OBJ_CONTROL)
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
	         DSLContext dsl = DSL.using(conn, SQLDialect.FIREBIRD_2_5);
	         

	          Result<?> result  = dsl.select
	        		  (USK.USK_ID.as("device_id"), 
	        		  USK.USK_UID.as("device_uid"), 
	        		  USK.USK_IP.as("device_ip"), 
	        		  HOME.HOME_NUMBER.as("house"), 
	        		  STREET.STRT_NAME.as("street_name"), 
	        		  STREET_TYPE.STREETT_SNAME.as("street_type"), 
	        		  GPRS_CURR.GPRS_CTIME.as("gprs_last_timestamp"), 
	        		  GUARD_PIN_NETSOST.GRDPN_NAME.as("link_state"))
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
          Record17<Integer, Integer, String, Double, Double, Double, Double, Double, Double, 
          Double, Double, Double, Double, Double,
          Double, Double, Timestamp> result = DSL.using(conn, SQLDialect.FIREBIRD_2_5)
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
       		  			.fetchAny();
          
       		  		return result!=null?result.formatJSON(new JSONFormat().header(false).recordFormat(RecordFormat.OBJECT)):"{}";
	}
}

	/**
	 * Shows devices state. 
	 * Returns json
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public static String showState() throws ClassNotFoundException, SQLException  {
		try (Connection conn = getConnection()) {     
			List<UspdState> retList 
					= DSL.using(conn, SQLDialect.FIREBIRD_2_5)
					.select(GUARD_PIN.GPIN_UNK_ID,  
	        				 GUARD_PIN.GPIN_ENTRY, 
	        				 GUARD_PIN_CURR.GPCR_DVALUE, 
	        				 USK.USK_IP, 
	        				 USK.USK_UID, 
	        				 HOME.HOME_NUMBER, 
	        				 STREET.STRT_NAME, 
		        		  	 STREET_TYPE.STREETT_SNAME, 
		        		  	 GPRS_CURR.GPRS_CTIME, 
		        		  	 GUARD_PIN_NETSOST.GRDPN_NAME,
		        		  	LIGHT_BLOCK.BLOCK_STANDALONE,
		        		  	LIGHT_BLOCK.BLOCK_ALL,
		        		  	LIGHT_BLOCK.SYNCED,
		        		  	GUARD_PIN_EVENT_DESRC.NAME, 
							GUARD_PIN_EVENT_DESRC.STATE, 
							GET_GUARD_PIN_LAST_EVENT_ALL.GPLG_LDATE,
							GET_GUARD_PIN_LAST_EVENT_ALL.GPLG_SDATE)
								 .from(GUARD_PIN_CURR)	
								 .join(GUARD_PIN).on(GUARD_PIN.GPIN_ID.eq(GUARD_PIN_CURR.GPCR_PIN_ID))
								 .join(USK).on(USK.USK_ID.eq(GUARD_PIN.GPIN_UNK_ID))
								 .join(ADRESS).on(ADRESS.ADR_ID.eq(USK.USK_ADR_ID))
				        		 .join(HOME).on(HOME.HOME_ID.eq(ADRESS.ADR_HOME_ID))
				        		 .join(STREET).on(STREET.STRT_ID.eq(HOME.HOME_STRT_ID))
				        		 .join(STREET_TYPE).on(STREET_TYPE.STREETT_ID.eq(STREET.STRT_TYPE))
				        		 .join(GPRS_CURR).on(GPRS_CURR.GPRS_USK_ID.eq(GUARD_PIN.GPIN_UNK_ID))
				        		 .join(GUARD_PIN_NETSOST).on(GUARD_PIN_NETSOST.GRDPN_ID.eq(GUARD_PIN_CURR.GPCR_STATE))
				        		 .leftJoin(LIGHT_BLOCK).on(LIGHT_BLOCK.USK_ID.eq(USK.USK_ID))
				        		 .leftJoin(GET_GUARD_PIN_LAST_EVENT_ALL.call(Props.get().getProperty("logical_user","admin"), 
				        				 		Props.get().getProperty("logical_password","admin")))
				        		 					.on(GET_GUARD_PIN_LAST_EVENT_ALL.USK_ID.eq(USK.USK_ID))
								 .leftJoin(GUARD_PIN_EVENT_DESRC).on(GET_GUARD_PIN_LAST_EVENT_ALL.GPLG_EVENT.eq(GUARD_PIN_EVENT_DESRC.EVENT_NUM)
										 .and(GET_GUARD_PIN_LAST_EVENT_ALL.GPLG_ACTION.eq(GUARD_PIN_EVENT_DESRC.ACTION_NUM)))		
								 .fetch()
								 .stream()
								.collect(Collectors.groupingBy(j-> j.value1()))
								.entrySet()
								.stream()
								.map(j->{
										UspdState us = new UspdState();
										
										if (j.getValue().isEmpty()) {
											return us;
										}
					
										us.setDeviceId(j.getValue().get(0).get(GUARD_PIN.GPIN_UNK_ID));
										us.setIp_addr(j.getValue().get(0).get(USK.USK_IP));
										us.setUid(j.getValue().get(0).get(USK.USK_UID));
										us.setPhis_addr(j.getValue().get(0).get(STREET_TYPE.STREETT_SNAME)+
														" "+
														j.getValue().get(0).get(STREET.STRT_NAME)+
														" "+
														j.getValue().get(0).get(HOME.HOME_NUMBER));
										us.setTsLastTelemetry(j.getValue().get(0).get(GPRS_CURR.GPRS_CTIME).getTime()/1000);
										us.setLinkType(j.getValue().get(0).get(GUARD_PIN_NETSOST.GRDPN_NAME));
										
										Map<Integer, Integer>pinMap = j.getValue().stream()
										.collect(Collectors.toMap(k->k.value2(), k->k.value3(),(oldVal, newVal)->oldVal));
									
										//Relay 1 state = PIN8
										us.setRelay1(pinMap.get(8)==0);
										//Relay 2 state = PIN12 (See electrical schema )
										us.setRelay2(pinMap.get(12)==0);
										
										
										
										us.setLastCmd(j.getValue().get(0).get(GUARD_PIN_EVENT_DESRC.NAME));
										us.setLastCmdState(j.getValue().get(0).get(GUARD_PIN_EVENT_DESRC.STATE));
										us.setTslastCmdServer(j.getValue().get(0).get(GET_GUARD_PIN_LAST_EVENT_ALL.GPLG_SDATE)!=null?j.getValue().get(0).get(GET_GUARD_PIN_LAST_EVENT_ALL.GPLG_SDATE).getTime()/1000:0L);
										us.setTslastCmdUsk(j.getValue().get(0).get(GET_GUARD_PIN_LAST_EVENT_ALL.GPLG_LDATE)!=null?j.getValue().get(0).get(GET_GUARD_PIN_LAST_EVENT_ALL.GPLG_LDATE).getTime()/1000:0L);
										
										
										
										
										boolean synced = j.getValue().get(0).get(LIGHT_BLOCK.SYNCED)!=null?j.getValue().get(0).get(LIGHT_BLOCK.SYNCED)!=0:false;
										Integer block = 0;
										if (synced) {
											if((block = j.getValue().get(0).get(LIGHT_BLOCK.BLOCK_STANDALONE))!=null)												
												block++;
											else
												block = 0;											
										}										
										us.setBlockStandalone(block);
										
										block = 0;
										if (synced) {
											if((block = j.getValue().get(0).get(LIGHT_BLOCK.BLOCK_ALL))!=null)												
												block++;
											else
												block = 0;
										}	
										us.setBlockAll(block);
									return us;
								}).collect(Collectors.toList());		
			
			
			Map<Integer, List<List<ClusterPoint>>> geoMap = DSL.using(conn, SQLDialect.FIREBIRD_2_5)
			.select(USK_COOR.USK_ID,
					USK_COOR.FIGURE_ID,
					USK_COOR.INDEX_ID,
					USK_COOR.LON,
					USK_COOR.LAT)
						.from(USK_COOR)
						.where(USK_COOR.REMOVED.eq(0))
						.fetch()			
						.stream()
						.collect(Collectors.groupingBy(j->j.value1()))
						.entrySet()
						.stream()			
						.collect(Collectors.toMap(j->j.getKey(), j->{
											 
													return j.getValue()
													.stream()
													.collect(Collectors.groupingBy(k->k.value2()))
													.entrySet()
													.stream()
													.map(i->{
														
														return i.getValue()
																	.stream()
																	.sorted(new Comparator<Record5<Integer, Integer, Integer, 
																										BigDecimal, BigDecimal>>(){
																		@Override
																		public int compare(
																				Record5<Integer, Integer, Integer, BigDecimal, BigDecimal> a,
																				Record5<Integer, Integer, Integer, BigDecimal, BigDecimal> b) {
																			// TODO Auto-generated method stub
																			return a.value3().compareTo(b.value3());
																		}		
																	})
																	.collect(
																			()->new ArrayList<ClusterPoint>(),
																			(list, item)->list.add(new ClusterPoint(item.value4(), item.value5())),
																			(list1, list2)->list1.addAll(list2));
													}).collect(Collectors.toList());
												}));
			for(UspdState us : retList) {
				us.setGeoData(geoMap.get(us.getDeviceId()));
			}
	         return new Gson().toJson(retList);
		}
	}
	
	
	/**
	 * Method for count getting of switched off lamps 
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */

	public static String getCountSwOffLamps() throws ClassNotFoundException, SQLException {
		 try (Connection conn = getConnection()) {		 	 
			 return new Gson().toJson(DSL.using(conn, SQLDialect.FIREBIRD_2_5)
			 			.select(CNT.CNT_UNK_ID,
			 					LIGHT_LINE.LAMP_NUM_A,
			 					LIGHT_LINE.LAMP_NUM_B,
			 					LIGHT_LINE.LAMP_NUM_C,
			 					LIGHT_LINE.LAMP_W_A,
			 					LIGHT_LINE.LAMP_W_B,		
			 					LIGHT_LINE.LAMP_W_C,
			 					CNT_MRCCURRVALUE.CNTMCV_PA,
			 					CNT_MRCCURRVALUE.CNTMCV_PB,
			 					CNT_MRCCURRVALUE.CNTMCV_PC,
			 					CNTV.CNTV_STATE,
			 					CNT_LSTATE.CNTLS_SNAME,
			 					HOME.HOME_NUMBER, 
		        				STREET.STRT_NAME, 
			        		  	STREET_TYPE.STREETT_SNAME )			 					
				 					.from(CNT)
				 					.join(LIGHT_LINE).on(LIGHT_LINE.LINE_CNT_ID.eq(CNT.CNT_ID))
				 					.join(CNT_MRCCURRVALUE).on(CNT_MRCCURRVALUE.CNTMCV_CID.eq(CNT.CNT_ID))
				 					.join(CNTV).on(CNTV.CNTV_ID.eq(CNT.CNT_ID))
				 					.join(CNT_LSTATE).on(CNT_LSTATE.CNTLS_ID.eq(CNTV.CNTV_STATE))
				 					.join(USK).on(USK.USK_ID.eq(CNT.CNT_UNK_ID))
				 					.join(ADRESS).on(ADRESS.ADR_ID.eq(USK.USK_ADR_ID))
					        		.join(HOME).on(HOME.HOME_ID.eq(ADRESS.ADR_HOME_ID))
					        		.join(STREET).on(STREET.STRT_ID.eq(HOME.HOME_STRT_ID))
					        		.join(STREET_TYPE).on(STREET_TYPE.STREETT_ID.eq(STREET.STRT_TYPE))
				 					.fetch()
				 					.stream()
				 					.map(j->{
				 						LampState ls = new LampState();
				 						ls.setDeviceId(j.getValue(CNT.CNT_UNK_ID));
				 						
				 						String str = j.getValue(STREET_TYPE.STREETT_SNAME)!= null?j.getValue(STREET_TYPE.STREETT_SNAME):"";
				 						str += " ";
				 						str += j.getValue(STREET.STRT_NAME)!=null?j.getValue(STREET.STRT_NAME):"";
				 						str += ", ";
				 						str += j.getValue(HOME.HOME_NUMBER)!=null?j.getValue(HOME.HOME_NUMBER):"";
				 						ls.setAddres(str);
				 						
				 						if (j.value11()==0) 	{//Counter link Exists
				 							if(j.getValue(LIGHT_LINE.LAMP_NUM_A)!=null && j.getValue(LIGHT_LINE.LAMP_W_A)!=null && j.getValue(CNT_MRCCURRVALUE.CNTMCV_PA)!=null && j.getValue(LIGHT_LINE.LAMP_W_A)!=0 )			 			
				 								ls.setBadLampA(j.getValue(LIGHT_LINE.LAMP_NUM_A) - j.getValue(CNT_MRCCURRVALUE.CNTMCV_PA).intValue()/j.getValue(LIGHT_LINE.LAMP_W_A));
				 			
				 							if(j.getValue(LIGHT_LINE.LAMP_NUM_B)!=null && j.getValue(LIGHT_LINE.LAMP_W_B)!=null && j.getValue(CNT_MRCCURRVALUE.CNTMCV_PB)!=null && j.getValue(LIGHT_LINE.LAMP_W_B)!=0 )			 			
				 								ls.setBadLampB(j.getValue(LIGHT_LINE.LAMP_NUM_B) - j.getValue(CNT_MRCCURRVALUE.CNTMCV_PB).intValue()/j.getValue(LIGHT_LINE.LAMP_W_B));

				 							if(j.getValue(LIGHT_LINE.LAMP_NUM_C)!=null && j.getValue(LIGHT_LINE.LAMP_W_C)!=null && j.getValue(CNT_MRCCURRVALUE.CNTMCV_PC)!=null && j.getValue(LIGHT_LINE.LAMP_W_C)!=0 )			 			
				 								ls.setBadLampC(j.getValue(LIGHT_LINE.LAMP_NUM_C) - j.getValue(CNT_MRCCURRVALUE.CNTMCV_PC).intValue()/j.getValue(LIGHT_LINE.LAMP_W_C));
				 						}
				 						
				 						return ls;
				 					})
				 		    		.filter(l->l.getBadLampA()!=0 || l.getBadLampB()!=0 || l.getBadLampC()!=0)
				 					.collect(Collectors.toList()));
	        } 		 
	}
	
	/**
	 * Method for blocking the control of USKs
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public static String blockControl(int deviceId, int blocLevel/* 0 - no block, 1 - inner scheduler block, 2 - block all*/) throws ClassNotFoundException, SQLException {
		 try (Connection conn = getConnection()) {		 	 
			DSLContext dsl = DSL.using(conn, SQLDialect.FIREBIRD_2_5);
	
			 int rs = dsl.update(LIGHT_BLOCK)
	            		.set(LIGHT_BLOCK.BLOCK_STANDALONE, blocLevel % 2)
	            		.set(LIGHT_BLOCK.BLOCK_ALL, blocLevel/2)
	            		.set(LIGHT_BLOCK.SYNCED, 0)
						.where(LIGHT_BLOCK.USK_ID.eq(deviceId))
						.execute();								            
	         if (rs==0) {
	        	 //TODO Constrains trouble with inserting USK.ID. 
	        	 //It's necessary to edit data base field USK.ID to autoIncrementing
	        	 
	        	 Record1<Integer> maxIdRecord = dsl
			        			.select(DSL.max(LIGHT_BLOCK.ID))
			        			.from(LIGHT_BLOCK)
			        			.fetchAny();
	        	 int maxId = 0;
	        	 if (maxIdRecord!=null && maxIdRecord.value1()!=null) 
	        		 maxId =  maxIdRecord.value1();
	        	 else
	        		 maxId = 0;
	        	 
	        	 
	        	 LightBlockRecord lbr = new LightBlockRecord(maxId+1, deviceId, blocLevel % 2, blocLevel/2, 0);
	        	 dsl.executeInsert(lbr);
	         }
	         conn.commit();
	         return "{\"message\":\"The command was send\"}";
		 }	 
	}
	
	
	
	public static String getLastEvent()  {	
				return "";
	}

	
}
