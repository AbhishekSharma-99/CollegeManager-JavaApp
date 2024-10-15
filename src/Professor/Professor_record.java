/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Professor;

import Database.DatabaseConnection;
import Home_page.Home;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abhishek Sharma
 */
public class Professor_record extends javax.swing.JFrame {

    /**
     * Creates new form Professor_record
     */
    public Professor_record() {
        initComponents();
        loadDataIntoProfessorTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Professor_Table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnReferesh = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        btnManageStudent = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 20));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lecturer's Record");

        jScrollPane2.setBorder(new javax.swing.border.MatteBorder(null));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        Professor_Table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Professor_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Professor's ID", "First Name", "Last Name", "DOB", "Gender", "Father's Name", "Mother's Name", "Address", "Contact No.", "Email", "Date of joining", "Designation", "Salary", "Academic Qualification", "Experience", "Graduation", "University(Graduation)", "Post Graduation", "University(Post Graduation)", "PhD", "University(PhD)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Professor_Table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        Professor_Table.setAutoscrolls(false);
        Professor_Table.setName(""); // NOI18N
        jScrollPane2.setViewportView(Professor_Table);
        if (Professor_Table.getColumnModel().getColumnCount() > 0) {
            Professor_Table.getColumnModel().getColumn(0).setMinWidth(100);
            Professor_Table.getColumnModel().getColumn(1).setMinWidth(70);
            Professor_Table.getColumnModel().getColumn(1).setPreferredWidth(70);
            Professor_Table.getColumnModel().getColumn(2).setMinWidth(70);
            Professor_Table.getColumnModel().getColumn(2).setPreferredWidth(70);
            Professor_Table.getColumnModel().getColumn(5).setMinWidth(120);
            Professor_Table.getColumnModel().getColumn(6).setMinWidth(120);
            Professor_Table.getColumnModel().getColumn(7).setMinWidth(150);
            Professor_Table.getColumnModel().getColumn(10).setMinWidth(85);
            Professor_Table.getColumnModel().getColumn(10).setPreferredWidth(85);
        }

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtSearch.setToolTipText("Enter Lecturer's ID Only");

        btnSearch.setBackground(new java.awt.Color(0, 102, 102));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnReferesh.setBackground(new java.awt.Color(0, 102, 102));
        btnReferesh.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnReferesh.setForeground(new java.awt.Color(255, 255, 255));
        btnReferesh.setText("Refresh");
        btnReferesh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefereshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(btnReferesh, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReferesh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtSearch, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setPreferredSize(new java.awt.Dimension(40, 60));

        btnBack.setBackground(new java.awt.Color(0, 102, 102));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.setPreferredSize(new java.awt.Dimension(40, 60));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnManageStudent.setBackground(new java.awt.Color(0, 102, 102));
        btnManageStudent.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnManageStudent.setForeground(new java.awt.Color(255, 255, 255));
        btnManageStudent.setText("Manage Lecturer");
        btnManageStudent.setPreferredSize(new java.awt.Dimension(40, 60));
        btnManageStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageStudentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnManageStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 15, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:        
        String t1 = txtSearch.getText().trim();
        if (t1.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Please enter a professor ID before searching.");
            return;
        }   

        Connection conn = DatabaseConnection.getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;        
        try {
            // Create a prepared statement object
            pstmt = conn.prepareStatement("SELECT * FROM Professor WHERE professor_id = ?");

            // Set the search value as a parameter
            pstmt.setString(1, t1);

            // Execute the query
            rs = pstmt.executeQuery();

            // Get the table model from the JTable
            DefaultTableModel model = (DefaultTableModel) Professor_Table.getModel();

            // Clear the table model
            model.setRowCount(0);

            // Iterate through the result set and add the data to the table model
            while (rs.next()) {
                model.addRow(new Object[] {
                    rs.getString("Professor_ID"),
                    rs.getString("FirstName"),
                    rs.getString("LastName"),
                    rs.getString("DOB"),
                    rs.getString("Gender"),
                    rs.getString("Father_Name"),
                    rs.getString("Mother_Name"),
                    rs.getString("Address"),
                    rs.getString("Contact_no"),
                    rs.getString("Email"),
                    rs.getString("DOJ"),
                    rs.getString("Designation"),
                    rs.getDouble("Salary"),
                    rs.getString("Academic_Q"),
                    rs.getInt("Experience"),
                    rs.getString("Graduation_D"),
                    rs.getString("Uni_G"),
                    rs.getString("Post_Graduation_D"),
                    rs.getString("Uni_PG"),
                    rs.getString("PhD"),
                    rs.getString("Uni_PhD")
                    // Add more columns as needed  
                });
            }

        } catch (SQLException e) {
            System.out.println("Error executing query: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                System.out.println("Error closing database resources: " + e.getMessage());
            }
        }
        
        txtSearch.requestFocus();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        Home home = new Home();
        home.setVisible(true);
        home.pack();
        home.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnManageStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageStudentActionPerformed
        // TODO add your handling code here:
        Manage_Professor ST_Frame = new Manage_Professor();
        ST_Frame.setVisible(true);
        ST_Frame.pack();
        ST_Frame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnManageStudentActionPerformed

    private void btnRefereshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefereshActionPerformed
        // TODO add your handling code here:
        loadDataIntoProfessorTable();
        txtSearch.requestFocus();
    }//GEN-LAST:event_btnRefereshActionPerformed

    private void loadDataIntoProfessorTable() {
    try {
        Connection conn;
        conn = DatabaseConnection.getConnection();

        // Create a prepared statement
        String query = "SELECT * FROM Professor";
        PreparedStatement pstmt = conn.prepareStatement(query);

        ResultSet resultSet;
        // Execute a query to retrieve the data
        resultSet = pstmt.executeQuery();

        DefaultTableModel model = (DefaultTableModel) Professor_Table.getModel();
        // Clear the table model
        model.setRowCount(0);

        // Load the data into the table model
        while (resultSet.next()) {
            Object[] row = new Object[21];
            row[0] = resultSet.getString("Professor_ID");
            row[1] = resultSet.getString("FirstName");
            row[2] = resultSet.getString("LastName");
            row[3] = resultSet.getString("DOB");
            row[4] = resultSet.getString("Gender");
            row[5] = resultSet.getString("Father_Name");
            row[6] = resultSet.getString("Mother_Name");
            row[7] = resultSet.getString("Address");
            row[8] = resultSet.getString("Contact_no");
            row[9] = resultSet.getString("Email");
            row[10] = resultSet.getString("DOJ");
            row[11] = resultSet.getString("Designation");
            row[12] = resultSet.getDouble("Salary");
            row[13] = resultSet.getString("Academic_Q");
            row[14] = resultSet.getInt("Experience");
            row[15] = resultSet.getString("Graduation_D");
            row[16] = resultSet.getString("Uni_G");
            row[17] = resultSet.getString("Post_Graduation_D");
            row[18] = resultSet.getString("Uni_PG");
            row[19] = resultSet.getString("PhD");
            row[20] = resultSet.getString("Uni_PhD");
            model.addRow(row);
        }

        // Close the result set, statement, and connection
        resultSet.close();
        pstmt.close();
        conn.close();
    } catch (SQLException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error loading data into professor table: " + e.getMessage());
    }
}
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
            java.util.logging.Logger.getLogger(Professor_record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Professor_record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Professor_record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Professor_record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Professor_record().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Professor_Table;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnManageStudent;
    private javax.swing.JButton btnReferesh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
