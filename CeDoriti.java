import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CeDoriti implements ActionListener {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("       Ce doriti sa cumparati? ");
    JButton myButton = new JButton("Scandura");
    JButton myButton2 = new JButton("Paleti");
    JButton myButton3 = new JButton("Bustean");
    JButton myButton4 = new JButton("Cancel");
    CeDoriti() {
        label.setBounds(0, 0, 500, 50);
        label.setFont(new Font(null, Font.PLAIN, 25));
        frame.add(label);
        frame.setResizable(false);
        myButton.setBounds(65, 40, 200, 40);
        myButton.setFocusable(false);
        myButton.addActionListener(this);
        myButton2.setBounds(65, 90, 200, 40);
        myButton2.setFocusable(false);
        myButton2.addActionListener(this);
        myButton3.setBounds(65, 140, 200, 40);
        myButton3.setFocusable(false);
        myButton3.addActionListener(this);
        myButton4.setBounds(125, 250, 80, 30);
        myButton4.setFocusable(false);
        myButton4.addActionListener(this);
        frame.add(myButton);
        frame.add(myButton2);
        frame.add(myButton3);
        frame.add(myButton4);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(350, 350);
        frame.setVisible(true);
        ///frame.setLayout(new FlowLayout());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == myButton4) {
            frame.dispose();
            Login inapoi = new Login();

        }
        if (e.getSource() == myButton) {
            frame.dispose();
            Scandura2 ScanduraCumparaturi = new Scandura2();


        }
    }
}
