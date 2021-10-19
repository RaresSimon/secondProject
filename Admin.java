import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin implements ActionListener
{
    JLabel label=new JLabel("Bine ati venit");
    JFrame frame= new JFrame("Login");
    JButton myButton =new JButton("Login");
    JTextField textField= new JTextField();
    JTextField textField2= new JTextField();
    Admin()
    {
        label.setBounds(0, 0, 500, 50);
        label.setFont(new Font(null, Font.PLAIN, 25));
        frame.add(label);
        textField.setPreferredSize(new Dimension(250,40));
        textField2.setPreferredSize(new Dimension(250,40));
        textField.setText("username");
        textField2.setText("password");
        ///f.setContentPane(new Login().panel1);
        myButton.setBounds(100,160,200,40);
        myButton.setFocusable(false);
        myButton.addActionListener(this);
        frame.add(textField);
        frame.add(textField2);
        frame.add(myButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(320,200);
        ///frame.pack();
        frame.setLayout(new FlowLayout());
        frame.setResizable(false);
        //f.add(new JButton("press me!"));
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String a="Admin";
        String b="Admin";
        if(textField.getText().equals(a)) {
            if(textField2.getText().equals(b))
            {
                if (e.getSource() == myButton) {
                    frame.dispose();
                    ContBancarAlFirmei ban = new ContBancarAlFirmei();
                    System.out.println("Welcome Admin");

                }
            }
        }
    }
}

