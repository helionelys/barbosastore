package model;

public class Funcoes {

    private String acaoForm = ""; 
    
    public Funcoes() {       
    }
    public Funcoes(String acaoForm) {
        this.acaoForm = acaoForm;
    }
   
    public String getAcaoForm() {
        return acaoForm;
    }    
    public void setAcaoForm(String acaoForm) {
        this.acaoForm = acaoForm;
    }

    @Override
    public String toString() {
        return "Funcoes{" + "acaoForm=" + acaoForm + '}';
    }
    
}
