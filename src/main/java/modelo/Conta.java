
package modelo;

import java.util.ArrayList;
import java.util.List;

public class Conta {
    
    private List <Transacao> transacoes;
    private float saldo;
    
    public Conta(){
        this.transacoes = new ArrayList();
        this.saldo = 0;
    }

    public List<Transacao> getMovimentacoes() {
        return transacoes;
    }

    public void setMovimentacoes(List<Transacao> movimentacoes) {
        this.transacoes = movimentacoes;
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }

    public void setTransacoes(List<Transacao> transacoes) {
        this.transacoes = transacoes;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    
    public boolean entrada(Transacao transacao){
        saldo += transacao.getValor();
        if (transacoes.add(transacao)) return true;
        return false;
    }
    
    public boolean saida(Transacao transacao){
        if(transacao.getValor() <= saldo){
            saldo -= transacao.getValor();
            transacoes.add(transacao);
            return true;       
        }
        return false;
    }

    @Override
    public String toString() {
        return "Conta{" + "transacoes=" + transacoes + ", saldo=" + saldo + '}';
    }
 
}
