/*************************************************************************
 *  Compilation:  javac HadamardMatrix.java
 *  Execution:    java HadamardMatrix 2
 *
 *  @author:
 *
 * The program HadamardMatrix prints H(n)
 *
 *  % java HadamardMatrix 2
 *  T T
 *  T F
 *
 *************************************************************************/

public class HadamardMatrix {

    public static void main(String[] args) {

    	int t= Integer.parseInt(args[0]);
        boolean [][] had= new boolean [t][t];

          had[0][0]=true;

          for(int n=1;n<t;n+=n){
            for(int a=0;a<n;a++){
                for(int h=0;h<n;h++){


                    had [a+n][h]= had[a][h];
                    had [a][h+n]= had[a][h];
                    had [a+n][h+n]= !had[a][h];
                }
            }
        }



    for (int f= 0; f<t; f++){
        for (int u= 0; u<t; u++){
            if (had[f][u]){
                System.out.print("T");
            }
                else {
                System.out.print("F");
            }
            }
                System.out.println();
        }

    }
}


      



//-1 n times
// T
/*  TT
    TF

    TTTT
    TFTF
    TTFF
    TFFT*/

