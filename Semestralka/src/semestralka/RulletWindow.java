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
public class RulletWindow extends JFrame {
    
    JButton[][] field;
    JButton zero, red, black, small, big, odd ,even, st, nd, rd, s1,s2,s3;
    int c;
    int k = 0;
    Icon imgicon;
    
   public RulletWindow()  {
        super("RULLET");
        this.setSize(800, 450);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocation(100, 100);
        
        int n = -12;
        int m = -3;
        int o = 12;
        int p=3;
        int x= 215; //location of width
        int y = 33; //location of height
        
        field = new JButton[o][p];
        for (int i = 0; i < o; i++) {
            for (int j = 0; j > m; j--) {
                k++;
                field[i][-j] = new JButton();
                field[i][-j].setBounds(35 * i + 250, 46 * j + 125, 35, 46);
                this.add(field[i][-j]);
                imgicon = new ImageIcon("grafika/"+k+".gif");
                field[i][-j].setIcon(imgicon);
            }
        }
        
        zero = new JButton();
        zero.setBounds(x, y, 35, 138);
        this.add(zero);
        Icon imgicon0 = new ImageIcon("grafika/0.gif");
        zero.setIcon(imgicon0);
        
        st = new JButton();
        st.setBounds(x+455, y+92, 35, 46);
        this.add(st);
        Icon imgicon1 = new ImageIcon("grafika/1st.gif");
        st.setIcon(imgicon1);
        
        nd = new JButton();
        nd.setBounds(x+455, y+46, 35, 46);
        this.add(nd);
        Icon imgicon2 = new ImageIcon("grafika/2nd.gif");
        nd.setIcon(imgicon2);
        
        rd = new JButton();
        rd.setBounds(x+455, y, 35, 46);
        this.add(rd);
        Icon imgicon3 = new ImageIcon("grafika/3rd.gif");
        rd.setIcon(imgicon3);
        
        s1 = new JButton();
        s1.setBounds(x+35, y+138, 140, 46);
        this.add(s1);
        Icon imgicon4 = new ImageIcon("grafika/1-12.gif");
        s1.setIcon(imgicon4);    
        
        s2= new JButton();
        s2.setBounds(x+175, y+138, 140, 46);
        this.add(s2);
        Icon imgicon5 = new ImageIcon("grafika/13-24.gif");
        s2.setIcon(imgicon5); 
        
        s3= new JButton();
        s3.setBounds(x+315, y+138, 140, 46);
        this.add(s3);
        Icon imgicon6 = new ImageIcon("grafika/25-36.gif");
        s3.setIcon(imgicon6); 
        
        even = new JButton();
        even.setBounds(x+35, y+184, 70, 46);
        this.add(even);
        Icon eveng = new ImageIcon("grafika/even.gif");
        even.setIcon(eveng); 
        
        odd = new JButton();
        odd.setBounds(x+105, y+184, 70, 46);
        this.add(odd);
        Icon oddg = new ImageIcon("grafika/odd.gif");
        odd.setIcon(oddg); 
        
        red = new JButton();
        red.setBounds(x+175, y+184, 70, 46);
        this.add(red);
        Icon redg = new ImageIcon("grafika/red.gif");
        red.setIcon(redg); 
        
        black = new JButton();
        black.setBounds(x+245, y+184, 70, 46);
        this.add(black);
        Icon blackg = new ImageIcon("grafika/black.gif");
        black.setIcon(blackg);
        
        small = new JButton();
        small.setBounds(x+315, y+184, 70, 46);
        this.add(small);
        Icon smallg = new ImageIcon("grafika/small.gif");
        small.setIcon(smallg);
        
        big = new JButton();
        big.setBounds(x+385, y+184, 70, 46);
        this.add(big);
        Icon bigg = new ImageIcon("grafika/big.gif");
        big.setIcon(bigg);
    }
            
}


