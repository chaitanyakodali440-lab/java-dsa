package Day11;
import java.util.*;
public class GraphBasic {
    public static void main(String[] args){
        String[] vertices = {"A","B","C"};
        List<String[]> edges = new ArrayList<>();

        edges.add(new String[]{"A","B"});
        edges.add(new String[]{"A","C"});
        edges.add(new String[]{"B","C"});
        System.out.println("Vertices : ");

        for(String vertex : vertices ){
            System.out.println(vertex);
        }
        System.out.println("\n Edges");

        for(String[] edge : edges){
            System.out.println(edge[0] + "-" + edge[1] );
        }
    }
}
