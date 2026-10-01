package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    public static Connection conectar() {

        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            String url =
                "jdbc:sqlserver://localhost:1433;" +
                "databaseName=ProjetoMedControl;" +
                "integratedSecurity=true;" +
                "encrypt=true;" +
                "trustServerCertificate=true;";

            Connection con =
            DriverManager.getConnection(url);

            System.out.println("Conectado!");

            return con;

        } catch (Exception e) {

            e.printStackTrace();

            return null;
        }
    }
}