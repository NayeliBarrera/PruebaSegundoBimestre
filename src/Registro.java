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

    public Registro() {
        botonBuscarPorCodigoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigo = obtenerCodigo();
                JFrame frame = new JFrame("Buscar por codigo");
                JButton button = new JButton("Estudiante encontrado por codigo");

            }
        });
        botonBuscarPorNombreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Nombre = obtenerNombre();
            }
        });
        botonBuscarPorSignoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Signo = obtenerSigno();
            }
        });
    }

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

}




        


