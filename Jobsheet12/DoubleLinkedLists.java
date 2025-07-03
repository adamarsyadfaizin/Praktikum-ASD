public class DoubleLinkedLists {
    Node14 head;
    Node14 tail;
    int size;

    public DoubleLinkedLists() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa14 item) {
        Node14 newNode = new Node14(null, item, head);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa14 item) {
        Node14 newNode = new Node14(tail, item, null);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

   public void insertAfter(String keyNim, Mahasiswa14 data) {
    Node14 current = head;

    // Cari node dengan nim = keyNim
    while (current != null && !current.data.nim.equals(keyNim)) {
        current = current.next;
    }

    if (current == null) {
        System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
        return;
    }

    Node14 newNode = new Node01(data);

    // Jika current adalah tail, cukup tambahkan di akhir
    if (current == tail) {
        current.next = newNode;
        newNode.prev = current;
        tail = newNode;
    } else {
        // Sisipkan di tengah
        newNode.next = current.next;
        newNode.prev = current;
        current.next.prev = newNode;
        current.next = newNode;
    }

    System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
}

    public void add(int index, Mahasiswa14 item) {
        if (index < 0 || index > size) {
            System.out.println("Index tidak valid.");
            return;
        }

        if (index == 0) {
            addFirst(item);
        } else if (index == size) {
            addLast(item);
        } else {
            Node14 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            Node14 newNode = new Node14(current.prev, item, current);
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }
    }

    public void removeAfter(String keyNim) {
        Node14 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            System.out.println("Node setelah NIM " + keyNim + " tidak ditemukan atau tidak ada.");
            return;
        }

        Node14 toDelete = current.next;
        current.next = toDelete.next;

        if (toDelete.next != null) {
            toDelete.next.prev = current;
        } else {
            tail = current;
        }

        size--;
        System.out.println("Node setelah NIM " + keyNim + " berhasil dihapus.");
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index tidak valid.");
            return;
        }

        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node14 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            current.prev.next = current.next;
            current.next.prev = current.prev;
            System.out.println("Data yang dihapus:");
            current.data.tampil();
            size--;
        }
    }

    public void getFirst() {
        if (!isEmpty()) {
            System.out.println("Data pertama:");
            head.data.tampil();
        } else {
            System.out.println("Linked list kosong.");
        }
    }
     public void getLast() {
        if (!isEmpty()) {
            System.out.println("Data terakhir:");
            tail.data.tampil();
        } else {
            System.out.println("Linked list kosong.");
        }
    }
    public void getIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index tidak valid.");
            return;
        }

        Node14 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        System.out.println("Data pada index ke-" + index + ":");
        current.data.tampil();
    }

    public int getSize() {
        return size;
    }

    
    public void print() {
        if (!isEmpty()) {
            Node14 tmp = head;
            while (tmp != null) {
                tmp.data.tampil();
                System.out.println("------------------");
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void removeFirst() {
        if (!isEmpty()) {
            System.out.println("Data yang dihapus:");
            head.data.tampil();
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void removeLast() {
        if (!isEmpty()) {
            System.out.println("Data yang dihapus:");
            tail.data.tampil();
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            } else {
                head = null;
            }
        } else {
            System.out.println("Linked list kosong");
        }
    }

        public Node14 search(String nim) {
        Node14 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

}