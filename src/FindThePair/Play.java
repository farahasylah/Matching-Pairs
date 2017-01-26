package FindThePair;


import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import static javax.swing.SwingConstants.CENTER;


public class Play extends JFrame implements ActionListener{
    Game g = new Game(Game.getNoOfPlayers(),Game.getGridSize(),Game.getIsCardText());
    String[] GridText = g.getGridSelect();
    int TotalCards = g.getGridSelect().length;
    Player[] p = new Player[Game.getNoOfPlayers()];
    int full = 0;
    int counter = 0;
    ArrayList<Integer> Player = new ArrayList<Integer>(Game.getNoOfPlayers());
    ArrayList<Integer> ResetBTN = new ArrayList<>(2);
    JLabel[] Score = new JLabel[Game.getNoOfPlayers()];
    JButton[] BTN = new JButton[TotalCards];
    //Message Dialog
    JLabel[] PlayerScore = new JLabel[Game.getNoOfPlayers()];
    JPanel MessagePanel = new JPanel();
    JLabel MsgTitle = new JLabel();
    Boolean EndGame;
         
   
    public Play() {
        initComponents();
        this.setLocation(250, 10);
        Player.clear();
        EndGame = false;
  	for (int i = 0;i < TotalCards;i++){
            BTN[i] = new JButton();
            BTN[i].setFont(new Font ("Arial",Font.BOLD,24));
            BTN[i].setForeground(Color.ORANGE);
            BTN[i].setBackground(Color.ORANGE);
            BTN[i].addActionListener(this);
            PlayPanel.add(BTN[i]);
        }
        if (TotalCards==4){
            PlayPanel.setSize(350,350);
            PlayPanel.setLocation(270, 220);
        }
        
        for (int i = 0;i<Game.getNoOfPlayers();i++){
            Player.add(i);
            Score[i] = new JLabel();
            Score[i].setFont(new Font ("Consolas",Font.LAYOUT_LEFT_TO_RIGHT,12));
            ScorePanel.add(Score[i]);
            p[i] = new Player();
        }
        g.setCurrentPlayer();
        DisplayPlayer();
        
    }

  
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ScorePanel = new javax.swing.JPanel();
        PlayPanel = new javax.swing.JPanel(new GridLayout(0, Game.getGridSize(),10,10));
        CPlayer = new javax.swing.JLabel();
        NewBTN = new javax.swing.JButton();
        EndBTN = new javax.swing.JButton();
        ExitBTN = new javax.swing.JButton();
        Instructions = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        BackgroundPlay = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Matching Pairs");
        setIconImage(Toolkit.getDefaultToolkit().getImage(Play.class.getResource("duck.gif")));
        setMinimumSize(new java.awt.Dimension(901, 720));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        ScorePanel.setBackground(new java.awt.Color(255, 255, 153));
        ScorePanel.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        getContentPane().add(ScorePanel);
        ScorePanel.setBounds(120, 110, 650, 20);

        PlayPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        PlayPanel.setOpaque(false);
        getContentPane().add(PlayPanel);
        PlayPanel.setBounds(110, 150, 670, 480);

        CPlayer.setBackground(new java.awt.Color(255, 255, 0));
        CPlayer.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        CPlayer.setForeground(new java.awt.Color(51, 51, 51));
        CPlayer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CPlayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/shelve1.png"))); // NOI18N
        CPlayer.setToolTipText("");
        CPlayer.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        CPlayer.setPreferredSize(new java.awt.Dimension(150, 25));
        getContentPane().add(CPlayer);
        CPlayer.setBounds(260, 70, 380, 40);
        CPlayer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        NewBTN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        NewBTN.setText("NEW GAME");
        NewBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewBTNActionPerformed(evt);
            }
        });
        getContentPane().add(NewBTN);
        NewBTN.setBounds(230, 650, 160, 30);

        EndBTN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EndBTN.setText("END GAME");
        EndBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndBTNActionPerformed(evt);
            }
        });
        getContentPane().add(EndBTN);
        EndBTN.setBounds(490, 650, 160, 30);

        ExitBTN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ExitBTN.setText("EXIT");
        ExitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBTNActionPerformed(evt);
            }
        });
        getContentPane().add(ExitBTN);
        ExitBTN.setBounds(490, 650, 160, 30);

        Instructions.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        Instructions.setForeground(new java.awt.Color(51, 51, 51));
        Instructions.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Instructions.setText("Click on the two tiles to find two matching pairs");
        getContentPane().add(Instructions);
        Instructions.setBounds(100, 130, 690, 15);

        Title.setBackground(new java.awt.Color(0, 204, 204));
        Title.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/title.png"))); // NOI18N
        Title.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Title.setPreferredSize(new java.awt.Dimension(500, 43));
        getContentPane().add(Title);
        Title.setBounds(130, 20, 640, 50);

        BackgroundPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FindThePair/backgroungame1sqa.jpg"))); // NOI18N
        BackgroundPlay.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        BackgroundPlay.setRequestFocusEnabled(false);
        getContentPane().add(BackgroundPlay);
        BackgroundPlay.setBounds(0, 0, 900, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBTNActionPerformed
        // TODO add your handling code here:
         ExitGame();
    }//GEN-LAST:event_ExitBTNActionPerformed

    private void NewBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewBTNActionPerformed
        // TODO add your handling code here:
        MainMenu m = new MainMenu();
        this.hide();
        m.show();
             
    }//GEN-LAST:event_NewBTNActionPerformed

    private void EndBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndBTNActionPerformed
        // TODO add your handling code here:
        ConfirmEnd();
    }//GEN-LAST:event_EndBTNActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        ExitGame();
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Play().setVisible(true);  
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundPlay;
    private javax.swing.JLabel CPlayer;
    private javax.swing.JButton EndBTN;
    private javax.swing.JButton ExitBTN;
    private javax.swing.JLabel Instructions;
    private javax.swing.JButton NewBTN;
    private javax.swing.JPanel PlayPanel;
    private javax.swing.JPanel ScorePanel;
    private javax.swing.JLabel Title;
    // End of variables declaration//GEN-END:variables

   @Override
    public void actionPerformed(ActionEvent e) {
      JButton btn = (JButton)e.getSource();
       for(int i = 0;i<TotalCards;i++){
            if (btn == BTN[i]) {
              clickButton(i);
            }
            DisplayPlayer();
            if(full==TotalCards){
                EndGame = true;
                EndBTN.setVisible(false);
                showMsgScore();
                break;
           }
        }
    }
    
    public void clickButton(int i){
        BTN[i].setText(GridText[i]);
        counter++;
        g.addCardSelect(BTN[i].getText());
        ResetBTN.add(i); 
        if(!Game.getIsCardText()){
            BTN[i].setText(null);
            BTN[i].setIcon(new ImageIcon(getClass().getResource(GridText[i])));
            BTN[i].setDisabledIcon(new ImageIcon(getClass().getResource(GridText[i])));
        }
        else
            BTN[i].setBackground(Color.WHITE);
                
        BTN[i].setEnabled(false);
        if (counter==2) {
            if(g.CheckCard()){
                full+=2;
                p[g.getCurrentPlayer()-1].setCardsCollect();
                for (int k = 0;k<2;k++){
                    int j =  ResetBTN.get(k);
                    BTN[j].setEnabled(false);  
                }
            }
            else {
            JOptionPane.showMessageDialog(null,"Oppsss...NOT MATCH!",
                                        "",JOptionPane.ERROR_MESSAGE);
                for (int k = 0;k<2;k++){
                    int j =  ResetBTN.get(k);
                    BTN[j].setEnabled(true); 
                    BTN[j].setIcon(null);
                    BTN[j].setForeground(Color.ORANGE);
                    BTN[j].setBackground(Color.ORANGE);
                    BTN[j].setText(null);
                }
                g.setCurrentPlayer();
            }
            ResetBTN.clear();
            g.clearSelection();
            counter = 0;
        } 
        
    }
    private void DisplayPlayer(){   
        for (int i = 0;i<Game.getNoOfPlayers();i++){
            Score[i].setText("      Player "  +(i+1)+ " :   " +p[i].getCardsCollects()+ "        " );
            CPlayer.setText(g.ShowCurrentPlayer());
            if(EndGame)
                g.setPScore(p[i].getCardsCollects());
        }
    }
    
    public void showMsgScore(){
        DisplayPlayer();
        JOptionPane.showMessageDialog(null,MsgScorePanel(),"SCOREBOARD",JOptionPane.PLAIN_MESSAGE);
    }
    
    public JPanel MsgScorePanel() {
        if (Game.getNoOfPlayers()==1)
            MessagePanel.setPreferredSize(new Dimension(600, 200));
        else if (Game.getNoOfPlayers()==2)
            MessagePanel.setPreferredSize(new Dimension(600, 300));
        else
            MessagePanel.setPreferredSize(new Dimension(600, 400));
            MessagePanel.add(MsgTitle);
            
        for (int i = 0;i<Game.getNoOfPlayers();i++){
            PlayerScore[i] = new JLabel();
            PlayerScore[i].setHorizontalTextPosition(CENTER);
            PlayerScore[i].setFont(new Font ("Arial Rounded MT Bold",Font.BOLD,30));
            if (full<TotalCards){
                PlayerScore[i].setIcon(new ImageIcon(getClass().getResource("/Image/badge1.png")));
                MsgTitle.setText("TOO BAD! YOU END THE GAME SO FAST :p");
                MsgTitle.setFont(new Font ("Arial",Font.BOLD,20));
                PlayerScore[i].setText("      Player " +(i+1)+ "  : " 
                                   +p[i].getCardsCollects());
            }
            else{
                MsgTitle.setIcon(new ImageIcon(getClass().getResource("/Image/ss-crop.png")));
                if(g.CheckDraw())
                    PlayerScore[i].setIcon(new ImageIcon(getClass().getResource("/Image/badgedraw.png")));
                else if(i==0)
                    PlayerScore[i].setIcon(new ImageIcon(getClass().getResource("/Image/badgeWin.png")));
                else
                    PlayerScore[i].setIcon(new ImageIcon(getClass().getResource("/Image/badge1.png")));
                checkWinner();
                for (int k = 0;k<Game.getNoOfPlayers();k++){
                    if( p[k].getRanking()==(i+1)){
                        PlayerScore[i].setText("      Player " +(k+1)+ "  : " 
                                   +Integer.toString(p[k].getCardsCollects()));
                        break;
                     }
                }
            }
            MessagePanel.add(PlayerScore[i]);
            MessagePanel.setBackground(new Color(255,255,153));
         }
        return MessagePanel;
    }
    
    public void ConfirmEnd(){
        int option = JOptionPane.showConfirmDialog(null, "Gave up already???",
                                                    "", JOptionPane.YES_NO_OPTION);
        switch (option) {
            case JOptionPane.YES_OPTION:
                EndGame = true;
                ExitBTN.setVisible(true);
                EndBTN.setVisible(false);
                showMsgScore();
                PlayPanel.setVisible(false);
                break;
            case JOptionPane.NO_OPTION:
                EndBTN.setVisible(true);
                break;
        }
    }
    
    public void checkWinner(){
        for (int i = 0;i<Game.getNoOfPlayers();i++){
            for (int k=0;k<Player.size();k++){
                if( g.CheckWinner(i)==p[Player.get(k)].getCardsCollects()){
                    p[Player.get(k)].setRanking(i+1);
                    Player.remove(k);
                    break;
                    }
             }
        }
    }
    
    public void ExitGame(){
      String msg;
        if (full==0)
            msg = "The game bores you already???";
        else 
            msg = "Exit now???";
        int exit = JOptionPane.showConfirmDialog(
                    this,msg,"Exit", JOptionPane.YES_NO_OPTION);
        if( exit==JOptionPane.YES_OPTION){
           System.exit(0);
        }
    }
}

