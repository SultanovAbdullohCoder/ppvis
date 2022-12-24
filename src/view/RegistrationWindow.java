package view;



import javax.swing.*;

public class RegistrationWindow extends JFrame {

    

    public RegistrationWindow(){
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 300, 300);

        JButton btnRegistration = new JButton("Регистрация");

        btnRegistration.addActionListener(e ->{});

        JTextField txtName = new JFormattedTextField("Имя");
        JTextField txtPass = new JFormattedTextField("Пароль");
        JTextField txtPhone = new JFormattedTextField("Телефон");
        String[] items = { "Продаец", "Покупатель"};
        JComboBox role = new JComboBox(items);


        
        this.add(btnRegistration);
        this.add(txtName);
        this.add(txtPass);
        this.add(txtPhone);
        this.add(role);
    }

}
