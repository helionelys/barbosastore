/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.barbosasys.dao;

import br.com.barbosasys.jdbc.ConexaoBanco;
import br.com.barbosasys.model.PerfilUsuario;
import java.util.ArrayList;

/**
 *
 * @author hbarbosa
 */
public class PerfilUsuarioDAO extends ConexaoBanco {

    // Recupera usuario através do codigo
    public ArrayList<PerfilUsuario> getListaPerfilUsuarioDAO() {
        ArrayList<PerfilUsuario> listaPerfilUsuario = new ArrayList();
        PerfilUsuario perfilUsuario = new PerfilUsuario();

        try {

            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "CODPERFIL,"
                    + "NOME"
                    + " FROM"
                    + " TBL_PERFILUSUARIO"
                    + ";"
            );

            while (this.getResultSet().next()) {
                perfilUsuario = new PerfilUsuario();
                perfilUsuario.setCodPerfil(this.getResultSet().getInt(1));
                perfilUsuario.setNome(this.getResultSet().getString(2));
                listaPerfilUsuario.add(perfilUsuario);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaPerfilUsuario;
    }
        }
