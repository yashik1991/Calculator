/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;
import java.io.*;
/**
 *
 * @author yashik
 */
public class Calculator extends Frame implements ActionListener{

    /**
     * @param args the command line arguments
     */
    final TextField tf;
    Panel p1,p2;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
    Calculator()
    {
        setLayout(new GridLayout(2,1));
        p2=new Panel();
        tf = new TextField();
        
        //add(p1, "South");
        p2.add(tf);
        add(p2);
        p1=new Panel();
        p1.setLayout(new GridLayout(4,4,0,0));
        p2.setLayout(new GridLayout(1,1));
       // p2.setBounds(0,0,600,200);
        //add(p2);
       // p1.setBounds(0,250,200,400);
        b1 = new Button("0");
        //b1.setBounds(0,80,100,80);
        b1.addActionListener(this);
        b2 = new Button("1");
        //b2.setBounds(0,160,100,80);
        b2.addActionListener(this);
        b3 = new Button("4");
        //b3.setBounds(0,240,100,80);
        b3.addActionListener(this);
        b4 = new Button("7");
        //b4.setBounds(0,320,100,80);
        b4.addActionListener(this);
        b5 = new Button("/");
        //b5.setBounds(100,80,100,80);
        b5.addActionListener(this);
        b6 = new Button("2");
        //b6.setBounds(100,160,100,80);
        b6.addActionListener(this);
        b7 = new Button("5");
        //b7.setBounds(100,240,100,80);
        b7.addActionListener(this);
        b8 = new Button("8");
       // b8.setBounds(100,320,100,80);
        b8.addActionListener(this);
        b9 = new Button("+");
       // b9.setBounds(200,80,100,80);
        b9.addActionListener(this);
        b10 = new Button("3");
       // b10.setBounds(200,160,100,80);
        b10.addActionListener(this);
        b11 = new Button("6");
       // b11.setBounds(200,240,100,80);
        b11.addActionListener(this);
        b12 = new Button("9");
      //  b12.setBounds(200,320,100,80);
        b12.addActionListener(this);
        b13 = new Button("<");
      //  b13.setBounds(300,80,100,80);
        b13.addActionListener(this);
        b14 = new Button("*");
       // b14.setBounds(300,160,100,80);
        b14.addActionListener(this);
        b15 = new Button("-");
       // b15.setBounds(300,240,100,80);
        b15.addActionListener(this);
        b16 = new Button("=");
       // b16.setBounds(300,320,100,80);
        b16.addActionListener(this);
        
        //add(tf);
       add(p1);
                p1.add(b1);p1.add(b2);p1.add(b3);p1.add(b4);p1.add(b5);p1.add(b6);p1.add(b7);p1.add(b8);p1.add(b9);p1.add(b10);p1.add(b11);p1.add(b12);p1.add(b13);p1.add(b14);p1.add(b15);p1.add(b16);
        
        setSize(700,700);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        String data = tf.getText();
        if(e.getSource()==b1)
        {
            data+='0';
            tf.setText(data);
        }
        if(e.getSource()==b2)
        {
            data+='1';
            tf.setText(data);
        }
        if(e.getSource()==b3)
        {
            data+='4';
            tf.setText(data);
        }
        if(e.getSource()==b4)
        {
            data+='7';
            tf.setText(data);
        }
        if(e.getSource()==b5)
        {
            data+=' ';
            data+='/';
            data+=' ';
            tf.setText(data);
        }
        if(e.getSource()==b6)
        {
            data+='2';
            tf.setText(data);
        }
        if(e.getSource()==b7)
        {
            data+='5';
            tf.setText(data);
        }
        if(e.getSource()==b8)
        {
            data+='8';
            tf.setText(data);
        }
        if(e.getSource()==b9)
        {
            data+=' ';
            data+='+';
            data+=' ';
            tf.setText(data);
        }
        if(e.getSource()==b10)
        {
            data+='3';
            tf.setText(data);
        }
        if(e.getSource()==b11)
        {
            data+='6';
            tf.setText(data);
        }
        if(e.getSource()==b12)
        {
            data+='9';
            tf.setText(data);
        }
        if(e.getSource()==b13)
        {
            int l=data.length();
            if(l>0)
            { String s=data.substring(0,l-1);
            tf.setText(s);}
        }
        if(e.getSource()==b14)
        {
            data+=' ';
            data+='*';
            data+=' ';
            tf.setText(data);
        }
        if(e.getSource()==b15)
        {
            data+=' ';
            data+='-';
            data+=' ';
            tf.setText(data);
        }
        if(e.getSource()==b16)
        {
            
            String word[] = data.split("\\s");
            int res=0;
            int x=Integer.parseInt(word[0]);
            int y=Integer.parseInt(word[2]);
           try{
            if(word[1].compareTo("/")==0)
                res=x/y;
           }catch(Exception e1)
           {
               tf.setText("Error");
               }
           
            if(word[1].compareTo("*")==0)
                res=x*y;
            if(word[1].compareTo("+")==0)
                res=x+y;
            if(word[1].compareTo("-")==0)
                res=x-y;
            
            data=String.valueOf(res);
            tf.setText(data);
        }
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new Calculator();
    }
}

    

