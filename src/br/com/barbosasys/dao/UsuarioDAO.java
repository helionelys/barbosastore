/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.barbosasys.dao;

import br.com.barbosasys.jdbc.ConexaoBanco;
import br.com.barbosasys.model.Usuario;
import java.util.ArrayList;

/**
 *
 * @author hbarbosa
 */
public class UsuarioDAO extends ConexaoBanco {

    //   Inserir usuario dentro banco de dados
    public int salvarUsuarioDAO(Usuario usuario) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO TBL_USUARIO ("
                    + "LOGIN,"
                    + "SENHA,"
                    + "CODFUNCIONARIO,"
                    + "CODPERFIL"
                    + ") VALUES ("
                    + "'" + usuario.getLogin() + "',"
                    + "MD5('" + usuario.getSenha() + "'),"
                    + "'" + usuario.getCodigo() + "',"
                    + "'" + usuario.getCodigoPerfil() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    // Recupera usuario através do codigo
    public Usuario getUsuarioDAO(int codigo) {
        Usuario usuario = new Usuario();

        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "TBL_USUARIO.CODUSUARIO,"
                    + "TBL_USUARIO.CODFUNCIONARIO, "
                    + "TBL_FUNCIONARIO.NOME,"
                    + "TBL_USUARIO.LOGIN,"        
                    + "TBL_USUARIO.SENHA,"        
                    + "TBL_USUARIO.CODPERFIL,"
                    + "TBL_PERFILUSUARIO.NOME"
                    + " FROM"
                    + " TBL_USUARIO"
                    + " INNER JOIN TBL_FUNCIONARIO"
                    + " ON TBL_FUNCIONARIO.CODFUNCIONARIO = TBL_USUARIO.CODFUNCIONARIO"
                    + " INNER JOIN TBL_PERFILUSUARIO"
                    + " ON TBL_PERFILUSUARIO.CODPERFIL = TBL_USUARIO.CODPERFIL"
                    + " WHERE"
                    + " CODUSUARIO = '" + codigo + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                
                usuario.setCodUsuario(this.getResultSet().getInt(1));
                usuario.setCodigo(this.getResultSet().getInt(2));
                usuario.setNomeRazaoSocial(this.getResultSet().getString(3));                
                usuario.setLogin(this.getResultSet().getString(4));
                usuario.setSenha(this.getResultSet().getString(5));
                usuario.setCodigoPerfil(this.getResultSet().getInt(6));
                usuario.setNomePerfil(this.getResultSet().getString(7));

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return usuario;
    }

    public Usuario getUsuarioDAO(String login) {
        Usuario usuario = new Usuario();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "TBL_USUARIO.CODUSUARIO,"
                    + "TBL_USUARIO.LOGIN, "
                    + "TBL_FUNCIONARIO.NOME,"
                    + "TBL_PERFILUSUARIO.NOME"
                    + " FROM"
                    + " TBL_USUARIO"
                    + " INNER JOIN TBL_FUNCIONARIO"
                    + " ON TBL_FUNCIONARIO.CODFUNCIONARIO = TBL_USUARIO.CODFUNCIONARIO"
                    + " INNER JOIN TBL_PERFILUSUARIO"
                    + " ON TBL_PERFILUSUARIO.CODPERFIL = TBL_USUARIO.CODPERFIL"
                    + " WHERE"
                    + " CODUSUARIO = '" + login + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                usuario.setCodigo(this.getResultSet().getInt(1));
                usuario.setLogin(this.getResultSet().getString(2));
                usuario.setNomeRazaoSocial(this.getResultSet().getString(3));
                usuario.setNomePerfil(this.getResultSet().getString(4));

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return usuario;
    }
    
    public boolean getUsuarioDAO(Usuario usuario){
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                + "CODUSUARIO,"
                + "LOGIN,"
                + "SENHA"
                + " FROM "
                + " TBL_USUARIO"
                + " WHERE"
                + " LOGIN = '" + usuario.getLogin()+"' AND SENHA = '" + usuario.getSenha()+"'"
                + ";"    
            );
            
            if (getResultSet().next()){
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally{
            this.fecharConexao();
        }
    }

    public ArrayList<Usuario> getListaUsuarioDAO() {
        ArrayList<Usuario> listaUsuario = new ArrayList();
        Usuario usuario = new Usuario();

        try {

            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "TBL_USUARIO.CODUSUARIO,"
                    + "TBL_USUARIO.LOGIN, "
                    + "TBL_FUNCIONARIO.NOME,"
                    + "TBL_PERFILUSUARIO.NOME"
                    + " FROM"
                    + " TBL_USUARIO"
                    + " INNER JOIN TBL_FUNCIONARIO"
                    + " ON TBL_FUNCIONARIO.CODFUNCIONARIO = TBL_USUARIO.CODFUNCIONARIO"
                    + " INNER JOIN TBL_PERFILUSUARIO"
                    + " ON TBL_PERFILUSUARIO.CODPERFIL = TBL_USUARIO.CODPERFIL"
                    + ";"
            );

            while (this.getResultSet().next()) {
                usuario = new Usuario();
                usuario.setCodigo(this.getResultSet().getInt(1));
                usuario.setLogin(this.getResultSet().getString(2));
                usuario.setNomeRazaoSocial(this.getResultSet().getString(3));
                usuario.setNomePerfil(this.getResultSet().getString(4));
                listaUsuario.add(usuario);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaUsuario;
    }

    public boolean atualizarUsuarioDAO(Usuario usuario) {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                    "UPDATE TBL_USUARIO SET "
                    + "SENHA = '" + usuario.getSenha()+ "',"
                    + "CODPERFIL = '" + usuario.getCodigoPerfil()+ "'"
                    + "WHERE "
                    + "CODUSUARIO = '" + usuario.getCodigo() + "'"
                    + ";"
            );
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean excluirUsuarioDAO(int codigo) {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                    "DELETE FROM TBL_USUARIO "
                    + "WHERE CODUSUARIO = '" + codigo + "'"
                    + ";"
            );
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}
