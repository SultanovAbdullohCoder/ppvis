import controller.buyerController;
import model.productModel;
import view.View;

public class ProgramStart {
    public static void main(String[] args) {
        Model model = new Model();
        Controller controller = new Controller(model);
        View view = new View(controller);

        view.initialize();
    }
}
