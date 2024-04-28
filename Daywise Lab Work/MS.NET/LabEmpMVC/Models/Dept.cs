using System;
using System.Collections.Generic;

namespace LabEmpMVC.Models;

public partial class Dept
{
    public int DeptNo { get; set; }

    public string? DeptName { get; set; }

    public virtual ICollection<Emp> Emps { get; set; } = new List<Emp>();
}
