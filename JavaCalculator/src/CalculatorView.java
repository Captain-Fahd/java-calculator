import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorView extends JFrame implements ActionListener {
    private String operation;
    private JButton Addition, Subtraction, Multiplication, Division, Equals, Clear;
    private Boolean isExpression;


    CalculatorView(){
        setTitle("Calculator");


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
