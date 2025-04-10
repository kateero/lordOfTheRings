package GUI;

import Builders.OrkDirector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
import mephi.b22901.kateero.laba2.Ork;

public class ArmySauron extends JFrame {

    OrkDirector orkDirector = new OrkDirector();
    DefaultMutableTreeNode root = new DefaultMutableTreeNode("Saurons's army");
    DefaultMutableTreeNode nodeMordor = new DefaultMutableTreeNode("Mordor");
    DefaultMutableTreeNode nodeDolGuldur = new DefaultMutableTreeNode("Dol Guldur");
    DefaultMutableTreeNode nodeMistyMountains = new DefaultMutableTreeNode("Misty Mountains");

    public ArmySauron() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        root.add(nodeMordor);
        root.add(nodeDolGuldur);
        root.add(nodeMistyMountains);
        jTree1 = new javax.swing.JTree(root);
        typeOrkComboBox = new javax.swing.JComboBox<>();
        tribeComboBox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabelName = new javax.swing.JLabel();
        jLabelWeapon = new javax.swing.JLabel();
        jLabelArmor = new javax.swing.JLabel();
        jLabelBanner = new javax.swing.JLabel();
        jLabelStrenght = new javax.swing.JLabel();
        jLabelAgility = new javax.swing.JLabel();
        jLabelIntelligence = new javax.swing.JLabel();
        jLabelHealth = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTree1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jTree1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTree1.setScrollsOnExpand(true);
        jTree1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTree1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTree1);

        typeOrkComboBox.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        typeOrkComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Basic ork", "Leader", "Scout" }));
        typeOrkComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeOrkComboBoxActionPerformed(evt);
            }
        });

        tribeComboBox.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        tribeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mordor", "Dol Guldur", "Misty Mountains"}));
        tribeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tribeComboBoxActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Old English Text MT", 0, 16)); // NOI18N
        jButton1.setText("Create Ork");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tribeComboBox, 0, 229, Short.MAX_VALUE)
                            .addComponent(typeOrkComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(25, 25, 25)))
                .addGap(18, 18, 18))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(typeOrkComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tribeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jLabelName.setFont(new java.awt.Font("Lucida Handwriting", 0, 24)); // NOI18N
        jLabelName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabelWeapon.setText("Weapon:");

        jLabelArmor.setText("Armor:");

        jLabelBanner.setText("Banner:");

        jLabelStrenght.setText("Strenght:");

        jLabelAgility.setText("Agility");

        jLabelIntelligence.setText("Intelligence");

        jLabelHealth.setText("Health");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelHealth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelIntelligence, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(jLabelAgility, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelStrenght, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelBanner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelArmor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelWeapon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 420, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jLabelWeapon)
                .addGap(18, 18, 18)
                .addComponent(jLabelArmor)
                .addGap(18, 18, 18)
                .addComponent(jLabelBanner)
                .addGap(18, 18, 18)
                .addComponent(jLabelStrenght)
                .addGap(18, 18, 18)
                .addComponent(jLabelAgility)
                .addGap(18, 18, 18)
                .addComponent(jLabelIntelligence)
                .addGap(18, 18, 18)
                .addComponent(jLabelHealth)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void typeOrkComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeOrkComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeOrkComboBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String tribe = tribeComboBox.getSelectedItem().toString();
        String typeOrk = typeOrkComboBox.getSelectedItem().toString();

        orkDirector.setOrkBuilder(tribe);
        orkDirector.createOrk(typeOrk);
        Ork newOrk = orkDirector.getOrk();

        DefaultTreeModel model = (DefaultTreeModel) jTree1.getModel();

        switch (tribe) {
            case "Mordor" -> {
                nodeMordor.add(new DefaultMutableTreeNode(newOrk));
                model.nodesWereInserted(nodeMordor, new int[]{nodeMordor.getChildCount() - 1});
            }

            case "Dol Guldur" -> {
                nodeDolGuldur.add(new DefaultMutableTreeNode(newOrk));
                model.nodesWereInserted(nodeDolGuldur, new int[]{nodeDolGuldur.getChildCount() - 1});
            }

            case "Misty Mountains" -> {
                nodeMistyMountains.add(new DefaultMutableTreeNode(newOrk));
                model.nodesWereInserted(nodeMistyMountains, new int[]{nodeMistyMountains.getChildCount() - 1});
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTree1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTree1MouseClicked
        if (evt.getClickCount() == 2) {
            TreePath path = jTree1.getPathForLocation(evt.getX(), evt.getY());
            if (path != null) {
                DefaultMutableTreeNode node = (DefaultMutableTreeNode) path.getLastPathComponent();
                Ork selectedOrk = (Ork) node.getUserObject();
                jLabelName.setText(selectedOrk.getName());
            }
        }
    }//GEN-LAST:event_jTree1MouseClicked

    private void tribeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tribeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tribeComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabelAgility;
    private javax.swing.JLabel jLabelArmor;
    private javax.swing.JLabel jLabelBanner;
    private javax.swing.JLabel jLabelHealth;
    private javax.swing.JLabel jLabelIntelligence;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelStrenght;
    private javax.swing.JLabel jLabelWeapon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    private javax.swing.JComboBox<String> tribeComboBox;
    private javax.swing.JComboBox<String> typeOrkComboBox;
    // End of variables declaration//GEN-END:variables
}
