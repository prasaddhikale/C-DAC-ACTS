using System;
using System.Collections.Generic;

namespace LabEmpMVC.Models;

public partial class Emp
{
    public int EmpNo { get; set; }

    public string? EmpName { get; set; }

    public decimal? Basic { get; set; }

    public int? DeptNo { get; set; }

    public virtual Dept? DeptNoNavigation { get; set; }
}
