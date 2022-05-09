package com.project;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

public class MyFrame extends Frame {

    MyFrame() throws IOException {
        setLayout(null );
        setSize(900,840);
        setVisible(true);


        Label lblName = new Label("Name");
        Label lblPhNum = new Label("Phone number");
        Label lblAddress = new Label("Address");
        Label lblEdu = new Label("CGPA");
        Label lblWorkExp = new Label("Work Experience");
        Label lblHobbies = new Label("Hobbies");
        Label lblSkill = new Label("Skills");

        TextField txtName = new TextField();
        TextField txtPhNum = new TextField();
        TextField txtAddress = new TextField();
        TextField txtEdu = new TextField();
        TextField txtWorkExp = new TextField();
        TextField txtHobbies = new TextField();
        TextField txtSkill = new TextField();

        Button btn = new Button("Save");



        add(lblName);
        add(lblPhNum);
        add(lblAddress);
        add(lblEdu);
        add(lblWorkExp);
        add(lblHobbies);
        add(lblSkill);

        add(txtName);
        add(txtPhNum);
        add(txtAddress);
        add(txtEdu);
        add(txtWorkExp);
        add(txtHobbies);
        add(txtSkill);

        add(btn);

        btn.setBounds(195,780,50,40);

        txtName.setBounds(290, 120, 200, 30);
        txtPhNum.setBounds(290, 220, 200, 30);
        txtAddress.setBounds(290, 320, 200, 30);
        txtEdu.setBounds(290, 420, 200, 30);
        txtWorkExp.setBounds(290, 520, 200, 30);
        txtHobbies.setBounds(290,620,200,30);
        txtSkill.setBounds(290,720,200,30);

        lblName.setBounds(100,100,100,100);
        lblPhNum.setBounds(100, 200, 100, 100);
        lblAddress.setBounds(100,300,100,100);
        lblEdu.setBounds(100,400,100,100);
        lblWorkExp.setBounds(100,500,100,100);
        lblHobbies.setBounds(100,600,100,100);
        lblSkill.setBounds(100,700,100,100);


        //BufferedImage Bi;
        //Bi = ImageIO.read(new File("D:\\clg\\SEM 2\\java\\End sem project\\backimp.jpg"));
        //add(Bi);


        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) throws IOException {
        new MyFrame();
        MyFrame mf = new MyFrame();
        mf.setVisible(true);
        
    }

}
