
package modelo;

import java.time.LocalDate;
import visao.Login;

public class Main {
    
    
    public static void main(String[] args){
        
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();

        cliente1.setNome("Maria");
        cliente1.setEmail("maria@hotmail.com");
        cliente1.setSenha("123");
        cliente1.setDataNascimento(LocalDate.now());
        cliente1.setSexo("Feminino");
        cliente1.setConta(new Conta());
        
        cliente2.setNome("Jonatas");
        cliente2.setEmail("jonatas@hotmail.com");
        cliente2.setSenha("123");
        cliente2.setDataNascimento(LocalDate.now());
        cliente2.setSexo("Masculino");
        cliente2.setConta(new Conta());
        
        Banco.cadastrarCliente(cliente1);
        Banco.cadastrarCliente(cliente2);
        
        Login telaLogin = new Login();
        telaLogin.setVisible(true);
    }
    
}
