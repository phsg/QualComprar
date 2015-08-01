package phsg.com.br.qualcomprar.entity;

/**
 * Created by Pedro on 27/07/2015.
 */
public class ProdutoEntity {

    private int codigo;
    private String descricao;
    private Double preco;
    private Double quantidade;
    private EnumTipoCalculo tipoCalculo;

    public ProdutoEntity(int codigo, String descricao, Double preco, Double quantidade, EnumTipoCalculo tipoCalculo) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
        this.tipoCalculo = tipoCalculo;
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

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public EnumTipoCalculo getTipoCalculo() {
        return tipoCalculo;
    }

    public void setTipoCalculo(EnumTipoCalculo tipoCalculo) {
        this.tipoCalculo = tipoCalculo;
    }

    public Double getTotal() {
        Double total = new Double(0);
        if (this.preco != null ){
            if (this.quantidade != null ){
                return  this.preco;
            }
            return this.preco;
        }

        return tipoCalculo;
    }
}
