import java.util.ArrayList;
import java.util.HashSet;

public class main {
    public static void main(String[] args) {
        ArrayList<String> teste1 = new ArrayList<String>();
        ArrayList<String> teste2 = new ArrayList<String>();
        ArrayList<String> intersecao = new ArrayList<String>();
        HashSet<String> uniao = new HashSet<String>();

        teste1.add("a");
        teste1.add("8");
        teste1.add("&");
        teste1.add("-5");

        teste2.add("c");
        teste2.add("&");
        teste2.add("8");
        teste2.add("-5");


        teste1.forEach(s -> isEqual(s, teste2, intersecao));

        criaUniao(teste1,teste2,intersecao,uniao);



        for(String s : uniao)
            System.out.println(s);

    }


    public static void isEqual(String s, ArrayList<String> array, ArrayList<String> intersecao) {
        for (int i = 0; i < array.size(); i++) {
            if (s.equals(array.get(i))) {
                intersecao.add(s);
            }
        }
    }

    public static void criaUniao(ArrayList<String> conjunto1, ArrayList<String> conjunto2, ArrayList<String> intersecao, HashSet<String> uniao) {
        for(int i = 0; i < conjunto1.size(); i++)
            uniao.add(conjunto1.get(i));

        for(int i = 0; i < conjunto2.size(); i++)
            uniao.add(conjunto2.get(i));

        for (int i = 0; i < intersecao.size(); i++)
            uniao.add(intersecao.get(i));


    }
}
