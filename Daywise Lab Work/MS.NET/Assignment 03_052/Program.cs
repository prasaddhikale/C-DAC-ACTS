using System.Runtime.Serialization;

namespace Employee1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            
            try {
                Employee.InvalidBasic += Employee_InvalidBasic;
                Console.WriteLine("Adding employee 1: ");
                Employee employee3 = new Employee(name: "BBB", basic: 25000, deptNo: 5);

                Console.WriteLine("Adding employee 2: ");
                Employee employee4 = new Employee(name: "BBB", basic: 5000, deptNo: 5);
                
                Console.WriteLine("Adding employee 3: ");
                Employee employee5 = new Employee(name: "BBB", basic: 5000, deptNo: -1);
            } catch(ApplicationException e) {
                Console.WriteLine(e.Message); 
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }



        }

        private static void Employee_InvalidBasic()
        {
            Console.WriteLine("Invalid Basic sal!!");
            Console.WriteLine("Event Handled Successfully!!!");
        }
    }


    /*Properties
    ----------
    string Name -> no blank names should be allowed
    int EmpNo -> must be greater than 0
    decimal Basic -> must be between some range
    short DeptNo -> must be > 0
     */
    public delegate void Del1(); 

    public class Employee {
        private string name;
        public String Name { 
            get { return name; }
            set {
                if (String.IsNullOrEmpty(value))
                    throw new EmployeeException("Name not provided");
                else
                    name = value;
            }
        }

        private int empNo;
        public int EmpNo { 
            get { return empNo; }
            private set {
                if (value < 0)
                    Console.WriteLine("Invalid empNo");
                else
                    empNo = value;
            }
        }

        public static event Del1 InvalidBasic;
        
        private decimal basic;
        public decimal Basic {
            get { return basic; }
            set
            {
                if (value < 10000 || value > 100000)
                    InvalidBasic();
                else
                    basic = value;
            }
        }

        private short deptNo;
        public short DeptNo {
            get { return deptNo; }
            set
            {
                if (value < 0)
                    throw new EmployeeException("Dept number not valid!!"); 
                else
                    deptNo = value;
            }
        }

        private static int empCount = 0;

        public Employee(string name = "Emp1", decimal basic = 10000 ,short deptNo = 20)
        {
            this.EmpNo = ++empCount;
            this.DeptNo = deptNo; 
            this.Basic = basic; 
            this.Name = name;
        }

        public decimal GetNetSalary()
        {
            return this.Basic * (decimal)1.18;
            //return Decimal.Multiply(this.Basic,Convert.ToDecimal(1.18));
        }

        public override string ToString()
        {
            return "Employee name: " + this.Name + " Employee ID: " + this.EmpNo + " Employee Dept: " + this.DeptNo + " Employee Salary: " + this.GetNetSalary();
        }
    }

    [Serializable]
    internal class EmployeeException : ApplicationException
    {
        public EmployeeException()
        {
        }

        public EmployeeException(string? message) : base(message)
        {
        }
    }
}