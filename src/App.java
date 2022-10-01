import java.util.ArrayList;
import java.util.List;

public class App {
    //static List<Conta> contas = new ArrayList<>();
    //static List<Cliente> clientes = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        List<Integer> opcoesIniciais = new ArrayList<>();
        opcoesIniciais.add(1);
        opcoesIniciais.add(2);
        opcoesIniciais.add(3);

        int opcaoInicial = 1;
        while (opcoesIniciais.get(opcaoInicial) != 3) {
            opcaoInicial = exibirMenuInicial(opcoesIniciais);
            if (opcoesIniciais.get(opcaoInicial) == 1) {

            }
        }
    }
    private static int exibirMenuInicial(List<Integer> opcoesIniciais) {
        return 0;
    }


    //private static int exibirMenuInicial(List<Integer> opcoesIniciais) {

}




