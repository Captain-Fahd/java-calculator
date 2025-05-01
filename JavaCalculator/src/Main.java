import javax.swing.*;

public class Main {
    public static void main(String[] args) {
       CalculatorView view = new CalculatorView();
       view.setVisible(true);
       view.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       view.pack();
    }
}
