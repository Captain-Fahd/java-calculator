import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorView extends JFrame {
    private String operation;
    private JButton Addition, Subtraction, Multiplication, Division, Equals, Clear;
    private JButton zero, one, two, three, four, five, six, seven, eight, nine;
    private JTextField resultField;
    private String resultString = "0";
    private Boolean isExpression;


    CalculatorView() {
        GridBagConstraints layoutConstraints = null;
        setTitle("Calculator");

        //Adding the result field
        resultField = new JTextField(13);
        //Setting the resultString to resultField
        resultField.setText(resultString);
        resultField.setEditable(false);

        setLayout(new GridBagLayout());
        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 0;
        layoutConstraints.gridy = 0;
        layoutConstraints.gridwidth = 3;
        layoutConstraints.insets = new Insets(5, 5, 5, 5);
        add(resultField, layoutConstraints);

        //Adding the zero button
        createNumButton(zero, "0", 0, 1, 3);
        createNumButton(one, "1", 1, 0, 2);
        createNumButton(two, "2", 2, 1, 2);
        createNumButton(three, "3", 3, 2, 2);
    }

    public void createNumButton(JButton btn, String btnText, int val, int x, int y) {
        GridBagConstraints btnConstraints = new GridBagConstraints();
        //Creating the button
        btn = new JButton(btnText);
        btnConstraints.gridx = x;
        btnConstraints.gridy = y;
        btnConstraints.insets = new Insets(5, 5, 5, 5);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultString = resultString + val;
                if(Integer.parseInt(resultField.getText()) == 0 && val == 0) {
                    resultString = "0";
                }
                resultField.setText(resultString);
            }
        });
        add(btn, btnConstraints);
    }

}
