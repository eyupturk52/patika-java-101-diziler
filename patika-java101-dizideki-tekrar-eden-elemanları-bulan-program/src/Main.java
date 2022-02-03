import java.util.Arrays;
public class Main {
    static boolean ısfınd(int[] arr,int value){
       for(int i:arr){
           if(i==value){
               return true;
           }
       }
         return false;
    }
    public static void main(String[] args) {
        int[] dizi={2,3,4,2,5,8,8,9,6,4,1,0,3,5,8,6,7,5};
        int[] duplicate=new int[dizi.length];
        int startindex=0;
        for(int i=0;i< dizi.length;i++){
            for(int j=0;j< dizi.length;j++){
               if((i!=j) && (dizi[i]==dizi[j]) && (dizi[i]%2==0)) {
                   if (!ısfınd(duplicate, dizi[i])) {
                       duplicate[startindex++] = dizi[i];
                       break;

                   }
               }
            }

        }
        System.out.print("{");
        for(int i=0;i< dizi.length;i++){
            if(duplicate[i]!=0) {

                System.out.print(duplicate[i]+",");

            }
            }
        System.out.print("}");
    }

}
