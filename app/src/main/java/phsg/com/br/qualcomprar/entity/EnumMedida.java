package phsg.com.br.qualcomprar.entity;

/**
 * Created by Pedro on 27/07/2015.
 */
public enum  EnumMedida {

    LIQUIDO(0,"Liquidos"),
    PESO(1,"Peso");

    private int codigo;
    private String descricao;

    EnumMedida(String descricao, int codigo) {
        this.descricao = descricao;
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
