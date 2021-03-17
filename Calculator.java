import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Calculator extends JFrame implements ActionListener{
       
    JFrame frame;
    JTextField inputdata;
    JButton clear,plus,minus,multiply,divide,percentage,equal;
    int calculations[];
    String datastored1,datastored2,dataresult,sign;
                 double operand1,operand2,total;
    public Calculator()
    {
        frame= new JFrame("TextField Example");  
        calculations = new int[100];
        //Upper Input Box  
        inputdata=new JTextField();  
        inputdata.setBounds(10,5,220,30);  
        
        //Clear button
        clear = new JButton("Clear");
        clear.setBounds(240, 5, 60, 30);
        clear.addActionListener(this);
        //plus button
        plus = new JButton("+");
        plus.setBounds(10, 60, 30, 30);
        plus.addActionListener(this);

        //minus button
        minus = new JButton("-");
        minus.setBounds(80, 60, 30, 30);
        minus.addActionListener(this);
        
        //multiply button
        multiply = new JButton("*");
        multiply.setBounds(10, 100, 30, 30);
        multiply.addActionListener(this);
        
        //divide button

        divide= new JButton("/");
        divide.setBounds(80, 100, 30, 30);
        divide.addActionListener(this);

        //percentage button
        //plus = new JButton("+");
        //plus.setBounds(10, 60, 30, 30);

        //equal to button
        equal = new JButton("=");
        equal.setBounds(35, 150, 60, 30);
        equal.addActionListener(this);

        frame.add(inputdata);
        frame.add(clear);
        
        frame.add(plus); 
        frame.add(minus); 
        frame.add(multiply); 
        frame.add(divide); 
        //frame.add(percentage); 
        frame.add(equal);  
        frame.setBounds(100,50,300,300);  
        frame.setLayout(null);  
        frame.setVisible(true); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setResizable(false);
        
           }
           public void actionPerformed(ActionEvent a)
           {
                 Object obj;
                 obj=a.getSource();
                 
                 if(obj.equals(clear))
                 {
                      
                    inputdata.setText("");
                 }
                 else if(obj.equals(plus))
                 {
                     datastored1 = inputdata.getText();
                     operand1 = Double.parseDouble(datastored1);
                     inputdata.setText("");
                     sign="+";
                     System.out.println("in plus sign " +sign );
                      
                 }
                 else if(obj.equals(minus))
                 {
                     datastored1 = inputdata.getText();
                     operand1 = Double.parseDouble(datastored1);
                     inputdata.setText("");
                     sign="-";
                     System.out.println("in minus sign " +sign );
                      
                 }
                 else if(obj.equals(multiply))
                 {
                     datastored1 = inputdata.getText();
                     operand1 = Double.parseDouble(datastored1);
                     inputdata.setText("");
                     sign="*";
                     System.out.println("in mul sign " +sign );
                      
                 }
                 else if(obj.equals(divide))
                 {
                     datastored1 = inputdata.getText();
                     operand1 = Double.parseDouble(datastored1);
                     inputdata.setText("");
                     sign="/";
                     System.out.println("in divide sign " +sign );
                      
                 }
                 else if(obj.equals(equal))
                 {
                    if(sign.equals("+"))
                    {
                       datastored2 = inputdata.getText();
                       operand2 = Double.parseDouble(datastored2);
                       System.out.println("operand 1 is " + operand1);
                       total = operand1 + operand2;
                       System.out.println(total);
                       dataresult = String.valueOf(total);
                       inputdata.setText(dataresult);
                    }
                    if(sign.equals("-"))
                    {
                       datastored2 = inputdata.getText();
                       operand2 = Double.parseDouble(datastored2);
                       System.out.println("operand 1 is " + operand1);
                       total = operand1 - operand2;
                       System.out.println(total);
                       dataresult = String.valueOf(total);
                       inputdata.setText(dataresult);
                    }
                    if(sign.equals("*"))
                    {
                       datastored2 = inputdata.getText();
                       operand2 = Double.parseDouble(datastored2);
                       System.out.println("operand 1 is " + operand1);
                       total = operand1 * operand2;
                       System.out.println(total);
                       dataresult = String.valueOf(total);
                       inputdata.setText(dataresult);
                    }
                    if(sign.equals("/"))
                    {
                       datastored2 = inputdata.getText();
                       operand2 = Double.parseDouble(datastored2);
                       System.out.println("operand 1 is " + operand1);
                       total = operand1 / operand2;
                       System.out.println(total);
                       dataresult = String.valueOf(total);
                       inputdata.setText(dataresult);
                    }
                 }

           }
    public static void main(String[] arg)
      {
         
         try {
             Calculator sj= new Calculator();
         }
         catch(Exception e)
         {

            
         }
         
      }
}
