package model;


import java.util.ArrayList;
import java.util.List;

public class Campus  implements java.io.Serializable {


    private int idCampus;
    private String codCampus;
    private String nomeCampus;
    private List<ItemPatrimonio> itempatrimonios;

    public Campus() {
    }


    public Campus(int idCampus) {
        this.idCampus = idCampus;
    }
    public Campus(int idCampus, String codCampus, String nomeCampus) {
        this.idCampus = idCampus;
        this.codCampus = codCampus;
        this.nomeCampus = nomeCampus;
        itempatrimonios = new ArrayList<ItemPatrimonio>();
    }

    public int getIdCampus() {
        return idCampus;
    }

    public void setIdCampus(int idCampus) {
        this.idCampus = idCampus;
    }

    public String getCodCampus() {
        return codCampus;
    }

    public void setCodCampus(String codCampus) {
        this.codCampus = codCampus;
    }

    public String getNomeCampus() {
        return nomeCampus;
    }

    public void setNomeCampus(String nomeCampus) {
        this.nomeCampus = nomeCampus;
    }

    public List<ItemPatrimonio> getItempatrimonios() {
        return itempatrimonios;
    }

    public void setItempatrimonios(List<ItemPatrimonio> itempatrimonios) {
        this.itempatrimonios = itempatrimonios;
    }





}


