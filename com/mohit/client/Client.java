package com.mohit.client;

import java.util.Scanner;

import com.mohit.presentation.ProjectPresentation;
import com.mohit.presentation.ProjectPresentationImpl;

public class Client {

	public static void main(String[] args) {
		ProjectPresentation projectPresentation=new ProjectPresentationImpl();
		Scanner scanner=new Scanner(System.in);
		while(true) {
			projectPresentation.showMenu();
			System.out.println("Enter Choice ");
			int choice=scanner.nextInt();
			projectPresentation.performMenu(choice);
					
		}
	}

}
