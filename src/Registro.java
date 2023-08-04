import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import static com.mysql.cj.util.SaslPrep.StringType.QUERY;

public class Registro {
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JComboBox comboBox1;
    private JButton botonBuscarPorCodigoButton;
    private JButton botonBuscarPorNombreButton;
    private JButton botonBuscarPorSignoButton;
    private JButton borrarElPresenteRegistroButton;
    private JButton actualizarElPresenteRegistroButton;
    private JButton ingresarElPresenteRegistroButton;
    private JButton limpiarFormularioButton;
    private JPanel Re;

    public static void main(String[] args) {
        String DB_URL="jdbc:mysql://localhost/ESTUDIANTES"; //conectar con el servidor
        String USER="root"; // ususario del cual nos vamos a conectar
        String PASS="";    //contraseña
        String QUERY="SELECT * from registro1";

        
        JFrame frame = new JFrame("Registro");
        frame.setContentPane(new Registro().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Registro() {
        botonBuscarPorCodigoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int Codigo= textField1.getText();
                String Codigo = new String(textField1.getText())

                Component Registro;
                String DB_URL;
                try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                     PreparedStatement stmt = conn.prepareStatement(QUERY)) {
                    stmt.setString(1, Codigo);
                    stmt.setString(2, Nombre)
                    stmt.setString(3, Signo);

                    ResultSet rs = stmt.executeQuery();

                   
                    if (rs.next()) {
                        int Codigo = rs.getString("Codigo");
                        String cedula = rs.getString("cedula");
                        String Nombre = rs.getString("Nombre");
                        String Signo = rs.getString("Signo");

                        System.out.println("Datos del usuario:");
                        System.out.println("Nombre: " + Nombre);
                        System.out.println("cedula: " + cedula);
                        System.out.println("Signo: " + Signo);


                        JOptionPane.showMessageDialog(Registro, "Estudiante encontrado por codigo");
                    } else {
                        JOptionPane.showMessageDialog(Registro, "Codigo incorrecto. Inténtalo de nuevo.",
                                "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(Registro, "Error al intentar conectarse a la base de datos.",
                            "Error de conexión", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        botonBuscarPorNombreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
    }
        


