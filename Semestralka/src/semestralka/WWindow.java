/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package semestralka;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;


/**
 *
 * @author Milan
 */
public class WWindow extends JFrame     {
    Button start;
    Button newg;
    Button load;
    JLabel players;
    JLabel credit;
    JLabel fail;
    Choice list;
    JTextField field;
    JTextField p1;
    JTextField p2;
    JTextField p3;
    JTextField p4;
    OperationStart o;
    
    
    
    public WWindow() throws HeadlessException {
        
        super("-YOU ARE WELCOME-");
        this.setSize(300, 400);
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

        
        list.addItemListener(new ItemListener(){
        @Override
        public void itemStateChanged(ItemEvent ie)
        {
            String a = list.getSelectedItem();
            switch (a) {
                case "1":
                    p1.setEnabled(true);
                    p2.setEnabled(false);
                    p3.setEnabled(false);
                    p4.setEnabled(false);
                    break;
                case "2":
                    p1.setEnabled(true);
                    p2.setEnabled(true);
                    p3.setEnabled(false);
                    p4.setEnabled(false);
                    break;
                case "3":
                    p2.setEnabled(true);
                    p3.setEnabled(true);
                    p1.setEnabled(true);
                    p4.setEnabled(false);
                    break;
                case "4":
                    p1.setEnabled(true);
                    p2.setEnabled(true);
                    p3.setEnabled(true);
                    p4.setEnabled(true);
                    break;
            }
  }});
    
                
        p1 = new JTextField("player 1", 2);
        p1.setBounds(90, 80, 100, 20);
        this.add(p1);
        
        p2 = new JTextField("player 2", 2);
        p2.setBounds(90, 110, 100, 20);
        this.add(p2);
        
        p3 = new JTextField("player 3", 2);
        p3.setBounds(90, 140, 100, 20);
        this.add(p3);
        
        p4 = new JTextField("player 4", 2);
        p4.setBounds(90, 170, 100, 20);
        this.add(p4);
        
        p2.setEnabled(false);
        p3.setEnabled(false);
        p4.setEnabled(false);
   
        credit = new JLabel("STARTING CREDIT:" );
        credit.setBounds(85, 210, 180, 20);
        this.add(credit);
        
        field = new JTextField("", 2);
        field.setHorizontalAlignment(SwingConstants.CENTER);
        field.setBounds(90, 250, 100, 20);
        this.add(field);
        
        fail = new JLabel("");
        fail.setBounds(100, 280, 100, 20);
        this.add(fail);
        
        o = new OperationStart();
        start = new Button("NEW GAME", 25, 320, 110, 30);
        start.setBackground(Color.green);
        start.addActionListener(o);        
        this.add(start);
        
        load = new Button("LOAD GAME", 145, 320, 110, 30);
        load.setBackground(Color.blue);
        load.addActionListener(o);        
        this.add(load);
        
}   


}