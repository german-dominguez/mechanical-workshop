package com.tix.home.vehicles.upvehicles;

public class UpVehicleView extends javax.swing.JPanel {

    /**
     * Creates new form RegisterForm
     */
    public UpVehicleView() {
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

        Title = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        Text3 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        Text6 = new javax.swing.JLabel();
        title = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        Text7 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        Text8 = new javax.swing.JLabel();
        author = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        Text9 = new javax.swing.JLabel();
        category = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        edit = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        Text10 = new javax.swing.JLabel();
        Text4 = new javax.swing.JLabel();
        lang = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        Text11 = new javax.swing.JLabel();
        pages = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        Text12 = new javax.swing.JLabel();
        descr = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        Text13 = new javax.swing.JLabel();
        stock = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        Text14 = new javax.swing.JLabel();
        ejem = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        available = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        Text15 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("Subir nuevo Libro");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 10, 350));

        Text3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text3.setText("Libro ID");
        add(Text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        id.setForeground(new java.awt.Color(102, 102, 102));
        id.setText("Ingrese el ID del Libro");
        id.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 260, 30));

        jSeparator4.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator4.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 260, 10));

        Text6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text6.setText("T??tulo");
        add(Text6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        title.setForeground(new java.awt.Color(102, 102, 102));
        title.setText("Ingrese el T??tulo");
        title.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 260, 30));

        jSeparator7.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator7.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 260, 10));

        Text7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text7.setText("Fecha de Publicaci??n");
        add(Text7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        date.setForeground(new java.awt.Color(102, 102, 102));
        date.setText("Ingrese la Fecha de Publicaci??n");
        date.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 260, 30));

        jSeparator8.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator8.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 260, 10));

        Text8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text8.setText("Autor");
        add(Text8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        author.setForeground(new java.awt.Color(102, 102, 102));
        author.setText("Ingrese el nombre del Autor/es");
        author.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(author, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 260, 30));

        jSeparator9.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator9.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 260, 10));

        Text9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text9.setText("Categor??a");
        add(Text9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        category.setForeground(new java.awt.Color(102, 102, 102));
        category.setText("Ingrese la Categor??a del Libro");
        category.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(category, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 260, 30));

        jSeparator10.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator10.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 260, 10));

        edit.setForeground(new java.awt.Color(102, 102, 102));
        edit.setText("Ingrese la edici??n");
        edit.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 260, 30));

        jSeparator11.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator11.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 260, 10));

        Text10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text10.setText("Edici??n");
        add(Text10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        Text4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text4.setText("Idioma");
        add(Text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, -1, -1));

        lang.setForeground(new java.awt.Color(102, 102, 102));
        lang.setText("Ingrese el idioma del Libro");
        lang.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(lang, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 260, 30));

        jSeparator5.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator5.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 260, 10));

        Text11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text11.setText("P??ginas");
        add(Text11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, -1, -1));

        pages.setForeground(new java.awt.Color(102, 102, 102));
        pages.setText("Ingrese la cantidad de p??ginas totales");
        pages.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(pages, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 260, 30));

        jSeparator12.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator12.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 260, 10));

        Text12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text12.setText("Descripci??n");
        add(Text12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, -1, -1));

        descr.setForeground(new java.awt.Color(102, 102, 102));
        descr.setText("Ingrese la descripci??n del Libro");
        descr.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(descr, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 260, 30));

        jSeparator13.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator13.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 260, 10));

        Text13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text13.setText("Stock");
        add(Text13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, -1, -1));

        stock.setForeground(new java.awt.Color(102, 102, 102));
        stock.setText("Cantidad Total");
        stock.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 80, 30));

        jSeparator14.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator14.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 80, 10));

        Text14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text14.setText("Ejemplares");
        add(Text14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, -1, -1));

        ejem.setForeground(new java.awt.Color(102, 102, 102));
        ejem.setText("Ingrese la cantidad de ejemplares");
        ejem.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(ejem, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 260, 30));

        jSeparator15.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator15.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 260, 10));

        available.setForeground(new java.awt.Color(102, 102, 102));
        available.setText("Cantidad a prestar");
        available.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(available, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 100, 30));

        jSeparator16.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator16.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 100, 10));

        Text15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text15.setText("Disponibles");
        add(Text15, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Text10;
    private javax.swing.JLabel Text11;
    private javax.swing.JLabel Text12;
    private javax.swing.JLabel Text13;
    private javax.swing.JLabel Text14;
    private javax.swing.JLabel Text15;
    private javax.swing.JLabel Text3;
    private javax.swing.JLabel Text4;
    private javax.swing.JLabel Text6;
    private javax.swing.JLabel Text7;
    private javax.swing.JLabel Text8;
    private javax.swing.JLabel Text9;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField author;
    private javax.swing.JTextField available;
    private javax.swing.JTextField category;
    private javax.swing.JTextField date;
    private javax.swing.JTextField descr;
    private javax.swing.JTextField edit;
    private javax.swing.JTextField ejem;
    private javax.swing.JTextField id;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField lang;
    private javax.swing.JTextField pages;
    private javax.swing.JTextField stock;
    private javax.swing.JTextField title;
    // End of variables declaration//GEN-END:variables
}
