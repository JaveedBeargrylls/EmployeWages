public class EmployeWage{
public static void main (String[] args){
System.out.println(" Welcome To Emloyee Wage");
int IS_FULL_TIME = 1;
int Wage_per_hour = 20;
int IS_PART_TIME = 2;
int Emp_wage_hour = 0;
double empCheck = Math.floor(Math.random()*10)%3;
if ( empCheck == IS_FULL_TIME )
	//System.out.println( " Employee is Present ");
	Emp_wage_hour = 8 ;
else if ( empCheck == IS_PART_TIME )
	//System.out.println(" Employee is Absent ");
	Emp_wage_hour = 4;
else

	Emp_wage_hour = 0;

	int Emp = Emp_wage_hour * Wage_per_hour;
System.out.println("Wage of a employee per day : " + Emp);
}
}
