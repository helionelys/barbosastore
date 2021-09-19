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
}
