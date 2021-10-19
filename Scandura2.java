import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Scandura2 implements ActionListener
{
    JFrame frame = new JFrame();
    JLabel label = new JLabel(" Ati selectat scandura. ");
    JLabel label2 = new JLabel("1-Scandura costa 10 lei. ");
    JLabel label3 = new JLabel(" doriti sa cumparati? ");
    JLabel label4 = new JLabel("          ");
    JTextField textField= new JTextField();
    JButton myButton = new JButton("next");
    JButton myButton2 = new JButton("cancel");
    public static int nrScanduri=0;
    Scandura2()
    {
        int m = 0;
        label.setBounds(0, 0, 500, 50);
        label2.setBounds(0, 60, 500, 50);
        label3.setBounds(0, 120, 500, 50);
        label.setFont(new Font(null, Font.PLAIN, 25));
        label2.setFont(new Font(null, Font.PLAIN, 25));
        label3.setFont(new Font(null, Font.PLAIN, 25));
        frame.add(label);
        frame.add(label2);
        frame.add(label3);
        textField.setPreferredSize(new Dimension(250,40));
        textField.setText(" ");
        frame.add(textField);
        myButton2.setBounds(0, 200, 200, 40);
        myButton2.setFocusable(false);
        myButton2.addActionListener(this);
        frame.add(myButton2);
        label4.setBounds(0, 0, 500, 50);
        label4.setFont(new Font(null, Font.PLAIN, 25));
        frame.add(label4);
        myButton.setBounds(100, 200, 200, 40);
        myButton.setFocusable(false);
        myButton.addActionListener(this);
        frame.add(myButton);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(315, 250);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == myButton2) {
            frame.dispose();
            CeDoriti MaterialeMeniu=new CeDoriti();

        }
        if (e.getSource() == myButton) {
            frame.dispose();
            PlataNumerCard PlataSAU=new PlataNumerCard();
            String p=textField.getText();
             int n=Integer.parseInt(p);
            nrScanduri=n;
            System.out.println(nrScanduri);

        }
    }
}
