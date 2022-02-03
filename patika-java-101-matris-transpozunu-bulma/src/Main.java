import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int satır,sutun;
        Scanner input=new Scanner(System.in);
        System.out.println("satır sayısını girin:");
        satır= input.nextInt();
        System.out.println("sutun sayısını girin:");
        sutun=input.nextInt();
        int[][] matris=new int[satır][sutun];
        for(int i=0;i<satır;i++){
            for(int j=0;j<sutun;j++){
                System.out.println("matris elamanlarını giriniz:");
                matris[i][j]=input.nextInt();
            }
        }
        System.out.println("kullanıcının girdiği matris");
        for(int i=0;i<satır;i++){
            for(int j=0;j<sutun;j++){
                System.out.print(matris[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        int[][] tmatris=new int[sutun][satır];
        for(int i=0;i<sutun;i++){
            for(int j=0;j<satır;j++){
                tmatris[i][j]=matris[j][i];
            }
        }
        System.out.println("----ters matris---");
        for(int i=0;i<sutun;i++){
            for(int j=0;j<satır;j++){
                System.out.print(tmatris[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
