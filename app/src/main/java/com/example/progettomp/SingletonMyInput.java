package com.example.progettomp;

public class SingletonMyInput {
    private static SingletonMyInput instance = null;
    public Integer myInput;


    protected SingletonMyInput(Integer n){
        this.myInput = n;
    }


    public static SingletonMyInput setSingletonInstance(Integer n){
        if (SingletonMyInput.instance == null)
            SingletonMyInput.instance = new SingletonMyInput(n);
        else{
            instance.myInput = n;
        }
        return instance;
    }

    public static SingletonMyInput getInstance(){
        return instance;
    }


    public static boolean isPrime(int limit){
        int i;

        for (i = 2; i < limit; i++){
            if ((limit % i) == 0 )
                return false;
        }
        return true;
    }



    public int findAllPrimes(){
    //public int[] findAllPrimes(){

        Integer n = this.myInput;
        //int[] vec = new int[n];
        //int[] ret_vec;
        int i;
        //int index = 0;
        int count = 0;

        for (i = 2; i <= n; i++){
            if (isPrime(i)) {
                //vec[index] = i;
                //index++;
                count++;
            }
        }


        return count;
    }


    public String fattorizza(){
        int i, index = 0;
        int n = this.myInput;

        String ret = "";

        for (i = 2; i <= n; i++){
            if (isPrime(i)){

                while ((n % i) == 0){
                    if (index != 0)
                        ret = ret + " * ";
                    ret = ret + i;
                    n = n / i;
                    index++;
                }
            }
        }

        System.out.println(ret);

        return ret;
    }



    private int MCD(int a){
        Integer b = this.myInput;
        int r;
        while (b != 0){
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }


    public int euleroFunc(){
        /* cerca i numeri minori di n relativamente primi con n */
        int i, count = 0;
        for (i = 1; i < this.myInput; i++){
            if (this.MCD(i) == 1)
                count ++;
        }
        return count;
    }

    public int[] primiGemelli(){ //restituisce l'n-esima coppia
        int count = 0, p = 2, n = this.myInput;
        int[] couple = new int[2];

        while (true){
            if (isPrime(p) && isPrime(p + 2)){
                count++;
                if (count == n){
                    couple[0] = p;
                    couple[1] = p + 2;
                    return couple;
                }
            }
            p++;
        }
    }



    public int nesimoPrimo(){
        int num = 0;
        int p = 2;
        while (true){
            if (isPrime(p))
                num++;

            if (num == this.myInput)
                break;
            p++;
        }
        return p;
    }
}
