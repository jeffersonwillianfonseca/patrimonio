package model;

public class Ocorrencia implements java.io.Serializable {

    private int idOcorrencia;
    private Local local;
    private Pessoa pessoa;
    private ItemPatrimonio itemPatrimonio;
    private String observacao;
    private int inutilizavel;
    private int desuso;
    private int localizado;
    private int tipoOcorrencia;

    public Ocorrencia() {
    }

    public Ocorrencia(int idOcorrencia, Local local, Pessoa pessoa) {
        this.idOcorrencia = idOcorrencia;
        this.local = local;
        this.pessoa = pessoa;
    }

    public int getIdOcorrencia() {
        return idOcorrencia;
    }

    public void setIdOcorrencia(int idOcorrencia) {
        this.idOcorrencia = idOcorrencia;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public ItemPatrimonio getItemPatrimonio() {
        return itemPatrimonio;
    }

    public void setItemPatrimonio(ItemPatrimonio itemPatrimonio) {
        this.itemPatrimonio = itemPatrimonio;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public int getInutilizavel() {
        return inutilizavel;
    }

    public void setInutilizavel(int inutilizavel) {
        this.inutilizavel = inutilizavel;
    }

    public int getDesuso() {
        return desuso;
    }

    public void setDesuso(int desuso) {
        this.desuso = desuso;
    }

    public int getLocalizado() {
        return localizado;
    }

    public void setLocalizado(int localizado) {
        this.localizado = localizado;
    }

    public int getTipoOcorrencia() {
        return tipoOcorrencia;
    }

    public void setTipoOcorrencia(int tipoOcorrencia) {
        this.tipoOcorrencia = tipoOcorrencia;
    }

    public String getDesusoString() {
        return (desuso == 0) ? "Não" : "Sim";
    }

    public String getInutilizavelString() {
        return (inutilizavel == 0) ? "Não" : "Sim";
    }

    public String getLocalizadoString() {
        return (localizado == 0) ? "Sim" : "Não";
    }

}
