package link;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import belajarjava.Koneksi;
import java.io.File;

import java.awt.*;
import java.io.*;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;
import javax.sound.sampled.AudioInputStream;

import javazoom.jl.player.*;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.Icon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileView;
/**
 *
 * @author Rakha Agung trimanda
 */
public class NewJFrame1 extends javax.swing.JFrame {
    static Koneksi kon = new Koneksi();
    ArrayList updateList = new ArrayList();
    Player player;
    
    File play1;
    static int a = 0;
   
    
    //Method Choose File
    public static String location;
    public static File f, file;
    public static FileReader frc;
    public static BufferedReader brc;
    JFileChooser chooser;
    FileFilter type1, type2, type3;
    FileView view;
    public static ArrayList<String> kmsc = new ArrayList<>();
    
    //Method Pecah Kata
    public static double [] Split_Second;
    public static String [] durasiSplit;
    public static String hasil, directoryWav, durasi, diphone, hm, name;
    public static ArrayList<String> kms = new ArrayList<>();
    public static FileReader fr;
    public static BufferedReader br;
    
    //Method Pecah Tanda Baca
    public static String kata;
    public static Pattern path1, path2, path3, path4, path5;
    public static Matcher m1, m2, m3, m4, m5;
    public static boolean b1, b2, b3, b4, b5;
    public static String[] pecah;
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame1() {
        initComponents();
         Dimensi();
         disable();
         breakline();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_DirectWav = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_FilesLoc = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_Durasi = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txt_Wav = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        btn_Submit = new javax.swing.JButton();
        btn_Clear = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jLabel1.setText("jLabel1");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Directory WAV");

        txt_DirectWav.setColumns(20);
        txt_DirectWav.setRows(5);
        jScrollPane2.setViewportView(txt_DirectWav);

        jLabel5.setText("Masukan Kata");

        jLabel2.setText("Lokasi File *");

        txt_Durasi.setColumns(20);
        txt_Durasi.setRows(5);
        jScrollPane3.setViewportView(txt_Durasi);

        jLabel7.setText("Durasi File");

        jButton3.setText("Upload");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txt_Wav.setColumns(20);
        txt_Wav.setRows(5);
        txt_Wav.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_WavKeyTyped(evt);
            }
        });
        jScrollPane4.setViewportView(txt_Wav);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3)
                    .addComponent(jButton3))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(txt_FilesLoc)
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txt_FilesLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btn_Submit.setText("Submit");
        btn_Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SubmitActionPerformed(evt);
            }
        });

        btn_Clear.setText("Clear");
        btn_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Submit)
                .addGap(28, 28, 28)
                .addComponent(btn_Clear)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Submit)
                    .addComponent(btn_Clear))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setText("* Jika kata yang dimasukan berasal dari file (.txt, .docx)");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btn_ClearActionPerformed

    private void btn_SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SubmitActionPerformed
        // TODO add your handling code here:
       
//            putar();
            try {
                if(txt_Durasi.getText()!=null){
              
                
    //                cariarti();
                    diphone();
//                    pecahTandaBaca();
                }
            } catch (IOException | UnsupportedAudioFileException | InterruptedException | LineUnavailableException ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        

    }//GEN-LAST:event_btn_SubmitActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            // TODO add your handling code here:
            ChooseFile();
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txt_WavKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_WavKeyTyped
        // TODO add your handling code here:
        
        if (txt_Wav.getText().isEmpty()) {
            txt_FilesLoc.setText("");
            txt_Durasi.setText("");
            txt_DirectWav.setText("");
            btn_Clear.enable(false);
        }
        
    }//GEN-LAST:event_txt_WavKeyTyped

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame1().setVisible(true);
            }
        });
         
    }
    
    public void clear(){
        txt_DirectWav.setText("");
        txt_Wav.setText("");
        txt_FilesLoc.setText("");
        txt_Durasi.setText("");
    }
    
    public void breakline(){
        txt_Durasi.setLineWrap(true);
        txt_Durasi.setWrapStyleWord(true);
        txt_DirectWav.setLineWrap(true);
        txt_DirectWav.setWrapStyleWord(true);
        txt_Wav.setLineWrap(true);
        txt_Wav.setWrapStyleWord(true);
    }
    
    public void disable(){
        txt_DirectWav.enable(false);
        txt_FilesLoc.enable(false);
        txt_Durasi.enable(false);
    }
    
    public void Dimensi (){
         Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (dim.width-getWidth())/2;
        int y = (dim.height-getHeight())/2;
        setLocation(x,y);
     }

    void putar() {
//        byte[] byteInput = new byte[(int)play1.length() - 44];
//        short[] input = new short[(int)(byteInput.length / 2f)];
//        if (a == 0) {
            try {
                
                //WAV Player
                String textWav = txt_Wav.getText();
                String gabungWav = "src/jar/".concat(textWav);
//                txtArtiKata.setText(gabungWav);
                
                File laguWav = new File(gabungWav);
                Clip clipWav = AudioSystem.getClip();
                clipWav.open(AudioSystem.getAudioInputStream(laguWav));
                
                clipWav.setMicrosecondPosition(2104);
                clipWav.start();
//                clipWav.loop(clipWav.LOOP_CONTINUOUSLY); //Play continuously 
                Thread.sleep(clipWav.getMicrosecondLength()/1000);
                
                
            } catch (Exception e) {
                System.out.println("Problem playing file ");
                System.out.println(e);
            }
            // run in new thread to play in background
//            new Thread() {
//                @Override
//                public void run() {
//                    try {
//                        player.play();
//                        //player.play();
//
//                    } catch (Exception e) {
//                        System.out.println(e);
//                    }
//                }
//            }.start();
//        } else {
//            player.close();
//            a = 0;
//            putar();
//        }

    }
    
    class AnOvalIcon implements Icon {
        Color color;

        public AnOvalIcon(Color c) {
          color = c;
        }

        public void paintIcon(Component c, Graphics g, int x, int y) {
          g.setColor(color);
          g.fillOval(x, y, getIconWidth(), getIconHeight());
        }

        public int getIconWidth() {
          return 10;
        }

        public int getIconHeight() {
          return 15;
        }
      }

      public class IconView extends FileView {
        private HashMap hash = new HashMap();

        public IconView() {
          hash.put("htm", new AnOvalIcon(Color.RED));
          hash.put("html", new AnOvalIcon(Color.GREEN));
          hash.put("java", new AnOvalIcon(Color.BLUE));
        }

        public String getName(File f) {
          String s = f.getName();
          if (s.length() == 0) {
            s = f.getAbsolutePath();
          }
          return s;
        }

        public String getDescription(File f) {
          return f.getName();
        }

        public String getTypeDescription(File f) {
          return f.getAbsolutePath();
        }

        public Icon getIcon(File f) {
          String path = f.getAbsolutePath();
          int pos = path.lastIndexOf('.');
          if ((pos >= 0) && (pos < (path.length() - 1))) {
            String ext = path.substring(pos + 1).toLowerCase();
            return (Icon) hash.get(ext);
          }
          return null;
        }

        public Boolean isTraversable(File file) {
          return (new Boolean(file.isDirectory()));
        }
      }

      public class ExtensionFilter extends FileFilter {
        private String extensions[];

        private String description;

        public ExtensionFilter(String description, String extension) {
          this(description, new String[] { extension });
        }

        public ExtensionFilter(String description, String extensions[]) {
          this.description = description;
          this.extensions = (String[]) extensions.clone();
        }

        public boolean accept(File file) {
          if (file.isDirectory()) {
            return true;
          }
          int count = extensions.length;
          String path = file.getAbsolutePath();
          for (int i = 0; i < count; i++) {
            String ext = extensions[i];
            if (path.endsWith(ext)
                && (path.charAt(path.length() - ext.length()) == '.')) {
              return true;
            }
          }
          return false;
        }

        public String getDescription() {
          return (description == null ? extensions[0] : description);
        }
      }

    public void ChooseFile() throws FileNotFoundException, IOException {
            chooser = new JFileChooser(".");
            type1 = new ExtensionFilter("Java Files", ".java");

            type2 = new ExtensionFilter("Document Files", new String [] {".docx", ".pdf", ".txt"});
            
            type3 = new ExtensionFilter("HTML Files", new String[] { ".htm", ".html" });

            chooser.addChoosableFileFilter(type1);
            chooser.addChoosableFileFilter(type2);
            chooser.addChoosableFileFilter(type3);

            view = new IconView();
            chooser.setFileView(view);
            int status = chooser.showOpenDialog(this);
            if (status == JFileChooser.APPROVE_OPTION) {
              f = chooser.getSelectedFile();
              location = f.getPath();
//              if(name.endsWith(".txt")){
//                  System.out.println("Salah!");
//              }
              System.out.println(f);
            }
            
            frc = new FileReader(f);
          brc = new BufferedReader(frc);
          
            int x = 0;
            String hm;

            while (true) {
                hm = brc.readLine();
                if (hm == null) {
                    break;
                }
                kmsc.add(hm);
            }
            brc.close();
            
//            while ((hm = br.readLine())!= null) {                    
//                kms.add(hm);
//                x++;
//            }
            
            
                String a="";
                for(String b: kmsc){
                    a += b+" ";
                    System.out.println(b);
                    txt_Wav.setText(txt_Wav.getText() + b + "\n");
                    kata = a;
                }
            txt_FilesLoc.setText("");
            txt_Durasi.setText("");
            txt_DirectWav.setText("");
            txt_FilesLoc.setText(location);
      }
    
    void diphone() throws FileNotFoundException, IOException, UnsupportedAudioFileException, InterruptedException, LineUnavailableException{
        file = new File("src/jar/diphone.dat");
        fr = new FileReader(file);
        br = new BufferedReader(fr);
          
//        ArrayList<String> laguwav = new ArrayList<>();
        
//        int x = 0;

        while ((hm = br.readLine())!= null) {                    
            kms.add(hm);
//            x++;
        }

          name = ("_").concat(txt_Wav.getText().concat("_")).replaceAll(" ", "_").toLowerCase();
          

          for( int i = 0; i < name.length()-1; i++ )
            {
                diphone = Character.toString( name.charAt(i) ).concat("	").concat(Character.toString( name.charAt(i+1) ));//.concat( "" ); 

                for(String ax:kms)


                    if(diphone.contains(ax.substring(0, 3))) {
                        // a match!
                        
                        directoryWav = "src/jar/".concat(ax.substring(4, 12).replace(" ", ""));
                        txt_DirectWav.setText(txt_DirectWav.getText() + diphone + "\n");
                        
                        
                        durasi = right(ax, 14);
                        txt_Durasi.setText(txt_Durasi.getText() + name + "\n");
                        
                        durasiSplit = durasi.split("\\s+");
                        Split_Second = new double[durasiSplit.length];
//                        splitSc[i] = Double.parseDouble(durasiSplit[i]);
                        
                        for (int j = 0; j<2; j++){
                            Split_Second[j] = (Double.parseDouble(durasiSplit[j]))/1000;
                            System.out.println((j+1) +". "+Split_Second[j]);
                        
                            JFXPanel fxPanel = new JFXPanel();
                            Media m = new Media(Paths.get(directoryWav).toUri().toString());
                            MediaPlayer mp = new MediaPlayer(m);
                            mp.setStartTime(Duration.seconds(Split_Second[j]));
                            Thread.sleep(50);
                            mp.setStopTime(Duration.seconds(Split_Second[j+1]));
                            mp.play();
                        }
                    }
            }
   }

    void pecahTandaBaca(){
        pecah = kata.split("(?<=\\?|\\!|\\.|\\,)");
        path1 = Pattern.compile("(?<=\\?)");
        path2 = Pattern.compile("(?<=\\!)");
        path3 = Pattern.compile("(?<=\\.)");
        path4 = Pattern.compile("(?<=\\,)");
        path5 = Pattern.compile(" ");
        
        for (int i=0; i<pecah.length;i++){
                
                m1 = path1.matcher(pecah[i]);
                b1 = m1.find();
                
                m2 = path2.matcher(pecah[i]);
                b2 = m2.find();
                
                m3 = path3.matcher(pecah[i]);
                b3 = m3.find();
                
                m4 = path4.matcher(pecah[i]);
                b4 = m4.find();
                
                m5 = path5.matcher(pecah[i]);
                b5 = m5.find();
                
                    if (b1) {
//                        System.out.println("Tanda Tanya: "+pecah[i]);
    //                    variabel.printout.add(pecah[i]);
                        }else if(b2){
                            System.out.println("Tanda Seru: "+pecah[i]);
                            System.out.println("Pecahannya: "+right1(pecah[i]));
                        }else if(b3){
                            System.out.println("Titik: "+pecah[i]);
                            System.out.println("Pecahannya: "+right1(pecah[i]));
                        }else if (b4) {
                            System.out.println("Koma: "+pecah[i]);
                            System.out.println("Pecahannya: "+right1(pecah[i]));
                        }else if (b5) {
                            System.out.println("Spaci: "+pecah[i]);
                            System.out.println("Pecahannya: "+right1(pecah[i]));
                    }
            }
    }
    
private static void Prosody(
        AudioInputStream audioStream,
        SourceDataLine line,
        float speed,
        float pitch,
        float rate,
        float volume,
        boolean emulateChordPitch,
        int quality,
        int sampleRate,
        int numChannels) throws IOException
    {
        Sonic sonic = new Sonic(sampleRate, numChannels);
        int bufferSize = line.getBufferSize();
        byte inBuffer[] = new byte[bufferSize];
        byte outBuffer[] = new byte[bufferSize];
        int numRead, numWritten;

        sonic.setSpeed(speed);
        sonic.setPitch(pitch);
        sonic.setRate(rate);
        sonic.setVolume(volume);
        sonic.setChordPitch(emulateChordPitch);
        sonic.setQuality(quality);
        do {
            numRead = audioStream.read(inBuffer, 0, bufferSize);
            if(numRead <= 0) {
                sonic.flushStream();
            } else {
                sonic.writeBytesToStream(inBuffer, numRead);
            }
            do {
                numWritten = sonic.readBytesFromStream(outBuffer, bufferSize);
                if(numWritten > 0) {
                    line.write(outBuffer, 0, numWritten);
                }
            } while(numWritten > 0);
        } while(numRead > 0);
    }
    
public static String right(String value, int length){
        return value.substring(value.length() - length);
    }
    
public static String right1 (String value){
        return value.substring(value.lastIndexOf(" ") + 1);
    }

void cariarti(){
    Connection con = kon.logOn();
    String query = "Select arti from kbbi where kata = '"+txt_Wav.getText()+"' ";

    try {
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {                
            txt_Durasi.setText(rs.getString(1));
        }
    } catch (SQLException ex) {
        Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Clear;
    private javax.swing.JButton btn_Submit;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextArea txt_DirectWav;
    private javax.swing.JTextArea txt_Durasi;
    private javax.swing.JTextField txt_FilesLoc;
    private javax.swing.JTextArea txt_Wav;
    // End of variables declaration//GEN-END:variables
}
