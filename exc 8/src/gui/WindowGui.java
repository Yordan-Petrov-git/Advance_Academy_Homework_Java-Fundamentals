package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowGui extends JFrame implements ActionListener {
    //------------------------
    private JLabel jLabelResult;
    //------------------------
    private JButton jButtonSum;
    private JButton jButtonSubtract;
    private JButton jButtonMultiply;
    private JButton jButtonDivide;
    //------------------------
    private JTextField jTextFieldNumFirst;
    private JTextField jTextFieldNumSecond;

    //------------------------
    public WindowGui() {
        super("Simple calculator");

        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        jTextFieldNumFirst = new JTextField();
        jTextFieldNumSecond = new JTextField();

        jLabelResult = new JLabel("Result");

        jButtonSum = new JButton("+");
        jButtonSubtract = new JButton("-");
        jButtonMultiply = new JButton("*");
        jButtonDivide = new JButton("/");

        jTextFieldNumFirst = new JTextField("FirstNumber");
        jTextFieldNumSecond = new JTextField("SecondNumber");


        jButtonSum.addActionListener(this);
        jButtonSubtract.addActionListener(this);
        jButtonMultiply.addActionListener(this);
        jButtonDivide.addActionListener(this);


        add(jButtonSum);
        add(jButtonSubtract);
        add(jButtonMultiply);
        add(jButtonDivide);

        add(jTextFieldNumFirst);
        add(jTextFieldNumSecond);

        add(jLabelResult);

        pack();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jButtonSum) {
            //Sum
            double firstNum = Double.parseDouble(jTextFieldNumFirst.getText());
            double secondNum = Double.parseDouble(jTextFieldNumSecond.getText());
            double result = firstNum + secondNum;
            jLabelResult.setText("" + result);

        } else if (e.getSource() == jButtonSubtract) {
            //Subtract
            double firstNum = Double.parseDouble(jTextFieldNumFirst.getText());
            double secondNum = Double.parseDouble(jTextFieldNumSecond.getText());
            double result = firstNum - secondNum;
            jLabelResult.setText("" + result);

        } else if (e.getSource() == jButtonMultiply) {
            //Multiply
            double firstNum = Double.parseDouble(jTextFieldNumFirst.getText());
            double secondNum = Double.parseDouble(jTextFieldNumSecond.getText());
            double result = firstNum * secondNum;
            jLabelResult.setText("" + result);

        } else if (e.getSource() == jButtonDivide) {
            //Divide
            double firstNum = Double.parseDouble(jTextFieldNumFirst.getText());
            double secondNum = Double.parseDouble(jTextFieldNumSecond.getText());
            double result = firstNum / secondNum;
            jLabelResult.setText("" + result);

        }
    }

}
