package Configuracion;

public class Transaciones {
    // nombre de la base de datos
    public static final String DBName = "PMO12024";
    public static final String TablePersonas = "personas";

    // Cracion de los campos de la base de datos

    public static final String id = "id";
    public static final String nombre = "nombre";
    public static final String apellido = "apellido";

    public static final String telefono = "telefono";

    public static final String CrateTablePersonas = "Create table personas "+TablePersonas+ " ("+ "id INTEGER PRIMARY KEY AUTOINCREMENT, nombre TEXT, apellido TEXT, telefono INTEGER )";

    public static final String DropTablePeronas  = "DROP TABLE IF EXISTS "+ TablePersonas;
    public static final String SelectAllPersonas = "SELECT * FROM "+ TablePersonas;
}
