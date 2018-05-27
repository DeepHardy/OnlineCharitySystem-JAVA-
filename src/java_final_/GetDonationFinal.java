/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_final_;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anubhav
 */
public class GetDonationFinal extends javax.swing.JFrame {
    

    /**
     * Creates new form GetDonationFinal
     */
    public ImageIcon ResizeImage2(String imagePath, byte[]pic){
        ImageIcon myImage=null;
        if(imagePath!=null){
            myImage = new ImageIcon(imagePath);
        }else{
            myImage=new ImageIcon(pic);
        }
        Image img=myImage.getImage();
        Image img2=img.getScaledInstance(lbl_image2.getWidth(), lbl_image2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image=new ImageIcon(img2);
        return image;
    }
    public ImageIcon ResizeImage3(String imagePath, byte[]pic){
        ImageIcon myImage=null;
        if(imagePath!=null){
            myImage = new ImageIcon(imagePath);
        }else{
            myImage=new ImageIcon(pic);
        }
        Image img=myImage.getImage();
        Image img2=img.getScaledInstance(lbl_image3.getWidth(), lbl_image3.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image=new ImageIcon(img2);
        return image;
    }
    String ImgPath=null;
    public GetDonationFinal() {
        initComponents();
        Show_Products_In_JTable();
        setTitle("GetDonation");
        ImgPath="C:\\Users\\anubh\\Desktop\\DeskTop Icons\\Java Project Pics\\20.jpg";
        lbl_image2.setIcon(ResizeImage2(ImgPath,null));
        ImgPath="C:\\Users\\anubh\\Desktop\\DeskTop Icons\\Java Project Pics\\23.png";
        lbl_image3.setIcon(ResizeImage3(ImgPath,null));
        
    }
    public int check=0;
    public ImageIcon ResizeImage(String imagePath, byte[]pic){
        ImageIcon myImage=null;
        if(imagePath!=null){
            myImage = new ImageIcon(imagePath);
        }else{
            myImage=new ImageIcon(pic);
        }
        Image img=myImage.getImage();
        Image img2=img.getScaledInstance(lbl_image.getWidth(), lbl_image.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image=new ImageIcon(img2);
        return image;
    }
    public ArrayList<ProductFinal> getProductList(){
    ArrayList<ProductFinal> productList=new ArrayList<ProductFinal>();
            Connection conn = JavaConnection.ConnecrDb();
            String query = "SELECT * FROM donateitems";
            
            Statement st;
            ResultSet rs;
        try {
            st=conn.createStatement();
            rs=st.executeQuery(query);
            ProductFinal product;
            
            while(rs.next()){
                product=new ProductFinal(rs.getInt("id"),rs.getString("item_name"),Integer.parseInt(rs.getString("quantity")),rs.getString("type"),rs.getBytes("image"));
                productList.add(product);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GetDonationFinal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return productList;
}
    public void Show_Products_In_JTable(){
        ArrayList<ProductFinal> list=getProductList();
        DefaultTableModel model=(DefaultTableModel)JTable_Products.getModel();
        // clear JTable content
        model.setRowCount(0);
        Object[] row=new Object[4];
        for(int i=0;i< list.size();i++){
            row[0]=list.get(i).getName();
            row[1]=list.get(i).getQuantity();
            row[2]=list.get(i).getType();
            row[3]=list.get(i).getId();
            
            model.addRow(row);
        }}
    
    String a1=null;
    String a2=null;
    String a3=null;
    String a4=null;
    public void ShowItem(int index){
        txt_4.setText(Integer.toString(getProductList().get(index).getId()));
        txt_1.setText(getProductList().get(index).getName());
        txt_2.setText(Integer.toString(getProductList().get(index).getQuantity()));
        txt_3.setText(getProductList().get(index).getType());
        lbl_image.setIcon(ResizeImage(null, getProductList().get(index).getImage()));
        
    
}
    public void delete(){
        
        try {
                Connection con=JavaConnection.ConnecrDb();
                PreparedStatement ps=con.prepareStatement("DELETE FROM donateitems WHERE id = ?");
                int id = Integer.parseInt(txt_4.getText());
                ps.setInt(1, id);
                ps.executeUpdate();
                Show_Products_In_JTable();
                //JOptionPane.showMessageDialog(null, "Product Deleted");
            } catch (SQLException ex) {
                Logger.getLogger(GetDonationFinal.class.getName()).log(Level.SEVERE, null, ex);
                //JOptionPane.showMessageDialog(null, "Product Not Deleted");
            }
        }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    String name2=null;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txt_1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lbl_image = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTable_Products = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lbl_image3 = new javax.swing.JLabel();
        lbl_image2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(580, 280));
        setMinimumSize(new java.awt.Dimension(1110, 665));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 140, 79, 29);

        txt_1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_1.setFocusable(false);
        getContentPane().add(txt_1);
        txt_1.setBounds(250, 140, 239, 28);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Enter Your Mobile Number:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 580, 330, 29);

        txt_2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_2.setFocusable(false);
        getContentPane().add(txt_2);
        txt_2.setBounds(250, 190, 239, 28);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("City:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(180, 230, 67, 29);

        txt_3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_3.setFocusable(false);
        getContentPane().add(txt_3);
        txt_3.setBounds(250, 230, 239, 28);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Item ID:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(140, 280, 105, 29);

        txt_4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_4.setFocusable(false);
        getContentPane().add(txt_4);
        txt_4.setBounds(250, 280, 239, 28);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Image:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(150, 320, 87, 29);

        lbl_image.setBackground(new java.awt.Color(255, 255, 153));
        lbl_image.setOpaque(true);
        getContentPane().add(lbl_image);
        lbl_image.setBounds(250, 320, 239, 210);

        jButton2.setBackground(new java.awt.Color(204, 255, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("HOME");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(15, 490, 210, 37);

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton1.setText("CLAIM ITEM");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(630, 570, 490, 53);

        JTable_Products.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Quantity", "City", "Item ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTable_Products.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTable_ProductsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTable_Products);
        if (JTable_Products.getColumnModel().getColumnCount() > 0) {
            JTable_Products.getColumnModel().getColumn(0).setResizable(false);
            JTable_Products.getColumnModel().getColumn(1).setResizable(false);
            JTable_Products.getColumnModel().getColumn(2).setResizable(false);
            JTable_Products.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(580, 140, 452, 386);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(350, 580, 260, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Quantity Available:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 190, 227, 29);
        getContentPane().add(lbl_image3);
        lbl_image3.setBounds(220, 30, 750, 70);
        getContentPane().add(lbl_image2);
        lbl_image2.setBounds(0, 0, 1120, 630);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JTable_ProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTable_ProductsMouseClicked
        // TODO add your handling code here:
        int index=JTable_Products.getSelectedRow();
        ShowItem(index);
        a1=txt_1.getText();
        a2=txt_2.getText();
        a3=txt_3.getText();
        a4=txt_4.getText();
    }//GEN-LAST:event_JTable_ProductsMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String sql2="Select * from signup where mobile=?";
        Connection conn2=JavaConnection.ConnecrDb();
        PreparedStatement pst2;
        ResultSet rs2;
        String to1=" ";
        try{
            pst2 = conn2.prepareStatement(sql2);
            pst2.setString(1, jTextField1.getText());
            rs2 = pst2.executeQuery();
            if(rs2.next()){
                String UpdateQuery=null;
                String az=rs2.getString("name");
                String a=rs2.getString("mobile");
                String b=rs2.getString("email");
                String c=rs2.getString("id");
                to1=to1+az+" \nMobile number:"+a+" \nEmail Id:"+b+" "+". \nand His ID is:"+c;
                //String a1=txt_1.getText();
                //String a2=txt_2.getText();
                //String a3=txt_3.getText();
                //String a4=txt_4.getText();
                System.out.println(to1);
                to1=to1+"\n"+"INFORMATION ABOUT ITEM:"+"\nITEM NAME:"+a1+"\nCURRENT QUANTITY:"+a2+"\nCITY:"+a3+"\nITEM ID:"+a4+".";
                System.out.println(to1);
        PreparedStatement ps=null;
        Connection con= JavaConnection.ConnecrDb();
        String sql ="Select * from donateitems where id=?";
        ResultSet rs=null;
        try {
                    UpdateQuery="UPDATE donateitems SET quantity = ? WHERE id = ?";
                    ps=con.prepareStatement(UpdateQuery);
                    int i=Integer.parseInt(txt_2.getText())-1;
                    ps.setString(1, Integer.toString(i));
                    //ps.setString(2, txt_price.getText());
                    //ps.setString(3, txt_AddDate.getText());
                    ps.setInt(2, Integer.parseInt(txt_4.getText()));
                    ps.executeUpdate();
                    Show_Products_In_JTable();
                    
                    ps=con.prepareStatement(sql);
                    ps.setString(1, txt_4.getText());
                    rs=ps.executeQuery();
                    String address="";
                    String name="";
                    while(rs.next()){
                        address=rs.getString("mobile");
                        name=rs.getString("name");
                        name2=name;
                        check=Integer.parseInt(rs.getString("quantity"));
                        EmailFinal ef=new EmailFinal();
                        ef.sendMail("rjanand812qw@gmail.com", "anubhav.anand@bennett.edu.in","Item has been claimed in your \"ONLINE CHARITY SYSTEM\" by"+to1+"\nName of Donator is:"+name2+"\n Please call to confirm.");
                        ef.sendMail("rjanand812qw@gmail.com", "riya.mishra@bennett.edu.in","Item has been claimed in your \"ONLINE CHARITY SYSTEM\" by"+to1+"."+"\nName of Donator is:"+name2+"\n Please call to confirm.");
                        ef.sendMail("rjanand812qw@gmail.com", "deepak.sharma@bennett.edu.in","Item has been claimed in your \"ONLINE CHARITY SYSTEM\" by"+to1+"."+"\nName of Donator is:"+name2+"\n Please call to confirm.");
                        ef.sendMail("rjanand812qw@gmail.com", "navnidhi.sharma@bennett.edu.in","Item has been claimed in your \"ONLINE CHARITY SYSTEM\" by"+to1+"."+"\nName of Donator is:"+name2+"\n Please call to confirm.");
                        System.out.println(check);
                    }
                    JOptionPane.showMessageDialog(null, "Item is Yours\n"+"\nName of the seller is: "+name+"\nPlease Contact on this number "+address+" for more information (address,time,ect).\nThankyou for Using our Application.");
                    //JOptionPane.showMessageDialog(null, "Product Updated");
                } catch (SQLException ex) {
                    Logger.getLogger(GetDonationFinal.class.getName()).log(Level.SEVERE, null, ex);
                }
        
        
     /*   try{
            
            ps=con.prepareStatement("DELETE FROM products WHERE id = ?");
            int id = Integer.parseInt(txt_4.getText());
                ps.setInt(1, id);
                //ps.executeUpdate();
                rs=ps.executeQuery();
                Show_Products_In_JTable();
                JOptionPane.showMessageDialog(null, "Product Deleted");
            } catch (SQLException ex) {
                Logger.getLogger(GetDonationFinal.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Product Not Deleted");
            }*/
            
        
                

        
        /*String sql ="Select * from signup where mobile = ? and password = ?";
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1, txt_f8.getText());
            pst.setString(2, txt_f9.getText());
            rs = pst.executeQuery();
            if(rs.next()){
                close();
                Welcome w=new Welcome();
                w.setVisible(true);
                System.out.println("Logged in successfully.");
            }else{
                JOptionPane.showMessageDialog(null, "ID and Password does not match.\nPress \"OK\" and try again.", "Wrong Input", JOptionPane.ERROR_MESSAGE);
                txt_f8.setText("");
                txt_f9.setText("");
                System.out.println("ID and Password does not match.");
            }
            pst.execute();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }*/
        //DELETING PRODUCT
        /*try {
                Connection con=getConnection();
                PreparedStatement ps=con.prepareStatement("DELETE FROM products WHERE id = ?");
                int id = Integer.parseInt(txt_id.getText());
                ps.setInt(1, id);
                ps.executeUpdate();
                Show_Products_In_JTable();
                JOptionPane.showMessageDialog(null, "Product Deleted");
            } catch (SQLException ex) {
                Logger.getLogger(GetDonationFinal.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Product Not Deleted");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Product Not Deleted : Enter The Product Id");
        }*/
        if(check<=0){
            delete();
        }
            }else{
                JOptionPane.showMessageDialog(null, "Mobile number does not match.\nPress \"OK\" and try again.", "Wrong Input", JOptionPane.ERROR_MESSAGE);
                jTextField1.setText("");
                
                //System.out.println("ID and Password does not match.");
            }
            pst2.execute();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        close();
        WelcomeFinal wel=new WelcomeFinal();
        wel.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    /*public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GetDonationFinal().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTable_Products;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbl_image;
    private javax.swing.JLabel lbl_image2;
    private javax.swing.JLabel lbl_image3;
    private javax.swing.JTextField txt_1;
    private javax.swing.JTextField txt_2;
    private javax.swing.JTextField txt_3;
    private javax.swing.JTextField txt_4;
    // End of variables declaration//GEN-END:variables
    private void close(){
        WindowEvent wc=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(wc);
    }
}
