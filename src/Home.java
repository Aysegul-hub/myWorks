
public class Home {

    public static void main(String[] args) {

        Home home1 = new Home(); // şablonu burda inşaa etmiş olduk.
        Home home2 = new Home();

        home2.windowShape = " Square ";
        home2.homeMadeYear = 2025;
        home2.roofColor = " Blue ";
        home2.doorColor = " Brown ";

        home1.doorColor = " Pink";

        System.out.println(home2.doorColor);
        System.out.println(home2.roofColor);

        System.out.println(home2.windowShape);

    }

   // default value'ler bunlar değiştirilebilir.
    String doorColor = "orange";
    String roofColor = "orange";
    String windowShape = "spherical";
    int homeMadeYear = 2021;


}
