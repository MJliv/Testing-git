package sesi1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// tipe data
		int num = 12;
		double angka = 4.5;
		char huruf = 'a';
		String kalimat = "Hello World";
		boolean cek = true;
//		
//		System.out.println(num);
		
		//input output
		// ctrl + '/' -> comment
		// ctrl + alt + up/down -> copy satu baris ke bawah/atas
//		System.out.println(angka);
//		System.out.print(huruf);
//		System.out.println();
//		System.out.printf("%d", num);
		
//		int n = scan.nextInt();
//		scan.nextLine();
//		String name = scan.nextLine();
//		System.out.println(n);
//		System.out.println(name);
		
		//Operator
		//Arithmetic operator -> perhitungan matematika 
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		System.out.println("Hasil penjumlahan: " + (num1+num2));
//		System.out.println("Hasil perkalian: " + (num1*num2));
//		System.out.println("Hasil sisa pembagian: " + (num1%num2));
		
		//Relational operator -> perbandingan antar variabel
//		boolean cek = true;
//		if(cek != true) {
//			System.out.println("True!");
//		}else {
//			System.out.println("false!");
//		}
//		
		int num1 = 15;
		int num2 = 20;
//		if(num1<num2) {
//			System.out.println("angka 1 lebih kecil dari angka 2");
//		}else if(num1>num2) {
//			System.out.println("angka 1 lebih besar dari angka 2");
//		}else {
//			System.out.println("Kedua angkanya sama");
//		}
		
		//Logical operator -> cek true or false
//		if(num1>=10 && num2 == 20) {
//			System.out.println("Semua kondisi harus true");
//		}
//		if(num1<10 || num2 == 20) {
//			System.out.println("Salah satu true");
//		}
//		if(!(num1==10)) {
//			System.out.println("False!");
//		}
		
		//Assignment operator -> nyimpan sekaligus bisa buat operasi matematika
//		System.out.println("num1 ditambah 10: " + (num1+=10));
//		System.out.println("num2 dikali 2: " + (num2*=2));
		
		//Selection
		// if, else if
//		int age = 50;
//		int tinggi = 160;
//		if(age == 20 && tinggi == 160) {
//			System.out.println("umurnya 10 dan tingginya 160cm");
//		}else if(age<20) {
//			System.out.println("umurnya kecil dari 20");
//		}else {
//			System.out.println("udah tua");
//		}
		
		//Switch case
//		int input = scan.nextInt();
//		switch(input) {
//			case 1:
//				System.out.println("angka 1");
//				break;
//			case 2:
//				System.out.println("angka 2");
//				break;
//			case 9:
//				System.out.println("angka 9");
//				break;
//			default:
//				System.out.println("tidak ada");
//				break;
//		}
		
		//Ternary operator
//		int check = 10;
//		String hasil = (check != 10) ? "check isinya 10" : "check bukan 10";
//		System.out.println(hasil);
		
		// Repetition
//		for(int i=1; i<10; i++) {
//			System.out.println("Halo");
//			if(i==5) {
//				break;
//			}
//		}
		
//		int j = 1;
//		while(j<=10) {
//			System.out.println("tes");
//			j++;
//		}
		
//		int j = 1;
//		do {
//			System.out.println("tes");
//			j++;
//		}while(j<=10);
		
		
		int umur;
		do {
			System.out.println("Masukkan umur[10-20]: ");
			umur = scan.nextInt();
			scan.nextLine();
		}while(umur<10 || umur>20);
		
		String name;
		do {
			System.out.println("Masukkan nama anda[>5 char]: ");
			name = scan.nextLine();
		}while(name.length()<=5);
		
		System.out.println("validation success!");
		

	}

}
