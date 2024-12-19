package com.mycompany.allboardshop;

import org.javatuples.Pair;

/**
 * @author Alexis Campourcy & Emeline Kleinhans
 */
public class ControlProposerVentePrivee {
    private final ControlSaisirTaille controlSaisirTaille;
    private final ControlAjouterTaille controlAjouterTaille;
    private final ControlVerifierConnexion controlVerifierConnexion;
    private final ControlValiderVente controlValiderVente;
    private final ControlAjouterProduit controlAjouterProduit;
    private Pair<Produit, Tailles[]>[] produitsProposes;
    private Tailles[] tailles;
    private Vente v;

    public ControlProposerVentePrivee() {
        this.controlSaisirTaille = new ControlSaisirTaille();
        this.controlAjouterTaille = new ControlAjouterTaille();
        this.controlVerifierConnexion = new ControlVerifierConnexion();
        this.controlValiderVente = new ControlValiderVente();
        this.controlAjouterProduit = new ControlAjouterProduit();
    }
    
    
    public boolean verifierConnexion(String jetonConnexion){
        return controlVerifierConnexion.verifierConnexion(jetonConnexion);
    }
    
    public void initialisation(){
        this.produitsProposes =  new Pair[100];
        this.v = new Vente();
    }
    
    public boolean validerVente(String nom, String dateDebut, String dateFin, String descriptif, Activite[] activites){
        this.v = controlValiderVente.validerVente(nom, dateDebut, dateFin, descriptif, activites);
        return this.v != null;
    }
    
    public void saisirTailles(){
        this.tailles = controlSaisirTaille.saisirTailles();
    }
    
    public boolean ajouterTaille(String taille, int quantite){
        return controlAjouterTaille.ajouterTaille(this.tailles, taille, quantite);
    }
    
    public boolean ajouterProduit(String nom, String description, String cheminPhoto, float prixBase, float prixVente){
        return controlAjouterProduit.ajouterProduit(nom, description, cheminPhoto, prixBase, prixVente, tailles, this.produitsProposes);
    }
    
    public void setProduits(){
        this.v.setProduits(produitsProposes);
    }
    
    public void ajouterVente(Fournisseur f){
        f.ajouterVente(v);
    }
    
    public String resumeVente(){
        return this.v.toString();
    }
}
