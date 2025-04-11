package GUI;

import Builders.OrkDirector;
import javax.swing.JFrame;
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
        valueWeapon = new javax.swing.JLabel();
        valueArmor = new javax.swing.JLabel();
        valueBanner = new javax.swing.JLabel();
        valueStrenght = new javax.swing.JProgressBar();
        valueAgility = new javax.swing.JProgressBar();
        valueIntelligence = new javax.swing.JProgressBar();
        valueHealth = new javax.swing.JProgressBar();

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

        jPanel1.setBackground(new java.awt.Color(101, 109, 74));

        jTree1.setBackground(new java.awt.Color(240, 234, 210));
        jTree1.setBorder(null);
        jTree1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jTree1.setForeground(new java.awt.Color(40, 54, 24));
        jTree1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTree1.setScrollsOnExpand(true);
        jTree1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTree1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTree1);

        typeOrkComboBox.setBackground(new java.awt.Color(240, 234, 210));
        typeOrkComboBox.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        typeOrkComboBox.setForeground(new java.awt.Color(40, 54, 24));
        typeOrkComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Basic ork", "Leader", "Scout" }));
        typeOrkComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeOrkComboBoxActionPerformed(evt);
            }
        });

        tribeComboBox.setBackground(new java.awt.Color(240, 234, 210));
        tribeComboBox.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        tribeComboBox.setForeground(new java.awt.Color(40, 54, 24));
        tribeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mordor", "Dol Guldur", "Misty Mountains"}));
        tribeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tribeComboBoxActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(188, 108, 37));
        jButton1.setFont(new java.awt.Font("Old English Text MT", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(254, 250, 224));
        jButton1.setText("Create Ork");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(250, 237, 205));

        jLabelName.setFont(new java.awt.Font("TolkienCyr", 1, 32)); // NOI18N
        jLabelName.setForeground(new java.awt.Color(188, 108, 37));
        jLabelName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabelWeapon.setFont(new java.awt.Font("Old English Text MT", 0, 20)); // NOI18N
        jLabelWeapon.setForeground(new java.awt.Color(40, 54, 24));
        jLabelWeapon.setText("Weapon:");

        jLabelArmor.setFont(new java.awt.Font("Old English Text MT", 0, 20)); // NOI18N
        jLabelArmor.setForeground(new java.awt.Color(40, 54, 24));
        jLabelArmor.setText("Armor:");

        jLabelBanner.setFont(new java.awt.Font("Old English Text MT", 0, 20)); // NOI18N
        jLabelBanner.setForeground(new java.awt.Color(40, 54, 24));
        jLabelBanner.setText("Banner:");

        jLabelStrenght.setFont(new java.awt.Font("Old English Text MT", 0, 20)); // NOI18N
        jLabelStrenght.setForeground(new java.awt.Color(40, 54, 24));
        jLabelStrenght.setText("Strenght:");

        jLabelAgility.setFont(new java.awt.Font("Old English Text MT", 0, 20)); // NOI18N
        jLabelAgility.setForeground(new java.awt.Color(40, 54, 24));
        jLabelAgility.setText("Agility:");

        jLabelIntelligence.setFont(new java.awt.Font("Old English Text MT", 0, 20)); // NOI18N
        jLabelIntelligence.setForeground(new java.awt.Color(40, 54, 24));
        jLabelIntelligence.setText("Intelligence:");

        jLabelHealth.setFont(new java.awt.Font("Old English Text MT", 0, 20)); // NOI18N
        jLabelHealth.setForeground(new java.awt.Color(40, 54, 24));
        jLabelHealth.setText("Health:");

        valueWeapon.setFont(new java.awt.Font("TolkienCyr", 0, 24)); // NOI18N

        valueArmor.setFont(new java.awt.Font("TolkienCyr", 0, 24)); // NOI18N

        valueBanner.setFont(new java.awt.Font("TolkienCyr", 0, 24)); // NOI18N

        valueStrenght.setMaximum(130);
        valueStrenght.setBackground(new java.awt.Color(237, 224, 212));
        valueStrenght.setFont(new java.awt.Font("TolkienCyr", 0, 18)); // NOI18N
        valueStrenght.setForeground(new java.awt.Color(166, 138, 100));

        valueAgility.setMaximum(130);
        valueAgility.setBackground(new java.awt.Color(237, 224, 212));
        valueAgility.setForeground(new java.awt.Color(166, 138, 100));

        valueIntelligence.setMaximum(50);
        valueIntelligence.setBackground(new java.awt.Color(237, 224, 212));
        valueIntelligence.setForeground(new java.awt.Color(166, 138, 100));

        valueHealth.setMaximum(200);
        valueHealth.setBackground(new java.awt.Color(237, 224, 212));
        valueHealth.setForeground(new java.awt.Color(166, 138, 100));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelHealth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelIntelligence, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelAgility, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelStrenght, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelBanner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelArmor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabelWeapon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(valueWeapon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(valueBanner, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                            .addComponent(valueArmor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(valueHealth, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                .addComponent(valueIntelligence, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(valueAgility, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(valueStrenght, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 30, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelWeapon)
                    .addComponent(valueWeapon))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelArmor)
                    .addComponent(valueArmor))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBanner)
                    .addComponent(valueBanner))
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelStrenght, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(valueStrenght, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAgility)
                    .addComponent(valueAgility, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelIntelligence)
                    .addComponent(valueIntelligence, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelHealth)
                    .addComponent(valueHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(126, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tribeComboBox, 0, 250, Short.MAX_VALUE)
                                    .addComponent(typeOrkComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 25, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 16, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(typeOrkComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tribeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        
        try {
            if (evt.getClickCount() == 2) {
            TreePath path = jTree1.getPathForLocation(evt.getX(), evt.getY());
            if (path != null) {
                DefaultMutableTreeNode node = (DefaultMutableTreeNode) path.getLastPathComponent();
                Ork selectedOrk = (Ork) node.getUserObject();
                jLabelName.setText(selectedOrk.getName());
                valueWeapon.setText(selectedOrk.getWeapon());
                valueArmor.setText(selectedOrk.getArmor());
                valueBanner.setText(selectedOrk.getBanner());
                valueStrenght.setValue((int) selectedOrk.getStrenght());
                valueAgility.setValue((int) selectedOrk.getAgility());
                valueIntelligence.setValue((int) selectedOrk.getIntelligence());
                valueHealth.setValue((int) selectedOrk.getHealth());
            }
        }
        } catch (ClassCastException ex) {
            System.out.println("Why are you poking here?");
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
    private javax.swing.JProgressBar valueAgility;
    private javax.swing.JLabel valueArmor;
    private javax.swing.JLabel valueBanner;
    private javax.swing.JProgressBar valueHealth;
    private javax.swing.JProgressBar valueIntelligence;
    private javax.swing.JProgressBar valueStrenght;
    private javax.swing.JLabel valueWeapon;
    // End of variables declaration//GEN-END:variables
}
