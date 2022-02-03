import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int length;
        System.out.print("dizi uzunlugunu giriniz:");
        length= input.nextInt();
        int[] dizi=new int[length];
        for(int i=0;i<length;i++){
            System.out.println((i+1)+ ".terimi girin:");
            dizi[i]=input.nextInt();
        }
        System.out.println("kullanıcı tarafından girilen dizi:");
        System.out.println(Arrays.toString(dizi));
        int gecici;
        for(int i=0;i<length;i++){
            for (int j=0;j<length;j++){
                if(dizi[i]<dizi[j]){
                   gecici=dizi[i];
                   dizi[i]=dizi[j];
                   dizi[j]=gecici;
                }
            }

        }
        System.out.println("dizinin küçükten büyüge dogru sıralanmıs hali:");
        System.out.println(Arrays.toString(dizi));

    }
}
