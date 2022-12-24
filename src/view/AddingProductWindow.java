package view;

import controller.productController;



public class AddingProductWindow extends JFrame {
    AddingProductController addingProductController;

    public AddingProductWindow(AddingProductController productController){

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 300, 300);

        JButton btnAddProduct = new JButton("Добавить товар");
        btnAddProduct.addActionListener(e ->{});

        JLabel lblNumberOrder = new JLabel("Ввести имя");
        JTextField txtNameProduct = new JTextField("Имя товара");

        JLabel lblImage = new JLabel("Загрузить картинку");

        JLabel lblAddDescription = new JLabel("Ввести описание");
        JTextArea txtDescription = new JTextArea("Текст описания");

        JLabel lblAddPrice = new JLabel("Ввести стоимость");
        JTextArea txtAddPrice = new JTextArea("Стоимость");

        JButton btnCancel = new JButton("Назад");
        btnCancel.addActionListener(e ->{});

        this.productController = productController;
        this.add(btnAddProduct);
        this.add(lblNumberOrder);
        this.add(txtNameProduct);
        this.add(lblImage);
        this.add(lblAddDescription);
        this.add(lblAddPrice);
        this.add(txtDescription);
        this.add(txtAddPrice);
        this.add(btnCancel);
    }

}
