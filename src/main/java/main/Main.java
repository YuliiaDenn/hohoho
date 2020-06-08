package main;

import entity.User;
import service.Notepad;

public class Main {

	public static void main(String[] args) {
		
		User user = new User();
		Notepad note = new Notepad();
		
		System.out.println(note.chooseAllRecords());
		System.out.println(note.chooseRecordById(1));
		System.out.println(note.chooseRecordsByName("Ivan"));
		System.out.println(note.chooseRecordsBySurname("Petrov"));
	}

}
