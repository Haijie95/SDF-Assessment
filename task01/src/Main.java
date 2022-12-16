public class Main{


    public static void main(String[] args) {
        
        //java -cp classes your.package.Main <csv file>
        if (args.length<=0){
            System.out.println("Missing cav file and template file");
            System.exit(1);
        } else if(args.length==1){
            System.out.println("One file name missing try again!");
            System.exit(1);
        }
        //create a file object
        System.out.println(args[0]);

        ProcessTheFile newfile = new ProcessTheFile(args[0].trim());
        newfile.start();
        
    }


}