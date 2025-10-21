public class oneDirectionListStructure {
    Node head = null;
    Node tail = null;

    void basaEkle(int x)
    {
        Node eleman = new Node();
        eleman.data = x;

        if(head == null)
        {
            eleman.next= null;
            head = eleman;
            tail = eleman;
            System.out.println("liste yapısı oluşturuldu ve ilk eleman eklendi");


        }
        else
        {
            eleman.next= head;
            head = eleman;
            System.out.println("başa eleman eklendi.");

        }
    }

    void sonaEkle( int x )
    {
        Node eleman = new Node();
        eleman.data = x;

        if(head == null)
        {
            eleman.next= null;
            head = eleman;
            tail= eleman;
            System.out.println("liste yapısı oluşturuldu ve ilk eleman eklendi");

        }
        else
        {
            eleman.next = null;
            tail.next=eleman; // ekleme yaptık
            tail= eleman; // isim atadık
            System.out.println("sona eleman eklendi.");

        }
    }

    void yazdir() {

        if (head == null) {

            System.out.println("liste boş!!!");

        } else {
            Node temp = head;
            System.out.print("\nbas -> ");

            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next; //linked listenin her düğümünün üstünden geçmesi için lazım.

            }
            System.out.print("son...");
        }
        }
    }
