import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;

public class GUI implements ActionListener {
    JFrame frame;

    public GUI() {
        frame = new JFrame ("Coffee Shop");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public void createLoginPanel() {
        JPanel loginPanel = new JPanel();
        loginPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        frame.getContentPane().add(loginPanel);
        loginPanel.setLayout(new GridLayout(0, 1, 0, 0));

        JPanel welcomePanel = new JPanel();
        loginPanel.add(welcomePanel);

        JLabel welcomeLabel = new JLabel("Welcome to the coffee shop!");
        welcomePanel.add(welcomeLabel);

        JPanel panel = new JPanel();
        loginPanel.add(panel);

        JLabel lblNewLabel = new JLabel("New label");
        panel.add(lblNewLabel);

        JPanel radioButtonPanel = new JPanel();
        loginPanel.add(radioButtonPanel);

        JRadioButton premiumRadio = new JRadioButton("Premium User");
        premiumRadio.setFont(new Font("Tahoma", Font.PLAIN, 17));
        radioButtonPanel.add(premiumRadio);

        JPanel userpassPanel = new JPanel();
        loginPanel.add(userpassPanel);
        userpassPanel.setLayout(new GridLayout(0, 2));

        JLabel nameLabel = new JLabel("Name:");
        userpassPanel.add(nameLabel);

        JTextField textField = new JTextField();
        textField.setColumns(10);
        userpassPanel.add(textField);

        JLabel addressLabel = new JLabel("Address");
        userpassPanel.add(addressLabel);

        JTextField textField_1 = new JTextField();
        textField_1.setColumns(10);
        userpassPanel.add(textField_1);

        JLabel phoneLabel = new JLabel("Phone Number:");
        userpassPanel.add(phoneLabel);

        JTextField textField_2 = new JTextField();
        textField_2.setColumns(10);
        userpassPanel.add(textField_2);

        Panel panel_1 = new Panel();
        loginPanel.add(panel_1);

        JButton nextButton = new JButton("Continue");
        nextButton.setActionCommand("nextButton");
        nextButton.addActionListener(this);
        panel_1.add(nextButton);
    }

    public void createSecondPanel() {
        frame.getContentPane().removeAll();
        frame.getContentPane().repaint();
        JPanel panel_2 = new JPanel();
        JLabel lblNewLabel_1 = new JLabel("Welcome to da second page");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        panel_2.add(lblNewLabel_1);
        frame.getContentPane().add(panel_2);
        frame.pack();
        frame.setVisible(true);


    }
    public void actionPerformed(ActionEvent e) {
        if ("nextButton".contentEquals(e.getActionCommand())) {
            createSecondPanel();
        }
    }

    public void createAndShowGUI() {
        createLoginPanel();
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        GUI gui = new GUI();
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                gui.createAndShowGUI();
            }
        });
    }
}
