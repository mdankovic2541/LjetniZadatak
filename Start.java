package dankovic.ljetnizadatak;

import java.util.List;

import javax.swing.JOptionPane;

public class Start {

	public Start() {
		izbornik();
		Baza.zatvoriVezu();
	}

	private void izbornik() {
		System.out.println("1. Izlistaj...");
		System.out.println("2. Unesi novo... ");
		System.out.println("3. Promijeni...");
		System.out.println("4. Obriši...");
		System.out.println("5. Link na kod na github-u.");
		System.out.println("6. Link na ERA na github-u.");
		System.out.println("7. Izlaz iz programa.");
		izvedi();
	}

	private void izbornik2() {
		System.out.println("1. Izlistaj vozače.");
		System.out.println("2. Izlistaj vozila.");
		System.out.println("3. Izlistaj vožnje.");
		izvedi2();
	}

	private void izvedi2() {
		switch (Pomocno.ucitajBroj("Unesite broj za željenu akciju.")) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		}
	}

	private void izbornik3() {
		System.out.println("1. Unesi novog vozača.");
		System.out.println("2. Unesi novo vozilo.");
		System.out.println("3. Unesi novu vožnju.");
		izvedi3();
	}

	private void izvedi3() {
		switch (Pomocno.ucitajBroj("Unesite broj za željenu akciju.")) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		}
	}

	private void izbornik4() {
		System.out.println("1. Promijeni vozača.");
		System.out.println("2. Promijeni vozilo.");
		System.out.println("3. Promijeni vožnju.");
		izvedi4();
	}

	private void izvedi4() {
		switch (Pomocno.ucitajBroj("Unesite broj za željenu akciju.")) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		}
	}

	private void izbornik5() {
		System.out.println("1. Obriši vozača.");
		System.out.println("2. Obriši vozilo.");
		System.out.println("3. Obriši vožnju.");
		izvedi5();
	}

	private void izvedi5() {
		switch (Pomocno.ucitajBroj("Unesite broj za željenu akciju.")) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		}
	}

	private void izvedi() {
		switch (Pomocno.ucitajBroj("Unesite broj za željenu akciju.")) {
		case 1:
			izbornik2();
			izbornik();
			break;
		case 2:
			izbornik3();
			izbornik();
			break;
		case 3:
			izbornik4();
			izbornik();
			break;
		case 4:
			izbornik5();
			izbornik();
			break;
		case 5:
			izbornik();
			break;
		case 6:
			izbornik();
			break;
		default:
			break;
		}

	}

	public static void main(String[] args) {
		new Start();
	}
}
