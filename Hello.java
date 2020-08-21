import java.awt.BorderLayout;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class Hello
{

  public static void main (String agr[])
  {

     System.out.println("hello this is the first code");
	 System.out.println("New hello");
	 
	  JFrame frame = new JFrame("Groups");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JButton button1 = new JButton("CSK");
      JButton button2 = new JButton("DC");
	  JScrollPane jScrollPane = new JScrollPane();
      
      frame.add(jScrollPane, BorderLayout.CENTER);
      frame.setSize(550, 250);
      frame.setVisible(true);

  }

}