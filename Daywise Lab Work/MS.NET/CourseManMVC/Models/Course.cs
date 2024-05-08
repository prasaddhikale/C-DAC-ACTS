using System;
using System.Collections.Generic;

namespace CourseManMVC.Models;

public partial class Course
{
    public int CourseId { get; set; }

    public string CourseName { get; set; } = null!;

    public virtual ICollection<Student> Students { get; set; } = new List<Student>();
}
