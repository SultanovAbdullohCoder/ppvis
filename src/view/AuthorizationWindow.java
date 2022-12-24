package view;

import controller.buyerController;
import controller.salerController;

import javax.swing.*;

public class AuthorizationWindow extends JFrame {


    BuyerController buyerController;

    public AuthorizationWindow(BuyerController buyerController){
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 300, 300);

        JButton btnEnter = new JButton("Войти");

        btnEnter.addActionListener(e ->{});

        JTextField txtName = new JFormattedTextField("Имя");
        JTextField txtPass = new JFormattedTextField("Пароль");



        this.buyerController = buyerController;
        this.add(btnEnter);
        this.add(txtName);
        this.add(txtPass);
    }

}
