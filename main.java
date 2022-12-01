import java.util.*;
public class main {
    public static int n=0;
    public static Employee[] employees=new Employee[3];
    public static boolean alreadyExists(Employee b){
    if(n==0)
    {
        return false;
    }
    else{
        for(int i=0;i<n;i++){
            if(employees[i].equals(b)){
                return true;
            }
        }
    }
    return false;
   }
   public static void searchByGender(char g){
    for(int i=0;i<n;i++){
        if(g==employees[i].getgender()){
            System.out.println(employees[i].toString());
        }
    }
   }
   public static void updateSalary(float r){
    for(int i=0;i<n;i++){
        employees[i].setsalary(employees[i].getsalary()+(employees[i].getsalary())*(r/100));
        System.out.println(employees[i].toString());
    }
   }
    public static void main(String[] args) {
        for(int i=0; ;i++){
        System.out.println("Exit: 0");
        System.out.println("Continue: 1");
        System.out.println("search by gender: 2");
        System.out.println("Update salary: 3");
        System.out.println("All details: 4");
        Scanner a=new Scanner(System.in);
        int choice=a.nextInt();
        if(choice==0){
            break;
        }
        else if(choice==1){
        String ID=a.next();
        String name=a.next();
        int age=a.nextInt();
        char gender=a.next().charAt(0);
        float salary=a.nextFloat();
        Employee b =new Employee(ID, name, age, gender, salary);
        
        if(!alreadyExists(b)){
            employees[n++]=b;
        }
        }
        else if(choice==2){
            System.out.println("Enter the Gender to search: ");
            char Gender=a.next().charAt(0);
            searchByGender(Gender);
        }
        else if(choice==3){
            System.out.println("Enter the rate: ");
            float rate=a.nextInt();
            updateSalary(rate);
        }
        else if(choice==4){
            for(int j=0;j<n;j++){
                System.out.println(employees[j].toString());

            }
        }
        
        
        }
        

    }
}
