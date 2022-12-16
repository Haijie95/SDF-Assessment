import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;

public class ProcessTheFile {

    private String fileName;
    private List<String> firstName;
    private List<String> lastName;
    private List<String> address;
    private List<String> years;

    public ProcessTheFile(String fileName) {
        this.fileName = fileName;
    }

    public void start() {

        try {
            Reader r = new FileReader(fileName);
            BufferedReader br = new BufferedReader(r);
            
            String line;

            while (null != (line = br.readLine())) {
                
                String[] info = line.trim().split(",");
                firstName.add(info[0].toString());
                lastName.add(info[1].toString());
                address.add(info[2].toString());
                years.add(info[3].toString());
            }
            System.out.println(firstName);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
