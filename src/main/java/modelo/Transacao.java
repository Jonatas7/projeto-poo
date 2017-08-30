
package modelo;

import java.time.LocalDate;
import java.util.Objects;


public class Transacao {
    
    private String descricao;
    private String tipo;
    private String categoria;
    private float valor;
    private LocalDate dataMovimentacao;
    
    public Transacao(){}

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public LocalDate getDataMovimentacao() {
        return dataMovimentacao;
    }

    public void setDataMovimentacao(LocalDate dataMovimentacao) {
        this.dataMovimentacao = dataMovimentacao;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.descricao);
        hash = 37 * hash + Objects.hashCode(this.tipo);
        hash = 37 * hash + Objects.hashCode(this.categoria);
        hash = 37 * hash + Float.floatToIntBits(this.valor);
        hash = 37 * hash + Objects.hashCode(this.dataMovimentacao);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Transacao other = (Transacao) obj;
        if (Float.floatToIntBits(this.valor) != Float.floatToIntBits(other.valor)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.categoria, other.categoria)) {
            return false;
        }
        if (!Objects.equals(this.dataMovimentacao, other.dataMovimentacao)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Movimentacao{" + "descricao=" + descricao + ", tipo=" + tipo + 
                ", categoria=" + categoria + ", valor=" + valor +
                ", dataMovimentacao=" + dataMovimentacao + '}';
    }
    
    
    
    
}
