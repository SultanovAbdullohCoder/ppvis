package view;

import controller.productController;

import javax.swing.*;

public class FavoriteWindow extends JFrame {

    FavoriteController productController;

    public FavoriteWindow(FavoriteController productController){

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 300, 300);

        JButton btnLookProduct = new JButton("Посмотреть товар");
        btnLookProduct.addActionListener(e ->{});

        JButton btnDeleteProduct = new JButton("Удалить товара");
        btnDeleteProduct.addActionListener(e ->{});

        JButton btnCancel = new JButton("Назад");
        btnCancel.addActionListener(e ->{});

        this.productController = productController;
        this.add(btnLookProduct);
        this.add(btnLookProduct);
        this.add(btnCancel);

    }
}
