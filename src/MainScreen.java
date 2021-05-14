import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Toolkit;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/*
  * -VERSION HISTORY-
*V 1.0 (2019.11.4):  Original interface consists of three buttons: START, HELP, EXIT GAME, allows user to navigate through game via setting visibility to True for each desired jFrame 
*V2.0 (2019.11.16): LEADERBOARD button added to interface, shows player the leaderboard directly. Interface now consists of four buttons: START, HELP, LEADERBOARD, EXIT GAME
 */

/**
 *Main interface of game 
 * Buttons of main screen interface lead user to jFrames around game 
 * See READ_ME file for more information on functionalities of variables used throughout program
 * @bashsaji161@granderie.ca 2019.11.18
 * 
 */
public class MainScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
        initComponents();
        Picture.setIcon(dice);
        Picture.setText("");
    }
    
    ImageIcon dice = new ImageIcon("dice.png");

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        Play = new javax.swing.JButton();
        Help = new javax.swing.JButton();
        Leaderboard = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        Picture = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(54, 33, 89));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Background.setBackground(new java.awt.Color(51, 51, 51));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("Goudy Old Style", 1, 60)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Title.setText("Guess the Number ");
        Background.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 730, 94));

        Play.setBackground(new java.awt.Color(0, 102, 0));
        Play.setFont(new java.awt.Font("Goudy Old Style", 1, 36)); // NOI18N
        Play.setForeground(new java.awt.Color(255, 255, 255));
        Play.setText("Play");
        Play.setBorder(null);
        Play.setBorderPainted(false);
        Play.setContentAreaFilled(false);
        Play.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Play.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PlayMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PlayMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PlayMouseExited(evt);
            }
        });
        Play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayActionPerformed(evt);
            }
        });
        Background.add(Play, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 191, 80));

        Help.setBackground(new java.awt.Color(204, 102, 0));
        Help.setFont(new java.awt.Font("Goudy Old Style", 1, 36)); // NOI18N
        Help.setForeground(new java.awt.Color(255, 255, 255));
        Help.setText("Help");
        Help.setBorder(null);
        Help.setBorderPainted(false);
        Help.setContentAreaFilled(false);
        Help.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HelpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HelpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HelpMouseExited(evt);
            }
        });
        Background.add(Help, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 190, 80));

        Leaderboard.setBackground(new java.awt.Color(51, 0, 153));
        Leaderboard.setFont(new java.awt.Font("Goudy Old Style", 1, 36)); // NOI18N
        Leaderboard.setForeground(new java.awt.Color(255, 255, 255));
        Leaderboard.setText("Leaderboard");
        Leaderboard.setBorder(null);
        Leaderboard.setBorderPainted(false);
        Leaderboard.setContentAreaFilled(false);
        Leaderboard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Leaderboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LeaderboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LeaderboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LeaderboardMouseExited(evt);
            }
        });
        Leaderboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeaderboardActionPerformed(evt);
            }
        });
        Background.add(Leaderboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 180, 80));

        Exit.setBackground(new java.awt.Color(204, 0, 0));
        Exit.setFont(new java.awt.Font("Goudy Old Style", 1, 36)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setText("Exit");
        Exit.setBorder(null);
        Exit.setBorderPainted(false);
        Exit.setContentAreaFilled(false);
        Exit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitMouseExited(evt);
            }
        });
        Background.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 100, 80));

        Picture.setForeground(new java.awt.Color(255, 255, 255));
        Picture.setText("Picture");
        Background.add(Picture, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 280, 220));

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PlayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlayMouseClicked
        //closes current jframe and brings user to username jframe to submit username string
        dispose();
        UsernameSubmit user = new UsernameSubmit();
        user.setVisible(true);
    }//GEN-LAST:event_PlayMouseClicked

    private void HelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpMouseClicked
        //makes help jframe visible to user 
        Help help = new Help();
        help.setVisible(true);
    }//GEN-LAST:event_HelpMouseClicked

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        //exits program completely
        System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked

    private void LeaderboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeaderboardMouseClicked
        
    }//GEN-LAST:event_LeaderboardMouseClicked

    private void LeaderboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeaderboardActionPerformed
        //Closes game environment form and opens leaderboard form
        Leaderboard lb;
        try {
            lb = new Leaderboard();
            lb.setVisible(true);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GameEnvironment.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GameEnvironment.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GameEnvironment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_LeaderboardActionPerformed

    private void PlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PlayActionPerformed

    private void LeaderboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeaderboardMouseEntered
        Leaderboard.setForeground(new Color (255,164,63));
    }//GEN-LAST:event_LeaderboardMouseEntered

    private void LeaderboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeaderboardMouseExited
        Leaderboard.setForeground(Color.white);
    }//GEN-LAST:event_LeaderboardMouseExited

    private void PlayMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlayMouseEntered
        Play.setForeground(new Color (255,164,63));
    }//GEN-LAST:event_PlayMouseEntered

    private void PlayMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlayMouseExited
        Play.setForeground(Color.white);
    }//GEN-LAST:event_PlayMouseExited

    private void HelpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpMouseEntered
        Help.setForeground(new Color (255,164,63));
    }//GEN-LAST:event_HelpMouseEntered

    private void HelpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpMouseExited
        Help.setForeground(Color.white);
    }//GEN-LAST:event_HelpMouseExited

    private void ExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseEntered
        Exit.setForeground(new Color (255,164,63));
    }//GEN-LAST:event_ExitMouseEntered

    private void ExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseExited
        Exit.setForeground(Color.white);
    }//GEN-LAST:event_ExitMouseExited

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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Help;
    private javax.swing.JButton Leaderboard;
    private javax.swing.JLabel Picture;
    private javax.swing.JButton Play;
    private javax.swing.JLabel Title;
    // End of variables declaration//GEN-END:variables
}
