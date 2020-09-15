/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.barbosasys.dao;

import br.com.barbosasys.jdbc.ConexaoBanco;
import br.com.barbosasys.model.Funcionario;
import java.util.ArrayList;

/**
 *
 * @author hbarbosa
 */
public class FuncionarioDAO extends ConexaoBanco {

    // Inserir funcionario dentro banco de dados
    public int salvarFuncionarioDAO(Funcionario funcionario) {
        try {
            this.conectar();
                return this.insertSQL(
                    "INSERT INTO TBL_FUNCIONARIO ("
                    + "NOME,"
                    + "DATANASCIMENTO,"
                    + "SEXO,"
                    + "CPF,"
                    + "RG,"
                    + "RGORGEXPEDIDOR,"
                    + "NOMEMAE,"
                    + "NOMEPAI,"
                    + "ESCOLARIDADE,"
                    + "ESTADOCIVIL,"
                    + "SALARIO,"
                    + "FUNCAO,"
                    + "DEPARTAMENTO,"
                    + "CEP,"
                    + "CIDADE,"
                    + "UF,"
                    + "LOGRADOURO,"
                    + "NUMERO,"
                    + "BAIRRO,"
                    + "COMPLEMENTO,"
                    + "CELULAR,"
                    + "EMAIL"
                    + ") VALUES ("
                    + "'" + funcionario.getNomeRazaoSocial()+ "',"
                    + "'" + funcionario.getDataNascimento() + "',"
                    + "'" + funcionario.getSexo()+ "',"
                    + "'" + funcionario.getCpfCnpj() + "',"
                    + "'" + funcionario.getRgInscricaoEstadual() + "',"
                    + "'" + funcionario.getRgOrgaoExpedidor() + "',"
                    + "'" + funcionario.getNomeMae()+ "',"
                    + "'" + funcionario.getNomePai()+ "',"
                    + "'" + funcionario.getEscolaridade()+ "',"
                    + "'" + funcionario.getEstadoCivil()+ "',"
                    + "'" + funcionario.getSalario()+ "',"
                    + "'" + funcionario.getFuncao()+ "',"
                    + "'" + funcionario.getDepartamento()+ "',"
                    + "'" + funcionario.getCep() + "',"
                    + "'" + funcionario.getCidade() + "',"
                    + "'" + funcionario.getUf() + "',"
                    + "'" + funcionario.getLogradouro() + "',"
                    + "'" + funcionario.getNumero() + "',"
                    + "'" + funcionario.getBairro() + "',"
                    + "'" + funcionario.getComplemento() + "',"
                    + "'" + funcionario.getCelular() + "',"
                    + "'" + funcionario.getEmail() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    // Recupera funcionario através do codigo
    public Funcionario getFuncionarioDAO(int codigo) {
        Funcionario funcionario = new Funcionario();

        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "CODFUNCIONARIO," //1
                    + "NOME," //2
                    + "DATANASCIMENTO," //3
                    + "SEXO," //4
                    + "CPF," //5
                    + "RG," //6 
                    + "RGORGEXPEDIDOR," //7
                    + "NOMEMAE," //8
                    + "NOMEPAI," //9
                    + "ESCOLARIDADE," //10
                    + "ESTADOCIVIL," //11
                    + "SALARIO," //12
                    + "FUNCAO," //13
                    + "DEPARTAMENTO," //14
                    + "CEP," //15
                    + "CIDADE," //16
                    + "UF," //17
                    + "LOGRADOURO," //18
                    + "NUMERO," //19
                    + "BAIRRO," //20
                    + "COMPLEMENTO," //21
                    + "CELULAR," //22
                    + "EMAIL" //23
                    + " FROM"
                    + " TBL_FUNCIONARIO"
                    + " WHERE"
                    + " CODFUNCIONARIO = '" + codigo + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                                
                funcionario.setCodigo(this.getResultSet().getInt(1));
                funcionario.setNomeRazaoSocial(this.getResultSet().getString(2));
                funcionario.setDataNascimento(this.getResultSet().getString(3));
                funcionario.setSexo(this.getResultSet().getString(4));
                funcionario.setCpfCnpj(this.getResultSet().getString(5));
                funcionario.setRgInscricaoEstadual(this.getResultSet().getString(6));
                funcionario.setRgOrgaoExpedidor(this.getResultSet().getString(7));
                funcionario.setNomeMae(this.getResultSet().getString(8));
                funcionario.setNomePai(this.getResultSet().getString(9));
                funcionario.setEscolaridade(this.getResultSet().getString(10));
                funcionario.setEstadoCivil(this.getResultSet().getString(11));
                funcionario.setSalario(Double.parseDouble(this.getResultSet().getString(12)));
                funcionario.setFuncao(this.getResultSet().getString(13));
                funcionario.setDepartamento(this.getResultSet().getString(14));
                funcionario.setCep(this.getResultSet().getString(15));
                funcionario.setCidade(this.getResultSet().getString(16));
                funcionario.setUf(this.getResultSet().getString(17));
                funcionario.setLogradouro(this.getResultSet().getString(18));
                funcionario.setNumero(this.getResultSet().getString(19));
                funcionario.setBairro(this.getResultSet().getString(20));
                funcionario.setComplemento(this.getResultSet().getString(21));
                funcionario.setCelular(this.getResultSet().getString(22));
                funcionario.setEmail(this.getResultSet().getString(23));
                

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return funcionario;
    }

    public Funcionario getFuncionarioDAO(String nome) {
        Funcionario funcionario = new Funcionario();
        try {
            this.conectar();
            this.executarSQL(
                   "SELECT "
                    + "CODFUNCIONARIO,"
                    + "NOME,"
                    + "DATANASCIMENTO,"
                    + "SEXO,"
                    + "CPF,"
                    + "RG,"
                    + "RGORGOEXPEDIDOR,"
                    + "NOMEMAE,"
                    + "NOMEPAI,"
                    + "ESCOLARIDADE,"
                    + "ESTADOCIVIL,"
                    + "SALARIO,"
                    + "FUNCAO,"
                    + "DEPARTAMENTO,"
                    + "CEP,"
                    + "CIDADE,"
                    + "UF,"
                    + "LOGRADOURO,"
                    + "NUMERO,"
                    + "BAIRRO,"
                    + "COMPLEMENTO,"
                    + "CELULAR,"
                    + "EMAIL"
                    + " FROM"
                    + " TBL_FUNCIONARIO"
                    + " WHERE"
                    + " NOME = '" + nome + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                                
                funcionario.setCodigo(this.getResultSet().getInt(1));
                funcionario.setNomeRazaoSocial(this.getResultSet().getString(2));
                funcionario.setDataNascimento(this.getResultSet().getString(3));
                funcionario.setSexo(this.getResultSet().getString(4));
                funcionario.setCpfCnpj(this.getResultSet().getString(6));
                funcionario.setRgInscricaoEstadual(this.getResultSet().getString(7));
                funcionario.setRgOrgaoExpedidor(this.getResultSet().getString(8));
                funcionario.setNomeMae(this.getResultSet().getString(9));
                funcionario.setNomePai(this.getResultSet().getString(10));
                funcionario.setEscolaridade(this.getResultSet().getString(11));
                funcionario.setEstadoCivil(this.getResultSet().getString(12));
                funcionario.setSalario(Double.parseDouble(this.getResultSet().getString(13)));
                funcionario.setFuncao(this.getResultSet().getString(14));
                funcionario.setDepartamento(this.getResultSet().getString(15));
                funcionario.setCep(this.getResultSet().getString(16));
                funcionario.setCidade(this.getResultSet().getString(17));
                funcionario.setUf(this.getResultSet().getString(18));
                funcionario.setLogradouro(this.getResultSet().getString(19));
                funcionario.setNumero(this.getResultSet().getString(20));
                funcionario.setBairro(this.getResultSet().getString(21));
                funcionario.setComplemento(this.getResultSet().getString(22));
                funcionario.setCelular(this.getResultSet().getString(23));
                funcionario.setTelefone(this.getResultSet().getString(24));
                funcionario.setEmail(this.getResultSet().getString(25));

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return funcionario;
    }

//    public ArrayList<Funcionario> getListaTodosFuncionarioDAO() {
//        ArrayList<Funcionario> listaFuncionario = new ArrayList();
//        Funcionario funcionario = new Funcionario();
//
//        try {
//
//            this.conectar();
//            this.executarSQL(
//                    "SELECT "
//                    + "CODCLIENTE,"
//                    + "TIPOCLIENTE,"
//                    + "DATANASCIMENTO,"
//                    + "NOME_RAZAOSOCIAL,"
//                    + "APELIDO_NOMEFANTASIA,"
//                    + "CPF_CNPJ,"
//                    + "RG_INSCRICAOESTADUAL,"
//                    + "CEP,"
//                    + "CIDADE,"
//                    + "UF,"
//                    + "LOGRADOURO,"
//                    + "NUMERO,"
//                    + "BAIRRO,"
//                    + "COMPLEMENTO,"
//                    + "CELULAR,"
//                    + "TELEFONE,"
//                    + "EMAIL,"
//                    + "DATACADASTRAMENTO"
//                    + " FROM"
//                    + " TBL_CLIENTE"
//                    + ";"
//            );
//
//            while (this.getResultSet().next()) {
//                Endereco end = new Endereco();
//                Contato cont = new Contato();
//                                
//                funcionario.setCodigo(this.getResultSet().getInt(1));
//                funcionario.setPessoaTipo(this.getResultSet().getInt(2));
//                funcionario.setDataNascimento(this.getResultSet().getString(3));
//                funcionario.setNomeRazaoSocial(this.getResultSet().getString(4));
//                funcionario.setApelidoNomeFantasia(this.getResultSet().getString(5));
//                funcionario.setCpfCnpj(this.getResultSet().getString(6));
//                
//                funcionario.setCep(this.getResultSet().getString(7));
//                funcionario.setCidade(this.getResultSet().getString(8));
//                funcionario.setUf(this.getResultSet().getString(9));
//                funcionario.setLogradouro(this.getResultSet().getString(10));
//                funcionario.setNumero(this.getResultSet().getString(11));
//                funcionario.setBairro(this.getResultSet().getString(12));
//                funcionario.setComplemento(this.getResultSet().getString(13));
//                
//                funcionario.setCelular(this.getResultSet().getString(14));
//                funcionario.setTelefone(this.getResultSet().getString(15));
//                funcionario.setEmail(this.getResultSet().getString(16));
//                
//                funcionario.setDataCadastramento(this.getResultSet().getString(17));
//
//                listaFuncionario.add(funcionario);
//
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            this.fecharConexao();
//        }
//        return listaFuncionario;
//    }
    
    public ArrayList<Funcionario> getListaFuncionarioDAO() {
        ArrayList<Funcionario> listaFuncionario = new ArrayList();
        Funcionario funcionario = new Funcionario();

        try {

            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "CODFUNCIONARIO,"
                    + "NOME,"
                    + "CPF,"
                    + "NOMEMAE,"
                    + "EMAIL"
                    + " FROM"
                    + " TBL_FUNCIONARIO"
                    + ";"
            );

            while (this.getResultSet().next()) {
                funcionario = new Funcionario();                                
                funcionario.setCodigo(this.getResultSet().getInt(1));
                funcionario.setNomeRazaoSocial(this.getResultSet().getString(2));
                funcionario.setCpfCnpj(this.getResultSet().getString(3));
                funcionario.setNomeMae(this.getResultSet().getString(4));
                funcionario.setEmail(this.getResultSet().getString(5));
  
                listaFuncionario.add(funcionario);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaFuncionario;
    }

    public boolean atualizarFuncionarioDAO(Funcionario funcionario) {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                    "UPDATE TBL_FUNCIONARIO SET "
                    + "NOME = '" + funcionario.getNomeRazaoSocial() + "',"
                    + "DATANASCIMENTO = '" + funcionario.getDataNascimento() + "',"
                    + "SEXO = '" + funcionario.getSexo() + "',"
                    + "CPF = '" + funcionario.getCpfCnpj() + "',"
                    + "RG = '" + funcionario.getRgInscricaoEstadual() + "',"
                    + "RGORGEXPEDIDOR = '" + funcionario.getRgOrgaoExpedidor() + "',"
                    + "NOMEMAE = '" + funcionario.getNomeMae() + "',"
                    + "NOMEPAI = '" + funcionario.getNomePai() + "',"
                    + "ESCOLARIDADE = '" + funcionario.getEscolaridade() + "',"
                    + "ESTADOCIVIL = '" + funcionario.getEstadoCivil() + "',"
                    + "SALARIO = '" + funcionario.getSalario() + "',"
                    + "FUNCAO = '" + funcionario.getFuncao() + "',"
                    + "DEPARTAMENTO = '" + funcionario.getDepartamento() + "',"
                    + "CEP = '" + funcionario.getCep()+ "',"
                    + "CIDADE = '" + funcionario.getCidade() + "',"
                    + "UF = '" + funcionario.getUf() + "',"
                    + "LOGRADOURO = '" + funcionario.getLogradouro() + "',"
                    + "NUMERO = '" + funcionario.getNumero() + "',"
                    + "BAIRRO = '" + funcionario.getBairro() + "',"
                    + "COMPLEMENTO = '" + funcionario.getComplemento() + "',"
                    + "CELULAR = '" + funcionario.getCelular() + "',"
                    + "EMAIL = '" + funcionario.getEmail() + "'"
                    + "WHERE "
                        + "CODFUNCIONARIO = '" + funcionario.getCodigo() + "'"
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

    public boolean excluirFuncionarioDAO(int codigo) {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                    "DELETE FROM TBL_FUNCIONARIO "
                    + "WHERE CODFUNCIONARIO = '" + codigo + "'"
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
