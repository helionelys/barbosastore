package br.com.barbosasys.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConexaoBanco {

    private boolean status = false;
    private String mensagem = "";
    private Connection con = null;
    private Statement statement;
    private ResultSet resultSet;

    private String server = "localhost";
    private String baseName = "dbbarbosashop";
    private String user = "root";
    private String password = "root1234";

    public ConexaoBanco() {
    }

    public ConexaoBanco(String server, String baseName, String user, String password) {
        this.server = server;
        this.baseName = baseName;
        this.user = user;
        this.password = password;

    }

    // Abre conexão com banco de dados
    public Connection conectar() {
        try {
            // Driver JDBC Mysql
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

            // Local do banco, nome do banco, usuário e senha
            String url = "jdbc:mysql://" + server + "/" + baseName +"?useTimezone=true&serverTimezone=UTC" ;
            this.setCon((Connection) DriverManager.getConnection(url, user, password));

            this.status = true;
        }
        catch(ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return this.getCon();

    }
    
    public boolean executarSQL(String sql){
        try {
            //createStatement de con para criar o Statement
            this.setStatement(getCon().createStatement());
            
            // Definindo o statement, executamos a consulta no banco de dados
            this.setResultSet(getStatement().executeQuery(sql));
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
        }
    
    public boolean executarUpdateDeleteSQL(String sql){
        try {
            //createStatement de con para criar o Statement
            this.setStatement(getCon().createStatement());
            
            // Definido o Statement, executamos a query no banco de dados
            getStatement().executeUpdate(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }
    
    public int insertSQL(String sql){
        int status = 0;
        try {
            //Create statement de con para criar o Statement
            this.setStatement(getCon().createStatement());
                        
            // Definindo o statement, executamos a consulta no banco de dados;
            this.getStatement().executeUpdate(sql);
            
            // Consulta o ultimo id inserido
            this.setResultSet(this.getStatement().executeQuery("SELECT last_insert_id();"));
            
            // Recupera o ultimo id inserido
            while(this.resultSet.next()){
                status = this.resultSet.getInt(1);
            }
            
            //retorna o ultimo id inserido
            return status;
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            return status;
        }
        
    }
    
    public boolean fecharConexao(){
        try {
            if((this.getResultSet() != null) && (this.statement != null)){
                this.getResultSet().close();
                this.statement.close();
            }
            this.getCon().close();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return false;
    }
    
    /*
    * retorna o status  
    */
    public boolean isStatus(){
        return this.status;
    }
    
    /*
    * retorna a mensagem  
    */
    public String getMensagem(){
        return mensagem;
    }
    
    /*
    * retorna o Statement 
    */
    public Statement getStatement(){
        return statement;
    }
    
    /*
    * retorna o ResultSet  
    */
    public ResultSet getResultSet(){
        return resultSet;
    }
    
    /*
    * parametro mensagem para mensagem set  
    */
    public void setMensagem(String mensagem){
        this.mensagem = mensagem;
    }
    
    /*
    * retorna o com  
    */
    public Connection getCon(){
        return con;
    }
    
    /*
    * parametro con para con set  
    */
    public void setCon(Connection con){
        this.con = con;
    }
    
     /*
    * parametro Statement para statement set  
    */
    public void setStatement(Statement statement){
        this.statement = statement;
    }
    
     /*
    * parametro ResultSet para ResultSet set  
    */
    public void setResultSet(ResultSet resultSet){
        this.resultSet = resultSet; 
    }
    
    /**
     * retorna o server
     */
    public String getServer(){
        return server;
    }
    
    /*
    * parametro server para server set  
    */
    public void setServer(String server){
        this.server = server;
    }
    
    /**
     * retorna o baseName
     * @return 
     */
    public String getBaseName(){
        return baseName;
    }
    
    /*
    * parametro baseName para baseName set
    */
    public void setBaseName(String baseName){
        this.baseName = baseName;
    }
    
    /**
     * retorna o user
     * @return 
     */
    public String getUser(){
        return user;
    }
    
    /*
    * parametro user para user set  
    */
    public void setUser(String user){
        this.user = user;
    }
    
    /**
     * retorna o password
     * @return 
     */
    public String getPassword(){
        return password;
    }
    
    /*
    * parametro password para password set
    */
    public void setPassword(String password){
        this.password = password;
    }
    
    }

