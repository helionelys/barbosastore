package br.com.barbosasys.dao;

import br.com.barbosasys.jdbc.ConexaoBanco;
import java.awt.Desktop;
import java.io.File;
import java.io.InputStream;
import java.sql.Date;
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
                    + " WHERE TBL_VENDA.CODSTATUSVENDA = '1' AND TBL_VENDA.CODCLIENTE = '" + codigo + "'"
                    + "ORDER BY TBL_VENDA.DATAVENDA DESC;");
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

    public boolean gerarRelatorioVendasGeralPorData(Date dataInicio, Date dataFim) {
        // Query usada no relatório de lista de vendas num intervalo datas 
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
                    + " WHERE TBL_VENDA.CODSTATUSVENDA = '1' AND TBL_VENDA.DATAVENDA BETWEEN '" + dataInicio + "' AND '" + dataFim + "'"
                    + " ORDER BY TBL_VENDA.DATAVENDA, TBL_VENDA.CODVENDA ASC;");
            JRResultSetDataSource jResultSDS = new JRResultSetDataSource(getResultSet());
            InputStream diretorioDoRelatorio = this.getClass().getClassLoader().getResourceAsStream("br/com/barbosasys/filereports/RelatorioVendaGeralPorData.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(diretorioDoRelatorio, new HashMap(), jResultSDS);

            String fileName = "C://BarbosaStore//Relatorios/RelatorioVendasGeralPorData.pdf";
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

    public boolean gerarRelatorioContasAPagarGeral() {
        // Query usada no relatório de lista de PRODUTOS 
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "date_format(TBL_LANCAMENTO.DATAVENCIMENTO, '%d/%m/%Y') AS VENCIMENTO,"
                    + "TBL_LANCAMENTO.CODLANCAMENTO AS LANCAMENTO,"
                    + "TBL_LANCAMENTO.DESCRICAO,"
                    + "TBL_LANCAMENTO.CODFORNECEDOR,"
                    + "TBL_FORNECEDOR.NOME_RAZAOSOCIAL AS FORNECEDOR,"
                    + "date_format(TBL_LANCAMENTO.DATALANCAMENTO, '%d/%m/%Y') AS INCLUSAO,"
                    + "TBL_LANCAMENTO.VALOR,"
                    + "TBL_STATUSLANCAMENTO.DESCRICAO AS STATUS"
                    + " FROM"
                    + " TBL_LANCAMENTO"
                    + " INNER JOIN TBL_FORNECEDOR"
                    + " ON TBL_LANCAMENTO.CODFORNECEDOR = TBL_FORNECEDOR.CODFORNECEDOR"
                    + " INNER JOIN TBL_STATUSLANCAMENTO"
                    + " ON TBL_LANCAMENTO.CODSTATUSLANCAMENTO = TBL_STATUSLANCAMENTO.CODSTATUSLANCAMENTO"
                    + " WHERE TBL_LANCAMENTO.CODTIPOLANCAMENTO = 2 AND TBL_STATUSLANCAMENTO.CODSTATUSLANCAMENTO = 2"
                    + " ORDER BY TBL_LANCAMENTO.CODLANCAMENTO DESC;");
            JRResultSetDataSource jResultSDS = new JRResultSetDataSource(getResultSet());
            InputStream diretorioDoRelatorio = this.getClass().getClassLoader().getResourceAsStream("br/com/barbosasys/filereports/RelatorioContasAPagarGeral.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(diretorioDoRelatorio, new HashMap(), jResultSDS);

            String fileName = "C://BarbosaStore//Relatorios/RelatorioContasAPagarGeral.pdf";
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

    public boolean gerarRelatorioContasAPagarPorFornecedor(int codigo) {
        // Query usada no relatório de lista de PRODUTOS 
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "date_format(TBL_LANCAMENTO.DATAVENCIMENTO, '%d/%m/%Y') AS VENCIMENTO,"
                    + "TBL_LANCAMENTO.CODLANCAMENTO AS LANCAMENTO,"
                    + "TBL_LANCAMENTO.DESCRICAO,"
                    + "TBL_LANCAMENTO.CODFORNECEDOR,"
                    + "TBL_FORNECEDOR.NOME_RAZAOSOCIAL AS FORNECEDOR,"
                    + "date_format(TBL_LANCAMENTO.DATALANCAMENTO, '%d/%m/%Y') AS INCLUSAO,"
                    + "TBL_LANCAMENTO.VALOR,"
                    + "TBL_STATUSLANCAMENTO.DESCRICAO AS STATUS"
                    + " FROM"
                    + " TBL_LANCAMENTO"
                    + " INNER JOIN TBL_FORNECEDOR"
                    + " ON TBL_LANCAMENTO.CODFORNECEDOR = TBL_FORNECEDOR.CODFORNECEDOR"
                    + " INNER JOIN TBL_STATUSLANCAMENTO"
                    + " ON TBL_LANCAMENTO.CODSTATUSLANCAMENTO = TBL_STATUSLANCAMENTO.CODSTATUSLANCAMENTO"
                    + " WHERE TBL_LANCAMENTO.CODTIPOLANCAMENTO = 2 AND TBL_STATUSLANCAMENTO.CODSTATUSLANCAMENTO = 2"
                    + " AND TBL_LANCAMENTO.CODFORNECEDOR = '"+codigo+"'"        
                    + " ORDER BY TBL_LANCAMENTO.CODLANCAMENTO DESC;");
            JRResultSetDataSource jResultSDS = new JRResultSetDataSource(getResultSet());
            InputStream diretorioDoRelatorio = this.getClass().getClassLoader().getResourceAsStream("br/com/barbosasys/filereports/RelatorioContasAPagarPorFornecedor.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(diretorioDoRelatorio, new HashMap(), jResultSDS);

            String fileName = "C://BarbosaStore//Relatorios/RelatorioContasAPagarPorFornecedor.pdf";
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

    public boolean gerarRelatorioContasAPagarPorData(Date dataInicio, Date dataFim) {
        // Query usada no relatório de lista de vendas num intervalo datas 
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "date_format(TBL_LANCAMENTO.DATAVENCIMENTO, '%d/%m/%Y') AS VENCIMENTO,"
                    + "TBL_LANCAMENTO.CODLANCAMENTO AS LANCAMENTO,"
                    + "TBL_LANCAMENTO.DESCRICAO,"
                    + "TBL_LANCAMENTO.CODFORNECEDOR,"
                    + "TBL_FORNECEDOR.NOME_RAZAOSOCIAL AS FORNECEDOR,"
                    + "date_format(TBL_LANCAMENTO.DATALANCAMENTO, '%d/%m/%Y') AS INCLUSAO,"
                    + "TBL_LANCAMENTO.VALOR,"
                    + "TBL_STATUSLANCAMENTO.DESCRICAO AS STATUS"
                    + " FROM"
                    + " TBL_LANCAMENTO"
                    + " INNER JOIN TBL_FORNECEDOR"
                    + " ON TBL_LANCAMENTO.CODFORNECEDOR = TBL_FORNECEDOR.CODFORNECEDOR"
                    + " INNER JOIN TBL_STATUSLANCAMENTO"
                    + " ON TBL_LANCAMENTO.CODSTATUSLANCAMENTO = TBL_STATUSLANCAMENTO.CODSTATUSLANCAMENTO"
                    + " WHERE TBL_LANCAMENTO.CODTIPOLANCAMENTO = 2 AND TBL_STATUSLANCAMENTO.CODSTATUSLANCAMENTO = 2"
                    + " AND TBL_LANCAMENTO.DATAVENCIMENTO BETWEEN '" + dataInicio + "' AND '" + dataFim + "'"
                    + " ORDER BY TBL_LANCAMENTO.CODLANCAMENTO DESC;");
            JRResultSetDataSource jResultSDS = new JRResultSetDataSource(getResultSet());
            InputStream diretorioDoRelatorio = this.getClass().getClassLoader().getResourceAsStream("br/com/barbosasys/filereports/RelatorioContasAPagarGeralPorData.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(diretorioDoRelatorio, new HashMap(), jResultSDS);

            String fileName = "C://BarbosaStore//Relatorios/RelatorioContasAPagarPorData.pdf";
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
    
    public boolean gerarRelatorioContasAReceberGeral() {
        // Query usada no relatório de lista de PRODUTOS 
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "date_format(TBL_LANCAMENTO.DATAVENCIMENTO, '%d/%m/%Y') AS VENCIMENTO,"
                    + "TBL_LANCAMENTO.CODLANCAMENTO AS LANCAMENTO,"
                    + "TBL_LANCAMENTO.DESCRICAO,"
                    + "TBL_LANCAMENTO.CODCLIENTE,"
                    + "TBL_CLIENTE.NOME_RAZAOSOCIAL AS CLIENTE,"
                    + "date_format(TBL_LANCAMENTO.DATALANCAMENTO, '%d/%m/%Y') AS INCLUSAO,"
                    + "TBL_LANCAMENTO.VALOR,"
                    + "TBL_STATUSLANCAMENTO.DESCRICAO AS STATUS"
                    + " FROM"
                    + " TBL_LANCAMENTO"
                    + " INNER JOIN TBL_CLIENTE"
                    + " ON TBL_LANCAMENTO.CODCLIENTE = TBL_CLIENTE.CODCLIENTE"
                    + " INNER JOIN TBL_STATUSLANCAMENTO"
                    + " ON TBL_LANCAMENTO.CODSTATUSLANCAMENTO = TBL_STATUSLANCAMENTO.CODSTATUSLANCAMENTO"
                    + " WHERE TBL_LANCAMENTO.CODTIPOLANCAMENTO = 1 AND TBL_STATUSLANCAMENTO.CODSTATUSLANCAMENTO = 2"
                    + " ORDER BY TBL_LANCAMENTO.CODLANCAMENTO DESC;");
            JRResultSetDataSource jResultSDS = new JRResultSetDataSource(getResultSet());
            InputStream diretorioDoRelatorio = this.getClass().getClassLoader().getResourceAsStream("br/com/barbosasys/filereports/RelatorioContasAReceberGeral.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(diretorioDoRelatorio, new HashMap(), jResultSDS);

            String fileName = "C://BarbosaStore//Relatorios/RelatorioContasAReceberGeral.pdf";
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

    public boolean gerarRelatorioContasAReceberPorCliente(int codigo) {
        // Query usada no relatório de lista de PRODUTOS 
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "date_format(TBL_LANCAMENTO.DATAVENCIMENTO, '%d/%m/%Y') AS VENCIMENTO,"
                    + "TBL_LANCAMENTO.CODLANCAMENTO AS LANCAMENTO,"
                    + "TBL_LANCAMENTO.DESCRICAO,"
                    + "TBL_LANCAMENTO.CODCLIENTE,"
                    + "TBL_CLIENTE.NOME_RAZAOSOCIAL AS CLIENTE,"
                    + "date_format(TBL_LANCAMENTO.DATALANCAMENTO, '%d/%m/%Y') AS INCLUSAO,"
                    + "TBL_LANCAMENTO.VALOR,"
                    + "TBL_STATUSLANCAMENTO.DESCRICAO AS STATUS"
                    + " FROM"
                    + " TBL_LANCAMENTO"
                    + " INNER JOIN TBL_CLIENTE"
                    + " ON TBL_LANCAMENTO.CODCLIENTE = TBL_CLIENTE.CODCLIENTE"
                    + " INNER JOIN TBL_STATUSLANCAMENTO"
                    + " ON TBL_LANCAMENTO.CODSTATUSLANCAMENTO = TBL_STATUSLANCAMENTO.CODSTATUSLANCAMENTO"
                    + " WHERE TBL_LANCAMENTO.CODTIPOLANCAMENTO = 1 AND TBL_STATUSLANCAMENTO.CODSTATUSLANCAMENTO = 2"
                    + " AND TBL_LANCAMENTO.CODCLIENTE = '"+codigo+"'"        
                    + " ORDER BY TBL_LANCAMENTO.CODLANCAMENTO DESC;");
            JRResultSetDataSource jResultSDS = new JRResultSetDataSource(getResultSet());
            InputStream diretorioDoRelatorio = this.getClass().getClassLoader().getResourceAsStream("br/com/barbosasys/filereports/RelatorioContasAReceberPorCliente.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(diretorioDoRelatorio, new HashMap(), jResultSDS);

            String fileName = "C://BarbosaStore//Relatorios/RelatorioContasAReceberPorCliente.pdf";
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

    public boolean gerarRelatorioContasAReceberPorData(Date dataInicio, Date dataFim) {
        // Query usada no relatório de lista de vendas num intervalo datas 
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "date_format(TBL_LANCAMENTO.DATAVENCIMENTO, '%d/%m/%Y') AS VENCIMENTO,"
                    + "TBL_LANCAMENTO.CODLANCAMENTO AS LANCAMENTO,"
                    + "TBL_LANCAMENTO.DESCRICAO,"
                    + "TBL_LANCAMENTO.CODCLIENTE,"
                    + "TBL_CLIENTE.NOME_RAZAOSOCIAL AS CLIENTE,"
                    + "date_format(TBL_LANCAMENTO.DATALANCAMENTO, '%d/%m/%Y') AS INCLUSAO,"
                    + "TBL_LANCAMENTO.VALOR,"
                    + "TBL_STATUSLANCAMENTO.DESCRICAO AS STATUS"
                    + " FROM"
                    + " TBL_LANCAMENTO"
                    + " INNER JOIN TBL_CLIENTE"
                    + " ON TBL_LANCAMENTO.CODCLIENTE = TBL_CLIENTE.CODCLIENTE"
                    + " INNER JOIN TBL_STATUSLANCAMENTO"
                    + " ON TBL_LANCAMENTO.CODSTATUSLANCAMENTO = TBL_STATUSLANCAMENTO.CODSTATUSLANCAMENTO"
                    + " WHERE TBL_LANCAMENTO.CODTIPOLANCAMENTO = 1 AND TBL_STATUSLANCAMENTO.CODSTATUSLANCAMENTO = 2"
                    + " AND TBL_LANCAMENTO.DATAVENCIMENTO BETWEEN '" + dataInicio + "' AND '" + dataFim + "'"
                    + " ORDER BY TBL_LANCAMENTO.CODLANCAMENTO DESC;");
            JRResultSetDataSource jResultSDS = new JRResultSetDataSource(getResultSet());
            InputStream diretorioDoRelatorio = this.getClass().getClassLoader().getResourceAsStream("br/com/barbosasys/filereports/RelatorioContasAReceberGeralPorData.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(diretorioDoRelatorio, new HashMap(), jResultSDS);

            String fileName = "C://BarbosaStore//Relatorios/RelatorioContasAReceberGeralPorData.pdf";
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
