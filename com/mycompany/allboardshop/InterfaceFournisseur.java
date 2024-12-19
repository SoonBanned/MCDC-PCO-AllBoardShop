package com.mycompany.allboardshop;

import java.awt.Container;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;

/**
 * @author Alexis Campourcy & Emeline Kleinhans
 */
public class InterfaceFournisseur extends javax.swing.JFrame {
    Materiel[] m = {Materiel.SOFTGOODS};
    Activite[] a = {Activite.SKI, Activite.SURF};
    Fournisseur fournisseur;
    JCheckBox[] checkboxes = new JCheckBox[6];
    String jetonConnexion = "SuisJeConnecter?";
    ControlProposerVentePrivee control = new ControlProposerVentePrivee();
    
    /**
     * Creates new form NewJFrame
     */
    public InterfaceFournisseur() {
        initComponents();
        checkboxes[0] = checkSkate;
        checkboxes[1] = checkSurf;
        checkboxes[2] = checkFunboard;
        checkboxes[3] = checkSnowboard;
        checkboxes[4] = checkWakeboard;
        checkboxes[5] = checkSki;
        
        fournisseur = new Fournisseur("", "1 rue des licornes, Paris", "fournisseur1@gmail.com", "0102030405", m, a);
        
        boolean connexionReussie = control.verifierConnexion(jetonConnexion);
        control.initialisation();
        if (!connexionReussie){
            JOptionPane.showMessageDialog(getContentPane(),
            "Malheureusement votre jeton de connexion est invalide",
            "Erreur de connexion",
            JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        informationsVente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        descriptif = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        dateFin = new javax.swing.JTextField();
        dateDebut = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        nomVente = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        checkSkate = new javax.swing.JCheckBox();
        checkSurf = new javax.swing.JCheckBox();
        checkFunboard = new javax.swing.JCheckBox();
        checkSnowboard = new javax.swing.JCheckBox();
        checkWakeboard = new javax.swing.JCheckBox();
        checkSki = new javax.swing.JCheckBox();
        validerVente = new javax.swing.JButton();
        accesPropositionVente = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        description = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        prixBase = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        prixVente = new javax.swing.JTextField();
        saisirTailles = new javax.swing.JButton();
        boutonValider = new javax.swing.JButton();
        ajouterProduit = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        labelPhoto = new javax.swing.JLabel();
        ajoutTailles = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        taille = new javax.swing.JTextField();
        quantite = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ajouterTaille = new javax.swing.JButton();
        boutonValiderTaille = new javax.swing.JButton();
        resumeVente = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        texteResume = new javax.swing.JTextPane();
        jLabel18 = new javax.swing.JLabel();
        boutonTerminer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenue ");

        jLabel12.setText("Activités");

        jLabel13.setText("Descriptif");

        jLabel14.setText("Date Fin");

        jLabel15.setText("Date Début");

        jLabel16.setText("Nom");

        jLabel17.setText("Veuillez saisir les informations de la vente à proposer");

        checkSkate.setText("SKATE");

        checkSurf.setText("SURF");

        checkFunboard.setText("FUNBOARD");

        checkSnowboard.setText("SNOWBOARD");

        checkWakeboard.setText("WAKEBOARD");

        checkSki.setText("SKI");

        validerVente.setText("Ajouter Produits");
        validerVente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validerVenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout informationsVenteLayout = new javax.swing.GroupLayout(informationsVente);
        informationsVente.setLayout(informationsVenteLayout);
        informationsVenteLayout.setHorizontalGroup(
            informationsVenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informationsVenteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(informationsVenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informationsVenteLayout.createSequentialGroup()
                        .addGroup(informationsVenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(validerVente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(informationsVenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(informationsVenteLayout.createSequentialGroup()
                                .addComponent(checkFunboard)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkSki)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkWakeboard))
                            .addGroup(informationsVenteLayout.createSequentialGroup()
                                .addComponent(checkSurf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkSkate, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkSnowboard, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(informationsVenteLayout.createSequentialGroup()
                        .addGroup(informationsVenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(informationsVenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(descriptif, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateFin, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateDebut, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomVente, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        informationsVenteLayout.setVerticalGroup(
            informationsVenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informationsVenteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(informationsVenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nomVente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(informationsVenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateDebut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(informationsVenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(informationsVenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(descriptif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(informationsVenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkSurf)
                    .addComponent(checkSnowboard)
                    .addComponent(checkSkate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(informationsVenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkFunboard)
                    .addComponent(checkWakeboard)
                    .addComponent(checkSki)
                    .addComponent(validerVente))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(informationsVente, "card5");

        jLabel2.setText("Nom");

        jLabel3.setText("Description");

        jLabel4.setText("Chemin Photo");

        jLabel5.setText("Prix Base");

        jLabel6.setText("Prix Vente");

        saisirTailles.setText("Saisir Tailles");
        saisirTailles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saisirTaillesActionPerformed(evt);
            }
        });

        boutonValider.setText("Valider");
        boutonValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonValiderActionPerformed(evt);
            }
        });

        ajouterProduit.setText("Ajouter");
        ajouterProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterProduitActionPerformed(evt);
            }
        });

        jLabel11.setText("Veuillez saisir les informations des produits à proposer");

        jButton2.setText("Choisir photo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        labelPhoto.setForeground(new java.awt.Color(242, 242, 242));
        labelPhoto.setEnabled(false);
        labelPhoto.setFocusable(false);

        javax.swing.GroupLayout accesPropositionVenteLayout = new javax.swing.GroupLayout(accesPropositionVente);
        accesPropositionVente.setLayout(accesPropositionVenteLayout);
        accesPropositionVenteLayout.setHorizontalGroup(
            accesPropositionVenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accesPropositionVenteLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(accesPropositionVenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                    .addGroup(accesPropositionVenteLayout.createSequentialGroup()
                        .addGroup(accesPropositionVenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(accesPropositionVenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(prixVente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prixBase, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(description, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nom, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)))
                    .addGroup(accesPropositionVenteLayout.createSequentialGroup()
                        .addComponent(saisirTailles)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ajouterProduit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boutonValider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(labelPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        accesPropositionVenteLayout.setVerticalGroup(
            accesPropositionVenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accesPropositionVenteLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(accesPropositionVenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(accesPropositionVenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(accesPropositionVenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(accesPropositionVenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(prixBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(accesPropositionVenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(prixVente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(accesPropositionVenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saisirTailles)
                    .addComponent(boutonValider)
                    .addComponent(ajouterProduit)
                    .addComponent(labelPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(accesPropositionVente, "card3");

        jLabel7.setText("Taille");

        jLabel8.setText("Quantité");

        ajouterTaille.setText("Ajouter Taille");
        ajouterTaille.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterTailleActionPerformed(evt);
            }
        });

        boutonValiderTaille.setText("Valider Tailles");
        boutonValiderTaille.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonValiderTailleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ajoutTaillesLayout = new javax.swing.GroupLayout(ajoutTailles);
        ajoutTailles.setLayout(ajoutTaillesLayout);
        ajoutTaillesLayout.setHorizontalGroup(
            ajoutTaillesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ajoutTaillesLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(ajoutTaillesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ajoutTaillesLayout.createSequentialGroup()
                        .addGroup(ajoutTaillesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ajoutTaillesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(quantite, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                            .addComponent(taille)))
                    .addGroup(ajoutTaillesLayout.createSequentialGroup()
                        .addComponent(ajouterTaille)
                        .addGap(200, 200, 200)
                        .addComponent(boutonValiderTaille)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        ajoutTaillesLayout.setVerticalGroup(
            ajoutTaillesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ajoutTaillesLayout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(ajoutTaillesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(taille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ajoutTaillesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(quantite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ajoutTaillesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ajouterTaille)
                    .addComponent(boutonValiderTaille))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        getContentPane().add(ajoutTailles, "card4");

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(texteResume);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setText("Votre vente à bien été validée, voici le résumé :");

        boutonTerminer.setText("Terminer");
        boutonTerminer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonTerminerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout resumeVenteLayout = new javax.swing.GroupLayout(resumeVente);
        resumeVente.setLayout(resumeVenteLayout);
        resumeVenteLayout.setHorizontalGroup(
            resumeVenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
            .addGroup(resumeVenteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(resumeVenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resumeVenteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(boutonTerminer)))
                .addContainerGap())
        );
        resumeVenteLayout.setVerticalGroup(
            resumeVenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resumeVenteLayout.createSequentialGroup()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boutonTerminer)
                .addContainerGap())
        );

        getContentPane().add(resumeVente, "card6");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saisirTaillesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saisirTaillesActionPerformed
        control.saisirTailles();
        Container c = getContentPane();
        c.removeAll();
        c.add(ajoutTailles);
        c.repaint();
        c.revalidate();
    }//GEN-LAST:event_saisirTaillesActionPerformed

    private void boutonValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonValiderActionPerformed
        Container c = getContentPane();
        
        
        control.setProduits();
        control.ajouterVente(fournisseur);

        texteResume.setText(control.resumeVente());
        
        c.removeAll();
        c.add(resumeVente);
        c.repaint();
        c.revalidate();
        
        
    }//GEN-LAST:event_boutonValiderActionPerformed

    private void ajouterProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterProduitActionPerformed
        
        try {
            boolean b = control.ajouterProduit(nom.getText(), description.getText(), labelPhoto.getText(), Float.parseFloat(prixBase.getText()), Float.parseFloat(prixVente.getText()));
            
            if (b){
                nom.setText("");
                labelPhoto.setText("");
                prixBase.setText("");
                prixVente.setText("");
                description.setText("");
            }else{
                JOptionPane.showMessageDialog(getContentPane(),
                "Malheureusement votre saisie est incorrecte.",
                "Erreur de saisie",
                JOptionPane.ERROR_MESSAGE);
            }
            
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(getContentPane(),
            "Malheureusement \"" + prixBase.getText() + "\" ou \"" + prixVente.getText() + "\" n'est pas un flottant.",
            "Erreur de saisie",
            JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_ajouterProduitActionPerformed

    private void boutonValiderTailleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonValiderTailleActionPerformed
        Container c = getContentPane();
        c.removeAll();
        c.add(accesPropositionVente);
        c.repaint();
        c.revalidate();       
    }//GEN-LAST:event_boutonValiderTailleActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
 
            int r = j.showOpenDialog(null);
 
            if (r == JFileChooser.APPROVE_OPTION)
            {
                labelPhoto.setText(j.getSelectedFile().getAbsolutePath());
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ajouterTailleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterTailleActionPerformed
        try {
            boolean b = control.ajouterTaille(taille.getText(), Integer.parseInt(quantite.getText()));

            if (b){
                quantite.setText("");
                taille.setText("");
            }else{
                JOptionPane.showMessageDialog(getContentPane(),
                "Malheureusement votre saisie est inccorecte.",
                "Erreur de saisie",
                JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(getContentPane(),
            "Malheureusement \"" + quantite.getText() + "\" n'est pas un entier.",
            "Erreur de saisie",
            JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_ajouterTailleActionPerformed

    private void boutonTerminerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonTerminerActionPerformed
        System.exit(0);
    }//GEN-LAST:event_boutonTerminerActionPerformed

    private void validerVenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validerVenteActionPerformed
        boolean b;
        int i = 0;
        Container c = getContentPane();
        Activite[] activites = new Activite[6];
        
        for (JCheckBox checkbox : checkboxes){
            if (checkbox.isSelected()){
                activites[i] = Activite.valueOf(checkbox.getText());
                i++;
            }
        }
        
        
        b = control.validerVente(nomVente.getText(), dateDebut.getText(), dateFin.getText(), descriptif.getText(), activites);
        if (b){
            c.removeAll();
            c.add(accesPropositionVente);
            c.repaint();
            c.revalidate();  
        }else{
            JOptionPane.showMessageDialog(getContentPane(),
            "Malheureusement votre saisie est inccorecte.",
            "Erreur de saisie",
            JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_validerVenteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceFournisseur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceFournisseur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceFournisseur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceFournisseur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceFournisseur().setVisible(true);
            }
        });
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel accesPropositionVente;
    private javax.swing.JPanel ajoutTailles;
    private javax.swing.JButton ajouterProduit;
    private javax.swing.JButton ajouterTaille;
    private javax.swing.JButton boutonTerminer;
    private javax.swing.JButton boutonValider;
    private javax.swing.JButton boutonValiderTaille;
    private javax.swing.JCheckBox checkFunboard;
    private javax.swing.JCheckBox checkSkate;
    private javax.swing.JCheckBox checkSki;
    private javax.swing.JCheckBox checkSnowboard;
    private javax.swing.JCheckBox checkSurf;
    private javax.swing.JCheckBox checkWakeboard;
    private javax.swing.JTextField dateDebut;
    private javax.swing.JTextField dateFin;
    private javax.swing.JTextField descriptif;
    private javax.swing.JTextField description;
    private javax.swing.JPanel informationsVente;
    private javax.swing.JButton jButton2;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelPhoto;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField nomVente;
    private javax.swing.JTextField prixBase;
    private javax.swing.JTextField prixVente;
    private javax.swing.JTextField quantite;
    private javax.swing.JPanel resumeVente;
    private javax.swing.JButton saisirTailles;
    private javax.swing.JTextField taille;
    private javax.swing.JTextPane texteResume;
    private javax.swing.JButton validerVente;
    // End of variables declaration//GEN-END:variables
}