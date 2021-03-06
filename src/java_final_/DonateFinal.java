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
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Anubhav
 */
public class DonateFinal extends javax.swing.JFrame {

    /**
     * Creates new form DonateFinal
     */
    String ImgPath2=null;
    public ImageIcon ResizeImage2(String imagePath, byte[]pic){
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
    public ImageIcon ResizeImage3(String imagePath, byte[]pic){
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
    public ImageIcon ResizeImage4(String imagePath, byte[]pic){
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
    public DonateFinal() {
        setTitle("Donate");
        initComponents();
        Connection conn=null;
        ImgPath="C:\\Users\\anubh\\Desktop\\DeskTop Icons\\Java Project Pics\\15.jpg";
        lbl_image2.setIcon(ResizeImage3(ImgPath,null));
        ImgPath="C:\\Users\\anubh\\Desktop\\DeskTop Icons\\Java Project Pics\\22.png";
        lbl_image3.setIcon(ResizeImage4(ImgPath,null));
        conn=JavaConnection.ConnecrDb();
    }
    
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
    
    public boolean checkInputs(){
        if(txt_noi.getText().length()==0||txt_qoi.getText().length()==0||txt_yn.getText().length()==0||txt_date.getDate()==null||txt_mn.getText().length()==0){
            return false;
        }else{
            return true;
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

        jScrollBar1 = new javax.swing.JScrollBar();
        lbl_image3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_noi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_qoi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_mn = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txt_yn = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        choose_image = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lbl_image = new javax.swing.JLabel();
        lbl_image2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(580, 250));
        setMinimumSize(new java.awt.Dimension(1140, 725));
        setPreferredSize(new java.awt.Dimension(1125, 710));
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(lbl_image3);
        lbl_image3.setBounds(10, 10, 790, 80);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name Of Item:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 100, 179, 29);

        txt_noi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(txt_noi);
        txt_noi.setBounds(280, 100, 269, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Quantity Of Item:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 140, 212, 29);

        txt_qoi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(txt_qoi);
        txt_qoi.setBounds(280, 140, 269, 29);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mobile Number:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 190, 191, 29);

        txt_mn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(txt_mn);
        txt_mn.setBounds(280, 190, 269, 29);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("City:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(220, 230, 67, 29);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Allahabad", "Agra", "Ahmedabad", "Ahmednagar", "Aizawl", "Ajitgarh (Mohali)", "Ajmer", "Akola", "Alappuzha", "Aligarh", "Alirajpur", "Allahabad", "Almora", "Alwar", "Ambala", "Ambedkar Nagar", "Amravati", "Amreli district", "Amritsar", "Anand", "Anantapur", "Anantnag", "Angul", "Anjaw", "Anuppur", "Araria", "Ariyalur", "Arwal", "Ashok Nagar", "Auraiya", "Aurangabad", "Aurangabad", "Azamgarh", "Badgam", "Bagalkot", "Bageshwar", "Bagpat", "Bahraich", "Baksa", "Balaghat", "Balangir", "Balasore", "Ballia", "Balrampur", "Banaskantha", "Banda", "Bandipora", "Bangalore Rural", "Bangalore Urban", "Banka", "Bankura", "Banswara", "Barabanki", "Baramulla", "Baran", "Bardhaman", "Bareilly", "Bargarh (Baragarh)", "Barmer", "Barnala", "Barpeta", "Barwani", "Bastar", "Basti", "Bathinda", "Beed", "Begusarai", "Belgaum", "Bellary", "Betul", "Bhadrak", "Bhagalpur", "Bhandara", "Bharatpur", "Bharuch", "Bhavnagar", "Bhilwara", "Bhind", "Bhiwani", "Bhojpur", "Bhopal", "Bidar", "Bijapur", "Bijapur", "Bijnor", "Bikaner", "Bilaspur", "Bilaspur", "Birbhum", "Bishnupur", "Bokaro", "Bongaigaon", "Boudh (Bauda)", "Budaun", "Bulandshahr", "Buldhana", "Bundi", "Burhanpur", "Buxar", "Cachar", "Central Delhi", "Chamarajnagar", "Chamba", "Chamoli", "Champawat", "Champhai", "Chandauli", "Chandel", "Chandigarh", "Chandrapur", "Changlang", "Chatra", "Chennai", "Chhatarpur", "Chhatrapati Shahuji Maharaj Nagar", "Chhindwara", "Chikkaballapur", "Chikkamagaluru", "Chirang", "Chitradurga", "Chitrakoot", "Chittoor", "Chittorgarh", "Churachandpur", "Churu", "Coimbatore", "Cooch Behar", "Cuddalore", "Cuttack", "Dadra and Nagar Haveli", "Dahod", "Dakshin Dinajpur", "Dakshina Kannada", "Daman", "Damoh", "Dantewada", "Darbhanga", "Darjeeling", "Darrang", "Datia", "Dausa", "Davanagere", "Debagarh (Deogarh)", "Dehradun", "Deoghar", "Deoria", "Dewas", "Dhalai", "Dhamtari", "Dhanbad", "Dhar", "Dharmapuri", "Dharwad", "Dhemaji", "Dhenkanal", "Dholpur", "Dhubri", "Dhule", "Dibang Valley", "Dibrugarh", "Dima Hasao", "Dimapur", "Dindigul", "Dindori", "Diu", "Doda", "Dumka", "Dungapur", "Durg", "East Champaran", "East Delhi", "East Garo Hills", "East Khasi Hills", "East Siang", "East Sikkim", "East Singhbhum", "Eluru", "Ernakulam", "Erode", "Etah", "Etawah", "Faizabad", "Faridabad", "Faridkot", "Farrukhabad", "Fatehabad", "Fatehgarh Sahib", "Fatehpur", "Fazilka", "Firozabad", "Firozpur", "Gadag", "Gadchiroli", "Gajapati", "Ganderbal", "Gandhinagar", "Ganganagar", "Ganjam", "Garhwa", "Gautam Buddh Nagar", "Gaya", "Ghaziabad", "Ghazipur", "Giridih", "Goalpara", "Godda", "Golaghat", "Gonda", "Gondia", "Gopalganj", "Gorakhpur", "Greater Noida", "Gulbarga", "Gumla", "Guna", "Guntur", "Gurdaspur", "Gurgaon", "Gwalior", "Hailakandi", "Hamirpur", "Hamirpur", "Hanumangarh", "Harda", "Hardoi", "Haridwar", "Hassan", "Haveri district", "Hazaribag", "Hingoli", "Hissar", "Hooghly", "Hoshangabad", "Hoshiarpur", "Howrah", "Hyderabad", "Hyderabad", "Idukki", "Imphal East", "Imphal West", "Indore", "Jabalpur", "Jagatsinghpur", "Jaintia Hills", "Jaipur", "Jaisalmer", "Jajpur", "Jalandhar", "Jalaun", "Jalgaon", "Jalna", "Jalore", "Jalpaiguri", "Jammu", "Jamnagar", "Jamtara", "Jamui", "Janjgir-Champa", "Jashpur", "Jaunpur district", "Jehanabad", "Jhabua", "Jhajjar", "Jhalawar", "Jhansi", "Jharsuguda", "Jhunjhunu", "Jind", "Jodhpur", "Jorhat", "Junagadh", "Jyotiba Phule Nagar", "Kabirdham (formerly Kawardha)", "Kadapa", "Kaimur", "Kaithal", "Kakinada", "Kalahandi", "Kamrup", "Kamrup Metropolitan", "Kanchipuram", "Kandhamal", "Kangra", "Kanker", "Kannauj", "Kannur", "Kanpur", "Kanshi Ram Nagar", "Kanyakumari", "Kapurthala", "Karaikal", "Karauli", "Karbi Anglong", "Kargil", "Karimganj", "Karimnagar", "Karnal", "Karur", "Kasaragod", "Kathua", "Katihar", "Katni", "Kaushambi", "Kendrapara", "Kendujhar (Keonjhar)", "Khagaria", "Khammam", "Khandwa (East Nimar)", "Khargone (West Nimar)", "Kheda", "Khordha", "Khowai", "Khunti", "Kinnaur", "Kishanganj", "Kishtwar", "Kodagu", "Koderma", "Kohima", "Kokrajhar", "Kolar", "Kolasib", "Kolhapur", "Kolkata", "Kollam", "Koppal", "Koraput", "Korba", "Koriya", "Kota", "Kottayam", "Kozhikode", "Krishna", "Kulgam", "Kullu", "Kupwara", "Kurnool", "Kurukshetra", "Kurung Kumey", "Kushinagar", "Kutch", "Lahaul and Spiti", "Lakhimpur", "Lakhimpur Kheri", "Lakhisarai", "Lalitpur", "Latehar", "Latur", "Lawngtlai", "Leh", "Lohardaga", "Lohit", "Lower Dibang Valley", "Lower Subansiri", "Lucknow", "Ludhiana", "Lunglei", "Madhepura", "Madhubani", "Madurai", "Mahamaya Nagar", "Maharajganj", "Mahasamund", "Mahbubnagar", "Mahe", "Mahendragarh", "Mahoba", "Mainpuri", "Malappuram", "Maldah", "Malkangiri", "Mamit", "Mandi", "Mandla", "Mandsaur", "Mandya", "Mansa", "Marigaon", "Mathura", "Mau", "Mayurbhanj", "Medak", "Meerut", "Mehsana", "Mewat", "Mirzapur", "Moga", "Mokokchung", "Mon", "Moradabad", "Morena", "Mumbai City", "Mumbai suburban", "Munger", "Murshidabad", "Muzaffarnagar", "Muzaffarpur", "Mysore", "Nabarangpur", "Nadia", "Nagaon", "Nagapattinam", "Nagaur", "Nagpur", "Nainital", "Nalanda", "Nalbari", "Nalgonda", "Namakkal", "Nanded", "Nandurbar", "Narayanpur", "Narmada", "Narsinghpur", "Nashik", "Navsari", "Nawada", "Nawanshahr", "Nayagarh", "Neemuch", "Nellore", "New Delhi", "Nilgiris", "Nizamabad", "Noida", "North 24 Parganas", "North Delhi", "North East Delhi", "North Goa", "North Sikkim", "North Tripura", "North West Delhi", "Nuapada", "Ongole", "Osmanabad", "Pakur", "Palakkad", "Palamu", "Pali", "Palwal", "Panchkula", "Panchmahal", "Panchsheel Nagar district (Hapur)", "Panipat", "Panna", "Papum Pare", "Parbhani", "Paschim Medinipur", "Patan", "Pathanamthitta", "Pathankot", "Patiala", "Patna", "Pauri Garhwal", "Perambalur", "Phek", "Pilibhit", "Pithoragarh", "Pondicherry", "Poonch", "Porbandar", "Pratapgarh", "Pratapgarh", "Pudukkottai", "Pulwama", "Pune", "Purba Medinipur", "Puri", "Purnia", "Purulia", "Raebareli", "Raichur", "Raigad", "Raigarh", "Raipur", "Raisen", "Rajauri", "Rajgarh", "Rajkot", "Rajnandgaon", "Rajsamand", "Ramabai Nagar (Kanpur Dehat)", "Ramanagara", "Ramanathapuram", "Ramban", "Ramgarh", "Rampur", "Ranchi", "Ratlam", "Ratnagiri", "Rayagada", "Reasi", "Rewa", "Rewari", "Ri Bhoi", "Rohtak", "Rohtas", "Rudraprayag", "Rupnagar", "Sabarkantha", "Sagar", "Saharanpur", "Saharsa", "Sahibganj", "Saiha", "Salem", "Samastipur", "Samba", "Sambalpur", "Sangli", "Sangrur", "Sant Kabir Nagar", "Sant Ravidas Nagar", "Saran", "Satara", "Satna", "Sawai Madhopur", "Sehore", "Senapati", "Seoni", "Seraikela Kharsawan", "Serchhip", "Shahdol", "Shahjahanpur", "Shajapur", "Shamli", "Sheikhpura", "Sheohar", "Sheopur", "Shimla", "Shimoga", "Shivpuri", "Shopian", "Shravasti", "Sibsagar", "Siddharthnagar", "Sidhi", "Sikar", "Simdega", "Sindhudurg", "Singrauli", "Sirmaur", "Sirohi", "Sirsa", "Sitamarhi", "Sitapur", "Sivaganga", "Siwan", "Solan", "Solapur", "Sonbhadra", "Sonipat", "Sonitpur", "South 24 Parganas", "South Delhi", "South Garo Hills", "South Goa", "South Sikkim", "South Tripura", "South West Delhi", "Sri Muktsar Sahib", "Srikakulam", "Srinagar", "Subarnapur (Sonepur)", "Sultanpur", "Sundergarh", "Supaul", "Surat", "Surendranagar", "Surguja", "Tamenglong", "Tarn Taran", "Tawang", "Tehri Garhwal", "Thane", "Thanjavur", "The Dangs", "Theni", "Thiruvananthapuram", "Thoothukudi", "Thoubal", "Thrissur", "Tikamgarh", "Tinsukia", "Tirap", "Tiruchirappalli", "Tirunelveli", "Tirupur", "Tiruvallur", "Tiruvannamalai", "Tiruvarur", "Tonk", "Tuensang", "Tumkur", "Udaipur", "Udalguri", "Udham Singh Nagar", "Udhampur", "Udupi", "Ujjain", "Ukhrul", "Umaria", "Una", "Unnao", "Upper Siang", "Upper Subansiri", "Uttar Dinajpur", "Uttara Kannada", "Uttarkashi", "Vadodara", "Vaishali", "Valsad", "Varanasi", "Vellore", "Vidisha", "Viluppuram", "Virudhunagar", "Visakhapatnam", "Vizianagaram", "Vyara", "Warangal", "Wardha", "Washim", "Wayanad", "West Champaran", "West Delhi", "West Garo Hills", "West Kameng", "West Khasi Hills", "West Siang", "West Sikkim", "West Singhbhum", "West Tripura", "Wokha", "Yadgir", "Yamuna Nagar", "Yanam", "Yavatmal", "Zunheboto" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(280, 230, 269, 36);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Your Name:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(130, 280, 142, 29);

        txt_yn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(txt_yn);
        txt_yn.setBounds(280, 280, 269, 29);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Date:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(210, 330, 65, 29);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Image Of Item:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(80, 380, 187, 29);

        choose_image.setBackground(new java.awt.Color(204, 255, 204));
        choose_image.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        choose_image.setText("Choose Image");
        choose_image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choose_imageActionPerformed(evt);
            }
        });
        getContentPane().add(choose_image);
        choose_image.setBounds(63, 490, 210, 25);

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Donate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(280, 620, 269, 50);

        jButton2.setBackground(new java.awt.Color(204, 255, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("HOME");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(565, 330, 190, 37);

        lbl_image.setBackground(new java.awt.Color(255, 255, 153));
        lbl_image.setOpaque(true);
        getContentPane().add(lbl_image);
        lbl_image.setBounds(280, 380, 269, 211);
        getContentPane().add(lbl_image2);
        lbl_image2.setBounds(0, 0, 1140, 710);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void choose_imageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choose_imageActionPerformed
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
            System.out.println(ImgPath);
        }else{
            System.out.println("No File Selected");
        }
    }//GEN-LAST:event_choose_imageActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(checkInputs()&& ImgPath!=null){
            try{
                Connection conn=JavaConnection.ConnecrDb();
                PreparedStatement ps=conn.prepareStatement("insert into donateitems(item_name,quantity,mobile,type,name,date,image) values(?,?,?,?,?,?,?)");
                ps.setString(1, txt_noi.getText());
                ps.setString(2, txt_qoi.getText());
                ps.setString(3, txt_mn.getText());
                ps.setString(4, jComboBox1.getSelectedItem().toString());
                ps.setString(5, txt_yn.getText());
                SimpleDateFormat df=new SimpleDateFormat("dd-MM-yyyy");
                String addDate=df.format(txt_date.getDate());
                ps.setString(6, addDate);
                InputStream img=new FileInputStream(new File(ImgPath));
                ps.setBlob(7, img);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Your Item Has Been Donated! Thankyou :-D");
                txt_noi.setText("");
                txt_qoi.setText("");
                txt_mn.setText("");
                txt_yn.setText("");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error");
            }
        }else{
            JOptionPane.showMessageDialog(null, "One Or More Field Is Empty");
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
                new DonateFinal().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton choose_image;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel lbl_image;
    private javax.swing.JLabel lbl_image2;
    private javax.swing.JLabel lbl_image3;
    private javax.swing.JTextField txt_mn;
    private javax.swing.JTextField txt_noi;
    private javax.swing.JTextField txt_qoi;
    private javax.swing.JTextField txt_yn;
    // End of variables declaration//GEN-END:variables
    private void close(){
        WindowEvent wc=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(wc);
    }
}
