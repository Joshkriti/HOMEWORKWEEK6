package week7homework;

public class Question17_Person {

    public String firstName;
    public String lastName;
    public int age;

    public String getFirstName() {
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public void setFirstName(String firstName) {
      String name = firstName;
    }
    public void setLastName(String lastName){
        String name = lastName;
    }
    public boolean setAge (int age) {
        if (age < 0 && age > 100) {
            // int age = age;
            return true;
        } else {
            age = 0;
        }
       // public boolean isTeen() {
            if (age > 12 && age < 20) {
                return true;
            }
            return false;
        }

       /* public String getFullName(); {
            if (firstName.isEmpty()) {
                return lastName;
            }
            if (lastName.isEmpty()){
               return firstName;
            }
            if (firstName.isEmpty() && lastName.isEmpty()){
                return " ";
            }
            else {
              return firstName + " " + lastName;
            } */

        }




