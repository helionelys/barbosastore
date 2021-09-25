package br.com.barbosasys.utilitarios;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilDatas {
        /**
     * Converte data tipo date para o formato americano yyyy/MM/dd também tipo date
     * Date para Date
     * @param data
     * @return
     * @throws Exception 
     */
     public java.sql.Date TransformaDataParaFormatoAmericanoS(Date data) throws Exception {   
        SimpleDateFormat formatarDate = new SimpleDateFormat("yyyy/MM/dd");
        String dataString = formatarDate.format(data);
         if (data == null || data.equals(""))  
            return null;  
          
        java.sql.Date date = null;  
        try {  
            DateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");  
            date = new java.sql.Date( ((java.util.Date)formatter.parse(dataString)).getTime() );  
        } catch (ParseException e) {              
            throw e;  
        }  
        return date;  
    }
     
    public java.sql.Date TransformaDataParaFormatoBR(Date data) throws Exception {   
        SimpleDateFormat formatarDate = new SimpleDateFormat("dd/MM/yyyy");
        String dataString = formatarDate.format(data);
         if (data == null || data.equals(""))  
            return null;  
          
        java.sql.Date date = null;  
        try {  
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
            date = new java.sql.Date( ((java.util.Date)formatter.parse(dataString)).getTime() );  
        } catch (ParseException e) {              
            throw e;  
        }  
        return date;  
    } 
}
