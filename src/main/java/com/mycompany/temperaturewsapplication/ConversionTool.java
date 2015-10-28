package com.mycompany.temperaturewsapplication;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author natalieedward
 */
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/TempConversion")
public class ConversionTool {

    @GET
    @Path("/FToC/{param}")
  //  @Consumes("application/xml")
    public Response FahrenheitToCelsius(@PathParam("param") Double message) {
        //String output = "Hello " + message + "!";
        Double output = ((message - 32)* 5)/9;
        return Response.status(200).entity(output).build();
    }

   @GET
    @Path("/CToF/{param}")
    public Response CelsiusToFahrenheit(@PathParam("param") Double message) {
        //String output = "Hello " + message + "!";
        Double output = ((message * 9)/ 5)+32;
        return Response.status(200).entity(output).build();
    }
}
