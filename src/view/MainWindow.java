package view;

import controller.buyerController;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    MainWindowController buyerController;

    public MainWindow(MainWindowController buyerController) {

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 300, 300);
        setTitle("Главное окно");

        JButton btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(e -> dispose());

        JButton btnRegistration = new JButton("Регистрация");

        btnRegistration.addActionListener(e ->{
            JOptionPane.showMessageDialog(this,
                    "Ошибка",
                    JOptionPane.ERROR_MESSAGE);
        });

        JButton btnAuthorization = new JButton("Авторизация");

        btnAuthorization.addActionListener(e ->{
            JOptionPane.showMessageDialog(this,
                    "Ошибка",
                    JOptionPane.ERROR_MESSAGE);
        });


        JButton btnSeller = new JButton("Аккаунт продавца");

        btnSeller.addActionListener(e ->{
            JOptionPane.showMessageDialog(this,
                    "Ошибка входа",
                    JOptionPane.ERROR_MESSAGE);
        });

        JButton btnBuyer = new JButton("Аккаунт покупателя");

        btnBuyer.addActionListener(e ->{
            JOptionPane.showMessageDialog(this,
                    "Ошибка ",
                    JOptionPane.ERROR_MESSAGE);
        });

        btnRegistration.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnAuthorization.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnForum.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnSeller.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnBuyer.setAlignmentX(Component.CENTER_ALIGNMENT);

        this.buyerController = buyerController;
        this.add(btnRegistration);
        this.add(btnAuthorization);
        this.add(btnForum);
        this.add(btnSeller);
        this.add(btnBuyer);
    }

    public void display(){
        setVisible(true);
    }

}
