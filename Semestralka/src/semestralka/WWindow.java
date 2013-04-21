/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package semestralka;

import java.awt.*;
import javax.swing.*;


/**
 *
 * @author Milan
 */
public class WWindow extends JFrame    {
    Button start;
    Button newg;
    Button load;
    JLabel players;
    JLabel credit;
    Choice list;
    JTextField pole;
    OperationStart o;
    
    public WWindow() throws HeadlessException {
        
        super("-YOU ARE WELCOME-");
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);  
        
        players = new JLabel("NUMBER OF PLAYERS" );
        players.setBounds(80, 20, 180, 20);
        this.add(players);
        
        list = new Choice();
        this.add(list);
        list.setBounds(90, 50, 100, 20);
        list.addItem("1");
        list.addItem("2");
        list.addItem("3");
        list.addItem("4");
        
        credit = new JLabel("STARTING CREDIT:" );
        credit.setBounds(80, 100, 180, 20);
        this.add(credit);
        
        pole = new JTextField("", 2);
        pole.setHorizontalAlignment(SwingConstants.CENTER);
        pole.setBounds(90, 130, 100, 20);
        this.add(pole);
        
        o = new OperationStart();
        start = new Button("NEW GAME", 25, 200, 110, 30);
        start.setBackground(Color.green);
        start.addActionListener(o);        
        this.add(start);
        
        load = new Button("LOAD GAME", 145, 200, 110, 30);
        load.setBackground(Color.blue);
        load.addActionListener(o);        
        this.add(load);

  
}

}