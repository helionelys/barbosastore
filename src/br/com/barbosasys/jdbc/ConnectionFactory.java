package br.com.barbosasys.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/DBBARBOSASHOP", "root", "root1234");
        } catch (Exception erro) {
            throw new RuntimeException(erro);
        }
    }
}
