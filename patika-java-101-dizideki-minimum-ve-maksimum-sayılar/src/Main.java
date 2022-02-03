import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] dizi={15,12,788,1,-1,-778,2,0};
        Scanner input=new Scanner(System.in);
        int sayi;
        System.out.print("bir sayı giriniz:");
        sayi= input.nextInt();
        int max=sayi;
        int min=sayi;
        for(int i=0;i< dizi.length;i++) {
            if (dizi[i] > sayi) {
            if(sayi==max || dizi[i]<max){
                max=dizi[i];
            }
            }
            else {
                if(sayi==min || dizi[i]>min ){
                    min=dizi[i];
                }


            }
        }
        System.out.println("dizi:" + Arrays.toString(dizi));
        System.out.println("girilen sayı:" +sayi);
        System.out.println("girilen sayıdan küçük en yakın sayı:" +max);
        System.out.println("girilen sayıdan büyük en yakın sayı:" +min);


    }
}
