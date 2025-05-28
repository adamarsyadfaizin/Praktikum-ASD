public class StackSurat14 {
    Surat14[] stack14;
    int top14;
    int size14;

    public StackSurat14(int size14) {
        this.size14 = size14;
        this.stack14 = new Surat14[size14];
        this.top14 = -1;
    }

    public boolean isFull() {
        return top14 == size14 - 1;
    }

    public boolean isEmpty() {
        return top14 == -1;
    }

    public void push(Surat14 surat14) {
        if (!isFull()) {
            stack14[++top14] = surat14;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan sura");
        }
    }

    public Surat14 pop() {
        if (!isEmpty()) {
            return stack14[top14--];
        } else {
            System.out.println("Stack kosong! Tidak ada surat yang iproses");
            return null;
        }
    }

    public Surat14 peek() {
        if (!isEmpty()) {
            return stack14[top14];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public boolean cariSurat(String nama14) {
        for (int i = 0; i <= top14; i++) {
            if (stack14[i].namaMahasiswa.equalsIgnoreCase(nama14)) {
                return true;
            }
        }
        return false;
    }
}
