package main;


public class Main {

    public static void main(String[] args) {
      System.out.println("----------Menampilkan-----------");
        //Buat object dari kelas kotak
        Kotak main = new Kotak();
        //mengatur ukuran kotak
        main.setPanjang(13.34);
        main.setLebar(6.34);

        //memanggil object kotak
        System.out.println("panjang: " + main.getPanjang());
        System.out.println("lebar: " + main.getLebar());
        System.out.println("luas: " + main.getPanjang() * main.getLebar());
        System.out.println("keliling: " + main.getPanjang() * main.getLebar() * main.getPanjang() * main.getLebar());

        System.out.println("----------------Menampilkan---------------");
        Mahasiswa Mahasiswa = new Mahasiswa();

        Mahasiswa.nama              = "MUH. ALIMUDDIN";
        Mahasiswa.nim               = "D0217344";
        Mahasiswa.alamat            = "MAJENE";
        Mahasiswa.golonganDarah     = "O";
        Mahasiswa.status            = "Mahasiswa";
        Mahasiswa.tinggiBadan       = "156";
        Mahasiswa.beratBadan        = "50";

        //getter mahasiswa
        System.out.println("nama: " + Mahasiswa.getNama());
        System.out.println("nim: " + Mahasiswa.getNim());
        System.out.println("alamat: " + Mahasiswa.getAlamat());
        System.out.println("golongan darah: " + Mahasiswa.getGolonganDarah());
        System.out.println("status: " + Mahasiswa.getStatus());
        System.out.println("tinggi badan: " + Mahasiswa.getTinggiBadan());
        System.out.println("berat badan: " + Mahasiswa.getBeratBadan());

        System.out.println("---------------Menampilkan---------------");
        //membuat object dari kelas note
        node node = new node();
        node.Label = "Oreo";
        node.Value = 3;

        //getter node
        System.out.println("Nama Label: " + node.getLabel());
        System.out.println("Jumlah Label: " + node.getValue());

        System.out.println("-------------Menampilkan-------------");
        //membuat object kelas stack
        stack stack = new stack();

        stack.value[0]    = "Muh.Alimuddin";
        stack.value[1]    = "Doraemon";
        stack.value[2]    = "Spongebob";
        stack.value[3]    = "Nobita";
        stack.value[4]    = "Patrick";
        stack.value[5]    = "Sandy";
        stack.setValueAt(6, "Suneo");

        for (int i = 0; i < stack.value.length; i++) {
            System.out.println(stack.value[i]);};

        }

    }