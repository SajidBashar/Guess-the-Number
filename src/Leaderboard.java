
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * -VERSION HISTORY-
*V 1.0 (2019.11.11): First GUI components set into place, leaderboard consists only of inactive components: jTextLabels, jTextAreas, jButtons 
*V2.0 (2019.11.12): Leaderboard cascading method developed to determine player's place on leaderboard via score earned from GameEnvironment.java
*V3.0 (2019.11.13): 1. jTextArea displaying user's score is removed, leaderboard automatically shown now after game is won by player in GameEnvironment.java
                                 2. Button to return to mains screen interface is removed, close button substituted to return user to game environment
*V4.0 (2019.11.14): Record of player successfully instantiated and compared w/ a set of written leaders (TEST), leaderboard array updated w/ new list of leaders  
*V5.0 (2019.11.15): Methods to create & read FILE I/O for leaderboard added to game - uses serialized objects and object streams (UNSUCCESSFUL DUE TO NON-SERIALZABLE OBJECT TYPE)  
*V5.0 (2019.11.16): FileWriter used w/ leaderboard and successfully writes leaderboard list to .txt file to store leader records, UNSUCCESSFUL FILE I/O reader when displaying leaders as jFrame is initialized 
*V6.0 (2019.11.17): SUCCESS --> File I/O methods using LB constructor, NEW FileReader, and FileWriter are successfully integrated into the leaderboard system to create a fully functonal guessing game
                                --> Leaderboard displays leaderlist when jFrame is initialized by user in main interface/game environmnet
 */
/**
 *
 * @ bashsaji161@granderie.ca 2019.11.18
 */
public class Leaderboard extends javax.swing.JFrame {

    //creates empty array of lists using leaderboard constructor
    LB[] Leaders = new LB[5];
   
    LocalDate today = LocalDate.now(); //variable with today's date - to be used if player makes leaderboard

    private String fileName = "Scores.txt"; //file path for leaderboard records in game directory

    /**
     */
    public Leaderboard() throws FileNotFoundException, IOException, ClassNotFoundException {
        initComponents();
        //Displays user's score in game
        //Allows for comparison of scores w/ top scores of other players
        
        //Disables player's ability to alter leaderboard text 
        Dates.setEditable(false);
        Dates.setText("");

        //fills Leaders array with empty records 
        for (int k = 0; k < Leaders.length; k++) {
            Leaders[k] = new LB(0.0, "", today);
        }

        //implements methods compare leaderboard when leaderboard form is opened 
        ScoresFileReader("Scores.txt");
        InstantiateRecord();
        WriteRecord();
        SplitLeaderboard();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        DatesLabel = new javax.swing.JLabel();
        CloseButton = new javax.swing.JButton();
        LeaderboardPlaceholderText1 = new javax.swing.JLabel();
        LeaderboardPlaceholderText2 = new javax.swing.JLabel();
        LeaderboardPlaceholderText3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Usernames = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        Scores = new javax.swing.JTextArea();
        AestheticLine2 = new javax.swing.JPanel();
        Dates = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Background.setBackground(new java.awt.Color(51, 51, 51));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DatesLabel.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        DatesLabel.setForeground(new java.awt.Color(255, 255, 255));
        DatesLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        DatesLabel.setText("Date");
        Background.add(DatesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 80, -1));

        CloseButton.setBackground(new java.awt.Color(255, 164, 63));
        CloseButton.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        CloseButton.setForeground(new java.awt.Color(255, 255, 255));
        CloseButton.setText("Close");
        CloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });
        Background.add(CloseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 70, 40));

        LeaderboardPlaceholderText1.setFont(new java.awt.Font("Goudy Old Style", 1, 36)); // NOI18N
        LeaderboardPlaceholderText1.setForeground(new java.awt.Color(255, 255, 255));
        LeaderboardPlaceholderText1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LeaderboardPlaceholderText1.setText("Leaderboard");
        Background.add(LeaderboardPlaceholderText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 261, -1));

        LeaderboardPlaceholderText2.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        LeaderboardPlaceholderText2.setForeground(new java.awt.Color(255, 255, 255));
        LeaderboardPlaceholderText2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LeaderboardPlaceholderText2.setText("Player");
        Background.add(LeaderboardPlaceholderText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 80, -1));

        LeaderboardPlaceholderText3.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        LeaderboardPlaceholderText3.setForeground(new java.awt.Color(255, 255, 255));
        LeaderboardPlaceholderText3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LeaderboardPlaceholderText3.setText("Score");
        Background.add(LeaderboardPlaceholderText3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 80, -1));

        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        Usernames.setEditable(false);
        Usernames.setBackground(new java.awt.Color(67, 67, 67));
        Usernames.setColumns(20);
        Usernames.setFont(new java.awt.Font("Goudy Old Style", 3, 22)); // NOI18N
        Usernames.setForeground(new java.awt.Color(255, 255, 255));
        Usernames.setLineWrap(true);
        Usernames.setRows(11);
        jScrollPane2.setViewportView(Usernames);

        Background.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 280, 170));

        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        Scores.setEditable(false);
        Scores.setBackground(new java.awt.Color(67, 67, 67));
        Scores.setColumns(20);
        Scores.setFont(new java.awt.Font("Goudy Old Style", 3, 22)); // NOI18N
        Scores.setForeground(new java.awt.Color(255, 255, 255));
        Scores.setLineWrap(true);
        Scores.setRows(11);
        Scores.setBorder(null);
        jScrollPane3.setViewportView(Scores);

        Background.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 170, 170));

        AestheticLine2.setBackground(new java.awt.Color(255, 255, 255));
        AestheticLine2.setPreferredSize(new java.awt.Dimension(0, 5));
        AestheticLine2.setRequestFocusEnabled(false);

        javax.swing.GroupLayout AestheticLine2Layout = new javax.swing.GroupLayout(AestheticLine2);
        AestheticLine2.setLayout(AestheticLine2Layout);
        AestheticLine2Layout.setHorizontalGroup(
            AestheticLine2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );
        AestheticLine2Layout.setVerticalGroup(
            AestheticLine2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        Background.add(AestheticLine2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 73, 590, -1));

        Dates.setEditable(false);
        Dates.setBackground(new java.awt.Color(67, 67, 67));
        Dates.setColumns(20);
        Dates.setFont(new java.awt.Font("Goudy Old Style", 3, 22)); // NOI18N
        Dates.setForeground(new java.awt.Color(255, 255, 255));
        Dates.setLineWrap(true);
        Dates.setRows(11);
        Background.add(Dates, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 140, 170));

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 330));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseButtonActionPerformed
        //Hides leaderboard - brings player back to previous interface
        this.hide();
    }//GEN-LAST:event_CloseButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Leaderboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Leaderboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Leaderboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Leaderboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Leaderboard().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Leaderboard.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Leaderboard.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Leaderboard.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    
    void InitializeRecordFile() {
        //writes blank file of scores if scores.txt file doesn't exist 
        try {
            PrintWriter pr = new PrintWriter("Scores.txt");
            //convert array to string
            for (int i = 0; i < Leaders.length; i++) {
                pr.println(Leaders[i].displayText());
            }
            pr.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("No such file exists.");
        }
    }

    void cascadeLeaders(LB temp) {
        for (int k = 0; k < Leaders.length; k++) {
            if (temp.getScore() > Leaders[k].score) {//start cascade assuming ascending order
                for (int j = Leaders.length - 1; j > k; j--) {
                    Leaders[j] = Leaders[j - 1];
                }
                Leaders[k] = temp;
                break;
            }
        }
    }

    void ScoresFileReader(String fileName) {
        if (!new File("Scores.txt").exists()){   //creates blank file if scores file doesn't already exist in game directory
            InitializeRecordFile();
        }   
        String line;
        try {
            // FileReader reads text files ->always wrap in buffered reader
            FileReader fr = new FileReader(fileName);
            BufferedReader bf = new BufferedReader(fr);
            while ((line = bf.readLine()) != null) {
                LB lr = new LB(line);
                cascadeLeaders(lr);
            }
            bf.close();
        } catch (FileNotFoundException e) {
            System.out.println("file not found or blocked" + fileName);
        } catch (IOException e) {
            System.out.println("Error reading file '");
        }
    }

    void InstantiateRecord() {
        // update the array only if score beats existing score
        LB temp = new LB(0.0, "", today);
        double tscore = 0.0;
        try {
            tscore = GameEnvironment.GameScore;
        } catch (NumberFormatException e) {
            tscore = 0.0;
        }
        //creates LB array and compares record
        temp.setScore(tscore);
        temp.setUsername(UsernameSubmit.Username);
        temp.setDate(GameEnvironment.GameDate);

        //compare to find a place in the array
        cascadeLeaders(temp);
        //textArea contains the records for the file
    }

    void WriteRecord() {
        //write textArea to file with formatting
        try {
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);
            for (LB k : Leaders) {
                bw.write(k.displayText());
                bw.newLine(); //not automatic
            }
            bw.close();
        } catch (IOException e) {
            System.out.println("Error writing to file ");
        }
    }
    
    void SplitLeaderboard() {
        //splits leaderboard entry into separate attributes
        for (LB k: Leaders) {
            Usernames.append(k.getUsername() + "\n");
            Scores.append(k.getScore() + "\n");
            Dates.append(k.getDate() + "\n");
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AestheticLine2;
    private javax.swing.JPanel Background;
    private javax.swing.JButton CloseButton;
    private javax.swing.JTextArea Dates;
    private javax.swing.JLabel DatesLabel;
    private javax.swing.JLabel LeaderboardPlaceholderText1;
    private javax.swing.JLabel LeaderboardPlaceholderText2;
    private javax.swing.JLabel LeaderboardPlaceholderText3;
    private javax.swing.JTextArea Scores;
    private javax.swing.JTextArea Usernames;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
