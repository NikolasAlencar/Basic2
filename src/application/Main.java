package application;

import java.util.Locale;

import java.util.Scanner;

//import util.Count;

import entities.Rooms;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		Rooms[] vector = new Rooms[n];
		
		
		for (int i=0; i<vector.length; i++) {
			//vector[i] = new Rooms();
			//vector[i].setRent(i);
			//System.out.printf("Rent #%d%n", vector[i].getRent());
			System.out.printf("Rent #%d%n", i+1);
			System.out.println("Name :");
			sc.nextLine();
			String name = sc.nextLine();
			//vector[i].setName(name);
			System.out.println("Email :");
			//sc.nextLine();
			String email = sc.nextLine();
			//vector[i].setEmail(email);
			System.out.println("Room: ");
			//sc.nextLine();
			int room = sc.nextInt();
			//vector[i].setRoom(room);
			vector[i] = new Rooms(name, email, room);
		}
		
		System.out.println("Busy rooms:");
		
		for (int i=0; i<vector.length; i++) {
			System.out.printf("%d: %s, %s%n", vector[i].getRoom(), vector[i].getName(), vector[i].getEmail());
		}

		sc.close();
		
		
	}
}