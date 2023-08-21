import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;


//Creating class and implementing interfaces
public class StudentManagementSystem implements ActionListener{


    //Creating objects of JFrame and JPanel
    JFrame frame;
    JPanel panel1;
    JPanel panel2;

    //Creating objects of components
    JLabel textLabel1;
    JLabel textLabel2;
    JLabel textLabel4;
    JLabel textLabel6;
    JLabel imageLabel;
    JLabel textLabel7;
    JLabel textLabel8;
    JLabel textLabel9;
    JTextField nameTextField;

    JTextField adressTextField;

    JTextField gradeTextField;

    JButton add;
    JButton delete;
    JButton cancel;
    JButton update;

    JButton show;
    JButton head;


    JTextField idTextField;

    JButton search;
    JButton record;
    Choice RollNo;
    JTable table;
    JButton id1,name1,adress1,grade1;
    JButton detail;


    StudentManagementSystem(){
//Setting properties of JFrame
        frame =new JFrame();
        frame.setTitle("Student Management System");
        frame.getContentPane().setLayout(null);

//Setting Properties of JPanel one and two
        panel1 =new JPanel();
        panel1.setLayout(null);
        panel1.setBackground(new Color(234,182,118));
        panel1.setBounds(0,0,372,700);


//Setting properties of the components

        textLabel1 =new JLabel();
        textLabel1.setText("Student");
        textLabel1.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
        textLabel1.setForeground(Color.BLACK);
        textLabel1.setBounds(78,20,300,100);


        textLabel2 =new JLabel();
        textLabel2.setText("Management System");
        textLabel2.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
        textLabel2.setForeground(Color.BLACK);
        textLabel2.setBounds(40,80,300,100);




        head = new JButton();
        head.setText("Student Record");
        head.setFont(new Font("Comic Sans MS",Font.BOLD,30));
        head.setBounds(480,2,300,45);
        head.setFocusable(false);
        head.setBackground(new Color(234,182,118));
        head.setForeground(Color.BLACK);


        textLabel4 =new JLabel();
        textLabel4.setText("Search Student by ID :-");
        textLabel4.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        textLabel4.setForeground(Color.BLACK);
        textLabel4.setBounds(400,80,250,50);


        RollNo = new Choice();
        try{
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from Student");
            while(rs.next()){
                RollNo.add(rs.getString("id"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        RollNo.setBounds(660, 85, 60, 30);
        RollNo.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        RollNo.setBackground(new Color(232,232,232));
        frame.add(RollNo);

        search = new JButton();
        search.setText("Search");
        search.setFont(new Font("Comic Sans MS",Font.BOLD,17));
        search.setBounds(750,85,100,35);
        search.setFocusable(false);
        search.setBackground(Color.BLACK);
        search.setForeground(Color.WHITE);
        search.addActionListener(this);


        detail = new JButton();
        detail.setText("Enter Student Detail:-");
        detail.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        detail.setBounds(400,125,300,30);
        detail.setFocusable(false);
        detail.setBackground(new Color(234,182,118));
        detail.setForeground(Color.BLACK);

        textLabel6 =new JLabel();
        textLabel6.setText("ID :-");
        textLabel6.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        textLabel6.setForeground(Color.BLACK);
        textLabel6.setBounds(400,160,100,50);


        idTextField =new JTextField();
        idTextField.setHorizontalAlignment(SwingConstants.CENTER);
        idTextField.setBounds(550,170,100,30);
        idTextField.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        idTextField.setBackground(new Color(232,232,232));
        idTextField.setBorder(BorderFactory.createBevelBorder(1));

        textLabel7 =new JLabel();
        textLabel7.setText("Name :-");
        textLabel7.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        textLabel7.setForeground(Color.BLACK);
        textLabel7.setBounds(400,210,100,50);


        nameTextField =new JTextField();
        nameTextField.setHorizontalAlignment(SwingConstants.CENTER);
        nameTextField.setBounds(550,220,100,30);
        nameTextField.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        nameTextField.setBackground(new Color(232,232,232));
        nameTextField.setBorder(BorderFactory.createBevelBorder(1));

        textLabel8 =new JLabel();
        textLabel8.setText("Adress :-");
        textLabel8.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        textLabel8.setForeground(Color.BLACK);
        textLabel8.setBounds(400,260,100,50);


        adressTextField =new JTextField();
        adressTextField.setHorizontalAlignment(SwingConstants.CENTER);
        adressTextField.setBounds(550,270,100,30);
        adressTextField.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        adressTextField.setBackground(new Color(232,232,232));
        adressTextField.setBorder(BorderFactory.createBevelBorder(1));

        textLabel9 =new JLabel();
        textLabel9.setText("Grade :-");
        textLabel9.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        textLabel9.setForeground(Color.BLACK);
        textLabel9.setBounds(400,310,100,50);


        gradeTextField =new JTextField();
        gradeTextField.setHorizontalAlignment(SwingConstants.CENTER);
        gradeTextField.setBounds(550,320,100,30);
        gradeTextField.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        gradeTextField.setBackground(new Color(232,232,232));
        gradeTextField.setBorder(BorderFactory.createBevelBorder(1));

        record = new JButton();
        record.setText("-Student Record Table -");
        record.setFont(new Font("Comic Sans MS",Font.BOLD,17));
        record.setBounds(480,380,300,35);
        record.setFocusable(false);
        record.setBackground(new Color(234,182,118));
        record.setForeground(Color.BLACK);

        id1 = new JButton();
        id1.setText("ID");
        id1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        id1.setBounds(410,460,100,30);
        id1.setFocusable(false);
        id1.setForeground(Color.BLACK);

        name1 = new JButton();
        name1.setText("NAME");
        name1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        name1.setBounds(520,460,100,30);
        name1.setFocusable(false);
        name1.setForeground(Color.BLACK);

        adress1 = new JButton();
        adress1.setText("ADDRESS");
        adress1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        adress1.setBounds(635,460,110,30);
        adress1.setFocusable(false);
        adress1.setForeground(Color.BLACK);

        grade1 = new JButton();
        grade1.setText("GRADE");
        grade1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        grade1.setBounds(770,460,100,30);
        grade1.setFocusable(false);
        grade1.setForeground(Color.BLACK);


        table=new JTable();
        table.setBounds(400,500,470,300);
        frame.add(table);

        add = new JButton();
        add.setText("Add");
        add.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        add.setBounds(10,500,90,35);
        add.setFocusable(false);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);

        update = new JButton();
        update.setText("Update");
        update.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        update.setBounds(130,500,100,35);
        update.setFocusable(false);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        update.addActionListener(this);

        delete = new JButton();
        delete.setText("Delete");
        delete.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        delete.setBounds(250,500,100,35);
        delete.setFocusable(false);
        delete.setBackground(Color.BLACK);
        delete.setForeground(Color.WHITE);
        delete.addActionListener(this);



        show = new JButton();
        show.setText("Show");
        show.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        show.setBounds(80,580,80,35);
        show.setFocusable(false);
        show.setBackground(Color.BLACK);
        show.setForeground(Color.WHITE);
        show.addActionListener(this);


        cancel = new JButton();
        cancel.setText("Cancel");
        cancel.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        cancel.setBounds(200,580,90,35);
        cancel.setFocusable(false);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);

        ImageIcon i1=new ImageIcon("logo.png");
        Image i2=i1.getImage().getScaledInstance(230,300,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        imageLabel=new JLabel(i3);
        imageLabel.setBounds(70,180,230,300);

//Adding panels to JFrame
        frame.add(panel1);

//Adding components to the container
        panel1.add(textLabel1);
        panel1.add(textLabel2);
        frame.add(textLabel4);
        frame.add(search);
        frame.add(record);
        frame.add(textLabel6);
        frame.add(textLabel7);
        frame.add(textLabel8);
        frame.add(textLabel9);
        frame.add(idTextField);
        frame.add(nameTextField);
        frame.add(adressTextField);
        frame.add(gradeTextField);
        frame.add(id1);
        frame.add(name1);
        frame.add(adress1);
        frame.add(grade1);
        panel1.add(cancel);
        panel1.add(add);
        panel1.add(delete);
        panel1.add(show);
        panel1.add(update);
        panel1.add(imageLabel);
        frame.add(detail);
        frame.add(head);


//Setting properties of JFrame
        frame.getContentPane().setBackground(Color.white);
        frame.setSize(900,700);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);







    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==show){
            try{
                //String query1="select * from Student where id='"+RollNo.getSelectedItem()+"'";
                String query1="select * from Student";
                conn c=new conn();
                ResultSet rs=c.s.executeQuery(query1);
                table.setModel(DbUtils.resultSetToTableModel(rs));
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        if(ae.getSource()==search){
            try{
                String query1="select * from Student where id='"+RollNo.getSelectedItem()+"'";
                conn c=new conn();
                ResultSet rs=c.s.executeQuery(query1);
                table.setModel(DbUtils.resultSetToTableModel(rs));
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        if(ae.getSource()==update){
            String id=idTextField.getText();
            if(id.equals("")){
                JOptionPane.showMessageDialog(null,"Id must be required ");
                return;
            }
            String name=nameTextField.getText();
            String adress=adressTextField.getText();
            String grade=gradeTextField.getText();
            try{
                conn c=new conn();
                String query="update Student set name='"+name+"',adress='"+adress+"',grade='"+grade+"' where id='"+id+"'";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Record Updated Sucessfully");

            }catch(Exception e){
                e.printStackTrace();
            }
        }
        if(ae.getSource()==add){
            String id=idTextField.getText();
            if(id.equals("")){
                JOptionPane.showMessageDialog(null,"Id must be required ");
                return;
            }
            String name=nameTextField.getText();
            String adress=adressTextField.getText();
            String grade=gradeTextField.getText();
            try{
                conn con=new conn();
                String query="insert into Student values('"+id+"','"+name+"','"+adress+"','"+grade+"')";
                con.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"!!Record Added Sucessfully!!");

            }catch(Exception e){
                e.printStackTrace();
            }
        }
        if(ae.getSource()==delete){
            String query1="delete from Student where id='"+RollNo.getSelectedItem()+"'";
            if(RollNo.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog(null, "Id must be required ");
                return;
            }
            try{
                conn c=new conn();
                c.s.executeUpdate(query1);
                JOptionPane.showMessageDialog(null,"Record Deleted Sucessfully");
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        if(ae.getSource()==cancel){
            frame.setVisible(false);
        }

    }



    //Creating main method
    public static void main(String[] args) {

        new StudentManagementSystem();

    }

}

