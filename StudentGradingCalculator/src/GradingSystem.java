import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.sql.ResultSet;


//Creating class and implementing interfaces
public class GradingSystem implements ActionListener {


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
    JLabel textLabel6;
    JLabel textLabel7;
    JLabel textLabel8;
    JLabel textLabel9;
    JLabel textLabel10;
    JLabel textLabel11;
    JTextField NameTextField;
    JTextField Sub1TextField;
    JTextField Sub2TextField;
    JTextField Sub3TextField;
    JTextField Sub4TextField;
    JTextField Sub5TextField;
    JButton submit;
    JButton check;
    JLabel MarksLabel;
    JLabel PercentageLabel;
    JLabel GradeLabel;
    JTextField MarksTextField;
    JTextField PercentageTextField;
    JTextField GradeTextField;
    Choice RollNo;
    GradingSystem(){
//Setting properties of JFrame
        frame =new JFrame();
        frame.setTitle("Student Grading  System");
        frame.getContentPane().setLayout(null);

//Setting Properties of JPanel one and two
        panel1 =new JPanel();
        panel1.setLayout(null);
        panel1.setBackground(new Color(128,0,128));
        panel1.setBounds(0,0,350,500);

        panel2=new JPanel();
        panel2.setLayout(null);
        panel2.setBackground(new Color(255,150,134));
        panel2.setBounds(351,370,350,100);
//Setting properties of the components

        textLabel1 =new JLabel();
        textLabel1.setText("Student");
        textLabel1.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
        textLabel1.setForeground(Color.WHITE);
        textLabel1.setBounds(78,20,300,100);


        textLabel2 =new JLabel();
        textLabel2.setText("Grading System");
        textLabel2.setFont(new Font("Comic Sans MS", Font.PLAIN, 35));
        textLabel2.setForeground(Color.WHITE);
        textLabel2.setBounds(48,80,300,100);


        textLabel3 =new JLabel();
        textLabel3.setText("Student Details :-");
        textLabel3.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        textLabel3.setForeground(new Color(128,0,128));
        textLabel3.setBounds(370,0,300,60);
        frame.add(textLabel3);



        textLabel4 =new JLabel();
        textLabel4.setText("Select Roll Number :-");
        textLabel4.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        textLabel4.setForeground(Color.black);
        textLabel4.setBounds(360,70,210,30);
        frame.add(textLabel4);

        RollNo = new Choice();
        try{
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from Student");
            while(rs.next()){
                RollNo.add(rs.getString("rollno"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        RollNo.setBounds(580, 70, 60, 30);
        RollNo.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        RollNo.setBackground(new Color(232,232,232));
        frame.add(RollNo);

        textLabel6 =new JLabel();
        textLabel6.setText("Name :- ");
        textLabel6.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        textLabel6.setForeground(Color.black);
        textLabel6.setBounds(370,110,200,30);
        frame.add(textLabel6);


        NameTextField =new JTextField();
        NameTextField.setHorizontalAlignment(SwingConstants.CENTER);
        NameTextField.setBounds(450,110,105,30);
        NameTextField.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        NameTextField.setBackground(new Color(232,232,232));
        NameTextField.setBorder(BorderFactory.createBevelBorder(1));
        frame.add(NameTextField);

        textLabel7 =new JLabel();
        textLabel7.setText("DBMS :-");
        textLabel7.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        textLabel7.setForeground(Color.black);
        textLabel7.setBounds(370,150,200,30);
        frame.add(textLabel7);


        Sub1TextField =new JTextField();
        Sub1TextField.setHorizontalAlignment(SwingConstants.CENTER);
        Sub1TextField.setBounds(450,150,105,30);
        Sub1TextField.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        Sub1TextField.setBackground(new Color(232,232,232));
        Sub1TextField.setBorder(BorderFactory.createBevelBorder(1));
        frame.add(Sub1TextField);

        textLabel8 =new JLabel();
        textLabel8.setText("JAVA :-");
        textLabel8.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        textLabel8.setForeground(Color.black);
        textLabel8.setBounds(370,190,200,30);
        frame.add(textLabel8);


        Sub2TextField =new JTextField();
        Sub2TextField.setHorizontalAlignment(SwingConstants.CENTER);
        Sub2TextField.setBounds(450,190,105,30);
        Sub2TextField.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        Sub2TextField.setBackground(new Color(232,232,232));
        Sub2TextField.setBorder(BorderFactory.createBevelBorder(1));
        frame.add(Sub2TextField);

        textLabel9 =new JLabel();
        textLabel9.setText("DSA :-");
        textLabel9.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        textLabel9.setForeground(Color.black);
        textLabel9.setBounds(370,230,200,30);
        frame.add(textLabel9);


        Sub3TextField =new JTextField();
        Sub3TextField.setHorizontalAlignment(SwingConstants.CENTER);
        Sub3TextField.setBounds(450,230,105,30);
        Sub3TextField.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        Sub3TextField.setBackground(new Color(232,232,232));
        Sub3TextField.setBorder(BorderFactory.createBevelBorder(1));
        frame.add(Sub3TextField);

        textLabel10 =new JLabel();
        textLabel10.setText("Python :-");
        textLabel10.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        textLabel10.setForeground(Color.black);
        textLabel10.setBounds(370,270,200,30);
        frame.add(textLabel10);


        Sub4TextField =new JTextField();
        Sub4TextField.setHorizontalAlignment(SwingConstants.CENTER);
        Sub4TextField.setBounds(450,270,105,30);
        Sub4TextField.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        Sub4TextField.setBackground(new Color(232,232,232));
        Sub4TextField.setBorder(BorderFactory.createBevelBorder(1));
        frame.add(Sub4TextField);

        textLabel11 =new JLabel();
        textLabel11.setText("Networking :-");
        textLabel11.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        textLabel11.setForeground(Color.black);
        textLabel11.setBounds(370,310,300,30);
        frame.add(textLabel11);


        Sub5TextField =new JTextField();
        Sub5TextField.setHorizontalAlignment(SwingConstants.CENTER);
        Sub5TextField.setBounds(500,310,105,30);
        Sub5TextField.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        Sub5TextField.setBackground(new Color(232,232,232));
        Sub5TextField.setBorder(BorderFactory.createBevelBorder(1));
        frame.add(Sub5TextField);

        submit = new JButton();

        submit.setText("Submit");
        submit.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        submit.setBounds(200,400,125,35);
        submit.setFocusable(false);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.white);
        submit.addActionListener(this);
        panel1.add(submit);

        check = new JButton();

        check.setText("Check");
        check.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        check.setBounds(50,400,125,35);
        check.setFocusable(false);
        check.setBackground(Color.BLACK);
        check.setForeground(Color.white);
        check.addActionListener(this);
        panel1.add(check);


        MarksLabel=new JLabel();
        MarksLabel.setText("Total Marks");
        MarksLabel.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        MarksLabel.setBounds(10,5,125,35);
        MarksLabel.setForeground(Color.black);



        PercentageLabel=new JLabel();
        PercentageLabel.setText("Percentage");
        PercentageLabel.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        PercentageLabel.setBounds(10,30,125,35);
        PercentageLabel.setForeground(Color.black);


        GradeLabel=new JLabel();
        GradeLabel.setText("Grade");
        GradeLabel.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        GradeLabel.setBounds(10,55,160,35);
        GradeLabel.setForeground(Color.black);


        MarksTextField=new JTextField();
        MarksTextField.setEditable(false);
        MarksTextField.setBounds(230,14,70,15);
        MarksTextField.setHorizontalAlignment(SwingConstants.CENTER);
        MarksTextField.setFont(new Font("Comic Sans MS",Font.BOLD,13));
        MarksTextField.setBorder(BorderFactory.createBevelBorder(1));


        PercentageTextField=new JTextField();
        PercentageTextField.setEditable(false);
        PercentageTextField.setBounds(230,39,70,15);
        PercentageTextField.setHorizontalAlignment(SwingConstants.CENTER);
        PercentageTextField.setFont(new Font("Comic Sans MS",Font.BOLD,13));
        PercentageTextField.setBorder(BorderFactory.createBevelBorder(1));

        GradeTextField=new JTextField();
        GradeTextField.setEditable(false);
        GradeTextField.setBounds(230,64,70,15);
        GradeTextField.setHorizontalAlignment(SwingConstants.CENTER);
        GradeTextField.setFont(new Font("Comic Sans MS",Font.BOLD,13));
        GradeTextField.setBorder(BorderFactory.createBevelBorder(1));



        ImageIcon icon=new ImageIcon("logo.png");
        imageLabel=new JLabel(icon);
        imageLabel.setBounds(50,160,icon.getIconWidth(),icon.getIconHeight());
        panel1.add(imageLabel);

//Adding panels to JFrame
        frame.add(panel1);
        frame.add(panel2);
//Adding components to the container
        panel1.add(textLabel1);
        panel1.add(textLabel2);
        panel2.add(MarksLabel);
        panel2.add(MarksTextField);
        panel2.add(PercentageLabel);
        panel2.add(PercentageTextField);
        panel2.add(GradeLabel);
        panel2.add(GradeTextField);




//Setting properties of JFrame
        frame.getContentPane().setBackground(Color.white);
        frame.setLayout(null);
        frame.setSize(700,500);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==check){
            String id=RollNo.getSelectedItem();

            String query="select * from Student where rollno='"+id+"'";
            try{
                conn c=new conn();
                ResultSet rs=c.s.executeQuery(query);
                while(rs.next()){
                    NameTextField.setText(rs.getString("name"));
                    Sub1TextField.setText(rs.getString("DBMS"));
                    Sub2TextField.setText(rs.getString("JAVA"));
                    Sub3TextField.setText(rs.getString("DSA"));
                    Sub4TextField.setText(rs.getString("Python"));
                    Sub5TextField.setText(rs.getString("Networking"));
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        if(ae.getSource()==submit){
            double sub1,sub2,sub3,sub4,sub5, sum, pr;
            String grd;
            sub1 = Integer.parseInt(Sub1TextField.getText());
            sub2 = Integer.parseInt(Sub2TextField.getText());
            sub3 = Integer.parseInt(Sub3TextField.getText());
            sub4 = Integer.parseInt(Sub4TextField.getText());
            sub5 = Integer.parseInt(Sub5TextField.getText());
            sum = sub1 + sub2 + sub3 + sub4 + sub5;
            // addition of subjects
            pr =(double) ((sum*100) / 500);
            // calculating percentage
            if(pr >= 90) {
                grd = "A";
            } else if(pr >= 80) {
                grd = "B";
            } else if(pr >= 70) {
                grd = "C";
            } else if(pr >= 60) {
                grd = "D";
            } else if(pr >= 50) {
                grd = "E";
            } else {
                grd = "S";
            }
            // printing results in the text field of Marks, Percentage and Grade
            MarksTextField.setText(String.valueOf(sum));
            PercentageTextField.setText(String.valueOf(pr));
            GradeTextField.setText(grd);
        }
    }

    public static void main(String[] args) {
        new GradingSystem();
    }

}

//Restricting JTextField Character limits using PlainDocument class

