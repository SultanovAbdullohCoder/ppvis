package view;

import controller.catalogController;

import javax.swing.*;

public class CatalogWindow extends JFrame{

    CatalogController catalogController;
    public CatalogWindow(CatalogController catalogController){

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 300, 300);

        JButton btnSearch = new JButton("Поиск");
        btnSearch.addActionListener(e ->{});

        JButton btnLookProduct = new JButton("Посмотреть товара");
        btnLookProduct.addActionListener(e ->{});

        JButton btnCancel = new JButton("Назад");
        btnCancel.addActionListener(e ->{});

        this.catalogController = catalogController;
        this.add(btnSearch);
        this.add(btnLookProduct);
        this.add(btnCancel);
    }
}
