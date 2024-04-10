import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

public class GUI extends JFrame implements ActionListener {


    JFrame frame;
    private JPanel contentPane;
    private JTextField textField = new JTextField();
    private JTextField textField_1 = new JTextField();
    private JTextField textField_2 = new JTextField();
    private final ButtonGroup buttonGroup = new ButtonGroup();
    private final ButtonGroup buttonGroup_1 = new ButtonGroup();
    private final ButtonGroup buttonGroup_2 = new ButtonGroup();
    JPanel loginPanel = new JPanel();
    JPanel welcomePanel = new JPanel();
    JLabel welcomeLabel = new JLabel("Welcome to the coffee shop!");
    JPanel panel = new JPanel();
    JLabel lblNewLabel = new JLabel("New label");
    JPanel radioButtonPanel = new JPanel();
    JRadioButton premiumRadio = new JRadioButton("Premium User");
    JPanel userpassPanel = new JPanel();
    JLabel nameLabel = new JLabel("Name:");

    JLabel addressLabel = new JLabel("Address");
    JLabel phoneLabel = new JLabel("Phone Number:");
    Panel panel_1 = new Panel();
    JButton nextButton = new JButton("Continue");
    JPanel panel_2 = new JPanel();
    JPanel panel_3 = new JPanel();
    JPanel panel_5 = new JPanel();
    JLabel filteredCoffeeLabel = new JLabel("Filtered Coffee Options");
    JPanel panel_6 = new JPanel();
    JRadioButton lightRadio = new JRadioButton("Light");
    JRadioButton mediumRadio = new JRadioButton("Medium");
    JRadioButton darkRadio = new JRadioButton("Dark");
    JButton filteredCoffeeOrderButton = new JButton("Add to order");
    JPanel panel_4 = new JPanel();
    JPanel panel_7 = new JPanel();
    JLabel espresssoLabel = new JLabel("Espresso Options");
    JPanel panel_8 = new JPanel();
    JLabel varietyLabel = new JLabel("Variety:");
    JRadioButton americanoRadio = new JRadioButton("Americano");
    JRadioButton latteRadio = new JRadioButton("Latte");
    JRadioButton mochaRadio = new JRadioButton("Mocha");
    JPanel panel_9 = new JPanel();
    JLabel shotLabel = new JLabel("Espresso shots:");
    JSpinner shotSpinner = new JSpinner();
    JLabel milkTypeLabel = new JLabel("Milk type:");
    JRadioButton wholeRadio = new JRadioButton("Whole");
    JRadioButton skimRadio = new JRadioButton("Skim");
    JRadioButton almondRadio = new JRadioButton("Almond");
    JPanel panel_10 = new JPanel();
    JLabel additionLabel = new JLabel("Additions:");
    JRadioButton chocolateRadio = new JRadioButton("Chocolate");
    JRadioButton whippedCreamRadio = new JRadioButton("Whipped Cream");
    JRadioButton cinnamonRadio = new JRadioButton("Cinnamon");
    JRadioButton sugarRadio = new JRadioButton("Sugar");
    JButton espressoOrderButton = new JButton("Add to order");
    public GUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new CardLayout(0, 0));
        loginPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.add(loginPanel, "loginPanel");
        loginPanel.setLayout(new GridLayout(0, 1, 0, 0));
        loginPanel.add(welcomePanel);
        welcomePanel.add(welcomeLabel);
        loginPanel.add(panel);
        panel.add(lblNewLabel);
        loginPanel.add(radioButtonPanel);
        premiumRadio.setFont(new Font("Tahoma", Font.PLAIN, 17));
        radioButtonPanel.add(premiumRadio);
        loginPanel.add(userpassPanel);
        userpassPanel.setLayout(new GridLayout(0, 2));
        userpassPanel.add(nameLabel);
        textField.setColumns(10);
        userpassPanel.add(textField);
        userpassPanel.add(addressLabel);
        textField_1.setColumns(10);
        userpassPanel.add(textField_1);
        userpassPanel.add(phoneLabel);
        textField_2.setColumns(10);
        userpassPanel.add(textField_2);
        loginPanel.add(panel_1);
        nextButton.setActionCommand("nextButton");
        nextButton.addActionListener(this);
        panel_1.add(nextButton);
        contentPane.add(panel_2, "selectionPanel");
        panel_2.setLayout(new GridLayout(2, 1, 0, 0));
        panel_3.setBorder(new CompoundBorder());
        panel_2.add(panel_3);
        panel_3.setLayout(new GridLayout(3, 1, 0, 0));
        panel_3.add(panel_5);
        panel_5.add(filteredCoffeeLabel);
        panel_3.add(panel_6);
        buttonGroup.add(lightRadio);
        panel_6.add(lightRadio);
        buttonGroup.add(mediumRadio);
        panel_6.add(mediumRadio);
        buttonGroup.add(darkRadio);
        panel_6.add(darkRadio);
        panel_3.add(filteredCoffeeOrderButton);
        panel_2.add(panel_4);
        panel_4.setLayout(new GridLayout(5, 1, 0, 0));
        panel_4.add(panel_7);
        panel_7.add(espresssoLabel);
        panel_4.add(panel_8);
        panel_8.add(varietyLabel);
        buttonGroup_2.add(americanoRadio);
        panel_8.add(americanoRadio);
        buttonGroup_2.add(latteRadio);
        panel_8.add(latteRadio);
        buttonGroup_2.add(mochaRadio);
        panel_8.add(mochaRadio);
        panel_4.add(panel_9);
        panel_9.add(shotLabel);
        shotSpinner.setModel(new SpinnerNumberModel(0, 0, 5, 1));
        panel_9.add(shotSpinner);
        panel_9.add(milkTypeLabel);
        buttonGroup_1.add(wholeRadio);
        panel_9.add(wholeRadio);
        buttonGroup_1.add(skimRadio);
        panel_9.add(skimRadio);
        buttonGroup_1.add(almondRadio);
        panel_9.add(almondRadio);
        panel_4.add(panel_10);
        panel_10.add(additionLabel);
        panel_10.add(chocolateRadio);
        panel_10.add(whippedCreamRadio);
        panel_10.add(cinnamonRadio);
        panel_10.add(sugarRadio);
        panel_4.add(espressoOrderButton);


    }



    public void actionPerformed(ActionEvent e) {
        CardLayout cl = (CardLayout) contentPane.getLayout();
        if (e.getSource() == nextButton) {
            cl.show(contentPane, "selectionPanel");
        }
    }



    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    GUI gui = new GUI();
                    gui.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });



    }
}
