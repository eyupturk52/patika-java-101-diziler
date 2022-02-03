public class Main {
    public static void main(String[] args) {
        String[][] letter=new String[5][4];
        for(int i=0;i<5;i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 0 || i == 2 || i == 4) {
                    letter[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    letter[i][j] = " * ";
                } else {
                    letter[i][j] = "   ";
                }
            }
        }
            for(int k=0;k<5;k++){
                for (int l=0; l<4;l++){
                    System.out.print(letter[k][l]);
                }
                System.out.println();
            }
        }
    }

