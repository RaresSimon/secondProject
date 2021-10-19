import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FonduriInsuficiente implements ActionListener
{

    JFrame frame= new JFrame("Login");
    JLabel label = new JLabel("Fonduri Insufiente!");
    JLabel label2 = new JLabel("doriti alta metoda de plata?");
    JButton myButton = new JButton("cancel");
    JButton myButton2 = new JButton("meniu");
    JButton myButton3 = new JButton("Da");
    FonduriInsuficiente()
    {
        label.setBounds(0, 0, 500, 50);
        label.setFont(new Font(null, Font.PLAIN, 25));
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 200);
        frame.setLayout(new FlowLayout());
        label2.setBounds(0, 0, 500, 50);
        label2.setFont(new Font(null, Font.PLAIN, 25));
        frame.add(label2);
        frame.setResizable(false);
        frame.setVisible(true);
        myButton.setBounds(65, 40, 200, 40);
        myButton.setFocusable(false);
        myButton.addActionListener(this);
        frame.add(myButton);
        myButton2.setBounds(65, 40, 200, 40);
        myButton2.setFocusable(false);
        myButton2.addActionListener(this);
        frame.add(myButton2);
        myButton3.setBounds(65, 40, 200, 40);
        myButton3.setFocusable(false);
        myButton3.addActionListener(this);
        frame.add(myButton3);
    }

    public static void main(String[] args) {
        FonduriInsuficiente fond=new FonduriInsuficiente();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
