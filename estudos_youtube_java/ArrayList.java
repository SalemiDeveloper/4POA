import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //ArrayList é um vetor com alocação dinâmica de memória
        ArrayList<Integer> idades = new ArrayList<Integer>();

        //adicionando itens no ArrayList
        idades.add(22);
        idades.add(50);
        idades.add(30);

        //pra remover - na posição
        idades.remove(0);

        //get - na posição
        idades.get(1);

        //pegar/retornar o tamanho do ArrayList
        idades.size();
    }
}
