import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContBancarAlFirmei implements ActionListener
{

        ContBancar CB1= new ContBancar(5000);
        double a=CB1.check_sold();
        String sold=String.valueOf(a);
        double c=a+Plata.costTransport;
        double d=c-a;
        JFrame frame = new JFrame();
        JLabel label = new JLabel("Banii la inceputu zilei"+sold);
        JLabel label2 = new JLabel("banii la finalul zilei"+c);
        JLabel label3 = new JLabel("        Profitul: "+d+"            ");
       // JLabel label4 = new JLabel("CNP");
        //JLabel label5 = new JLabel("Parola");
        //JLabel label6 = new JLabel("");
       // JTextField textField= new JTextField();
       // JTextField textField2= new JTextField();
       // JTextField textField3= new JTextField();
       // JTextField textField4= new JTextField();
       JButton myButton = new JButton("next");
        JButton myButton2 = new JButton("cancel");
        ContBancarAlFirmei()
        {
            label.setBounds(0, 0, 500, 50);
            label2.setBounds(0, 60, 500, 50);
            label3.setBounds(0, 120, 500, 50);
            label.setFont(new Font(null, Font.PLAIN, 25));
            label2.setFont(new Font(null, Font.PLAIN, 25));
            label3.setFont(new Font(null, Font.PLAIN, 25));
            frame.add(label);
            frame.add(label2);
          //  frame.add(textField);
            frame.add(label3);
          //  frame.add(textField2);
            //textField.setPreferredSize(new Dimension(80,40));
          //  textField.setText(" ");
          //  textField2.setPreferredSize(new Dimension(80,40));
          //  textField2.setText(" ");
         //   textField3.setPreferredSize(new Dimension(200,40));
          //  textField3.setText(" ");
          //  textField4.setPreferredSize(new Dimension(180,40));
          //  textField4.setText(" ");
          //  frame.add(label4);
           // frame.add(textField3);
          //  frame.add(label5);
             myButton2.setBounds(0, 200, 200, 40);
            myButton2.setFocusable(false);
            myButton2.addActionListener(this);
            frame.add(myButton2);
           // label4.setBounds(0, 0, 500, 50);
         //   label4.setFont(new Font(null, Font.PLAIN, 25));
          //  label5.setBounds(0, 0, 500, 50);
         //   label5.setFont(new Font(null, Font.PLAIN, 25));
         //   label6.setBounds(0, 0, 100, 50);
          //  label6.setFont(new Font(null, Font.PLAIN, 25));
            myButton.setBounds(100, 200, 200, 40);
            myButton.setFocusable(false);
            myButton.addActionListener(this);
           // frame.add(label6);
            frame.add(myButton);
            frame.setResizable(false);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(null);
            frame.setSize(350, 350);
            frame.setVisible(true);
            frame.setLayout(new FlowLayout());
        }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
