import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
public class Pokemon_Game{
    JFrame window;
    Container con;
    JPanel titleNamePanel, startButtonParnel, mainTextPanel, choiceButtonPanel,pokemonparnel;
    JLabel titleNameLabel, pokemonlebel,pokemonname,hplebel,cerrenthp;
    Font titleFont = new Font ("times New Roman",Font.PLAIN, 90);
    Font normalFont = new Font ("times New Roman",Font.PLAIN, 30);
    JButton startButton,choice1, choice2, choice3, choice4;
    JTextArea maintextarea; 
    

    TitleScreenhandler tshandler = new TitleScreenhandler(); 
    public static void  main(String[] args) {
        new Pokemon_Game();
    }
    public Pokemon_Game()  {
        window = new JFrame();
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        window.setVisible(true);
        con = window.getContentPane();

        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100,100,600,150);
        titleNamePanel.setBackground(Color.black);
        titleNameLabel = new JLabel("POKEMON");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);

        startButtonParnel = new JPanel();
        startButtonParnel.setBounds (300,400,200,100);
        startButtonParnel.setBackground(Color.black);
        

        startButton = new JButton("Start");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFont(normalFont);
        startButton.addActionListener(tshandler);

        titleNamePanel.add(titleNameLabel);
        startButtonParnel.add(startButton);

      
        
        con.add(titleNamePanel); 
        con.add(startButtonParnel);
    }
    public void createGameScreen(){

        titleNamePanel.setVisible(false);
        startButtonParnel.setVisible(false);

        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100,100, 600, 250);
        mainTextPanel.setBackground(Color.black);
        con.add(mainTextPanel); 

        maintextarea = new JTextArea("what do you want to do?");
        maintextarea.setBounds(100,100, 600, 250);
        maintextarea.setBackground(Color.black);
        maintextarea.setForeground(Color.white);
        maintextarea.setFont(normalFont);
        maintextarea.setLineWrap(true);
        mainTextPanel.add(maintextarea);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250, 350, 300, 150);
        choiceButtonPanel.setBackground(Color.black);
        choiceButtonPanel.setLayout(new GridLayout(4,1));
        con.add(choiceButtonPanel);


        choice1 = new JButton("Go fight");
        choice1.setBackground(Color.black);
        choice1.setForeground(Color.white);
        choice1.setFont(normalFont);
        choiceButtonPanel.add(choice1);
        
        choice2 = new JButton("Your Pokemon");
        choice2.setBackground(Color.black);
        choice2.setForeground(Color.white);
        choice2.setFont(normalFont);
        choiceButtonPanel.add(choice2);
        
        choice3 = new JButton("Find some berry");
        choice3.setBackground(Color.black);
        choice3.setForeground(Color.white);
        choice3.setFont(normalFont);
        choiceButtonPanel.add(choice3);
        
        choice4 = new JButton("Pokemon Center");
        choice4.setBackground(Color.black);
        choice4.setForeground(Color.white);
        choice4.setFont(normalFont);
        choiceButtonPanel.add(choice4);
        
        pokemonparnel = new JPanel();
        pokemonparnel.setBounds(100,15,600,50);
        pokemonparnel.setBackground(Color.blue);
        pokemonparnel.setLayout(new GridLayout(1,4));
        con.add(pokemonparnel);
        pokemonlebel = new JLabel("pokemon :");
        pokemonlebel.setFont(normalFont);
        pokemonlebel.setForeground(Color.white);
        pokemonparnel.add(pokemonlebel);
    }
    public void wyName(){
        String name = JOptionPane.showInputDialog("what is your pokemon's name.");
    }
    public class TitleScreenhandler implements ActionListener{
        
        public void actionPerformed(ActionEvent event){
            wyName();
            createGameScreen();
        } 
    }
}