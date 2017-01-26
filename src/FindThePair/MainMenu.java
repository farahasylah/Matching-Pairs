package FindThePair;


import javax.swing.*;
import java.awt.Toolkit;


public class MainMenu extends JFrame {
    int GridSize;
    int NoOfPlayers;

    public MainMenu() {
    
        initComponents();
        this.setLocation(350, 150);  
        this.setVisible(true);
        ShowPlayer();
    }
    private void ShowPlay(){
        Play p = new Play();
        p.show();
        this.hide();
    }
    
    private void ShowCardOption(){
        CardOptionPanel.setVisible(true);
        PlayerPanel.setVisible(false);
        GridPanel.setVisible(false);
    }
    
    private void ShowGrid(){
        BackBtn.setVisible(true);
        ExitBtn.setLocation(410, 380);
        GridPanel.setVisible(true);
        PlayerPanel.setVisible(false);
        CardOptionPanel.setVisible(false);
    }
     private void ShowPlayer(){
        ExitBtn.setLocation(300, 380);
        BackBtn.setVisible(false);
        PlayerPanel.setVisible(true);
        GridPanel.setVisible(false);
        CardOptionPanel.setVisible(false);
    }
     
    public void ExitDialog(){
        int exit = JOptionPane.showConfirmDialog(
                   this, "Are you sure you want miss out on something fun??","Confirm Exit", JOptionPane.YES_NO_OPTION);
        if( exit==JOptionPane.YES_OPTION){
             System.exit(0);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        Title = new javax.swing.JLabel();
        PlayerPanel = new javax.swing.JPanel();
        P1Btn = new javax.swing.JButton();
        P2Btn = new javax.swing.JButton();
        P3Btn = new javax.swing.JButton();
        GridPanel = new javax.swing.JPanel();
        Grid2 = new javax.swing.JButton();
        Grid4 = new javax.swing.JButton();
        Grid6 = new javax.swing.JButton();
        CardOptionPanel = new javax.swing.JPanel();
        ImageBtn = new javax.swing.JButton();
        TextBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        ExitBtn = new javax.swing.JButton();
        BMainMenu = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Matching Pairs");
        setBackground(new java.awt.Color(255, 255, 153));
        setIconImage(Toolkit.getDefaultToolkit().getImage(Play.class.getResource("duck.gif")));
        setMaximumSize(new java.awt.Dimension(740, 449));
        setMinimumSize(new java.awt.Dimension(500, 449));
        setPreferredSize(new java.awt.Dimension(736, 439));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        Title.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        Title.setForeground(new java.awt.Color(0, 51, 51));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/titlemain.png"))); // NOI18N
        Title.setMaximumSize(new java.awt.Dimension(800, 450));
        Title.setMinimumSize(new java.awt.Dimension(800, 450));
        Title.setPreferredSize(new java.awt.Dimension(440, 230));
        Title.setRequestFocusEnabled(false);
        getContentPane().add(Title);
        Title.setBounds(0, 50, 740, 70);

        PlayerPanel.setEnabled(false);
        PlayerPanel.setOpaque(false);
        PlayerPanel.setPreferredSize(new java.awt.Dimension(440, 230));

        P1Btn.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        P1Btn.setText("1 Player");
        P1Btn.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        P1Btn.setFocusPainted(false);
        P1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P1BtnActionPerformed(evt);
            }
        });

        P2Btn.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        P2Btn.setText("2 Players");
        P2Btn.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        P2Btn.setFocusPainted(false);
        P2Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P2BtnActionPerformed(evt);
            }
        });

        P3Btn.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        P3Btn.setText("3 Players");
        P3Btn.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        P3Btn.setFocusPainted(false);
        P3Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P3BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PlayerPanelLayout = new javax.swing.GroupLayout(PlayerPanel);
        PlayerPanel.setLayout(PlayerPanelLayout);
        PlayerPanelLayout.setHorizontalGroup(
            PlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlayerPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(PlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(P2Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P1Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P3Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PlayerPanelLayout.setVerticalGroup(
            PlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlayerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(P1Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(P2Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(P3Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(PlayerPanel);
        PlayerPanel.setBounds(160, 130, 420, 230);

        GridPanel.setOpaque(false);

        Grid2.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Grid2.setText("2 X 2");
        Grid2.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        Grid2.setFocusPainted(false);
        Grid2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Grid2ActionPerformed(evt);
            }
        });

        Grid4.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Grid4.setText("4 X 4");
        Grid4.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        Grid4.setFocusPainted(false);
        Grid4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Grid4ActionPerformed(evt);
            }
        });

        Grid6.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Grid6.setText("6 X 6");
        Grid6.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        Grid6.setFocusPainted(false);
        Grid6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Grid6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GridPanelLayout = new javax.swing.GroupLayout(GridPanel);
        GridPanel.setLayout(GridPanelLayout);
        GridPanelLayout.setHorizontalGroup(
            GridPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GridPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Grid2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Grid4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GridPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Grid6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
        );
        GridPanelLayout.setVerticalGroup(
            GridPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GridPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(GridPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Grid2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Grid4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Grid6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(GridPanel);
        GridPanel.setBounds(150, 130, 440, 220);

        CardOptionPanel.setName(""); // NOI18N
        CardOptionPanel.setOpaque(false);
        CardOptionPanel.setPreferredSize(new java.awt.Dimension(440, 230));

        ImageBtn.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        ImageBtn.setText("Image");
        ImageBtn.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        ImageBtn.setFocusPainted(false);
        ImageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImageBtnActionPerformed(evt);
            }
        });

        TextBtn.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        TextBtn.setText("Text");
        TextBtn.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        TextBtn.setFocusPainted(false);
        TextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CardOptionPanelLayout = new javax.swing.GroupLayout(CardOptionPanel);
        CardOptionPanel.setLayout(CardOptionPanelLayout);
        CardOptionPanelLayout.setHorizontalGroup(
            CardOptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CardOptionPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(CardOptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ImageBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        CardOptionPanelLayout.setVerticalGroup(
            CardOptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CardOptionPanelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(TextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ImageBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        getContentPane().add(CardOptionPanel);
        CardOptionPanel.setBounds(150, 130, 440, 230);

        BackBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BackBtn.setText("BACK");
        BackBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        getContentPane().add(BackBtn);
        BackBtn.setBounds(200, 380, 140, 30);

        ExitBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ExitBtn.setText("EXIT");
        ExitBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ExitBtn);
        ExitBtn.setBounds(410, 380, 140, 30);

        BMainMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FindThePair/background1.jpg"))); // NOI18N
        BMainMenu.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        BMainMenu.setPreferredSize(new java.awt.Dimension(440, 230));
        getContentPane().add(BMainMenu);
        BMainMenu.setBounds(-30, 0, 770, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Grid6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Grid6ActionPerformed
        // TODO add your handling code here:
        GridSize = 6;
        ShowCardOption();
    }//GEN-LAST:event_Grid6ActionPerformed

    private void Grid2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Grid2ActionPerformed
        // TODO add your handling code here:
        GridSize = 2;
        ShowCardOption();
    }//GEN-LAST:event_Grid2ActionPerformed

    private void Grid4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Grid4ActionPerformed
        // TODO add your handling code here:
        GridSize = 4;
        ShowCardOption();
    }//GEN-LAST:event_Grid4ActionPerformed

    private void ExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBtnActionPerformed
        // TODO add your handling code here:
       ExitDialog();
    }//GEN-LAST:event_ExitBtnActionPerformed

    private void P2BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P2BtnActionPerformed
        // TODO add your handling code here:
        // Player p2 = new Player();
        NoOfPlayers = 2;
        ShowGrid();
    }//GEN-LAST:event_P2BtnActionPerformed

    private void P1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P1BtnActionPerformed
        // TODO add your handling code here:
        NoOfPlayers = 1;
        
        ShowGrid();
    }//GEN-LAST:event_P1BtnActionPerformed

    private void P3BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P3BtnActionPerformed
        // TODO add your handling code here:
        NoOfPlayers = 3;
        ShowGrid();
    }//GEN-LAST:event_P3BtnActionPerformed

    private void ImageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImageBtnActionPerformed
        // TODO add your handling code here:
        Game g = new Game(NoOfPlayers,GridSize,false);
        ShowPlay();
    }//GEN-LAST:event_ImageBtnActionPerformed

    private void TextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextBtnActionPerformed
        // TODO add your handling code here:
        Game g = new Game(NoOfPlayers,GridSize,true);
        ShowPlay();
    }//GEN-LAST:event_TextBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        if (CardOptionPanel.isVisible())
            ShowGrid();
        else 
            ShowPlayer();
            
            
        
    }//GEN-LAST:event_BackBtnActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       ExitDialog();
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BMainMenu;
    private javax.swing.JButton BackBtn;
    private javax.swing.JPanel CardOptionPanel;
    private javax.swing.JButton ExitBtn;
    private javax.swing.JButton Grid2;
    private javax.swing.JButton Grid4;
    private javax.swing.JButton Grid6;
    private javax.swing.JPanel GridPanel;
    private javax.swing.JButton ImageBtn;
    private javax.swing.JButton P1Btn;
    private javax.swing.JButton P2Btn;
    private javax.swing.JButton P3Btn;
    private javax.swing.JPanel PlayerPanel;
    private javax.swing.JButton TextBtn;
    private javax.swing.JLabel Title;
    private javax.swing.JRadioButton jRadioButton1;
    // End of variables declaration//GEN-END:variables

  
              

}

