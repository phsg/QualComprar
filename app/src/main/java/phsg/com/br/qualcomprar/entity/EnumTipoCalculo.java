package phsg.com.br.qualcomprar.entity;

/**
 * Created by Pedro on 27/07/2015.
 */
public enum EnumTipoCalculo {

    SIMPLES(0, "Simples"),
    COMPOSTO(1, "Compostp"),
    COMBO(2, "Combo");

    private int codigo;
    private String nome;

    EnumTipoCalculo(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

}
