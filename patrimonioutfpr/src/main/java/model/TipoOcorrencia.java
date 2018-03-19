package model;

import java.util.ArrayList;
import java.util.List;

public class TipoOcorrencia  implements java.io.Serializable {


    private int idTipoOcorrencia;
    private String descricaoTipoOcorrencia;
    private List<Ocorrencia> ocorrencias;

    public TipoOcorrencia() {
    }


    public TipoOcorrencia(int idTipoOcorrencia) {
        this.idTipoOcorrencia = idTipoOcorrencia;
    }
    public TipoOcorrencia(int idTipoOcorrencia, String descricaoTipoOcorrencia) {
        this.idTipoOcorrencia = idTipoOcorrencia;
        this.descricaoTipoOcorrencia = descricaoTipoOcorrencia;
        this.ocorrencias = new ArrayList<Ocorrencia>();
    }

    public int getIdTipoOcorrencia() {
        return idTipoOcorrencia;
    }

    public void setIdTipoOcorrencia(int idTipoOcorrencia) {
        this.idTipoOcorrencia = idTipoOcorrencia;
    }

    public String getDescricaoTipoOcorrencia() {
        return descricaoTipoOcorrencia;
    }

    public void setDescricaoTipoOcorrencia(String descricaoTipoOcorrencia) {
        this.descricaoTipoOcorrencia = descricaoTipoOcorrencia;
    }

    public List<Ocorrencia> getOcorrencias() {
        return ocorrencias;
    }

    public void setOcorrencias(List<Ocorrencia> ocorrencias) {
        this.ocorrencias = ocorrencias;
    }

    @Override
    public String toString() {
        return descricaoTipoOcorrencia;
    }


}


