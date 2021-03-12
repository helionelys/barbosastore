package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "marca_moto")
public class MarcaMoto implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_marcamoto", nullable = false)
    private Integer idMarcaMoto;
    
    @Column(name = "mar_marca", length = 100)
    private String marMarca;
    
    //OneToMany modelo_moto
    @OneToMany(mappedBy = "marcaMoto")
    private List<ModeloMoto>modelosMoto;

    public MarcaMoto() {
        modelosMoto = new ArrayList<ModeloMoto>();
    }

    public MarcaMoto(String marMarca, List<ModeloMoto> modelosMoto) {
        this.marMarca = marMarca;
        this.modelosMoto = modelosMoto;
    }

    public Integer getIdMarcaMoto() {
        return idMarcaMoto;
    }

    public void setIdMarcaMoto(Integer idMarcaMoto) {
        this.idMarcaMoto = idMarcaMoto;
    }

    public String getMarMarca() {
        return marMarca;
    }

    public void setMarMarca(String marMarca) {
        this.marMarca = marMarca;
    }

    public List<ModeloMoto> getModelosMoto() {
        return modelosMoto;
    }

    public void setModelosMoto(List<ModeloMoto> modelosMoto) {
        this.modelosMoto = modelosMoto;
    }

    @Override
    public String toString() {
        return this.getMarMarca();
    }
}
