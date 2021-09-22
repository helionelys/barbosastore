package br.com.barbosasys.model;

public class Cliente extends Pessoa {

    private String dataCadastramento;

    public String getDataCadastramento() {
        return dataCadastramento;
    }

    public void setDataCadastramento(String dataCadastramento) {
        this.dataCadastramento = dataCadastramento;
    }
   
    
    
  @Override
  public String toString(){
      return this.getNomeRazaoSocial() + this.getCpfCnpj() + this.getCodigo()
              + this.getCelular();
  }
  
//  @Override
//  public int toInt(){
//      return this.getCodigo();
//  }
//    
}
