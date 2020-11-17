/**
	Copyright 2020 Dark Dead Dragon (ak LeonardoDarkVinchi)
	License by GNU GPLv3
*/

package TeCu;

import java.awt.*;
import java.awt.event.*;
import java.lang.*;
import javax.swing.*;


public class Task1 {
	
	public Task1() {
		
	}
	
	private static void outputAnswer() {
		String answer = "\n Во первых: код представленный в задаче неработоспособен, т.к. содержит несколько ошибок:\n";
		answer += "Ошибка 1: Инициализация объекта вложенного класса из статической функции.\n";
		answer += "Ошибка 2: Отсутствует конструктор класса Employee.\n";
		answer += "Ошибка 3: Класс Vacancy всегда возвращает строку \"engineer\".\n";
		answer += "Ошибка 4: Vacancy vacancy никогда не инициируется.\n";
		answer += "Ошибка 5: Из-за ошибки 2 id также не сохраняется.\n";
		answer += "Ошибка 6: Отсутствует конструктор класса Vacancy.\n";
		answer += "Ошибка 7: Отсутствует переменная в которой хранилось бы значение класса Vacancy.\n";
		answer += "Далее вы видите результат работы исправленного варианта.\n";
		
		System.out.println(answer);
	}
	
	public static void main(String[] args) {
		outputAnswer(); 
		Employee tester = new Task1().new Employee(7,"Developer");
		System.out.println(tester.getId());
		System.out.println(tester.getVacancy());
	}
		
	class Employee {
		private long id;
		private Vacancy vacancy;
		
		Employee(long id, String vacancy) {
			this.id = id;
			this.vacancy = new Vacancy(vacancy);
		}
		
		String getVacancy() {
			return vacancy.getVacancy();
		}
		
		long getId() {
			return id;
		}
	}
	
	
	class Vacancy {
		private String vacancy;
		
		Vacancy(String vacancy) {
			this.vacancy = vacancy;
		}
		
		String getVacancy() {
			return vacancy;
		}
	}
		
}

