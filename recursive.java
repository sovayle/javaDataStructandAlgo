package MyProject1.src.dataStructAlgo;

public class recursive {
    public static void main(String[] args){
        System.out.println(fib(7));

    }

    static int fib(int n){
        //assume n is pos integer
        if (n >=3){
            return fib(n-1) + fib(n-2);
        }
        else{
            return 1;
        }

    }
    
}
