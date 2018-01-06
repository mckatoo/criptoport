/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ikatoo.criptoport;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author mckatoo
 */

@ApplicationPath("/rest")
public class MyApp extends ResourceConfig {
    public MyApp() {
        packages("br.com.ikatoo.criptoport.controllers");
    }
}