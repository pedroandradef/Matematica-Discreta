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
        teste1.add("10");
        teste1.add("a");

        teste2.add("c");
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

        testeMap.put("D", criaIntersecao(testeMap.get("A"),testeMap.get("B")));

        System.out.println(testeMap.get("D"));

    }


    public static HashSet criaIntersecao(HashSet<String> conjunto1, HashSet<String> conjunto2) {
        HashSet<String> intersecao = new HashSet<String>();

        for(String s : conjunto1){ //Passa por todos os elementos do primeiro conjunto
            for (String p : conjunto2){ //Passa por todos elementos do segundo conjunto
                if (s.equals(p)) //Compara os 2 elementos
                    intersecao.add(s);
            }
        }

        return intersecao;

    }

    public static HashSet criaUniao(HashSet<String> conjunto1, HashSet<String> conjunto2) {  //Recebe dois Conjuntos que estao dentro do HashMap para criar a uniao
        HashSet<String> uniao = new HashSet<String>();

        uniao.addAll(conjunto1);

        for(String s : conjunto2)
            uniao.add(s); //Adiciona os elementos do conjunto 2 ao hash sem duplicar os elementos.

        return uniao;
    }
}
