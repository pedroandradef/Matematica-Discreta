import java.util.ArrayList;

public class main {
    public static void main(String [] args){
        ArrayList<String> teste1 = new ArrayList<String>();
        ArrayList<String> teste2 = new ArrayList<String>();
        ArrayList<String> intersecao = new ArrayList<String>();
        ArrayList<String> uniao = new ArrayList<String>();

        teste1.add("a");
        teste1.add("8");
        teste1.add("&");
        teste1.add("-5");

        teste2.add("c");
        teste2.add("&");
        teste2.add("8");
        teste2.add("-5");




            teste1.forEach(s -> isEqual(s, teste2, intersecao));

            while (!intersecao.isEmpty())
                System.out.println(intersecao.remove(0));

    }


    public static void isEqual(String s, ArrayList<String> array, ArrayList<String> intersecao){
        for(int i = 0; i < array.size(); i++){
            if (s.equals(array.get(i))){
                intersecao.add(s);
            }
        }
    }

    public static void uniao(String s, ArrayList<String> array, ArrayList<String> uniao ){

    }
}
