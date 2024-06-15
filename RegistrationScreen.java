import javax.swing.*;

import java.awt.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

public class RegistrationScreen extends JFrame {

  private JTextField usernameField;

  private JPasswordField passwordField;

  private JButton registerButton;

  public RegistrationScreen() {

    // Configurar a janela

    setTitle("Register");

    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    setSize(300, 200);

    setLocationRelativeTo(null);

    // Criar componentes

    JLabel usernameLabel = new JLabel("Username:");

    JLabel passwordLabel = new JLabel("Password:");

    usernameField = new JTextField();

    passwordField = new JPasswordField();

    registerButton = new JButton("Register");

    // Layout manager

    setLayout(new GridLayout(3, 2));

    add(usernameLabel);

    add(usernameField);

    add(passwordLabel);

    add(passwordField);

    add(new JLabel()); // Espaço em branco

    add(registerButton);

    // Adicionar ActionListener ao botão de registro

    registerButton.addActionListener(new ActionListener() {

      @Override

      public void actionPerformed(ActionEvent e) {

        // Processar os dados do formulário de registro aqui

        String username = usernameField.getText();

        char[] password = passwordField.getPassword();

        // Chame um método para criar a conta do usuário

        createUserAccount(username, password);

        // Feche a janela após o registro

        dispose();

      }

    });

    // Mostrar a janela de registro

    setVisible(true);

  }

  private void createUserAccount(String username, char[] password) {

    // Implemente a lógica para criar uma nova conta de usuário

  }

  public static void main(String[] args) {

    SwingUtilities.invokeLater(() -> {

      new RegistrationScreen();

    });

  }

}