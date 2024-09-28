
package Student;

import Home_page.Home;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;


public class Manage_Student extends javax.swing.JFrame {

  
    public Manage_Student() {
        setUndecorated(true);
        initComponents();
        
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        btnStudentRecord = new javax.swing.JButton();
        txtSearchStudentId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtDate = new com.toedter.calendar.JDateChooser();
        txtGender = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtMotherName = new javax.swing.JTextField();
        txtFOccupation = new javax.swing.JTextField();
        txtFatherName = new javax.swing.JTextField();
        txtMOccupation = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        txtContectNo = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtStudentID = new javax.swing.JTextField();
        txtBranch = new javax.swing.JTextField();
        txtBatch = new javax.swing.JTextField();
        txtYear = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 670));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 500));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Student", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Student Id");

        btnSearch.setBackground(new java.awt.Color(0, 102, 102));
        btnSearch.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnStudentRecord.setBackground(new java.awt.Color(0, 102, 102));
        btnStudentRecord.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        btnStudentRecord.setForeground(new java.awt.Color(255, 255, 255));
        btnStudentRecord.setText("Student' s Record");
        btnStudentRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentRecordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(txtSearchStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(btnStudentRecord)
                .addGap(52, 52, 52))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnStudentRecord)
                        .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSearchStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel2.setBackground(new java.awt.Color(0, 153, 153));
        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Manage Students");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Basic info", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setMinimumSize(new java.awt.Dimension(780, 325));
        jPanel3.setPreferredSize(new java.awt.Dimension(780, 400));

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("First name");

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("last name");

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Date of birth");

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gender");

        txtFirstName.setToolTipText("Name");

        txtDate.setDateFormatString("dd, MM, yyyy");
        txtDate.setPreferredSize(new java.awt.Dimension(70, 17));

        txtGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Father's name");

        jLabel8.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("MOther's name");

        jLabel9.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Occupation");

        jLabel10.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Occupation");

        jLabel11.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Address");

        txtAddress.setColumns(15);
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        jLabel12.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Contect no.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(txtFatherName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(txtFOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(txtMotherName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(txtMOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(txtContectNo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFatherName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMotherName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtContectNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acadmic info", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Student's id :");

        jLabel15.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Branch");

        jLabel16.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("batch");

        jLabel17.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("year");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(txtStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(txtBatch, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(txtBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBatch, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "*", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        btnAdd.setBackground(new java.awt.Color(0, 153, 153));
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add ");
        btnAdd.setAlignmentX(0.5F);
        btnAdd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, java.awt.Color.lightGray));
        btnAdd.setBorderPainted(false);
        btnAdd.setMargin(new java.awt.Insets(0, 15, 0, 15));
        btnAdd.setPreferredSize(new java.awt.Dimension(77, 19));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(0, 153, 153));
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.setAlignmentX(0.5F);
        btnUpdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, java.awt.Color.lightGray));
        btnUpdate.setBorderPainted(false);
        btnUpdate.setMargin(new java.awt.Insets(0, 15, 0, 15));
        btnUpdate.setPreferredSize(new java.awt.Dimension(77, 19));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(0, 153, 153));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.setAlignmentX(0.5F);
        btnDelete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, java.awt.Color.lightGray));
        btnDelete.setBorderPainted(false);
        btnDelete.setMargin(new java.awt.Insets(0, 15, 0, 15));
        btnDelete.setPreferredSize(new java.awt.Dimension(77, 19));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(0, 153, 153));
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.setAlignmentX(0.5F);
        btnClear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, java.awt.Color.lightGray));
        btnClear.setBorderPainted(false);
        btnClear.setMargin(new java.awt.Insets(0, 15, 0, 15));
        btnClear.setPreferredSize(new java.awt.Dimension(77, 19));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 153, 153));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.setAlignmentX(0.5F);
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, java.awt.Color.lightGray));
        btnBack.setBorderPainted(false);
        btnBack.setMargin(new java.awt.Insets(0, 15, 0, 15));
        btnBack.setPreferredSize(new java.awt.Dimension(77, 19));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("Manager");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        //javax.swing.JOptionPane.showMessageDialog(null, "Hello");
        
        String t1 = txtSearchStudentId.getText().trim();
        if (t1.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Please enter a student ID before searching.");
            return;
        }
        try {
            int studentId = Integer.parseInt(t1);          
            Connection conn = DatabaseConnection.getConnection();
            if (conn == null) {
                javax.swing.JOptionPane.showMessageDialog(null, "Error establishing database connection.");
                return;
            }

            PreparedStatement pstmt = null;
            ResultSet rs = null;
            try {
                pstmt = conn.prepareStatement("SELECT * FROM Student WHERE Student_ID = ?");
                pstmt.setInt(1, studentId);
                rs = pstmt.executeQuery();
                //check if student exists or not 
               if (rs.next()) {
                    // Student exists
                    javax.swing.JOptionPane.showMessageDialog(null, "Student exists");

                    // Retrieve and set values for each field
                    txtStudentID.setText(String.valueOf(rs.getInt("Student_ID")));
                    txtFirstName.setText(rs.getString("FirstName"));
                    txtLastName.setText(rs.getString("LastName"));
                    txtDate.setDate(rs.getDate("DOB"));
                    txtGender.setSelectedItem(rs.getString("Gender"));
                    txtFatherName.setText(rs.getString("Father_Name"));
                    txtFOccupation.setText(rs.getString("F_Occupation"));
                    txtMotherName.setText(rs.getString("Mother_Name"));
                    txtMOccupation.setText(rs.getString("M_Occupation"));
                    txtAddress.setText(rs.getString("Address"));
                    txtContectNo.setText(rs.getString("Contact_no"));
                    txtBatch.setText(rs.getString("Batch"));
                    txtBranch.setText(rs.getString("Branch"));
                    txtYear.setText(rs.getString("Year"));

                    javax.swing.JOptionPane.showMessageDialog(null, "all components working successfully");
                } else {
                    // Student does not exist
                    javax.swing.JOptionPane.showMessageDialog(null, "Student does not exist");
                }
                
            } catch (SQLException e) {
                javax.swing.JOptionPane.showMessageDialog(null, "Error executing query: " + e.getMessage());
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
                } catch (Exception e) {
                    javax.swing.JOptionPane.showMessageDialog(null, "Error closing resources: " + e.getMessage());
                }
            }
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Invalid student ID format. Please enter a valid integer.");
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
         // Clear all text fields
        txtAddress.setText("");
        txtBatch.setText("");
        txtBranch.setText("");
        txtContectNo.setText("");
        txtFOccupation.setText("");
        txtFatherName.setText("");
        txtFirstName.setText("");
        txtLastName.setText("");
        txtMOccupation.setText("");
        txtMotherName.setText("");
        txtSearchStudentId.setText("");
        txtStudentID.setText("");
        txtYear.setText("");

        // Reset combo box
        txtGender.setSelectedIndex(0);

        // Clear date chooser
        txtDate.setDate(null);
        
        // Set focus back to txtSearchStudentId
        txtSearchStudentId.requestFocus();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        
        // Check if StudentID is empty
        if (txtStudentID.getText().trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Please fill in the Student ID");
            txtStudentID.requestFocus();
            return;
        }

        // Check if StudentID already exists in the database
        try {
            Connection conn = DatabaseConnection.getConnection();
            PreparedStatement pstmt = null;
            String query = "SELECT * FROM Student WHERE Student_ID = ?";
            pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, Integer.parseInt(txtStudentID.getText()));
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                javax.swing.JOptionPane.showMessageDialog(null, "Student ID already exists. Please choose a different ID.");
                txtStudentID.requestFocus();
                return;
            }
        } catch (SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error checking Student ID: " + e.getMessage());
            return;
        }
        
        // Check if FirstName is empty
        if (txtFirstName.getText().trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Please fill in the First Name");
            txtFirstName.requestFocus();
            return;
        }

        // Check if LastName is empty
        if (txtLastName.getText().trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Please fill in the Last Name");
            txtLastName.requestFocus();
            return;
        }

        // Check if DOB is empty
        if (txtDate.getDate() == null) {
            javax.swing.JOptionPane.showMessageDialog(null, "Please select the Date of Birth");
            txtDate.requestFocus();
            return;
        }

        // Check if Gender is empty
        if (txtGender.getSelectedItem() == null) {
            javax.swing.JOptionPane.showMessageDialog(null, "Please select the Gender");
            txtGender.requestFocus();
            return;
        }

        // Check if Father_Name is empty
        if (txtFatherName.getText().trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Please fill in the Father's Name");
            txtFatherName.requestFocus();
            return;
        }

        // Check if F_Occupation is empty
        if (txtFOccupation.getText().trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Please fill in the Father's Occupation");
            txtFOccupation.requestFocus();
            return;
        }

        // Check if Mother_Name is empty
        if (txtMotherName.getText().trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Please fill in the Mother's Name");
            txtMotherName.requestFocus();
            return;
        }

        // Check if M_Occupation is empty
        if (txtMOccupation.getText().trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Please fill in the Mother's Occupation");
            txtMOccupation.requestFocus();
            return;
        }

        // Check if Address is empty
        if (txtAddress.getText().trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Please fill in the Address");
            txtAddress.requestFocus();
            return;
        }

        // Check if Contact No is empty, has exactly 10 digits, and contains only digits
        if (txtContectNo.getText().trim().isEmpty() || txtContectNo.getText().trim().length() != 10 || !txtContectNo.getText().trim().matches("\\d+")) {
            if (txtContectNo.getText().trim().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(null, "Please fill in the Contact No");
            } else if (txtContectNo.getText().trim().length() != 10) {
                javax.swing.JOptionPane.showMessageDialog(null, "Contact No must have exactly 10 digits");
            } else {
                javax.swing.JOptionPane.showMessageDialog(null, "Contact No must contain only digits");
            }
            txtContectNo.requestFocus();
            return;
        }
        
        // Check if Batch is empty
        if (txtBatch.getText().trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Please fill in the Batch");
            txtBatch.requestFocus();
            return;
        }

        // Check if Branch is empty
        if (txtBranch.getText().trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Please fill in the Branch");
            txtBranch.requestFocus();
            return;
        }

        // Check if Year is empty
        if (txtYear.getText().trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Please fill in the Year");
            txtYear.requestFocus();
            return;
        }

        // Get values from text fields
        int studentId = Integer.parseInt(txtStudentID.getText());
        String firstName = txtFirstName.getText();
        String lastName = txtLastName.getText();
        Date sqlDate = new Date(txtDate.getDate().getTime());
        String gender = (String) txtGender.getSelectedItem();
        String fatherName = txtFatherName.getText();
        String fOccupation = txtFOccupation.getText();
        String motherName = txtMotherName.getText();
        String mOccupation = txtMOccupation.getText();
        String address = txtAddress.getText();
        String contactNo = txtContectNo.getText();
        String batch = txtBatch.getText();
        String branch = txtBranch.getText();
        String year = txtYear.getText();

        
        Connection conn = DatabaseConnection.getConnection();
        PreparedStatement pstmt;        
        // Create a prepared statement to insert into the database
        String query = "INSERT INTO Student (Student_ID, FirstName, LastName, DOB, Gender, Father_Name, F_Occupation, Mother_Name, M_Occupation, Address, Contact_no, Batch, Branch, Year) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, studentId);
            pstmt.setString(2, firstName);
            pstmt.setString(3, lastName);           
            pstmt.setDate(4, sqlDate);
            pstmt.setString(5, gender);
            pstmt.setString(6, fatherName);
            pstmt.setString(7, fOccupation);
            pstmt.setString(8, motherName);
            pstmt.setString(9, mOccupation);
            pstmt.setString(10, address);
            pstmt.setString(11, contactNo);
            pstmt.setString(12, batch);
            pstmt.setString(13, branch);
            pstmt.setString(14, year);

            // Execute the query
            pstmt.executeUpdate();

            // Show a success message
            javax.swing.JOptionPane.showMessageDialog(null, "Student added successfully!");
        } catch (SQLException e) {
            // Handle any SQL exceptions
            javax.swing.JOptionPane.showMessageDialog(null, "Error adding student: " + e.getMessage());
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        // Get the student ID from a text field or wherever you're storing it
        int studentId = Integer.parseInt(txtStudentID.getText());

        // Create a DELETE query with a parameter for the student ID
        String query = "DELETE FROM Student WHERE Student_ID = ?";
        Connection conn = DatabaseConnection.getConnection();
        PreparedStatement pstmt;
        try {
            // Prepare the statement
            pstmt = conn.prepareStatement(query);

            // Set the student ID parameter
            pstmt.setInt(1, studentId);

            // Execute the query
            pstmt.executeUpdate();

            // Show a success message
            javax.swing.JOptionPane.showMessageDialog(null, "Student deleted successfully!");
            btnClearActionPerformed(evt);
        } catch (SQLException ex) {
            // Handle any SQL exceptions
            javax.swing.JOptionPane.showMessageDialog(null, "Error deleting student: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:       
        // Check if StudentID is empty
        if (txtStudentID.getText().trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Please fill in the Student ID");
            txtStudentID.requestFocus();
            return;
        }

        // Check if FirstName is empty
        if (txtFirstName.getText().trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Please fill in the First Name");
            txtFirstName.requestFocus();
            return;
        }

        // Check if LastName is empty
        if (txtLastName.getText().trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Please fill in the Last Name");
            txtLastName.requestFocus();
            return;
        }

        // Check if DOB is empty
        if (txtDate.getDate() == null) {
            javax.swing.JOptionPane.showMessageDialog(null, "Please select the Date of Birth");
            txtDate.requestFocus();
            return;
        }

        // Check if Gender is empty
        if (txtGender.getSelectedItem() == null) {
            javax.swing.JOptionPane.showMessageDialog(null, "Please select the Gender");
            txtGender.requestFocus();
            return;
        }

        // Check if Father_Name is empty
        if (txtFatherName.getText().trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Please fill in the Father's Name");
            txtFatherName.requestFocus();
            return;
        }

        // Check if F_Occupation is empty
        if (txtFOccupation.getText().trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Please fill in the Father's Occupation");
            txtFOccupation.requestFocus();
            return;
        }

        // Check if Mother_Name is empty
        if (txtMotherName.getText().trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Please fill in the Mother's Name");
            txtMotherName.requestFocus();
            return;
        }

        // Check if M_Occupation is empty
        if (txtMOccupation.getText().trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Please fill in the Mother's Occupation");
            txtMOccupation.requestFocus();
            return;
        }

        // Check if Address is empty
        if (txtAddress.getText().trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Please fill in the Address");
            txtAddress.requestFocus();
            return;
        }

        // Check if Contact No is empty, has exactly 10 digits, and contains only digits
        if (txtContectNo.getText().trim().isEmpty() || txtContectNo.getText().trim().length() != 10 || !txtContectNo.getText().trim().matches("\\d+")) {
            if (txtContectNo.getText().trim().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(null, "Please fill in the Contact No");
            } else if (txtContectNo.getText().trim().length() != 10) {
                javax.swing.JOptionPane.showMessageDialog(null, "Contact No must have exactly 10 digits");
            } else {
                javax.swing.JOptionPane.showMessageDialog(null, "Contact No must contain only digits");
            }
            txtContectNo.requestFocus();
            return;
        }

        // Check if Batch is empty
        if (txtBatch.getText().trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Please fill in the Batch");
            txtBatch.requestFocus();
            return;
        }

        // Check if Branch is empty
        if (txtBranch.getText().trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Please fill in the Branch");
            txtBranch.requestFocus();
            return;
        }

        // Check if Year is empty
        if (txtYear.getText().trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Please fill in the Year");
            txtYear.requestFocus();
            return;
        }

        // Get values from text fields
        int studentId = Integer.parseInt(txtStudentID.getText());
        String firstName = txtFirstName.getText();
        String lastName = txtLastName.getText();
        Date sqlDate = new Date(txtDate.getDate().getTime());
        String gender = (String) txtGender.getSelectedItem();
        String fatherName = txtFatherName.getText();
        String fOccupation = txtFOccupation.getText();
        String motherName = txtMotherName.getText();
        String mOccupation = txtMOccupation.getText();
        String address = txtAddress.getText();
        String contactNo = txtContectNo.getText();
        String batch = txtBatch.getText();
        String branch = txtBranch.getText();
        String year = txtYear.getText();

        Connection conn = DatabaseConnection.getConnection();
        PreparedStatement pstmt;        
        // Create a prepared statement to update the database
        String query = "UPDATE Student SET FirstName = ?, LastName = ?, DOB = ?, Gender = ?, Father_Name = ?, F_Occupation = ?, Mother_Name = ?, M_Occupation = ?, Address = ?, Contact_no = ?, Batch = ?, Branch = ?, Year = ? WHERE Student_ID = ?";
        try {
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, firstName);
            pstmt.setString(2, lastName);           
            pstmt.setDate(3, sqlDate);
            pstmt.setString(4, gender);
            pstmt.setString(5, fatherName);
            pstmt.setString(6, fOccupation);
            pstmt.setString(7, motherName);
            pstmt.setString(8, mOccupation);
            pstmt.setString(9, address);
            pstmt.setString(10, contactNo);
            pstmt.setString(11, batch);
            pstmt.setString(12, branch);
            pstmt.setString(13, year);
            pstmt.setInt(14, studentId);

            // Execute the query
            pstmt.executeUpdate();

            // Show a success message
            javax.swing.JOptionPane.showMessageDialog(null, "Student updated successfully!");
        } catch (SQLException e) {
            // Handle any SQL exceptions
            javax.swing.JOptionPane.showMessageDialog(null, "Error updating student: " + e.getMessage());
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnStudentRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentRecordActionPerformed
        // TODO add your handling code here:
        Student_record st = new Student_record();
        st.setVisible(true);
        st.pack();
        st.setLocationRelativeTo(null);
        
        this.dispose();
    }//GEN-LAST:event_btnStudentRecordActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        //System.exit(0);
        Home home = new Home();
        home.setVisible(true);
        home.pack();
        home.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnStudentRecord;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtBatch;
    private javax.swing.JTextField txtBranch;
    private javax.swing.JTextField txtContectNo;
    private com.toedter.calendar.JDateChooser txtDate;
    private javax.swing.JTextField txtFOccupation;
    private javax.swing.JTextField txtFatherName;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JComboBox txtGender;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMOccupation;
    private javax.swing.JTextField txtMotherName;
    private javax.swing.JTextField txtSearchStudentId;
    private javax.swing.JTextField txtStudentID;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
