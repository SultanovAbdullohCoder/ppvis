package view;

import controller.Controller;
import controller.MainWindowController;

public class View {

    private Controller controller;
    private MainWindow mainWindow;

    public View(Controller controller) { this.controller = controller; }

    public void initialize(){
        createMainWindow();
        mainWindow.display();
    }

    public void createMainWindow() {
        MainWindowController mainWindowController = controller.getMainWindowController();
        mainWindow = new MainWindow(mainWindowController);
    }
}
