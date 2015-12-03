/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.dao;

import java.sql.Connection;

/**
 *
 * @author anas
 */
public class Dao {
    private String piloteJdbc;
    private String urlBd;
    private String loginBd;
    private String mdpBd;
    private Connection cnx;
    
    
    public Dao(String piloteJdbc, String urlBd, String loginBd, String mdpBd) {
        this.piloteJdbc = piloteJdbc;
        this.urlBd = urlBd;
        this.loginBd = loginBd;
        this.mdpBd = mdpBd;
    }
}
