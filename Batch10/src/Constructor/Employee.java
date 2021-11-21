package Constructor;

import Mentoring.GetTheDigitAndSum;

public class Employee {
    String name;
    int age;
    int employeeId;
    String gender;
    String companyName="Techtorial";

    public int setEmployeeId(int id){
        employeeId=id;
        return employeeId;
    }
    public Employee (){}

 public Employee (String newGender){
        gender=newGender;




    }
}
