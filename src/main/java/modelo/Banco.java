
package modelo;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    
    private static List <Cliente> clientes = new ArrayList();
    
    public static boolean cadastrarCliente(Cliente cliente){
        if (clientes.add(cliente)) return true;
        return false;
    }
    
    public static boolean removerCliente(Cliente cliente){
        for(Cliente c : clientes)
            if (c.equals(cliente)){
                clientes.remove(c);
                return true;
            }
        return false;
    }
    
    public static boolean atualizarCliente(Cliente cliente){
        for(int k = 0; k < clientes.size();k++)
            if (cliente.getEmail().equals(clientes.get(k).getEmail())){
                clientes.set(k, cliente);
                return true;
            }
        return false;
    }
    
    public static Cliente login(String email, String senha){
        for(Cliente c : clientes){
            if (email.equals(c.getEmail()) & senha.equals(c.getSenha())) return c;
        }
        return null;
    }
    
    public static void listar(){
        for(Cliente c : clientes)
            System.out.println(c.toString());
    }
    
}
