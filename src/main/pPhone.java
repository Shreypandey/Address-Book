/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author shrey
 */
public class pPhone extends javax.swing.JPanel {

    /**
     * Creates new form pPhone
     */
    public pPhone() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fNumber = new javax.swing.JFormattedTextField();
        fCode = new javax.swing.JFormattedTextField();
        fPType = new javax.swing.JComboBox<>();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fNumber.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        fNumber.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        fNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNumberActionPerformed(evt);
            }
        });
        add(fNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 250, 50));

        try {
            fCode.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fCode.setText("+91");
        fCode.setToolTipText("Country Code");
        fCode.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        fCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fCodeActionPerformed(evt);
            }
        });
        add(fCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

        fPType.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        fPType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Main", "Mobile", "Office", "Work", "Personal" }));
        fPType.setName(""); // NOI18N
        add(fPType, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 250, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void fNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNumberActionPerformed

    private void fCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fCodeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JFormattedTextField fCode;
    public javax.swing.JFormattedTextField fNumber;
    public javax.swing.JComboBox<String> fPType;
    // End of variables declaration//GEN-END:variables
}
