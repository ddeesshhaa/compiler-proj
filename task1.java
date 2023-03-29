
import java.io.IOException;
import java.io.FileWriter;
import java.io.File;
public class code {

    public static void main(String[] args)throws Exception{
//block number 1
		File output = new File("task2.txt");
		output.createNewFile();
		FileWriter w = new FileWriter("task2.txt");
		w.write("block 1 is Visited " +"\n");

        int x=5;
        if (x==5){
//block number 2
w.write("block 2 is Visited" +"\n");

        }
        if (true) {
//block number 3
w.write("block 3 is Visited" +"\n");


        }else{
//block number 4
w.write("block 4 is Visited" +"\n");


        }


        for(int i =0;i<6;i++){
//block number 5
w.write("block 5 is Visited" +"\n");


        }

    w.close();
}
}