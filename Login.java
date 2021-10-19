import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.*;

public class Login extends JFrame implements ActionListener
{
    JLabel label=new JLabel("Bine ati venit");
    JFrame frame= new JFrame("Login");
    JButton myButton =new JButton("Login");
    JButton myButton2 =new JButton("Admin");
    JTextField textField= new JTextField();
    JTextField textField2= new JTextField();
    Login()
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
        myButton2.setBounds(100,160,200,40);
        myButton2.setFocusable(false);
        myButton2.addActionListener(this);
        frame.add(textField);
        frame.add(textField2);
        frame.add(myButton);
        frame.add(myButton2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(320,200);
        ///frame.pack();
        frame.setLayout(new FlowLayout());
        frame.setResizable(false);
        //f.add(new JButton("press me!"));
        frame.setVisible(true);

    }
    public static int pretScanduraCumparare=5;
    public static int pretScanduraVanzare=10;
    public static void  main(String[] args)
    {
        Login login=new Login();
        Scanner sc=new Scanner(System.in);
        System.out.println("Introducem randul:");
        int rand= sc.nextInt();
        System.out.println("Introducem categorie:");
        String categorie= sc.next();
        System.out.println("Introducem vopsea:");
        String vopsea= sc.next();
        Depozit A=new Depozit(rand,categorie,vopsea);
        System.out.println("--------------------------------------"+"\nAfisam ce rand dorim din depozit :"+A.rand+"\nAfisam ce categorie dorim din depozit :"+A.categorie+"\nAfisam ce culoare dorim din depozit :"+A.vopsea+"\n--------------------------------------");
        System.out.println("Introducem ce doresti sa cumperi:");
        String nevoie= sc.next();
        Vector Vc=new Vector();
        Depozit D=new Depozit(rand,vopsea,categorie);
        /*
        Vc.add(D.GetScandura());
        Vc.add(D.GetPaleti());
        Vc.add(D.GetBustean());

         */
        ContBancar CB= new ContBancar(5000);
        System.out.println("soldul este:" + CB.check_sold());
        System.out.println("cate zile sa se simuleze??");
        int zile= sc.nextInt();
        double a;
        for(int i=1;i<=zile;i++)
        {
            switch (nevoie) {
                case "scandura":
                    System.out.println("ce lemn doriti?\n 0-Brad\n1-Stejar\n2-Artar");
                    int x = sc.nextInt();
                    int z = D.scanduraDinMagazin[x].getcantitate();
                    System.out.println("In stock sunt " + z + " scanduri");
                    int m = sc.nextInt();
                    System.out.println("Clientul ar dorii sa cumpere " + Scandura2.nrScanduri + " scanduri");
                    if (Scandura2.nrScanduri < z) {
                        z = z - Scandura2.nrScanduri;
                        a= CB.check_sold();
                        CB.DepozitareSuma(Scandura2.nrScanduri * pretScanduraVanzare);
                        System.out.println("soldul este:" + CB.check_sold());
                        CB.cumparareMateriale(Scandura2.nrScanduri * pretScanduraCumparare);
                        System.out.println("soldul este:" + CB.check_sold());
                        double q = CB.check_sold()-a;
                        System.out.println("Am facut profit " + q);
                        CB.profit(q);
                        z = z + Scandura2.nrScanduri;
                        System.out.println("Am reumplut stock-ul");

                    } else {
                        if (m == z) {
                            z = z - m;
                            System.out.println("Stockul este Gol.");
                            CB.DepozitareSuma(m * pretScanduraVanzare);
                            System.out.println("soldul este:" + CB.check_sold());
                            CB.cumparareMateriale(m * pretScanduraCumparare);
                            System.out.println("soldul este:" + CB.check_sold());
                            z = z + m;
                            System.out.println("Am reumplut stock-ul");
                        } else {
                            if (m > z) {
                                System.out.println("Nu avem atatea scanduri in stock.\nDoriti cate avem?\nAvem " + z);
                                String Raspuns = sc.next();
                                m = z;
                                if (Raspuns == "da") {
                                    z = z - m;
                                    CB.DepozitareSuma(m * pretScanduraVanzare);
                                    System.out.println("soldul este:" + CB.check_sold());
                                    CB.cumparareMateriale(m * pretScanduraCumparare);
                                    System.out.println("soldul este:" + CB.check_sold());
                                    z = z + m;
                                    System.out.println("Am reumplut stock-ul");

                                }
                            }
                        }
                    }
                    break;
                case "paleti":
                    System.out.println("ce lemn doriti?\n 0-Brad\n1-Stejar\n2-Artar");
                    int x1 = sc.nextInt();
                    int z1 = D.paletiDinMagazin[x1].getcantitate();
                    System.out.println("In stock sunt " + z1 + " scanduri");
                    int m1 = sc.nextInt();
                    System.out.println("Clientul ar dorii sa cumpere " + m1 + " scanduri");
                    if (m1 < z1) {
                        z1 = z1 - m1;
                        CB.DepozitareSuma(m1 * pretScanduraVanzare);
                        System.out.println("soldul este:" + CB.check_sold());
                        CB.cumparareMateriale(m1 * pretScanduraCumparare);
                        System.out.println("soldul este:" + CB.check_sold());
                        z1 = z1 + m1;
                        System.out.println("Am reumplut stock-ul");

                    } else {
                        if (m1 == z1) {
                            z1 = z1 - m1;
                            System.out.println("Stockul este Gol.");
                            CB.DepozitareSuma(m1 * pretScanduraVanzare);
                            System.out.println("soldul este:" + CB.check_sold());
                            CB.cumparareMateriale(m1 * pretScanduraCumparare);
                            System.out.println("soldul este:" + CB.check_sold());
                            z1 = z1 + m1;
                            System.out.println("Am reumplut stock-ul");
                        } else {
                            if (m1 > z1) {
                                System.out.println("Nu avem atatea scanduri in stock.\nDoriti cate avem?\nAvem " + z1);
                                String Raspuns1 = sc.next();
                                m1 = z1;
                                if (Raspuns1 == "da") {
                                    z1 = z1 - m1;
                                    CB.DepozitareSuma(m1 * pretScanduraVanzare);
                                    System.out.println("soldul este:" + CB.check_sold());
                                    CB.cumparareMateriale(m1 * pretScanduraCumparare);
                                    System.out.println("soldul este:" + CB.check_sold());
                                    z1 = z1 + m1;
                                    System.out.println("Am reumplut stock-ul");

                                }
                            }
                        }
                    }
                    break;
                case "bustean":
                    System.out.println("ce lemn doriti?\n 0-Brad\n1-Stejar\n2-Artar");
                    int x2 = sc.nextInt();
                    int z2 = D.paletiDinMagazin[x2].getcantitate();
                    System.out.println("In stock sunt " + z2 + " scanduri");
                    int m2 = sc.nextInt();
                    System.out.println("Clientul ar dorii sa cumpere " + m2 + " scanduri");
                    if (m2 < z2) {
                        z2 = z2 - m2;
                        CB.DepozitareSuma(m2 * pretScanduraVanzare);
                        System.out.println("soldul este:" + CB.check_sold());
                        CB.cumparareMateriale(m2 * pretScanduraCumparare);
                        System.out.println("soldul este:" + CB.check_sold());
                        z2 = z2 + m2;
                        System.out.println("Am reumplut stock-ul");

                    } else {
                        if (m2 == z2) {
                            z2 = z2 - m2;
                            System.out.println("Stockul este Gol.");
                            CB.DepozitareSuma(m2 * pretScanduraVanzare);
                            System.out.println("soldul este:" + CB.check_sold());
                            CB.cumparareMateriale(m2 * pretScanduraCumparare);
                            System.out.println("soldul este:" + CB.check_sold());
                            z2 = z2 + m2;
                            System.out.println("Am reumplut stock-ul");
                        } else {
                            if (m2 > z2) {
                                System.out.println("Nu avem atatea scanduri in stock.\nDoriti cate avem?\nAvem " + z2);
                                String Raspuns2 = sc.next();
                                m2 = z2;
                                if (Raspuns2 == "da") {
                                    z2 = z2 - m2;
                                    CB.DepozitareSuma(m2 * pretScanduraVanzare);
                                    System.out.println("soldul este:" + CB.check_sold());
                                    CB.cumparareMateriale(m2 * pretScanduraCumparare);
                                    System.out.println("soldul este:" + CB.check_sold());
                                    z2 = z2 + m2;
                                    System.out.println("Am reumplut stock-ul");

                                }
                            }
                        }
                    }
                    break;

            }
            System.out.println("A trecut"+i+"zile");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==myButton)
        {
            frame.dispose();
            CeDoriti MaterialeMeniu=new CeDoriti();
            System.out.println("Welcome "+ textField.getText());

        }
        if(e.getSource()==myButton2)
        {
            frame.dispose();
            Admin admin=new Admin();
            System.out.println("Welcome Admin");

        }
    }
}
