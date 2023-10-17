import java.security.PublicKey;
import java.util.Stack;

public class Pila {
    private Stack< Integer> pila;

    public  Pila(){
        pila= new Stack<Integer>();

    }

    public void ingresarElemneto(Integer dato){
        pila.push(dato);
    }

    public Integer extraerElemnto() throws  Exception{
        if (pila.empty())
            throw new Exception(" Pila  sin elementos");
        return pila.pop();
    }

    public Integer elementoTop() throws Exception{
        if (pila.empty());
        throw new Exception("No hay elementos en la pila");
    }

    @Override
    public String toString() {
        String resultado= "===Pila===\n";
        for (int i=pila.size()-1;i>=0;i--){
            resultado+=pila.get(i)+"\n";
        }
        return resultado;
    }
}
