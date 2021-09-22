package br.com.barbosasys.dao;

import br.com.barbosasys.jdbc.ConexaoBanco;
import java.awt.Desktop;
import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

public class RelatoriosDAO extends ConexaoBanco {

    public boolean gerarRelatorioCliente() {
        // Query usada no relatório de lista de clientes 
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + " CODCLIENTE,"
                    + " NOME_RAZAOSOCIAL,"
                    + " CPF_CNPJ,"
                    + " CIDADE,"
                    + " UF,"
                    + " TELEFONE"
                    + " FROM TBL_CLIENTE");
            JRResultSetDataSource jResultSDS = new JRResultSetDataSource(getResultSet());
            InputStream diretorioDoRelatorio = this.getClass().getClassLoader().getResourceAsStream("br/com/barbosasys/filereports/RelatorioClientes.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(diretorioDoRelatorio, new HashMap(), jResultSDS);

            String fileName = "C://BarbosaStore//Relatorios/RelatorioCliente.pdf";
            JasperExportManager.exportReportToPdfFile(jasperPrint, fileName);
            File arquivo = new File(fileName);
            try {
                Desktop.getDesktop().open(arquivo);
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
            }
            arquivo.deleteOnExit();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public boolean gerarRelatorioProduto() {
        // Query usada no relatório de lista de PRODUTOS 
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + " TBL_PRODUTO.`CODPRODUTO`,"
                    + " TBL_PRODUTO.`DESCRICAO`,"
                    + " TBL_PRODUTO.`FABRICANTE`,"
                    + " TBL_PRODUTO.`VALORCOMPRA`,"
                    + " TBL_UNIDADEMEDIDA.`DESCRICAO` AS UND"
                    + " FROM `TBL_PRODUTO`"
                    + " TBL_PRODUTO INNER JOIN `TBL_UNIDADEMEDIDA` TBL_UNIDADEMEDIDA ON TBL_PRODUTO.`CODUNIDADEMEDIDA` = TBL_UNIDADEMEDIDA.`CODUNIDADE`");
            JRResultSetDataSource jResultSDS = new JRResultSetDataSource(getResultSet());
            InputStream diretorioDoRelatorio = this.getClass().getClassLoader().getResourceAsStream("br/com/barbosasys/filereports/RelatorioProdutos.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(diretorioDoRelatorio, new HashMap(), jResultSDS);

            String fileName = "C://BarbosaStore//Relatorios/RelatorioProduto.pdf";
            JasperExportManager.exportReportToPdfFile(jasperPrint, fileName);
            File arquivo = new File(fileName);
            try {
                Desktop.getDesktop().open(arquivo);
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
            }
            arquivo.deleteOnExit();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public boolean gerarRelatorioProdutoSaldoEstoque() {
        // Query usada no relatório de lista de PRODUTOS 
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + " TBL_PRODUTO.`CODPRODUTO`,"
                    + " TBL_PRODUTO.`DESCRICAO`,"
                    + " TBL_PRODUTO.`VALORCOMPRA`,"
                    + " TBL_UNIDADEMEDIDA.`DESCRICAO` AS UND,"
                    + " TBL_PRODUTO.`QUANTIDADE` AS SALDO,"
                    + " TBL_FORNECEDOR.`NOME_RAZAOSOCIAL` AS FORNECEDOR"
                    + " FROM `TBL_PRODUTO`"
                    + " TBL_PRODUTO INNER JOIN `TBL_UNIDADEMEDIDA` TBL_UNIDADEMEDIDA ON TBL_PRODUTO.`CODUNIDADEMEDIDA` = TBL_UNIDADEMEDIDA.`CODUNIDADE`"
                    + " INNER JOIN TBL_FORNECEDOR\n"
                    + "ON TBL_PRODUTO.CODFORNECEDOR = TBL_FORNECEDOR.CODFORNECEDOR");
            JRResultSetDataSource jResultSDS = new JRResultSetDataSource(getResultSet());
            InputStream diretorioDoRelatorio = this.getClass().getClassLoader().getResourceAsStream("br/com/barbosasys/filereports/RelatorioProdutosSaldo.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(diretorioDoRelatorio, new HashMap(), jResultSDS);

            String fileName = "C://BarbosaStore//Relatorios/RelatorioProdutoSaldoEstoque.pdf";
            JasperExportManager.exportReportToPdfFile(jasperPrint, fileName);
            File arquivo = new File(fileName);
            try {
                Desktop.getDesktop().open(arquivo);
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
            }
            arquivo.deleteOnExit();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public boolean gerarRelatorioVendasGeral() {
        // Query usada no relatório de lista de PRODUTOS 
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + " TBL_VENDA.CODVENDA,"
                    + " TBL_CLIENTE.NOME_RAZAOSOCIAL,"
                    + " TBL_TIPOPAGAMENTO.DESCRICAO AS TIPOPAGAMENTO,"
                    + " TBL_VENDA.DESCONTO, TBL_VENDA.TOTALVENDA,"
                    + " date_format(TBL_VENDA.DATAVENDA, '%d/%m/%Y') AS DATAVENDA,"
                    + " TBL_STATUSVENDA.DESCRICAO"
                    + " FROM TBL_VENDA"
                    + " INNER JOIN TBL_CLIENTE ON TBL_VENDA.CODCLIENTE = TBL_CLIENTE.CODCLIENTE"
                    + " INNER JOIN TBL_STATUSVENDA"
                    + " ON TBL_VENDA.CODSTATUSVENDA = TBL_STATUSVENDA.CODSTATUSVENDA"
                    + " INNER JOIN TBL_TIPOPAGAMENTO"
                    + " ON TBL_VENDA.CODTIPOPAGAMENTO = TBL_TIPOPAGAMENTO.CODTIPOPAGAMENTO"
                    + " WHERE TBL_VENDA.CODSTATUSVENDA = '1' ORDER BY TBL_VENDA.CODVENDA ASC;");
            JRResultSetDataSource jResultSDS = new JRResultSetDataSource(getResultSet());
            InputStream diretorioDoRelatorio = this.getClass().getClassLoader().getResourceAsStream("br/com/barbosasys/filereports/RelatorioVendaGeral.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(diretorioDoRelatorio, new HashMap(), jResultSDS);

            String fileName = "C://BarbosaStore//Relatorios/RelatorioVendasGeral.pdf";
            JasperExportManager.exportReportToPdfFile(jasperPrint, fileName);
            File arquivo = new File(fileName);
            try {
                Desktop.getDesktop().open(arquivo);
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
            }
            arquivo.deleteOnExit();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    public boolean gerarRelatorioVendasPorCliente(int codigo) {
        // Query usada no relatório de lista de PRODUTOS 
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + " TBL_VENDA.CODVENDA,"
                    + " TBL_CLIENTE.NOME_RAZAOSOCIAL,"
                    + " TBL_TIPOPAGAMENTO.DESCRICAO AS TIPOPAGAMENTO,"
                    + " TBL_VENDA.DESCONTO, TBL_VENDA.TOTALVENDA,"
                    + " date_format(TBL_VENDA.DATAVENDA, '%d/%m/%Y') AS DATAVENDA,"
                    + " TBL_STATUSVENDA.DESCRICAO"
                    + " FROM TBL_VENDA"
                    + " INNER JOIN TBL_CLIENTE ON TBL_VENDA.CODCLIENTE = TBL_CLIENTE.CODCLIENTE"
                    + " INNER JOIN TBL_STATUSVENDA"
                    + " ON TBL_VENDA.CODSTATUSVENDA = TBL_STATUSVENDA.CODSTATUSVENDA"
                    + " INNER JOIN TBL_TIPOPAGAMENTO"
                    + " ON TBL_VENDA.CODTIPOPAGAMENTO = TBL_TIPOPAGAMENTO.CODTIPOPAGAMENTO"
                    + " WHERE TBL_VENDA.CODSTATUSVENDA = '1' AND TBL_VENDA.CODCLIENTE = '"+ codigo + "'"
                    + "ORDER BY TBL_VENDA.CODVENDA ASC;");
            JRResultSetDataSource jResultSDS = new JRResultSetDataSource(getResultSet());
            InputStream diretorioDoRelatorio = this.getClass().getClassLoader().getResourceAsStream("br/com/barbosasys/filereports/RelatorioVendaPorClientel.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(diretorioDoRelatorio, new HashMap(), jResultSDS);

            String fileName = "C://BarbosaStore//Relatorios/RelatorioVendasPorCliente.pdf";
            JasperExportManager.exportReportToPdfFile(jasperPrint, fileName);
            File arquivo = new File(fileName);
            try {
                Desktop.getDesktop().open(arquivo);
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
            }
            arquivo.deleteOnExit();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
}
