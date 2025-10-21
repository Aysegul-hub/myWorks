import java.util.concurrent.atomic.AtomicReference;

public class listStructure {

    Node head = null;
    Node tail = null;


    void ekle(int x)   //Liste yapısının içine düğüm ekliyecek.
    {

        Node eleman = new Node();
        eleman.data = x;
        eleman.next = null;

        if(head == null) //eğer head yani ilk düğümün içi null ise bir değer atanmadığı için nulldur.
        {
            head = eleman;
            tail = eleman; // ilk düğüm boşken head de tail da Node objesiyle yaratılan elemana eşittir.
            System.out.println("Liste oluşturuldu ve ilk düğüm eklendi.");
        }
        else {


            tail.next = eleman; //son elemanın devamına yeni düğüm ekledik
            tail = eleman;
            System.out.println("Listenin sonuna yeni bir eleman eklendi.");

        }


    }

    void yazdir()
    {
        if(head == null)
        {
            System.out.println("Listede yazdıracak bir şey yok.");

        }
        else
        {
            Node temp = head;//geçici bir düğümdür tüm düğümler üzerinde gezecektir
            System.out.print("\nbas -> ");
            while ( temp!= null)
            {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("son...");
        }







    }

}
