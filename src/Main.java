import designPattern.SomeClass;
import designPattern.builder.BuildDirector;
import designPattern.factory.Factory;
import designPattern.factory.FactoryInterface;
import designPattern.strategy.Strategy1;
import designPattern.strategy.Strategy2;
import sorting.Basic;
import tree.BinaryTree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] ary = new int[] {9, 2, 1, 8, 4, 3, 16, 13, 7};
        int[] ary2 = new int[] {9, 2, 1, 8, 4, 3, 16, 13, 7, 20, 21, 5};

        int graph[][] =
                new int[][] {
                    {0, 4, 0, 0, 0, 0, 0, 8, 0},
                    {4, 0, 8, 0, 0, 0, 0, 11, 0}
                };

        List<Integer> smallList = new ArrayList<>();
        List<List<Integer>> bigList = new ArrayList<>();
        BinaryTree binaryTree = new BinaryTree();
        Set<Integer> set = new HashSet<>();
        HashMap<String, String> hashmap = new HashMap<>();
        LinkedList<Integer> asd = new LinkedList<>();
        Main main = new Main();
        // main.test(graph);
        // main.test(ary);
        // main.test(smallList);
        main.test(bigList);

        String exp = "x+5-3+x=6+2x-2";
        String[] expElements = exp.split("(?=[-+])");
        // main.tryDesignPattern();

        // main.sorting();

    }

    private void recur(int[][] graph, int i, int j) {
        if (graph[i].length < 1) {
            return;
        }

        System.out.println(graph[i][j] + ",");

        i = graph[i][j];
        for (int k = 0; k < graph[i].length; k++) {
            recur(graph, i, k);
        }
    }

    private <T> void test(T variable) {
        int[][] ans = new int[5][5];
        "a".replace("aa", "").length();
        System.out.println(variable);
        List<List<String>> accounts = (List<List<String>>) variable;
        for (int i = 0; i < accounts.size(); i++) {
            HashMap<String, String> hashmap = new HashMap<>();
            for (int j = 0; j < accounts.get(i).size(); j++) {}
        }
    }

    private void tryDesignPattern() {
        Factory factory = new Factory();
        FactoryInterface factoryInterface = factory.createProduct("NO1");
        factoryInterface.prodcutFunction();

        SomeClass someClass = new BuildDirector().buildThis();
        SomeClass someClass2 = new BuildDirector().buildThat();

        if (1 == 2 - 1) {
            new Strategy1();
        } else {
            new Strategy2();
        }
    }

    private void sorting() {
        Basic basic = new Basic();
        // basic.insertion(ary);
        // basic.insertion(ary2);
        // basic.bubble(ary);
        // basic.bubble(ary2);
        // basic.selection(ary);
        // basic.selection(ary2);}
    }
}
