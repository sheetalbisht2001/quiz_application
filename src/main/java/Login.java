import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// JFrame class is used to make a frame
// action listener works whenever the button is clicked
public class Login extends JFrame implements ActionListener {

    JButton rules,back;
    JTextField tfname;
    // we make a constructor of login class and inside of constructor class we write description of frame

    public Login(){
        // to make our own layout we have to write this and this take where we have to place icon on frame,
        setBounds(200,200,1200,466);
        // to change the frame colour , we have to take full frame by getContentPane() and change the colour
        getContentPane().setBackground(Color.WHITE);
        // by this we can set frame size
        setSize(1200, 500);
        // this one tells that where we want to keep the frame in screen
        setLocation(200, 150);
        //   by-default the visibility of the frame is hidden ,so we had to make frame visible so that we can see
        setVisible(true);
        setLayout(null);// by this line we are saying that we don't need your layout we are making our own layout

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        // JLabel class is used to add icon and anything you want to write  on the frame
        JLabel image = new JLabel(i1);
        //this tells that where the image will be on the frame on that location
        image.setBounds(0,0,600,500);
        add(image);

        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Vainer Hand ITC",Font.BOLD, 18));
        // to change font colour
        heading.setForeground(Color.BLUE);
        add(heading);

        JLabel name = new JLabel("Enter your name");
        name.setBounds(810,150,300,20);
        name.setFont(new Font("Mongolian Bait",Font.BOLD, 18));
        // to change font colour
        name.setForeground(Color.BLUE);
        add(name);

        // by JTextField you can make a box in which you can write
        tfname = new JTextField();
        tfname.setBounds(735,200,300,25);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tfname);

        // by JButton you can make button on frame
        rules = new JButton("Rules");
        rules.setBounds(735, 270,120,25);
        rules.setBackground(Color.BLUE);
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);

        back = new JButton("Back");
        back.setBounds(915, 270,120,25);
        back.setBackground(Color.BLUE);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

    }

    public void actionPerformed(ActionEvent ae){

        if(ae.getSource() == rules){
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);

        }else if(ae.getSource() == back){
            setVisible(false);
        }
    }
    public static void main(String[] args){
        new Login();// we make an anonymous object of  login class

    }
}
