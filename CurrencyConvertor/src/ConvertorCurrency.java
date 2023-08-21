
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;





//Creating class and implementing interfaces
public class ConvertorCurrency{


    //Creating objects of JFrame and JPanel
    JFrame frame;
    JPanel panel1;
    JPanel panel2;

    //Creating objects of components
    JLabel textLabel1;
    JLabel textLabel2;
    JLabel textLabel3;
    JLabel textLabel4;
    JLabel textLabel5;
    JLabel imageLabel;
    JTextField rupeeTextField;

    JTextField dollorTextField;

    JButton cancel;
    JButton INR;
    JButton dollors;


    ConvertorCurrency(){
//Setting properties of JFrame
        frame =new JFrame();
        frame.setTitle("Currency Convertor");
        frame.getContentPane().setLayout(null);

//Setting Properties of JPanel one and two
        panel1 =new JPanel();
        panel1.setLayout(null);
        panel1.setBackground(new Color(234,182,118));
        panel1.setBounds(0,0,350,500);


//Setting properties of the components

        textLabel1 =new JLabel();
        textLabel1.setText("Currency");
        textLabel1.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
        textLabel1.setForeground(Color.BLACK);
        textLabel1.setBounds(78,20,300,100);


        textLabel2 =new JLabel();
        textLabel2.setText("Convertor System");
        textLabel2.setFont(new Font("Comic Sans MS", Font.PLAIN, 35));
        textLabel2.setForeground(Color.BLACK);
        textLabel2.setBounds(40,80,300,100);


        textLabel3 =new JLabel();
        textLabel3.setText("Convertor");
        textLabel3.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        textLabel3.setForeground(Color.red);
        textLabel3.setBounds(450,0,300,100);


        textLabel4 =new JLabel();
        textLabel4.setText("Rupees :-");
        textLabel4.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        textLabel4.setForeground(Color.BLACK);
        textLabel4.setBounds(400,80,100,50);


        rupeeTextField =new JTextField();
        rupeeTextField.setHorizontalAlignment(SwingConstants.CENTER);
        rupeeTextField.setBounds(550,90,100,30);
        rupeeTextField.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        rupeeTextField.setBackground(new Color(232,232,232));
        rupeeTextField.setBorder(BorderFactory.createBevelBorder(1));

        INR = new JButton();
        INR.setText("INR");
        INR.setFont(new Font("Comic Sans MS",Font.BOLD,17));
        INR.setBounds(480,140,100,35);
        INR.setFocusable(false);
        INR.setBackground(new Color(234,182,118));
        INR.setForeground(Color.BLACK);
        frame.add(INR);

        textLabel5 =new JLabel();
        textLabel5.setText("Dollors :-");
        textLabel5.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        textLabel5.setForeground(Color.BLACK);
        textLabel5.setBounds(400,200,100,50);


        dollorTextField =new JTextField();
        dollorTextField.setHorizontalAlignment(SwingConstants.CENTER);
        dollorTextField.setBounds(550,210,100,30);
        dollorTextField.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        dollorTextField.setBackground(new Color(232,232,232));
        dollorTextField.setBorder(BorderFactory.createBevelBorder(1));

        dollors = new JButton();
        dollors.setText("Dollor");
        dollors.setFont(new Font("Comic Sans MS",Font.BOLD,17));
        dollors.setBounds(480,260,100,35);
        dollors.setFocusable(false);
        dollors.setBackground(new Color(234,182,118));
        dollors.setForeground(Color.BLACK);


        cancel = new JButton();
        cancel.setText("Cancel");
        cancel.setFont(new Font("Comic Sans MS",Font.BOLD,17));
        cancel.setBounds(470,400,125,35);
        cancel.setFocusable(false);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);





        ImageIcon i1=new ImageIcon("new.jpg");
        Image i2=i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        imageLabel=new JLabel(i3);
        imageLabel.setBounds(70,180,200,180);



//Adding panels to JFrame
        frame.add(panel1);

//Adding components to the container
        panel1.add(textLabel1);
        panel1.add(textLabel2);
        frame.add(textLabel3);
        frame.add(textLabel4);
        frame.add(textLabel5);
        frame.add(rupeeTextField);
        frame.add(dollorTextField);
        frame.add(cancel);
        frame.add(dollors);
        panel1.add(imageLabel);


//Setting properties of JFrame
        frame.getContentPane().setBackground(Color.white);
        frame.setSize(700,500);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);





        // Adding action listener
        INR.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                // Converting to double
                double d
                        = Double.parseDouble(rupeeTextField.getText());

                // Converting rupees to dollars
                double d1 = (double)(d / 83.16);
                double ans = Math.round(d1 * 1000) / 1000.0;

                // Getting the string value of the
                // calculated value
                String str1 = String.valueOf(ans);

                // Placing it in the text box
                dollorTextField.setText(str1);
            }
        });

        // Adding action listener
        dollors.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                // Converting to double
                double d2
                        = Double.parseDouble(dollorTextField.getText());

                // converting Dollars to rupees
                double d3 = (double)(d2 * 83.16);
                double ans = Math.round(d3 * 1000) / 1000.0;

                // Getting the string value of the
                // calculated value
                String str2 = String.valueOf(ans);

                // Placing it in the text box
                rupeeTextField.setText(str2);
            }
        });

        // Action listener to close the form
        cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                frame.dispose();
            }
        });

        // Default method for closing the frame
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });

    }



    //Creating main method
    public static void main(String[] args) {

            new ConvertorCurrency();

    }

}

