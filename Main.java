package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        SinglyLinkedList<Pegawai> linkedList = new SinglyLinkedList<>("Pegawai");
        linkedList.insertAtFront(new Pegawai("345", "Eki", "IT"));

        Scanner scan = new Scanner(System.in);
        boolean kondisi = true;
        while (kondisi) {
            menu();
            int input = scan.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Masukkan data");
                    System.out.println("Tuliskan nip, nama dan divisi pegawai");
                    String nip = scan.next();
                    String nama = scan.next();
                    String divisiPegawai = scan.next();
                    System.out.println("Tambahkan data di awal list? (y/n)");
                    if (scan.next().equals("y")) {
                        linkedList.insertAtFront(new Pegawai(nip, nama, divisiPegawai));
                    } else {
                        linkedList.insertAtBack(new Pegawai(nip, nama, divisiPegawai));
                    }
                    break;
                case 2:
                    System.out.println("Hapus data di awal list? (y/n)");
                    if (scan.next().equals("y")) {
                        linkedList.removeFromFront();
                    } else {
                        linkedList.removeFromBack();
                    }
                    break;
                case 3:
                    linkedList.print();
                    break;
                default:
                    kondisi = false;
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("Pilihlah menu:");
        System.out.println("1. Input data");
        System.out.println("2. Hapus data");
        System.out.println("3. Cetak data pegawai");
        System.out.println("4. keluar");
    }
}