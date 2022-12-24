package view;

import controller.productController;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import javax.swing.*;

public class ProductWindow extends JFrame {

    ProductController productController;
    public ProductWindow(ProductController productController){

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 300, 300);

        JButton btnAddToBasket = new JButton("Добавить в корзину");
        btnAddToBasket.addActionListener(e ->{});

        JButton btnAddToFavorite = new JButton("Добавить в избранное");
        btnAddToFavorite.addActionListener(e ->{});

        JButton btnAddReview = new JButton("Добавить отзыв");
        btnAddReview.addActionListener(e ->{});

        JButton btnReviews = new JButton("Отзывы");
        btnReviews.addActionListener(e ->{});

        JLabel lblNumberOrder = new JLabel("Имя товара");
        JLabel lblPrice = new JLabel("Стоимость");

        JLabel txtDescription = new JLabel("Описание");

        JPEGImageReadParam image = new JPEGImageReadParam();

        JButton btnCancel = new JButton("Назад");
        btnCancel.addActionListener(e ->{});

        this.productController = productController;
        this.add(btnAddToBasket);
        this.add(btnAddToFavorite);
        this.add(lblPrice);
        this.add(btnAddReview);
        this.add(btnReviews);
        this.add(lblNumberOrder);
        this.add(txtDescription);
        this.add(image);
        this.add(btnCancel);
    }

    private void add(JPEGImageReadParam image) {
    }
}
