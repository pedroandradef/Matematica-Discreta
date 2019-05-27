import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class main {
    public static void main(String[] args) {

        Map<String,HashSet<String>> testeMap = new HashMap<String,HashSet<String>>(); //Cria um HASH MAP DO TIPO HASHSET
        HashSet<String> teste1 = new HashSet<String>();
        HashSet<String> teste2 = new HashSet<String>();



        teste1.add("8");
        teste1.add("&");
        teste1.add("-5");

        teste2.add("c");
        teste2.add("&");
        teste2.add("8");
        teste2.add("-5");
        teste2.add("A");
        teste2.add("a");


        //teste1.forEach(s -> criaIntercessao(s, teste2, intersecao));

        testeMap.put("A",teste1); //Adiciona o HASHSET teste1 no HASHMAP
        System.out.println(testeMap.get("A"));

        testeMap.put("B",teste2);

        testeMap.put("C",criaUniao(testeMap.get("A"), testeMap.get("B"))); //Chama a funcao de criar uniao dentro da funcao de adicionar HashSet no HashMap.

        System.out.println(testeMap.get("C"));

    }


    public static void criaIntercessao(String s, ArrayList<String> array, ArrayList<String> intercessao) {


        for (int i = 0; i < array.size(); i++) {
            if (s.equals(array.get(i))) {
                intercessao.add(s);
            }
        }
    }

    public static HashSet criaUniao(HashSet<String> conjunto1, HashSet<String> conjunto2) {  //Recebe dois Conjuntos que estao dentro do HashMap para criar a uniao
        HashSet<String> uniao = new HashSet<String>();

        for(String s : conjunto1)
            uniao.add(s);

        for(String s : conjunto2)
            uniao.add(s);

        return uniao;
    }
}
