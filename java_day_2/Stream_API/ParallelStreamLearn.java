package java_day_2.Stream_API;

import java.io.File;
import java.util.*;
import java.util.List;
import java.util.Scanner;

// allows parallel excution of the stream
// the order of operations is not guranteed
public class ParallelStreamLearn {
    
    public static void main(String[] args) throws Exception {
        
        File current_file = new File("C:\\Users\\imank\\Downloads\\java_tasks\\java_day_2\\Stream_API\\file.txt");

        Scanner obj = new Scanner(current_file);

        List<String> list = new ArrayList<>();

        while(obj.hasNext()){
            list.add(obj.next());
        }

        list.parallelStream().forEach((a) -> {
            System.out.print(a.toUpperCase()+" ");
        });
    }

}
