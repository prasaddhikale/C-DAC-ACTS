using System.Transactions;

namespace day3Assignment2EmployeeMaxSalary
{
    internal class Program
    {

       



        static void Main(string[] args)
        {

            Employee[] employees = new Employee[2];


            for (int i = 0; i < employees.Length; i++)
            {
                Console.Write("Enter employee name(not blank) , basic salary(>10000 & <70000), deptNo(>0)");

                string name = Console.ReadLine();
                decimal salary = Convert.ToDecimal(Console.ReadLine());
                short deptNo =  short.Parse(Console.ReadLine());

                employees[i] = new Employee(name,salary,deptNo);
            }

            Console.WriteLine(EmpDetails(2,employees) );

            Console.WriteLine(getMaxSalary(employees));


        }

        public static String EmpDetails(int empNo, Employee[] employees)
        {
            for (int i = 0; i < employees.Length; i++)
            {
                if (employees[i].EmpNo == empNo)
                    return employees[i].Name;
            }
            return "Not found";
        }

        public static String getMaxSalary(Employee[] employees)
        {
            Employee employee = null;
            decimal max = 0;
            decimal salary;
            for (int i = 0; i < employees.Length; i++)
            {
                salary = employees[i].Basic;

                if (salary > max)
                {
                    max = salary;
                    employee = employees[i];
                }
            }


            if (employee != null)
                return employee.ToString();
            else
                return "error";
        }

    }
    public class Employee
    {
        private static int EmpCount;

        public override string? ToString()
        {
            return $"empNo : {EmpNo}   , name : {name} , basic salary : {basic}, dept : {deptNo} ";
        }

        static Employee()
        {
            EmpCount = 0;
        }
        private string name;
        public string Name
        {
            get
            {
                return name;
            }
            set
            {

                if (string.IsNullOrEmpty(value))
                {
                    Console.WriteLine("Entered Username is Emppty please Pls enter valid name");
                }
                else
                {

                    name = value;
                }
            }
        }
        private int empNo;
        public int EmpNo
        {
            get { return empNo; }
        }
        private decimal basic;
        public decimal Basic
        {
            get { return basic; }
            set
            {

                if (value >= 10000 && value <= 70000)
                    basic = value;
                else
                    Console.WriteLine("Invalid value of basic");

            }
        }

        private short deptNo;
        public short DeptNo
        {
            get { return deptNo; }
            set
            {

                if (value <= 0)
                {
                    Console.WriteLine("Invalid dept no");

                }
                else
                {
                    deptNo = value;
                }

            }
        }

        public Employee(string name = "null", decimal basic = 11000, short deptNo = 1)
        {
            this.Name = name;
            this.Basic = basic;
            this.DeptNo = deptNo;
            empNo = ++EmpCount;
        }


        public decimal GetNetSalary()
        {
            return this.basic + basic * 1 / 10;
        }

        


    }
}
//Create an array of Employee class objects
//        Accept details for all Employees
//        Display the Employee with highest Salary
//        Accept EmpNo to be searched. Display all details for that employee.

