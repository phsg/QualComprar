package phsg.com.br.qualcomprar.entity;

/**
 * Created by Pedro on 27/07/2015.
 */
public enum EnumQuantidade {

    GRAMA(0,0,EnumMedida.PESO,"Grama","gr"),
    KILO(1,1,EnumMedida.PESO,"Kilograma","kq"),
    MILIGRANA(3,1,EnumMedida.LIQUIDO,"Mililitro","ml"),
    LITRO(2,0,EnumMedida.LIQUIDO,"Litro","l");

    private int codigo;
    private int orde;
    private EnumMedida medida;
    private String descricao;
    private String simbolo;

    EnumQuantidade(int codigo, int orde, EnumMedida medida, String descricao, String simbolo) {
        this.codigo = codigo;
        this.orde = orde;
        this.medida = medida;
        this.descricao = descricao;
        this.simbolo = simbolo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getOrde() {
        return orde;
    }

    public void setOrde(int orde) {
        this.orde = orde;
    }

    public EnumMedida getMedida() {
        return medida;
    }

    public void setMedida(EnumMedida medida) {
        this.medida = medida;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }
}
