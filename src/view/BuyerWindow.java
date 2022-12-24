package view;

import controller.buyerController;


import javax.swing.*;

public class BuyerWindow extends JFrame {

    BuyerController buyerController;
    public BuyerWindow(BuyerController buyerController){

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 300, 300);

        JButton btnOrder = new JButton("Заказ");
        btnOrder.addActionListener(e ->{});

        JButton btnCatalog = new JButton("Каталог");
        btnCatalog.addActionListener(e ->{});

        JButton btnFavorite = new JButton("Избранное");
        btnFavorite.addActionListener(e ->{});

        JButton btnBasket = new JButton("Корзина");
        btnBasket.addActionListener(e ->{});

        JButton btnCancel = new JButton("Назад");
        btnCancel.addActionListener(e ->{});

        JLabel lblBuyerName = new JLabel("Имя покупателя");
        JLabel lblPhoneNumber = new JLabel("Телефон");

        this.buyerController = buyerController;
        this.add(btnOrder);
        this.add(btnCatalog);
        this.add(btnFavorite);
        this.add(btnBasket);
        this.add(btnCancel);
        this.add(lblBuyerName);
        this.add(lblPhoneNumber);
    }

}
