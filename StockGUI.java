/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author yasiru
 */
import javax.swing.JOptionPane;
import javax.swing.table.*;

public class StockGUI extends javax.swing.JFrame {

    private StockDb stockDb;

    /**
     * Creates new form StockGUI
     */
    public StockGUI(StockDb sdb) {
        initComponents();
        this.stockDb = sdb;
        this.loadTable(sdb.getDataModel());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        txtTSLA = new javax.swing.JTextField();
        txtTXN = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFB = new javax.swing.JTextField();
        txtVRTU = new javax.swing.JTextField();
        txtGOOGL = new javax.swing.JTextField();
        txtMSFT = new javax.swing.JTextField();
        txtXLNX = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtYHOO = new javax.swing.JTextField();
        btnView = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Stock Market");
        setResizable(false);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        txtTSLA.setEditable(false);
        txtTSLA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTSLAActionPerformed(evt);
            }
        });

        txtTXN.setEditable(false);

        jLabel1.setText("FB");

        jLabel2.setText("YHOO");

        jLabel3.setText("TSLA");

        jLabel4.setText("XLNX");

        jLabel6.setText("MSFT");

        jLabel7.setText("VRTU");

        jLabel8.setText("GOOGL");

        txtFB.setEditable(false);

        txtVRTU.setEditable(false);

        txtGOOGL.setEditable(false);

        txtMSFT.setEditable(false);
        txtMSFT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMSFTActionPerformed(evt);
            }
        });

        txtXLNX.setEditable(false);
        txtXLNX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtXLNXActionPerformed(evt);
            }
        });

        jLabel5.setText("TXN");

        txtYHOO.setEditable(false);

        btnView.setText("View Details");
        btnView.setToolTipText("");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTXN)
                            .addComponent(txtFB)
                            .addComponent(txtVRTU)
                            .addComponent(txtMSFT)
                            .addComponent(txtGOOGL)
                            .addComponent(txtYHOO)
                            .addComponent(txtXLNX)
                            .addComponent(txtTSLA, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnView, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVRTU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMSFT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGOOGL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtYHOO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtXLNX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTSLA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTXN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTSLAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTSLAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTSLAActionPerformed

    private void txtMSFTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMSFTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMSFTActionPerformed

    private void txtXLNXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtXLNXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtXLNXActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableMouseClicked

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed

        if (table.getSelectedRow() != -1) {
            String sym = (String) table.getValueAt(table.getSelectedRow(), 0);
            if (stockDb.getBidItemList(sym) == null) {
                JOptionPane.showMessageDialog(this,"No data available for this Stock item");
            } else {
                viewBidGUI dtwindow = new viewBidGUI(stockDb.getBidItemList(sym));
                dtwindow.setVisible(true);
            }
        }else{
            JOptionPane.showMessageDialog(this,"Please Select a Stock item from the table");
        }
    }//GEN-LAST:event_btnViewActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtFB;
    private javax.swing.JTextField txtGOOGL;
    private javax.swing.JTextField txtMSFT;
    private javax.swing.JTextField txtTSLA;
    private javax.swing.JTextField txtTXN;
    private javax.swing.JTextField txtVRTU;
    private javax.swing.JTextField txtXLNX;
    private javax.swing.JTextField txtYHOO;
    // End of variables declaration//GEN-END:variables

    public void loadTable(Object[][] obj) {
       try{
       int  row = table.getSelectedRow();
      
        table.setModel(new DefaultTableModel(obj, new String[]{"Symbol", "Name", "Price"}));
        if(row != -1){
        table.getSelectionModel().addSelectionInterval(row,row);
       }
        txtFB.setText(Float.toString(stockDb.getItem("FB").getPrice()));
        txtVRTU.setText(Float.toString(stockDb.getItem("VRTU").getPrice()));
        txtMSFT.setText(Float.toString(stockDb.getItem("MSFT").getPrice()));
        txtGOOGL.setText(Float.toString(stockDb.getItem("GOOGL").getPrice()));
        txtYHOO.setText(Float.toString(stockDb.getItem("YHOO").getPrice()));
        txtXLNX.setText(Float.toString(stockDb.getItem("XLNX").getPrice()));
        txtTSLA.setText(Float.toString(stockDb.getItem("TSLA").getPrice()));
        txtTXN.setText(Float.toString(stockDb.getItem("TXN").getPrice()));
       }catch(Exception e){
          e.printStackTrace(System.err);
       }
    }

}