/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.barbosasys.dao;

import br.com.barbosasys.jdbc.ConexaoBanco;
import br.com.barbosasys.model.DadosEmpresa;
import br.com.barbosasys.model.Fornecedor;

/**
 *
 * @author hbarbosa
 */
public class DadosEmpresaDAO extends ConexaoBanco {

       // Recupera fornecedor através do codigo
    public DadosEmpresa getDadosEmpresaDAO(int codigo) {
        DadosEmpresa dadosEmpresa = new DadosEmpresa();

        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "CODEMPRESA,"
                    + "NOMEFANTASIA,"
                    + "RAZAOSOCIAL,"
                    + "CNPJ,"
                    + "INSCRICAOESTADUAL,"
                    + "TELEFONE,"
                    + "EMAIL,"
                    + "IMAGEM"
                    + " FROM"
                    + " TBL_DADOSEMPRESA"
                    + " WHERE"
                    + " CODEMPRESA = '" + codigo + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                                
                dadosEmpresa.setCodigo(this.getResultSet().getInt(1));
                dadosEmpresa.setApelidoNomeFantasia(this.getResultSet().getString(2));
                dadosEmpresa.setNomeRazaoSocial(this.getResultSet().getString(3));
                dadosEmpresa.setCpfCnpj(this.getResultSet().getString(4));
                dadosEmpresa.setRgInscricaoEstadual(this.getResultSet().getString(5));
                dadosEmpresa.setTelefone(this.getResultSet().getString(6));
                dadosEmpresa.setEmail(this.getResultSet().getString(7));
                dadosEmpresa.setImagemEndereco(this.getResultSet().getString(8));
                

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return dadosEmpresa;
    }

    public boolean atualizarDadosEmpresaDAO(DadosEmpresa dadosEmpresa) {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                    "UPDATE TBL_DADOSEMPRESA SET "
                    + "NOMEFANTASIA = '" + dadosEmpresa.getApelidoNomeFantasia() + "',"        
                    + "RAZAOSOCIAL = '" + dadosEmpresa.getNomeRazaoSocial() + "',"
                    + "CNPJ = '" + dadosEmpresa.getCpfCnpj() + "',"
                    + "INSCRICAOESTADUAL = '" + dadosEmpresa.getRgInscricaoEstadual()+ "',"
                    + "TELEFONE = '" + dadosEmpresa.getTelefone() + "',"
                    + "EMAIL = '" + dadosEmpresa.getEmail() + "'"
//                    + "EMAIL = '" + dadosEmpresa.getEmail() + "',"
//                    + "IMAGEM = " + dadosEmpresa.getImagemEndereco() + "'"
                    + "WHERE "
                    + "CODEMPRESA = '" + dadosEmpresa.getCodigo() + "'"
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
