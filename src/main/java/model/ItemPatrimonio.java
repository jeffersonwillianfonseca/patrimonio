package model;

public class ItemPatrimonio  implements java.io.Serializable {

    private int idItemPatrimonio;
    private Campus campus;
    private Local local;
    private Pessoa pessoa;
    private String descricaoItem;
    private String tomboItem;
    private String statusItem;
    private String textoBotao;
    private int tipoItem;

    private boolean mudouLocal;
    private boolean mudouPessoa;

    private boolean desuso;
    private boolean inutilizado;
    private boolean localizado;

    public ItemPatrimonio() {
    }


    public ItemPatrimonio(int idItemPatrimonio, Campus campus, Local local, Pessoa pessoa) {
        this.idItemPatrimonio = idItemPatrimonio;
        this.campus = campus;
        this.local = local;
        this.pessoa = pessoa;
    }
    public ItemPatrimonio(int idItemPatrimonio, Campus campus, Local local, Pessoa pessoa, String descricaoItem, String tomboItem, String statusItem) {
        this.idItemPatrimonio = idItemPatrimonio;
        this.campus = campus;
        this.local = local;
        this.pessoa = pessoa;
        this.descricaoItem = descricaoItem;
        this.tomboItem = tomboItem;
        this.statusItem = statusItem;
    }

    public int getIdItemPatrimonio() {
        return idItemPatrimonio;
    }

    public void setIdItemPatrimonio(int idItemPatrimonio) {
        this.idItemPatrimonio = idItemPatrimonio;
    }

    public Campus getCampus() {
        return campus;
    }

    public void setCampus(Campus campus) {
        this.campus = campus;
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

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public String getTomboItem() {
        return tomboItem;
    }

    public void setTomboItem(String tomboItem) {
        this.tomboItem = tomboItem;
    }

    public String getStatusItem() {
        return statusItem;
    }

    public void setStatusItem(String statusItem) {
        this.statusItem = statusItem;
    }

    public String getTextoBotao() {
        return textoBotao;
    }

    public void setTextoBotao(String textoBotao) {
        this.textoBotao = textoBotao;
    }

    public boolean isMudouLocal() {
        return mudouLocal;
    }

    public void setMudouLocal(boolean mudouLocal) {
        this.mudouLocal = mudouLocal;
    }

    public boolean isMudouPessoa() {
        return mudouPessoa;
    }

    public void setMudouPessoa(boolean mudouPessoa) {
        this.mudouPessoa = mudouPessoa;
    }

    public boolean isDesuso() {
        return desuso;
    }

    public void setDesuso(boolean desuso) {
        this.desuso = desuso;
    }

    public boolean isInutilizado() {
        return inutilizado;
    }

    public void setInutilizado(boolean inutilizado) {
        this.inutilizado = inutilizado;
    }

    public boolean isLocalizado() {
        return localizado;
    }

    public void setLocalizado(boolean localizado) {
        this.localizado = localizado;
    }

    public int getTipoItem() {
        return tipoItem;
    }

    public void setTipoItem(int tipoItem) {
        this.tipoItem = tipoItem;
    }




}


