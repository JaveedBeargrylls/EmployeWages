public class EmployeWage{
public static void main (String[] args){
System.out.println(" Welcome To Emloyee Wage");
int IS_FULL_TIME = 1;
int Wage_per_hour = 20;
int Full_work_hour = 8;
int Emp_wage = 0;
double empCheck = Math.floor(Math.random()*10)%2;
if ( empCheck == IS_FULL_TIME )
	//System.out.println( " Employee is Present ");
	Emp_wage = 1;
else
	//System.out.println(" Employee is Absent ");
	Emp_wage = 0;

	int Emp = Emp_wage * Wage_per_hour * Full_work_hour;
System.out.println("Wage of a employee per day : " + Emp);
}
}
