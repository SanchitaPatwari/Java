/*************************************************************************
 *  Compilation:  javac RunLengthEncoding.java
 *  Execution:    java RunLengthEncoding
 *
 *  @author:
 *
 *************************************************************************/

public class RunLengthEncoding 
{

    public static String encode (String original)  
    {


    int value=1;
    String lol = original+" ";
    String rip = "";
	   for (int i = 0; i< original.length(); i++)
       {
            if (lol.charAt(i)==lol.charAt(i+1))
            {
                value++;
            }
            else if (value==1) 
            {
                rip +=lol.substring(i,i+1);
                value = 1;
            }
            else 
            {
                rip +=value+lol.substring(i,i+1);
                value=1;    
            }
        }
        return rip;
    }
    
    public static String decode (String original)  
    {
    char o= original.charAt(0);
    
        if (Character.isDigit(o)&& o!='1'){
                o--;
                original=o+original.substring(1);  
         //System.out.println(original.charAt(1));      
          return original.charAt(1)+decode(original);  
          
         }
        if (o=='1'){ 
            return decode(original.substring(1));
        }
         
      //  System.out.println(original.charAt(1)); 
    if (original.length()<=1){
        return original;
    }
     /* if (original.length()<=2){
        return original.charAt()+decode(original.substring(1));
        }
        else{ */
            return o+decode(original.substring(1));
}

    public static void main (String[] args) 
    {
        String original = "2s4d5f6ge";
        System.out.println(original.length());
        original= decode(original);
        System.out.println(original);
        System.out.println(original.length());
    }
}
