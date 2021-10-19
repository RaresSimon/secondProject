import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PlataNumerCard implements ActionListener
{
    JFrame frame= new JFrame("Login");
    JButton myButton = new JButton("next");
    JButton myButton2 = new JButton("cancel");
    JCheckBox checkBox=new JCheckBox();
    JCheckBox checkBox2=new JCheckBox();
    JLabel label = new JLabel("  Metoda de plata");
    JLabel label2 = new JLabel("                      ");
    JLabel label3 = new JLabel("           ");
    JLabel label4 = new JLabel("         ");
    PlataNumerCard() {
        label.setBounds(0, 0, 500, 50);
        label.setFont(new Font(null, Font.PLAIN, 25));
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 200);
        frame.setLayout(new FlowLayout());
        checkBox.setText("Card");
        checkBox.setFocusable(false);
        frame.add(checkBox);
        label2.setBounds(0, 0, 500, 50);
        label2.setFont(new Font(null, Font.PLAIN, 25));
        frame.add(label2);
        checkBox2.setText("Plata cash la livrare");
        frame.add(checkBox2);
        checkBox2.setFocusable(false);
        label3.setBounds(0, 0, 500, 50);
        label3.setFont(new Font(null, Font.PLAIN, 25));
        frame.add(label3);
        myButton2.setBounds(65, 40, 200, 40);
        myButton2.setFocusable(false);
        myButton2.addActionListener(this);
        frame.add(myButton2);
        label4.setBounds(0, 0, 500, 50);
        label4.setFont(new Font(null, Font.PLAIN, 25));
        frame.add(label4);
        myButton.setBounds(65, 40, 200, 40);
        myButton.setFocusable(false);
        myButton.addActionListener(this);
        frame.add(myButton);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==myButton2)
        {
            frame.dispose();
            CeDoriti MaterialeMeniu1=new CeDoriti();
        }
        if(checkBox.isSelected())
        {
            if(e.getSource()==myButton)
            {
                frame.dispose();
                DateCard plataCard=new DateCard();
            }
        }
        if(checkBox2.isSelected())
        {
            if(e.getSource()==myButton)
            {
                frame.dispose();
                Plata plataa=new Plata();
                int q=Scandura2.nrScanduri;
            }
        }
    }
}
