/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.dao;

import modele.dao.Dao;

/**
 *
 * @author btssio
 */
public class DaoOracle extends Dao{

    public DaoOracle(String nomBd, String loginBd, String mdpBd) {
        super("oracle.jdbc.driver.OracleDriver", "jdbc:oracle:thin:172.15.11.102/GSB@//localhost:1521/orcl", loginBd, mdpBd);
    }

    public void connecter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
