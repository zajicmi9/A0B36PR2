/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package semestralka;

import java.awt.*;
import java.awt.event.*;
import java.util.List;
import javax.swing.*;

/**
 *
 * @author Milan
 */
public class WWindow extends JFrame implements ActionListener, ItemListener {
    Button start;
    JLabel players;
    JLabel credit;
   Choice list;
    JTextField pole;
    
    
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
        
        
        
        credit = new JLabel("STARTING CREDITS:" );
        credit.setBounds(80, 100, 180, 20);
        this.add(credit);
        
        pole = new JTextField("", 2);
        pole.setHorizontalAlignment(SwingConstants.CENTER);
        pole.setBounds(90, 130, 100, 20);
        this.add(pole);
        
        start = new Button("START", 90, 200, 100, 30);
        start.setBackground(Color.green);
//        start.addActionListener(o);
        this.add(start);
        

  
}

    @Override
    public void itemStateChanged(ItemEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}