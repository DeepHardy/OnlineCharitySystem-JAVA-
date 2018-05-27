/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_final_;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anubhav
 */
public class AdminPanelFinal extends javax.swing.JFrame {

    /**
     * Creates new form AdminPanelFinal
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
    int pos=0;
    public AdminPanelFinal() {
        initComponents();
        Show_Products_In_JTable();
        setTitle("Admin Panel");
        ImgPath="C:\\Users\\anubh\\Desktop\\DeskTop Icons\\Java Project Pics\\19.jpg";
        lbl_image2.setIcon(ResizeImage2(ImgPath,null));
        ImgPath="C:\\Users\\anubh\\Desktop\\DeskTop Icons\\Java Project Pics\\24.png";
        lbl_image3.setIcon(ResizeImage3(ImgPath,null));
        
    }
    
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
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
            Logger.getLogger(AdminPanelFinal.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(AdminPanelFinal.class.getName()).log(Level.SEVERE, null, ex);
                //JOptionPane.showMessageDialog(null, "Product Not Deleted");
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
        txt_choose = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txt_update = new javax.swing.JButton();
        txt_delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTable_Products = new javax.swing.JTable();
        txt_first = new javax.swing.JButton();
        txt_next = new javax.swing.JButton();
        txt_previous = new javax.swing.JButton();
        txt_last = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        lbl_image3 = new javax.swing.JLabel();
        lbl_image2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(500, 150));
        setMinimumSize(new java.awt.Dimension(1142, 803));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Date Of DOnation:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 620, 220, 29);

        txt_1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(txt_1);
        txt_1.setBounds(260, 130, 239, 28);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Quantity Available:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 170, 227, 29);

        txt_2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(txt_2);
        txt_2.setBounds(260, 170, 239, 28);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("City:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(190, 210, 67, 29);

        txt_3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(txt_3);
        txt_3.setBounds(260, 210, 239, 28);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Item ID:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(140, 260, 105, 29);

        txt_4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_4.setFocusable(false);
        getContentPane().add(txt_4);
        txt_4.setBounds(260, 260, 239, 28);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Image:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(160, 300, 87, 29);

        lbl_image.setBackground(new java.awt.Color(255, 255, 153));
        lbl_image.setOpaque(true);
        getContentPane().add(lbl_image);
        lbl_image.setBounds(260, 300, 239, 210);

        txt_choose.setBackground(new java.awt.Color(204, 255, 204));
        txt_choose.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_choose.setText("Choose Image");
        txt_choose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_chooseActionPerformed(evt);
            }
        });
        getContentPane().add(txt_choose);
        txt_choose.setBounds(13, 390, 230, 31);

        jButton2.setBackground(new java.awt.Color(204, 255, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("HOME");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(110, 450, 105, 37);

        txt_update.setBackground(new java.awt.Color(204, 255, 204));
        txt_update.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_update.setText("Update");
        txt_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_updateActionPerformed(evt);
            }
        });
        getContentPane().add(txt_update);
        txt_update.setBounds(220, 670, 137, 31);

        txt_delete.setBackground(new java.awt.Color(204, 255, 204));
        txt_delete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_delete.setText("Delete");
        txt_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_deleteActionPerformed(evt);
            }
        });
        getContentPane().add(txt_delete);
        txt_delete.setBounds(380, 670, 152, 31);

        JTable_Products.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Quantity", "Type", "Item ID"
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
        jScrollPane1.setBounds(620, 120, 452, 386);

        txt_first.setBackground(new java.awt.Color(204, 255, 204));
        txt_first.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_first.setText("First");
        txt_first.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_firstActionPerformed(evt);
            }
        });
        getContentPane().add(txt_first);
        txt_first.setBounds(590, 520, 110, 31);

        txt_next.setBackground(new java.awt.Color(204, 255, 204));
        txt_next.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_next.setText("Next");
        txt_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nextActionPerformed(evt);
            }
        });
        getContentPane().add(txt_next);
        txt_next.setBounds(710, 520, 95, 31);

        txt_previous.setBackground(new java.awt.Color(204, 255, 204));
        txt_previous.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_previous.setText("Previous");
        txt_previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_previousActionPerformed(evt);
            }
        });
        getContentPane().add(txt_previous);
        txt_previous.setBounds(811, 520, 140, 31);

        txt_last.setBackground(new java.awt.Color(204, 255, 204));
        txt_last.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_last.setText("Last");
        txt_last.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_lastActionPerformed(evt);
            }
        });
        getContentPane().add(txt_last);
        txt_last.setBounds(960, 520, 100, 31);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Name:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(170, 130, 79, 29);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("Name Of Donor:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(50, 530, 200, 29);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Mobile Number:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(50, 580, 200, 29);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.setFocusable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(260, 532, 240, 30);

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField2.setFocusable(false);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(260, 580, 240, 28);

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField3.setFocusable(false);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(260, 620, 240, 28);
        getContentPane().add(lbl_image3);
        lbl_image3.setBounds(230, 20, 630, 70);
        getContentPane().add(lbl_image2);
        lbl_image2.setBounds(0, 0, 1140, 780);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JTable_ProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTable_ProductsMouseClicked
        // TODO add your handling code here:
        int index=JTable_Products.getSelectedRow();
        ShowItem(index);
        String sql="select * from donateitems where id=?";
        try{
            /*pst = conn.prepareStatement(sql);
            pst.setString(1, txt_f8.getText());
            pst.setString(2, txt_f9.getText());
            rs = pst.executeQuery();
            if(rs.next()){
                close();
                WelcomeFinal w=new WelcomeFinal();
                w.setVisible(true);
                System.out.println("Logged in successfully.");
            }else{
                JOptionPane.showMessageDialog(null, "ID and Password does not match.\nPress \"OK\" and try again.", "Wrong Input", JOptionPane.ERROR_MESSAGE);
                txt_f8.setText("");
                txt_f9.setText("");
                System.out.println("ID and Password does not match.");
            }
            pst.execute();*/
            conn=JavaConnection.ConnecrDb();
            pst = conn.prepareStatement(sql);
            pst.setString(1, txt_4.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                jTextField1.setText(rs.getString("Name"));
                jTextField2.setText(rs.getString("mobile"));
                jTextField3.setText(rs.getString("date"));
            }else{
                JOptionPane.showMessageDialog(null, "Error");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_JTable_ProductsMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        close();
        WelcomeFinal wel=new WelcomeFinal();
        wel.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_updateActionPerformed
        // TODO add your handling code here:
        if(txt_4.getText()!=null){
            String UpdateQuery=null;
            PreparedStatement ps=null;
            Connection con= JavaConnection.ConnecrDb();
            //update without image
            if(ImgPath==null){
                
                
                try {
                    UpdateQuery="UPDATE donateitems SET item_name = ?, quantity = ?, type = ? WHERE id = ?";
                    ps=con.prepareStatement(UpdateQuery);
                    ps.setString(1, txt_1.getText());
                    ps.setString(2, txt_2.getText());
                    ps.setString(3, txt_3.getText());
                    ps.setInt(4, Integer.parseInt(txt_4.getText()));
                    ps.executeUpdate();
                    Show_Products_In_JTable();
                    JOptionPane.showMessageDialog(null, "Product Updated");
                } catch (SQLException ex) {
                    Logger.getLogger(AdminPanelFinal.class.getName()).log(Level.SEVERE, null, ex);
                }
        }else{
                try{
                InputStream img = new FileInputStream(new File(ImgPath));
                //UpdateQuery="UPDATE products SEt name = ?, price = ?, add_date = ?, image = ? WHERE id = ?";
                UpdateQuery="UPDATE donateitems SET item_name = ?, quantity = ?, type = ?, image = ? WHERE id = ?";
                ps=con.prepareStatement(UpdateQuery);
                ps.setString(1, txt_1.getText());
                ps.setString(2, txt_2.getText());
                ps.setString(3, txt_3.getText());
                ps.setBlob(4, img);
                ps.setInt(5, Integer.parseInt(txt_4.getText()));
                ps.executeUpdate();
                Show_Products_In_JTable();
                JOptionPane.showMessageDialog(null, "Product Updated");
                
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }}else{
            JOptionPane.showMessageDialog(null,"One Or More Fields Are Empty" );
        
        }
    }//GEN-LAST:event_txt_updateActionPerformed

    private void txt_chooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_chooseActionPerformed
        // TODO add your handling code here:
        JFileChooser file =new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter =new FileNameExtensionFilter("*.image","jpg","png");
        file.addChoosableFileFilter(filter);
        int result=file.showSaveDialog(null);
        if(result==JFileChooser.APPROVE_OPTION){
            File selectedFile=file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            lbl_image.setIcon(ResizeImage(path,null));
            ImgPath=path;
        }else{
            System.out.println("No File Selected");
        }
    }//GEN-LAST:event_txt_chooseActionPerformed

    private void txt_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_deleteActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_txt_deleteActionPerformed

    private void txt_firstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_firstActionPerformed
        // TODO add your handling code here:
        pos=0;
        ShowItem(pos);
    }//GEN-LAST:event_txt_firstActionPerformed

    private void txt_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nextActionPerformed
        // TODO add your handling code here:
        pos++;
        if(pos>=getProductList().size()){
            pos=getProductList().size()-1;
        }
        
        ShowItem(pos);
    }//GEN-LAST:event_txt_nextActionPerformed

    private void txt_previousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_previousActionPerformed
        // TODO add your handling code here:
        pos--;
        if(pos<0){
            pos=0;
        }
        ShowItem(pos);
    }//GEN-LAST:event_txt_previousActionPerformed

    private void txt_lastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_lastActionPerformed
        // TODO add your handling code here:
        pos=getProductList().size()-1;
        ShowItem(pos);
    }//GEN-LAST:event_txt_lastActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */
    /*public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPanelFinal().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTable_Products;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lbl_image;
    private javax.swing.JLabel lbl_image2;
    private javax.swing.JLabel lbl_image3;
    private javax.swing.JTextField txt_1;
    private javax.swing.JTextField txt_2;
    private javax.swing.JTextField txt_3;
    private javax.swing.JTextField txt_4;
    private javax.swing.JButton txt_choose;
    private javax.swing.JButton txt_delete;
    private javax.swing.JButton txt_first;
    private javax.swing.JButton txt_last;
    private javax.swing.JButton txt_next;
    private javax.swing.JButton txt_previous;
    private javax.swing.JButton txt_update;
    // End of variables declaration//GEN-END:variables
    private void close(){
        WindowEvent wc=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(wc);
    }
}
