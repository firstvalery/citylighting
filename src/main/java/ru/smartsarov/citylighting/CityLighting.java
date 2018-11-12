package ru.smartsarov.citylighting;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import ru.smartsarov.citylighting.SprutExchange;
import static ru.smartsarov.citylighting.CityLightingConstants.*;

import java.io.InputStream;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class CityLighting
{
	@GET
	@Path("/")
	@Produces(MediaType.TEXT_HTML + ";charset=UTF-8")
    public Response index()
    {
		InputStream is = this.getClass().getResourceAsStream("/static/index.html");
    	return Response.status(Response.Status.OK).entity(is).build();
    }

	@GET
	@Path("/sprut/on_evening")
    public Response sprutOnEvening(
    		@QueryParam("device_id") int device_id)
    {	
		try {
			return Response.status(Response.Status.OK).entity(SprutExchange.updateOrInsertObjControl(device_id, 1, CMD_EVENING, 1, "smartsarov")).build(); 
		} catch (Exception e) {
			return Response.status(Response.Status.OK).entity(e.toString()).build(); 
		}
    }
	
	@GET
	@Path("/sprut/on_night")
    public Response sprutOnNight(
    		@QueryParam("device_id") int device_id)
    {	
		try {
			return Response.status(Response.Status.OK).entity(SprutExchange.updateOrInsertObjControl(device_id, 1, CMD_NIGHT, 1, "smartsarov")).build(); 
		} catch (Exception e) {
			return Response.status(Response.Status.OK).entity(e.toString()).build(); 
		}
    }
	
	@GET
	@Path("/sprut/off")
    public Response sprutOff(
    		@QueryParam("device_id") int device_id)
    {	
		try {
			return Response.status(Response.Status.OK).entity(SprutExchange.updateOrInsertObjControl(device_id, 1, CMD_OFF, 1, "smartsarov")).build(); 
		} catch (Exception e) {
			return Response.status(Response.Status.OK).entity(e.toString()).build(); 
		}
    }
	
	@GET
	@Path("/sprut/show_devices")
    public Response sprutShowDevices()
    {	
		try {
			return Response.status(Response.Status.OK).entity(SprutExchange.showDevices()).build(); 
		} catch (Exception e) {
			return Response.status(Response.Status.OK).entity(e.toString()).build(); 
		}
    }
	
	@GET
	@Path("/sprut/state")
    public Response sprutShowDeviceState(
    		@QueryParam("device_id") int device_id)
    {	
		try {
			return Response.status(Response.Status.OK).entity(SprutExchange.showStateById(device_id)).build(); 
		} catch (Exception e) {
			return Response.status(Response.Status.OK).entity(e.toString()).build(); 
		}
    }
}