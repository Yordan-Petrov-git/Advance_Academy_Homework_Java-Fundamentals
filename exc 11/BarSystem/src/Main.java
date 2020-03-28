import Helpers.InitializeObjects;
import Views.JFrameMain;

public class Main {
    public static void main(String[] args) {
        //init OBJECTS
        //  Waiter waiter = new Waiter("Ivan Ivanov", "Ivan", "1234");
        //  JFrameMain.waiter.add(waiter);
        //Test for username is it unique
        String fullName = "Ivan Ivanov";
        String username = "Ivan";
        String password = "1234";
        InitializeObjects.initializeNewWaiter(fullName, username, password);

        //Start
        JFrameMain jFrame = new JFrameMain();
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);

    }
}
