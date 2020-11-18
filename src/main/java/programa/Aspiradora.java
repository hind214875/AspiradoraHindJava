package programa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Hind
 */

public class Aspiradora implements ActionListener {
    
    private static JLabel labelUsuario;
    private static JTextField usuarioTexto;
    private static JLabel labelContraseña;
    private static JButton button;
    private static JLabel message;
    private static JPasswordField Contraseña;
    
   
    public static void main(String[] args) {
        JPanel panel=new JPanel();
        JFrame frame=new JFrame();
        
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);
        
        labelUsuario=new JLabel("Usuario");
        labelUsuario.setBounds(10, 20, 80, 25);
        panel.add(labelUsuario);
        
        usuarioTexto= new JTextField();
        usuarioTexto.setBounds(100, 20, 165, 25);
        panel.add(usuarioTexto);
        
        labelContraseña=new JLabel("contraseña");
        labelContraseña.setBounds(10, 50, 80, 25);
        panel.add(labelContraseña);
        
        Contraseña= new JPasswordField();
        Contraseña.setBounds(100, 50, 165, 25);
        panel.add(Contraseña);
        
        button=new JButton("login");
        button.setBounds(10, 80, 80, 25);
        panel.add(button);
        
         // Adding the listeners to components
        button.addActionListener(new Aspiradora());
        
        message =new JLabel();
        message.setBounds(10, 110, 300, 25);
        panel.add(message);
        
        
        
        frame.setVisible(true);
        
        
        
        
      
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
       String user=usuarioTexto.getText();
       String password=Contraseña.getText();
       
       if (user.equals("Admin") && password.equals("Admin")){
           
                     message.setText("Login Successfuly");
       }else {
         message.setText(" Invalid user.. ");
      }
           
               
               }
       
  
  
    
    
}
