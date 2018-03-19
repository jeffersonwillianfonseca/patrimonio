package model;

import java.util.ArrayList;
import java.util.List;

public class Pessoa  implements java.io.Serializable {


    private int idPessoa;
    private String nomePessoa;
    private String email;
    private String codSiape;
    private String codPessoa;
    private String cargoPessoa;
    private String instituicaoPessoa;
    private List<ItemPatrimonio> itempatrimonios;
    private List<Ocorrencia> ocorrencias;

    public Pessoa() {
    }


    public Pessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }
    public Pessoa(int idPessoa, String nomePessoa, String email, String codSiape, String codPessoa, String cargoPessoa, String instituicaoPessoa) {
        this.idPessoa = idPessoa;
        this.nomePessoa = nomePessoa;
        this.email = email;
        this.codSiape = codSiape;
        this.codPessoa = codPessoa;
        this.cargoPessoa = cargoPessoa;
        this.instituicaoPessoa = instituicaoPessoa;
        this.itempatrimonios = new ArrayList<ItemPatrimonio>();
        this.ocorrencias = new ArrayList<Ocorrencia>();
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCodSiape() {
        return codSiape;
    }

    public void setCodSiape(String codSiape) {
        this.codSiape = codSiape;
    }

    public String getCodPessoa() {
        return codPessoa;
    }

    public void setCodPessoa(String codPessoa) {
        this.codPessoa = codPessoa;
    }

    public String getCargoPessoa() {
        return cargoPessoa;
    }

    public void setCargoPessoa(String cargoPessoa) {
        this.cargoPessoa = cargoPessoa;
    }

    public String getInstituicaoPessoa() {
        return instituicaoPessoa;
    }

    public void setInstituicaoPessoa(String instituicaoPessoa) {
        this.instituicaoPessoa = instituicaoPessoa;
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
        return nomePessoa;
    }





}



