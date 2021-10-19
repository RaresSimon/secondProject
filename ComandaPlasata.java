import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComandaPlasata implements ActionListener
{
    JFrame frame= new JFrame("Login");
    JLabel label = new JLabel("Comanda a fost plasata cu succes!");
    JButton myButton =new JButton("Menu");
    ComandaPlasata()
    {
        myButton.setBounds(100,160,200,40);
        myButton.setFocusable(false);
        myButton.addActionListener(this);
        label.setBounds(0, 0, 500, 50);
        label.setFont(new Font(null, Font.PLAIN, 25));
        frame.add(label);
        frame.add(myButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450,200);
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
    }
}
