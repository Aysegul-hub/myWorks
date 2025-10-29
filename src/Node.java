public class Node {

        int data;
        Node next; //bir sonraki düğümü göstersin diye


    public static void main(String[] args) {

        listStructure list = new listStructure();

        list.ekle(11);
        list.ekle(22);
        list.ekle(33);
        list.ekle(44);

        System.out.println();

        list.yazdir();

        oneDirectionListStructure tyList = new oneDirectionListStructure();

        tyList.basaEkle(5);
        tyList.sonaEkle(9);
        tyList.basaEkle(7);
        tyList.sonaEkle(11);
        tyList.basaEkle(3);


        System.out.println(" baştaki düğüm elemanı " + tyList.head.data);
        System.out.println(" sondaki düğüm elemanı " + tyList.tail.data);

        tyList.yazdir();




    }







}
