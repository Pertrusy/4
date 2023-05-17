/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/

import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    try {
      Service s = new Service();
      Scanner scan = new Scanner(System.in);
      while(true){
        System.out.println("Co chcesz zrobic?");
        System.out.println("1. Dodaj studenta");
        System.out.println("2. Wyświetl liste studentów");
        int x = scan.nextInt();scan.nextLine();
        switch(x){
          case 1:{
            System.out.println("Wprowadź imie:");
            String name = scan.nextLine();
            System.out.println("Wprowadź nazwisko:");
            String surname = scan.nextLine();
            System.out.println("Wprowadź wiek:");
            int age = scan.nextInt();
            s.addStudent(new Student(name, surname, age));
          } 

            
            break;
          case 2:{
            var students = s.getStudents();
            for(Student current : students){
              System.out.println(current.ToString());
              
            }
            
          }
            break;
            case 0:{
            return;
          }
        }
      }
    }
      
        
      
     catch (IOException e) {

    }
  }
}