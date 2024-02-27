//nama class utama harus sama dengan nama file java jika tidak akan terjadi error
public class HelloWorld {
    //ini adalah method mainnya yang wajib dibuat untuk menjalankan program
    public static void main(String[] args) {
        // ini adalah program yang akan di eksekusi akan menampilkan pesan Hello World
        System.out.println("Hello World");
    }
}

/*
public static void main(String[] args) {}
public merupakan keyword aksebilitas yang memungkinan methodnya bisa di panggil atau akses diluar class
static merupakan keyword yang menandakan bahwa method ini bersifat statis artinya dapat dipanggil tanpa membuat objek / instance dari kelas tempat metode tersebut didefinisikan.
void merupakan tipe data Kembali (return type) yang tidak mengembalikan suatu nilai
main nama methodnya
(String[] args) parameter dari methodnya

System.out.println("Hello World");
perintah tersebut akan mencetak pesan Hello World pada konsol
perlu diperhatikan saat menggunakan println maka akan menambahkan satu baris baru ketika selesai mencetak teks
sehingga hasil output selanjutnya akan tampil di baris baru

*/