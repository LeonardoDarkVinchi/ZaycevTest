/**
	Copyright 2020 Dark Dead Dragon (ak LeonardoDarkVinchi)
	License by GNU GPLv3
*/

package TeCu;

import java.awt.*;
import java.awt.event.*;
import java.lang.*;
import javax.swing.*;
import java.util.*;
import java.util.regex.*;

public class Task2 {
	
	public Task2() {
		
	}
	
	/**
	Просто тестовая функция, чтобы показать функционал искомой
	Здесь нет защиты от неправильного ввода, потому что к ней я не стремился. 
	*/
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите список цен через пробел:");
		String input = in.nextLine();
		Pattern pattern = Pattern.compile("\\s");
		String[] strings1 = pattern.split(input);
		int[] price = new int[strings1.length];
		for (int i = 0; i < strings1.length; i++) {
			price[i] = Integer.parseInt(strings1[i]);
		}
		System.out.println("Введите скидку:");
		input = in.nextLine();
		int discount = Integer.parseInt(input);
		System.out.println("Введите начальную позицию применения скидки:");
		input = in.nextLine();
		int offset = Integer.parseInt(input);
		System.out.println("Введите колличество позиций применения скидки:");
		input = in.nextLine();
		int readLength = Integer.parseInt(input);
		
		int[] answer = decryptData(price, discount, offset, readLength);
		
		System.out.println("Результат после применения скидки:");
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + ((i < answer.length - 1)?",":"\n"));
		}
	}
	
	/**
	* Метод "скидка". Применяет скидку discount к цене price, начиная с позиции
	offset
	* на количество позиций readLength. Новые цены округляем “вниз”,
	* до меньшего целого числа.
	* @param price - исходные цены.
	* @param discount - % скидки, от 1 до 99.
	* @param offset - номер позиции, с которой нужно применить скидку.
	* @param readLength - количество позиций, к которым нужно применить скидку.
	* @return - массив новых цен.
	*/
	public static int[] decryptData(int[] price, int discount, int offset, int readLength) {
		int[] newPrice = new int[readLength];
		for (int i = offset; i < offset + readLength; i++) {
			newPrice[i - offset] = (int)Math.floor(price[i] * (100 - discount) / 100.0);
		}
		return newPrice;
	}
	
}

