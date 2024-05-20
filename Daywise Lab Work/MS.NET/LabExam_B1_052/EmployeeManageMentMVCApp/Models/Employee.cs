using Microsoft.Data.SqlClient;
using System.ComponentModel.DataAnnotations;

namespace EmployeeManageMentMVCApp.Models
{
    public class Employee
    {
        [Required]
        public int Id { get; set; }
        [DataType(DataType.Text)]
        [Required(ErrorMessage = "First Name is required")]
        public string Name { get; set; }
        [DataType(DataType.Text)]
        [Required(ErrorMessage = "City is required")]
        public string City { get; set; }
        [DataType(DataType.Text)]
        [Required(ErrorMessage = "Address is required")]
        public string Address { get; set; }

        public static List<Employee> GetAllEmployees()
        {
            var employees = new List<Employee>();
            SqlConnection conn = new SqlConnection();
            conn.ConnectionString = @"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=EmployeeDB;Integrated Security=True";
            try
            {
                conn.Open();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = conn;
                cmd.CommandType= System.Data.CommandType.Text;
                cmd.CommandText = "select * from Employees";
                SqlDataReader dr = cmd.ExecuteReader();
                while (dr.Read())
                {
                    employees.Add(new Employee {Id=dr.GetInt32(0),Name=dr.GetString(1),City=dr.GetString(2),Address=dr.GetString(3) });
                }

            }
            catch(Exception ex)
            {
                throw;
            }
            finally { conn.Close(); }
            return employees;
        }

        public static void Insert(Employee emp)
        {
            SqlConnection conn = new SqlConnection();
            conn.ConnectionString = @"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=EmployeeDB;Integrated Security=True";
            try
            {
                conn.Open();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = conn;
                cmd.CommandType = System.Data.CommandType.Text;
                cmd.CommandText = "insert into Employees values(@Name,@City,@Address)";
                cmd.Parameters.AddWithValue("@Name", emp.Name);
                cmd.Parameters.AddWithValue("@City", emp.City);
                cmd.Parameters.AddWithValue("@Address", emp.Address);
                cmd.ExecuteNonQuery();
            }
            catch (Exception ex)
            {
                throw;
            }
            finally { conn.Close(); }
        }

        public static Employee GetSingleEmployee(int id)
        {
            Employee obj = new Employee();
            SqlConnection conn = new SqlConnection();
            conn.ConnectionString = @"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=EmployeeDB;Integrated Security=True";
            try
            {
                conn.Open();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = conn;
                cmd.CommandType = System.Data.CommandType.Text;
                cmd.CommandText = "select * from Employees where Id=@Id";
                cmd.Parameters.AddWithValue("@Id", id);
                SqlDataReader dr = cmd.ExecuteReader();
                if(dr.Read())
                {
                    obj.Id = dr.GetInt32(0);
                    obj.Name = dr.GetString(1);
                    obj.City = dr.GetString(2);
                    obj.Address = dr.GetString(3);
                }
                else
                {
                    obj = null;
                }

            }
            catch (Exception ex)
            {
                throw;
            }
            finally { conn.Close(); }
            return obj;
        }

        internal static void Delete(int id)
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = @"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=EmployeeDB;Integrated Security=True";
            try
            {
                cn.Open();
                SqlCommand cmdInsert = new SqlCommand();
                cmdInsert.Connection = cn;
                cmdInsert.CommandType = System.Data.CommandType.Text;
                cmdInsert.CommandText = "delete from Employees where Id =@Id";
                cmdInsert.Parameters.AddWithValue("@Id", id);
                cmdInsert.ExecuteNonQuery();
            }
            catch (Exception ex)
            {
                throw;
            }
            finally
            {
                cn.Close();
            }
        }
    }


}
