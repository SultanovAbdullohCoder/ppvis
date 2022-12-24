package view;



import javax.swing.*;

public class BasketWindow extends JFrame {

    
    public BasketWindow(){
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 300, 300);

        JButton btnMakeOrder = new JButton("Сделать заказ");
        btnMakeOrder.addActionListener(e ->{});

        JButton btnLookProduct = new JButton("Посмотреть товара");
        btnLookProduct.addActionListener(e ->{});

        JButton btnDeleteProductFrBasket = new JButton("Удалить товар");
        btnDeleteProductFrBasket.addActionListener(e ->{});

        JButton btnCancel = new JButton("Назад");
        btnCancel.addActionListener(e ->{});

        this.add(btnMakeOrder);
        this.add(btnLookProduct);
        this.add(btnDeleteProductFrBasket);
        this.add(btnCancel);

    }
}
