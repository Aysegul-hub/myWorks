public class HesapMakinesiClass {

    double toplam = 0;

    public void sum(double num1, double num2 ){
        toplam = num1+num2;
    }
    public void sum(double num1 ){
        toplam += num1;
    }

    public double hesapMakinesindekiDegeriDondur() {

        return toplam;



    }

    public static void main(String[] args) {

        HesapMakinesiClass hm1 = new HesapMakinesiClass();
        hm1.sum(5,8);
        hm1.sum(9);
        System.out.println(hm1.hesapMakinesindekiDegeriDondur());


        HesapMakinesiClass hm2 = new HesapMakinesiClass();
        hm2.sum(8);
        hm2.sum(12+8);
        hm2.sum(-3);
        System.out.println(hm2.hesapMakinesindekiDegeriDondur());



    }

}
