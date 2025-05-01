import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorView extends JFrame {
    private String operation;
    private JButton Addition, Subtraction, Multiplication, Division, Equals, Clear;
    private JButton zero, one, two, three, four, five, six, seven, eight, nine, equals, clear;
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

        //making the number button
        createNumButton(zero, "0", 0, 1, 4);
        createNumButton(one, "1", 1, 2, 3);
        createNumButton(two, "2", 2, 1, 3);
        createNumButton(three, "3", 3, 0, 3);
        createNumButton(four, "4", 4, 2, 2);
        createNumButton(five, "5", 5, 1, 2);
        createNumButton(six, "6", 6, 0, 2);
        createNumButton(seven, "7", 7, 2, 1);
        createNumButton(eight, "8", 8, 1, 1);
        createNumButton(nine, "9", 9, 0, 1);

        //creating the equals button
        clear = new JButton("C");
        createOtherButton(clear, 3, 1);
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultString = "";
                resultField.setText(resultString);
            }
        });
        equals = new JButton("=");
        createOtherButton(equals, 2, 4);

    }
    public void createOtherButton(JButton btn, int x, int y) {
        GridBagConstraints btnConstraints = new GridBagConstraints();
        //Create other button style
        btnConstraints.gridx = x;
        btnConstraints.gridy = y;
        btnConstraints.insets = new Insets(5, 5, 5, 5);
        add(btn, btnConstraints);
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
                if(resultString.equals("0")) {
                    resultString = "";
                }
                resultString = resultString + val;

                if (Integer.parseInt(resultString) == 0 && val == 0) {
                    resultString = "0";
                }
                resultField.setText(resultString);
            }
        });
        add(btn, btnConstraints);
    }

}
