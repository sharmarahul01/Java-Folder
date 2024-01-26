import java.awt.*;
import java.awt.event.*;

public class LoginWindow extends Frame {
    // Components
    private Label userLabel, passLabel;
    private TextField userTextField;
    private TextField passTextField;
    private Button loginButton;

    public LoginWindow() {
        // Set the layout manager to null to position components manually
        setLayout(null);

        // User Label
        userLabel = new Label("Username:");
        userLabel.setBounds(50, 50, 80, 20);
        add(userLabel);

        // Password Label
        passLabel = new Label("Password:");
        passLabel.setBounds(50, 100, 80, 20);
        add(passLabel);

        // User Text Field
        userTextField = new TextField();
        userTextField.setBounds(150, 50, 150, 20);
        add(userTextField);

        // Password Text Field
        passTextField = new TextField();
        passTextField.setEchoChar('*'); // To hide the password
        passTextField.setBounds(150, 100, 150, 20);
        add(passTextField);

        // Login Button
        loginButton = new Button("Login");
        loginButton.setBounds(100, 150, 70, 30);
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = userTextField.getText();
                String password = passTextField.getText();
                if (username.equals("your_username") && password.equals("your_password")) {
                    // Perform login action here
                    System.out.println("Login successful");
                } else {
                    System.out.println("Login failed");
                }
            }
        });
        add(loginButton);

        // Frame settings
        setTitle("Login Window");
        setSize(350, 250);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new LoginWindow();
    }
}
