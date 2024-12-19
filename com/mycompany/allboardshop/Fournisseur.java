package com.mycompany.allboardshop;

/**
 * @author Alexis Campourcy & Emeline Kleinhans
 */
public class Fournisseur {
    public String nom;
    public String adressePostale;
    public String adresseMail; 
    public String numeroTelephone;
    public Materiel[] typesMateriel;
    public Activite[] specialites;
    public Produit[] produits = new Produit[100];;
    public Vente[] venteProposees = new Vente[10];

    public Fournisseur(String nom, String adressePostale, String adresseMail, String numeroTelephone, Materiel[] typesMateriel, Activite[] specialites) {
        this.nom = nom;
        this.adressePostale = adressePostale;
        this.adresseMail = adresseMail;
        this.numeroTelephone = numeroTelephone;
        this.typesMateriel = typesMateriel;
        this.specialites = specialites;
    }
    
    public void ajouterProduit(Produit p){
        int i = 0;
                
        while(i < 100 && produits[i] != null){
            i++;
        }

        if (i != 100){
            produits[i] = p;
        }
    }
    
    public void ajouterVente(Vente v){
        int i = 0;
                
        while(i < 10 && venteProposees[i] != null){
            i++;
        }

        if (i != 10){
            venteProposees[i] = v;
        }
    }
    
}
