/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ikatoo.criptoport.controllers;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author mckatoo
 */
@Path("moedas")
public class MoedasController {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/")
    public List<String> listMoedas(){
        String url = "https://api.bitfinex.com/v1/symbols";
        return null;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{sigla}/")
    public String getMoeda(@PathParam("sigla") String sigla) {
        return sigla;
    };
}
