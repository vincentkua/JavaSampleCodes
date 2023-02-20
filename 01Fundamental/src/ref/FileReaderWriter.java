package ref;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReaderWriter {

    public static void main(String[] args) throws FileNotFoundException,IOException{
        Path cithPath = Paths.get("practicelist.txt");
        File cith = cithPath.toFile();

        if (!cith.exists()){
            System.err.println("Target File Not Found");
            System.exit(1);
        }

        FileReader fr = new FileReader(cith);
        BufferedReader br = new BufferedReader(fr);
        FileWriter wr = new FileWriter("zcopy_" + cith);
        String line;

        while((line = br.readLine())!= null){
            wr.write(line.toUpperCase() + "\n");
            System.out.println(line);
        }

        br.close();
        fr.close();
        wr.flush();
        wr.close();





    }
    
}
