package Mentoring.EmployeeProject;

public class Employee {

    String name;
    double salary;
    double workHours;
    double hireYear;
    public Employee (String name, double salary, double workHours, double hireYear){
        this.name=name;
        this.salary=salary;
        this.hireYear=hireYear;
        this.workHours=workHours;
    }
    //TAX METHOD
    public double taxMethod(){
        double totaltax;
        if(salary<1000){
            totaltax=0;
        }else{
            totaltax=salary*0.3;
        }
        return totaltax;
    }
    //BOnus METHOD
    public double bonusMethod(){
        double totalBonus;
        if(workHours<40){
            totalBonus=0;
        }else{
            totalBonus=(workHours-40)*30;
        }
        return totalBonus;
    }
    public double raiseSalaryMethod(){
        double year=2021-hireYear;
        double raised;
        if(year<=10){
            raised=salary*0.05;
        }else if(year<=20 && year >10){
            raised=salary*0.1;
        }else {
            raised=salary*0.15;
        }
        return raised;
    }
    public void info(){
        System.out.println("Name : "+name);
        System.out.println("Salary "+salary);
        System.out.println("Work hours "+workHours);
        System.out.println("Hire year "+hireYear);
        System.out.println("Tax "+taxMethod());
        System.out.println("Bonus "+bonusMethod());
        System.out.println("Raise salary "+raiseSalaryMethod());
        System.out.println("Salary with tax and bonus "+(salary+bonusMethod()-taxMethod()));
        System.out.println("Total salary "+(salary+bonusMethod()-taxMethod()+raiseSalaryMethod()));

    }

}