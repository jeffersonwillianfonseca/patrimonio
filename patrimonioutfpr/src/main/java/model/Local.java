package model;
// Generated 04/11/2017 18:57:20 by Hibernate Tools 4.3.1

import java.util.ArrayList;
import java.util.List;

public class Local  implements java.io.Serializable {

    private int idLocal;
    private String nomeLocal;
    private String codLocal;
    private String codPorta;
    private String localizacaoLocal;
    private List<ItemPatrimonio> itempatrimonios = new ArrayList<ItemPatrimonio>();
    private List<Ocorrencia> ocorrencias;

    public Local() {
    }

    public Local(int idLocal) {
        this.idLocal = idLocal;
    }
    public Local(int idLocal, String nomeLocal, String codLocal, String codPorta, String localizacaoLocal) {
        this.idLocal = idLocal;
        this.nomeLocal = nomeLocal;
        this.codLocal = codLocal;
        this.codPorta = codPorta;
        this.localizacaoLocal = localizacaoLocal;
        this.itempatrimonios = new ArrayList<ItemPatrimonio>();
        this.ocorrencias = new ArrayList<Ocorrencia>();
    }

    public int getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(int idLocal) {
        this.idLocal = idLocal;
    }

    public String getNomeLocal() {
        return nomeLocal;
    }

    public void setNomeLocal(String nomeLocal) {
        this.nomeLocal = nomeLocal;
    }

    public String getCodLocal() {
        return codLocal;
    }

    public void setCodLocal(String codLocal) {
        this.codLocal = codLocal;
    }

    public String getCodPorta() {
        return codPorta;
    }

    public void setCodPorta(String codPorta) {
        this.codPorta = codPorta;
    }

    public String getLocalizacaoLocal() {
        return localizacaoLocal;
    }

    public void setLocalizacaoLocal(String localizacaoLocal) {
        this.localizacaoLocal = localizacaoLocal;
    }

    public List<ItemPatrimonio> getItempatrimonios() {
        return itempatrimonios;
    }

    public void setItempatrimonios(List<ItemPatrimonio> itempatrimonios) {
        this.itempatrimonios = itempatrimonios;
    }

    public List<Ocorrencia> getOcorrencias() {
        return ocorrencias;
    }

    public void setOcorrencias(List<Ocorrencia> ocorrencias) {
        this.ocorrencias = ocorrencias;
    }

    @Override
    public String toString() {
        return nomeLocal;
    }



}


