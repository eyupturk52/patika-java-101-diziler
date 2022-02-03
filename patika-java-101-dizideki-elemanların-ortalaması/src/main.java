public class main {
    public static void main(String[] args) {
        double [] numbers={1,2,3,4,5};
        double harmonik=0;
        for(int i=0;i< numbers.length;i++){
            harmonik+=1/numbers[i];
        }
        System.out.println("harmoik seri sonucu:" +harmonik);
        double ort=numbers.length/harmonik;
        System.out.println("ortalama:" +ort);
    }
}
