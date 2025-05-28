public class StackTugasMahasiswa14 {
    Mahasiswa14[] stack;
    int size;
    int top;

    public StackTugasMahasiswa14(int size) {
        this.size = size;
        stack = new Mahasiswa14[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false; 
        }
    }

    public void push(Mahasiswa14 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak dapat menambahkan data.");
        }
    }

    public Mahasiswa14 pop() {
        if (!isEmpty()) {
            Mahasiswa14 mhs = stack[top];
            top--;
            return mhs;
        } else {
            System.out.println("Stack kosong! Tidak ada data yang dapat diambil.");
            return null;
        }
    }

    public Mahasiswa14 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public void print() {
            for (int i = 0; i <= top; i++) {
                System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
            }
            System.out.println("");
    }

    
    public String konversiDesimalKeBiner(int nilai) {
        StackKonversi14 stack = new StackKonversi14();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner = "";
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }


    public Mahasiswa14 lihatTugasTerbawah() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public int jumlahTugas() {
        return top + 1;
    }

}
