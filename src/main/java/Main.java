import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InterfacePhone redmi12 = new Xiaomi();
        InterfacePhone iPhone15 = new iPhone();
        InterfacePhone samsungGalaxy22 = new Samsung();
        InterfacePhone oppo12 = new Oppo();
        PhoneUser satu = new PhoneUser(redmi12);
        PhoneUser dua = new PhoneUser(iPhone15);
        PhoneUser tiga = new PhoneUser(samsungGalaxy22);
        PhoneUser empat = new PhoneUser(oppo12);
        Scanner masukan = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Silakan Pilih Jenis Ponsel");
            System.out.println("1. Xiaomi");
            System.out.println("2. iPhone");
            System.out.println("3. Samsung");
            System.out.println("4. Oppo");
            System.out.println("0. Keluar");
            System.out.println();
            System.out.print("Masukan angka : ");
            pilihan = masukan.nextInt();

            switch (pilihan){
                case 1:
                    System.out.println();
                    System.out.println("Handphone Xiaomi");
                    while (true) {
                        System.out.println("Silakan Pilih Apa yang Ingin Anda Lakukan");
                        System.out.println("1. Menyalakan HP");
                        System.out.println("2. Mematikan HP");
                        System.out.println("3. Memperbesar Volume");
                        System.out.println("4. Mengecilkan Volume");
                        System.out.println("0. Keluar");
                        System.out.println();
                        System.out.print("Masukan angka : ");
                        pilihan = masukan.nextInt();

                        if(pilihan == 1){
                            satu.turnOnThePhone();
                        } else if (pilihan == 2){
                            satu.turnOffThePhone();
                        } else if (pilihan == 3){
                            satu.makePhoneLouder();
                        } else if (pilihan == 4){
                            satu.makePhoneSilent();
                        } else if (pilihan == 0){
                            System.exit(0);
                        } else {
                            System.out.println("Pilihan tidak ada");
                        }
                    }

                case 2:
                    System.out.println();
                    System.out.println("Handphone iPhone");
                    while (true) {
                        System.out.println("Silakan Pilih Apa yang Ingin Anda Lakukan");
                        System.out.println("1. Menyalakan HP");
                        System.out.println("2. Mematikan HP");
                        System.out.println("3. Memperbesar Volume");
                        System.out.println("4. Mengecilkan Volume");
                        System.out.println("0. Keluar");
                        System.out.println();
                        System.out.print("Masukan angka : ");
                        pilihan = masukan.nextInt();

                        if(pilihan == 1){
                            dua.turnOnThePhone();
                        } else if (pilihan == 2){
                            dua.turnOffThePhone();
                        } else if (pilihan == 3){
                            dua.makePhoneLouder();
                        } else if (pilihan == 4){
                            dua.makePhoneSilent();
                        } else if (pilihan == 0){
                            System.exit(0);
                        } else {
                            System.out.println("Pilihan tidak ada");
                        }
                    }

                case 3:
                    System.out.println();
                    System.out.println("Handphone Samsung");
                    while (true) {
                        System.out.println("Silakan Pilih Apa yang Ingin Anda Lakukan");
                        System.out.println("1. Menyalakan HP");
                        System.out.println("2. Mematikan HP");
                        System.out.println("3. Memperbesar Volume");
                        System.out.println("4. Mengecilkan Volume");
                        System.out.println("0. Keluar");
                        System.out.println();
                        System.out.print("Masukan angka : ");
                        pilihan = masukan.nextInt();

                        if(pilihan == 1){
                            tiga.turnOnThePhone();
                        } else if (pilihan == 2){
                            tiga.turnOffThePhone();
                        } else if (pilihan == 3){
                            tiga.makePhoneLouder();
                        } else if (pilihan == 4){
                            tiga.makePhoneSilent();
                        } else if (pilihan == 0){
                            System.exit(0);
                        } else {
                            System.out.println("Pilihan tidak ada");
                        }
                    }

                case 4:
                    System.out.println();
                    System.out.println("Handphone Oppo");
                    while (true) {
                        System.out.println("Silakan Pilih Apa yang Ingin Anda Lakukan");
                        System.out.println("1. Menyalakan HP");
                        System.out.println("2. Mematikan HP");
                        System.out.println("3. Memperbesar Volume");
                        System.out.println("4. Mengecilkan Volume");
                        System.out.println("0. Keluar");
                        System.out.println();
                        System.out.print("Masukan angka : ");
                        pilihan = masukan.nextInt();

                        if(pilihan == 1){
                            empat.turnOnThePhone();
                        } else if (pilihan == 2){
                            empat.turnOffThePhone();
                        } else if (pilihan == 3){
                            empat.makePhoneLouder();
                        } else if (pilihan == 4){
                            empat.makePhoneSilent();
                        } else if (pilihan == 0){
                            System.exit(0);
                        } else {
                            System.out.println("Pilihan tidak ada");
                        }
                    }

                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }
        }while (pilihan != 0);

    }
}
