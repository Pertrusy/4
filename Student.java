public class Student {

  private String Name;
  private String Surname;
  private int Age;
  private String Date;

  public Student(String name, String surname, int age, String date) {
    Name = name;
    Surname = surname;
    Age = age;
    Date = date;
  }

  public String GetName() {return Name;}
  public String GetSurname() {return Surname;}
  public int GetAge() {return Age;}
  public String GetDate() {return Date;}

  public String ToString() {
    return Name + " " + Surname +  " " + Integer.toString(Age) + " " + Date;
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 4) 
      return new Student("error", "surname error", -1 ,  "age error");
    return new Student(data[0], data[1], Integer.parseInt(data[2]), data[3]);
  }
}