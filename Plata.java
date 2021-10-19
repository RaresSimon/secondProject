import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Plata implements ActionListener
{
    public static int cost=Scandura2.nrScanduri*10;
    public static int costTransport=cost+100;
    String costt2=String.valueOf(costTransport);
    String costt=String.valueOf(cost);
    JFrame frame= new JFrame("Login");
    JLabel label = new JLabel(costt);
    JLabel label2 = new JLabel("                          ");
    JLabel label3 = new JLabel("100lei(Transport)="+costt2);

    JLabel label4 = new JLabel("    ");
    //JLabel label5 = new JLabel("suma");
    JLabel label6 = new JLabel("   ");
    JLabel label7 = new JLabel("      Plasati comanda?");
    JButton myButton = new JButton("Nu");
    JButton myButton2 = new JButton("Da");
    Plata()
    {
        label.setBounds(0, 0, 500, 50);
        label.setFont(new Font(null, Font.PLAIN, 25));
        frame.add(label);
        label2.setBounds(0, 0, 500, 50);
        label2.setFont(new Font(null, Font.PLAIN, 25));
        frame.add(label2);
        label3.setBounds(0, 0, 500, 50);
        label3.setFont(new Font(null, Font.PLAIN, 25));
        frame.add(label3);
        label4.setBounds(0, 0, 500, 50);
        label4.setFont(new Font(null, Font.PLAIN, 25));
         frame.add(label4);
        //label5.setBounds(0, 0, 500, 50);
       // label5.setFont(new Font(null, Font.PLAIN, 25));
        //frame.add(label5);
        label6.setBounds(0, 0, 500, 50);
        label6.setFont(new Font(null, Font.PLAIN, 25));
        label7.setBounds(0, 0, 500, 50);
        label7.setFont(new Font(null, Font.PLAIN, 25));
        frame.add(label7);
        frame.add(label6);
        myButton.setBounds(65, 40, 200, 40);
        myButton.setFocusable(false);
        myButton.addActionListener(this);
        myButton2.setBounds(65, 90, 200, 40);
        myButton2.setFocusable(false);
        myButton2.addActionListener(this);
        frame.add(myButton);
        frame.add(myButton2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(320,200);
        ///frame.pack();
        frame.setLayout(new FlowLayout());
        frame.setResizable(false);
        //f.add(new JLabel("hello ,world!"));
        //f.add(new JButton("press me!"));
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == myButton) {
            frame.dispose();
            CeDoriti MaterialeMeniu=new CeDoriti();

        }
        if (e.getSource() == myButton2) {
            frame.dispose();
            ComandaPlasata PLATA=new ComandaPlasata();

        }
    }
}
