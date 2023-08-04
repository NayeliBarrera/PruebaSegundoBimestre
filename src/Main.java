import java.sql.*;

public class Main {

        int Codigo;
        String Nombre;
        int Cedula;
        String Signo;

    public Main(int codigo, String nombre, int cedula, String signo) {
        Codigo = codigo;
        Nombre = nombre;
        Cedula = cedula;
        Signo = signo;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int cedula) {
        Cedula = cedula;
    }

    public String getSigno() {
        return Signo;
    }

    public void setSigno(String signo) {
        Signo = signo;
    }
}
