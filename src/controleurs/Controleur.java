/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controleurs;

import controleurs.*;
import vues.*;
import javax.swing.JOptionPane;


/**
 *
 * @author anas
 */
public class Controleur {
    
    private CtrlAccueil ctrlAccueil;
    private CtrlRapport ctrlRapport;
    private CtrlVisiteur ctrlVisiteur;
    private Controleur ctrl;
    
  

    public Controleur(Controleur ctrl) {
        this.ctrl = ctrl;
    }
    
    public CtrlVisiteur getVue(){
        return ctrlVisiteur;
    }
    
   public void afficherRapport(){
        this.ctrlAccueil.getVue().setVisible(false);
        this.ctrlRapport.getVue().setVisible(true);
        this.ctrlVisiteur.getVue().setVisible(false);
    }
    
    public void afficherVisiteur(){
        this.ctrlAccueil.getVue().setVisible(false);
        this.ctrlRapport.getVue().setVisible(false);
        this.ctrlVisiteur.getVue().setVisible(true);
    }
    
    public void afficherAccueil(){
        this.ctrlAccueil.getVue().setVisible(true);
        this.ctrlRapport.getVue().setVisible(false);
        this.ctrlVisiteur.getVue().setVisible(false);
    }

    public void quitterApplication(){       
        // Confirmer avant de quitter
        int rep = JOptionPane.showConfirmDialog(null, "Quitter l'application\nEtes-vous sûr(e) ?", "AGENCEB", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (rep == JOptionPane.YES_OPTION) {
            // mettre fin à l'application
            System.exit(0);
        }
    }
    
}
