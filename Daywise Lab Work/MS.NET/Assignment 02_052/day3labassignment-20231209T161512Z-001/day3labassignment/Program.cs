namespace day3labassignment
{
    internal class Assignment2
    {
        //static void Main(string[] args)
        //{
        //    Console.WriteLine("Hello, World!");
        //}
    }


    public abstract class Employee : IDbFunctions
    {

        private static int EmpCount;

        static Employee()
        {
            EmpCount = 0;
        }
        protected short deptNo;
        protected int empNo;
        protected string name;
        protected decimal basic;

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
        public int EmpNo
        {
            get { return empNo; }
        }


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
        public abstract decimal Basic
        {
            get;
            set;
        }

        public Employee(string name = "null", decimal basic = 11000, short deptNo = 1)
        {
            
            this.Name = name;
            this.Basic = basic;
            this.DeptNo = deptNo;
            empNo = ++EmpCount;
        }

        public abstract decimal GetNetSalary();

        public void Insert()
        {
            Console.WriteLine("Insert Method ");
        }

        public void Update()
        {
            Console.WriteLine("Update Method ");
        }

        public void Delete()
        {
            Console.WriteLine("Delete Method ");
        }
    }

    //Manager: Employee
    //   Prop

    //    string Designation -> cant be blank
    public class Manager : Employee, IDbFunctions
    {
        public Manager(string name = "null", decimal basic = 11000, short deptNo = 1, string Designation=" ") : base(name,basic,deptNo)
        {

            this.Designation = Designation; 
        }

        string? designation;

        string Designation
        {
            get { return designation; }
            set
            {
                if (string.IsNullOrEmpty(value))
                    Console.WriteLine("Invalid value for Designation");
                else 
                    designation = value; 
            }
        }
        public override decimal Basic { 
            get { 
                return basic; 
            } 
            set {
                if (value >= 30000 && value <= 100000)
                    basic = value;
                else
                    Console.WriteLine("Invalid value of basic");

            }
        }

        public override decimal GetNetSalary()
        {
            return Basic + 10000;
        }
    }
    //GeneralManager : Manager
    //   Prop
    // 	string Perks -> no validations
    public class GeneralManager : Employee, IDbFunctions
    {
        string? perks;
        public string Perks
        {
            get;
            set;
        }
        public override decimal Basic { 
            get { return basic; }
            set
            {
                if (value >= 50000 && value <= 150000)
                    basic = value;
                else
                    Console.WriteLine("Invalid value of basic");
            } 
        }

        public GeneralManager(string name = "null", decimal basic = 11000, short deptNo = 1, string Perks = " ") : base(name, basic, deptNo)
        {

            this.Perks = Perks;
        }

        public override decimal GetNetSalary()
        {
            return basic + 20000;
        }
    }
    //CEO : Employee
    //      Make CalNetSalary() a sealed method
    public class CEO : Employee, IDbFunctions
    {
        public override decimal Basic {
            get { return basic; }
            set
            {
                if (value >= 100000 && value <= 700000)
                    basic = value;
                else
                    Console.WriteLine("Invalid value of basic");
            }
        }
        public sealed override decimal GetNetSalary()
        {
            return Basic + 40000;
        }

        public  CEO(string name = "null", decimal basic = 11000, short deptNo = 1) : base(name, basic, deptNo)
        {
 
        }
    }

    public interface IDbFunctions
    {
        void Insert();
        void Update();
        void Delete();
    }

}




//Create the following classes
//Employee
//   Prop	
//	string Name -> no blanks
//	int EmpNo -> readonly, autogenerated
//	short DeptNo -> > 0

//    abstract decimal Basic
//   Methods
//    abstract decimal CalcNetSalary()


//Manager: Employee
//   Prop

//    string Designation -> cant be blank


//GeneralManager : Manager
//   Prop
// 	string Perks -> no validations

//CEO : Employee
//      Make CalNetSalary() a sealed method

//NOTE : Overloaded constructors in all classes calling their base class constructor
//All classes must implement IDbFunctions interface
//All classes to override the abstract members defined in the base class(Employee). Basic property to have different validation in different classes.
//CalcNetSalary() to have different validation in different classes.