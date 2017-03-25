package pl.modultrzeci_java;

import java.util.Arrays;

public class Tabele {

	public static void main(String[] args) {

		int[] tabelka = { 1, 2, 3, 4, 5 }; // inicjujemy tabele
		int[] tabela = { 2, 3, 78, 4, 85, 24, 6, 4 };

		// sprawdzamy 1 metode
		int sum = sum(tabelka);
		System.out.println(sum);
		// sprawdzamy 2 metode
		String suma = toString(tabelka);
		System.out.println(suma);
		// sprawdzamy 3 metode
		int[] newTabelka = addN(tabelka, 1);
		for (int i : newTabelka) {
			System.out.print(" " + i + " ");
		}
		System.out.println();
		// sprawdzamy 4 metode
		int[] newTabel = reverse(tabelka);
		for (int i : newTabel) {
			System.out.print(" " + i + " ");
		}
		System.out.println();
		// sprawdzamy 5 metode
		boolean zawieraN = hasN(tabelka, 6);
		System.out.println("Czy zawiera tabelka liczbe 6?");
		System.out.println(zawieraN);
		System.out.println("Czy zawiera tabelka liczbe 1?");
		zawieraN = hasN(tabelka, 1);
		System.out.println(zawieraN);

		System.out.println();
		// sprawdzamy 6 metode
		for (int i : tabela) {
			System.out.print(" " + i + " ");
		}
		System.out.println();

		replaceAll(tabela, 4, 2);
		for (int i : tabela) {
			System.out.print(" " + i + " ");
		}
		System.out.println();
		System.out.println("Before sorting: ");

		for (int i : tabela) {
			System.out.print(" " + i + " ");
		}
		System.out.println();
		int[] sortedArray = sort(tabela);
		System.out.println("After sorting: ");
		for (int i : sortedArray) {
			System.out.print(" " + i + " ");
		}
	}

	private static int sum(int[] arr) {
		int suma = 0;
		for (int i = 0; i < arr.length; i++) {
			suma += arr[i];
		}
		return suma;
	}

	private static String toString(int[] arr) {
		String str = Arrays.toString(arr);
		return str;
	}

	private static int[] addN(int[] arr, int n) {
		int[] newTabelka = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			newTabelka[i] = arr[i] + n;
		}
		return newTabelka;
	}

	private static int[] reverse(int[] arr) {
		int j = 0;
		int[] revTabelka = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			revTabelka[j] = arr[i];
			j++;
		}
		return revTabelka;
	}

	private static boolean hasN(int[] arr, int n) {
		int i = 0;
		while (i != arr.length) {
			if (arr[i] == n) {
				return true;
			}
			i++;
		}
		return false;
	}

	private static void replaceAll(int[] arr, int old, int nw) {
		int i = 0;
		while (i != arr.length) {
			if (arr[i] == old) {
				arr[i] = nw;
			}
			i++;
		}
	}

	private static int[] sort(int[] arr) {
		int[] sort = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			sort[i] = arr[i];
		}

		int temp = 0;
		// SORTING ALGORITHM (BUBBLES )
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (sort[j] > sort[j + 1]) {
					temp = sort[j];
					sort[j] = sort[j + 1];
					sort[j + 1] = temp;
				}
			}
		}
		return sort;
	}

}
