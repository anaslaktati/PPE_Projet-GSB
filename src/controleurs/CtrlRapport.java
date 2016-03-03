package controleurs;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.List;
import javax.swing.JOptionPane;
import modele.dao.DaoException;
import modele.dao.DaoOracle;
import modele.dao.Dao;
import modele.metier.Rapport;


/**
 *
 * @author btssio
 */
public class CtrlRapport extends Controleur{
    
    DaoOracle dao = null;
    private CtrlCréerRapport ctrlCréerRapport;
    
    public CtrlRapport(Controleur ctrl) throws DaoException {
        super(ctrl);
        // Ouvrir une connexion JDBC vers la base de données visée
        dao = new DaoOracle("GSB", "GSB", "GSB");
        try {
            dao.connecter();
            // initialiser l'interface graphique
            
            this.afficherVue();
            chargerListeRapport();
            
        } catch (DaoException ex) {
           JOptionPane.showMessageDialog(vue, "CtrlVisiteur - instanciation - " + ex.getMessage(), "Visiteurs", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void rapportAnnuler() {
        
        this.getCtrl().afficherVue();
        this.cacherVue();
        
    } 
    
    public void chargerListeRapport() throws DaoException {
        List<Rapport> desRapports = dao.lireTousLesRapports();
        for (Rapport unRapport : desRapports) {
            ((VueRapport)vue).getModeleJComboBoxNumRapport().addElement(unRapport.getNum());
        }
    }
    
    public void chargerDonneesRapport(String numRapport) throws DaoException {
        
        Rapport unRapport = dao.lireUnRapport(numRapport);
        
        ((VueRapport)vue).getjTextFieldVisiteur().setText(unRapport.getVisiteur());
        ((VueRapport)vue).getjTextFieldDateRapport().setText(unRapport.getDate());
        ((VueRapport)vue).getjTextAreaBilan().setText(unRapport.getBilan());
        ((VueRapport)vue).getjTextFieldMotifRapport().setText(unRapport.getMotif());
        ((VueRapport)vue).getjTextFieldPatricien().setText(unRapport.getMatricule());

    }
    
    public void afficherCréerRapport() throws DaoException{
        if (ctrlCréerRapport == null){
            ctrlCréerRapport = new CtrlCréerRapport(this);
        }else{
            ctrlCréerRapport.afficherVue();
        }
        this.cacherVue();
    }

    Object getVue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}