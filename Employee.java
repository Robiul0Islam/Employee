import java.util.EnumSet;

import javax.lang.model.util.ElementScanner14;

public class Employee{
    private String ID;
    private String name;
    private int age;
    private char gender;
    private float salary;
    Employee(){

    }
    Employee(String ID,String name,int age,char gender,float salary){
        this.ID=ID;
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.salary=salary;

    }
    public void setID(String ID){
        this.ID=ID;
    }
    public void setname(String name){
        this.name=name;
    }
    public void setage(int age){
        this.age=age;
    }
    public void setgender(char gender){
        this.gender=gender;
    }
    public void setsalary(float salary){
        this.salary=salary;
    }
    public String getID(){
        return ID;
    }
    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
    public char getgender(){
        return gender;
    }
    public float getsalary(){
        return salary;
    }
    public String toString(){
        return "[ID: "+ID+" Name: "+name+" Age: "+age+" Gender: "+gender+" Salary: "+salary+"]";
    }
    public boolean equals(Employee b){
        if(this.getID().equals(b.getID())&&(this.getname().equals(b.getname()))&&(this.getage()==b.getage())&&(this.getgender()==b.getgender())&&(this.getsalary()==b.getsalary())){
            return true;
        }
        else return false;
        
    }
    
   
}