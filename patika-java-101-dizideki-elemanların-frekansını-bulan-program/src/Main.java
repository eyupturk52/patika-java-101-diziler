import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int sayac=1;
        int[] dizi={10,20,20,10,10,20,5,20};
        System.out.println(Arrays.toString(dizi));
        for(int i=0;i< dizi.length;i++){
            for(int j=0;j< dizi.length;j++){
                if(i!=j && dizi[i]==dizi[j]){
                    sayac++;
                }
            }

            System.out.println(dizi[i] + " sayısı " + sayac + " kadar tekrar edildi");
            sayac = 1;

            }

    }
}
