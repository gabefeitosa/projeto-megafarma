package br.com.fiap.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static Connection connection;

    public static void closeConnection(){
        try {
            if (!connection.isClosed())
                connection.close();
        } catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static Connection getConnection(){
        try {
            if (connection != null && !connection.isClosed())
                return connection;
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //Busca dados de conexão nas variáveis de ambiente

            String url = System.getenv("DB_URL");
            final String USER = System.getenv("DB_USER");
            final String PASS = System.getenv("DB_PASSWORD");
            if (url == null || USER == null || PASS == null)
                throw new RuntimeException("Variáveis de ambientedo banco " +
                        "não configuradas");
            connection = DriverManager.getConnection(url, USER, PASS);
        } catch (SQLException e) {
            System.out.println("Erro de SQL " + e.getMessage());
        } catch (ClassNotFoundException e){
            System.out.println("Erro nome da classe: " + e.getMessage());
        }
        return connection;
    }


}
