package ref;

public class PrintArgs {

    public static void main(String[] args) {
      
        System.out.println("The Input args size is " + args.length );
        for (int i=0 ; i < args.length ; i++){
            System.out.println(args[i]);
        }
    }

}
