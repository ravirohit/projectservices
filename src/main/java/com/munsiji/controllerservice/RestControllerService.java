package com.munsiji.controllerservice;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/rest")
public class RestControllerService {

	@GET
	@Path("/gethealth")
	public String healthCheck(){
	   System.out.println("healthcheck method called");	
	   return "{\"status\":\"sucess\"}";
	}
	@POST
	@Path("/posthealth")
	public String healthCheck(String str){
	   System.out.println("healthcheck method called");	
	   return "{\"status\":\"sucess\"}";
	}
	
}
