import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

public class GUI extends JFrame implements ActionListener {

    Customer currentCustomer;

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
    JButton filteredCoffeeOrderButton = new JButton("Add order");
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
    JButton espressoOrderButton = new JButton("Add order");
    JButton checkoutButton = new JButton("View Orders");
    JPanel preparePanel = new JPanel();
    JScrollPane scrollPane = new JScrollPane();
    JTextPane orderPane = new JTextPane();

    public GUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 400);
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
        filteredCoffeeOrderButton.addActionListener(this);
        panel_2.add(panel_4);
        panel_4.setLayout(new GridLayout(6, 1, 0, 0));
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
        espressoOrderButton.addActionListener(this);
        panel_4.add(checkoutButton);
        checkoutButton.addActionListener(this);
        contentPane.add(preparePanel, "preparePanel");
        preparePanel.setLayout(new GridLayout(3, 1, 0, 0));
        preparePanel.add(scrollPane);
        orderPane.setEditable(false);
        scrollPane.setViewportView(orderPane);


    }



    public void actionPerformed(ActionEvent e) {
        CardLayout cl = (CardLayout) contentPane.getLayout();
        if (e.getSource() == nextButton) {
            if (textField.getText().equalsIgnoreCase("") || textField_1.getText().equalsIgnoreCase("") || textField_2.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Please fill out all fields");
            } else {
                if (premiumRadio.isSelected()) {
                    currentCustomer = (new PremiumCustomer(textField.getText(), textField_1.getText(), textField_2.getText()));
                } else {
                    currentCustomer = (new RegularCustomer(textField.getText(), textField_1.getText(), textField_2.getText()));
                }
                cl.show(contentPane, "selectionPanel");
            }
        } else if (e.getSource() == filteredCoffeeOrderButton) {
            if (!lightRadio.isSelected() && !mediumRadio.isSelected() && !darkRadio.isSelected()) {
                JOptionPane.showMessageDialog(null, "Please choose a brew type");
            } else if (lightRadio.isSelected()) {
                currentCustomer.addOrder(new FilteredCoffee("Light Coffee", 3.49, "Lightly brewed filtered coffee",70, true, "light"));
                JOptionPane.showMessageDialog(null, "Successfully added order");
            } else if (mediumRadio.isSelected()) {
                currentCustomer.addOrder(new FilteredCoffee("Medium Coffee", 3.49, "Medium brewed filtered coffee",60, true, "medium"));
                JOptionPane.showMessageDialog(null, "Successfully added order");
            } else if (darkRadio.isSelected()) {
                currentCustomer.addOrder(new FilteredCoffee("Dark Coffee", 3.49, "Dark brewed filtered coffee",50, true, "dark"));
                JOptionPane.showMessageDialog(null, "Successfully added order");
            }
        } else if (e.getSource() == espressoOrderButton) {
            boolean hasChocolate = chocolateRadio.isSelected();
            boolean hasWhippedCream = whippedCreamRadio.isSelected();
            boolean hasCinnamon = cinnamonRadio.isSelected();
            boolean hasSugar = sugarRadio.isSelected();

            if ((!americanoRadio.isSelected() && !latteRadio.isSelected() && !mochaRadio.isSelected()
                && !wholeRadio.isSelected() && !skimRadio.isSelected() && !almondRadio.isSelected())) {
                JOptionPane.showMessageDialog(null, "Make sure you have selected a variety AND a milk type");
            } else if (americanoRadio.isSelected()) {
                if (wholeRadio.isSelected()) {
                    currentCustomer.addOrder(new Espresso("Americano", 5.49, "Americano with whole milk",
                            100, true, "Americano", (Integer) shotSpinner.getValue(),
                            "Whole", hasChocolate, hasWhippedCream, hasCinnamon,
                            hasSugar));
                    JOptionPane.showMessageDialog(null, "Successfully added order");
                } else if (skimRadio.isSelected()) {
                    currentCustomer.addOrder(new Espresso("Americano", 5.49, "Americano with skim milk",
                            90, true, "Americano", (Integer) shotSpinner.getValue(),
                            "Skim", hasChocolate, hasWhippedCream, hasCinnamon,
                            hasSugar));
                    JOptionPane.showMessageDialog(null, "Successfully added order");
                } else if (almondRadio.isSelected()) {
                    currentCustomer.addOrder(new Espresso("Americano", 5.49, "Americano with almond milk",
                            95, true, "Americano", (Integer) shotSpinner.getValue(),
                            "almond", hasChocolate, hasWhippedCream, hasCinnamon,
                            hasSugar));
                    JOptionPane.showMessageDialog(null, "Successfully added order");
                }
            } else if (latteRadio.isSelected()) {
                if (wholeRadio.isSelected()) {
                    currentCustomer.addOrder(new Espresso("Latte", 5.49, "Latte with whole milk",
                            100, true, "Latte", (Integer) shotSpinner.getValue(),
                            "Whole", hasChocolate, hasWhippedCream, hasCinnamon,
                            hasSugar));
                    JOptionPane.showMessageDialog(null, "Successfully added order");
                } else if (skimRadio.isSelected()) {
                    currentCustomer.addOrder(new Espresso("Latte", 5.49, "Latte with skim milk",
                            90, true, "Latte", (Integer) shotSpinner.getValue(),
                            "Skim", hasChocolate, hasWhippedCream, hasCinnamon,
                            hasSugar));
                    JOptionPane.showMessageDialog(null, "Successfully added order");
                } else if (almondRadio.isSelected()) {
                    currentCustomer.addOrder(new Espresso("Latte", 5.49, "Latte with almond milk",
                            95, true, "Latte", (Integer) shotSpinner.getValue(),
                            "Almond", hasChocolate, hasWhippedCream, hasCinnamon,
                            hasSugar));
                    JOptionPane.showMessageDialog(null, "Successfully added order");
                }
            } else if (mochaRadio.isSelected()) {
                if (wholeRadio.isSelected()) {
                    currentCustomer.addOrder(new Espresso("Mocha", 5.49, "Mocha with whole milk",
                            100, true, "Mocha", (Integer) shotSpinner.getValue(),
                            "Whole", hasChocolate, hasWhippedCream, hasCinnamon,
                            hasSugar));
                    JOptionPane.showMessageDialog(null, "Successfully added order");
                } else if (skimRadio.isSelected()) {
                    currentCustomer.addOrder(new Espresso("Mocha", 5.49, "Mocha with skim milk",
                            90, true, "Mocha", (Integer) shotSpinner.getValue(),
                            "Skim", hasChocolate, hasWhippedCream, hasCinnamon,
                            hasSugar));
                    JOptionPane.showMessageDialog(null, "Successfully added order");
                } else if (almondRadio.isSelected()) {
                    currentCustomer.addOrder(new Espresso("Mocha", 5.49, "Mocha with almond milk",
                            95, true, "Mocha", (Integer) shotSpinner.getValue(),
                            "Almond", hasChocolate, hasWhippedCream, hasCinnamon,
                            hasSugar));
                    JOptionPane.showMessageDialog(null, "Successfully added order");
                }
            }
        } else if (e.getSource() == checkoutButton) {
            if (currentCustomer.getOrders().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please add at least one order");
            } else {
                cl.show(contentPane, "preparePanel");
                orderPane.setText("Orders for: " + currentCustomer.getName() + " (" + currentCustomer.getPhoneNumber() +
                        ")\n--------------\n");
                int orderNum = 1;
                for (Coffee order : currentCustomer.getOrders()) {
                    orderPane.setText(orderPane.getText() + "Order Number: " + orderNum + "\n" + order.prepare() + "\n" +
                            "--------------\n");
                    orderNum++;
                }
                orderPane.setCaretPosition(0);
            }

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
