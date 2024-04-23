using System.Net;

namespace Day2_Assignment_1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");


            Employee o1 = new Employee();
            Employee o2 = new Employee();
            Employee o3 = new Employee();

            Console.WriteLine(o1.EmpNo);
            Console.WriteLine(o2.EmpNo);
            Console.WriteLine(o3.EmpNo);
            Console.WriteLine(o3.EmpNo);
            Console.WriteLine(o2.EmpNo);
            Console.WriteLine(o1.EmpNo);

        }
    }

    public class Employee
    {
        private static int EmpCount;

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
                    Console.WriteLine("Entered Username is Empty, Plz enter valid Username");
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
            get
            {
                return empNo;
            }
        }

        private decimal basic;

        public decimal Basic
        {
            get
            {
                return basic;
            }
            set
            {
                if (value >= 15000 && value <= 80000)
                    basic = value;

                else
                    Console.WriteLine("Invalid value of Basic");
            }
        }

        private short deptNo;
        public short DeptNo
        {

            get
            {
                return deptNo;
            }
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
        public Employee(String name = "null", decimal bais = 20000, short deptNo = 1)
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



