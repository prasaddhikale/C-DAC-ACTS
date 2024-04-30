using System;
using System.Collections.Generic;
using Microsoft.EntityFrameworkCore;

namespace EmployeeAPI.Models;

public partial class EmployeesMvcContext : DbContext
{
    public EmployeesMvcContext()
    {
    }

    public EmployeesMvcContext(DbContextOptions<EmployeesMvcContext> options)
        : base(options)
    {
    }

    public virtual DbSet<TblEmployee> TblEmployees { get; set; }

    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
#warning To protect potentially sensitive information in your connection string, you should move it out of source code. You can avoid scaffolding the connection string by using the Name= syntax to read it from configuration - see https://go.microsoft.com/fwlink/?linkid=2131148. For more guidance on storing connection strings, see https://go.microsoft.com/fwlink/?LinkId=723263.
        => optionsBuilder.UseSqlServer("Data Source=(localdb)\\MsSqlLocalDb;Initial Catalog=EmployeesMVC;Integrated Security=true");

    protected override void OnModelCreating(ModelBuilder modelBuilder)
    {
        modelBuilder.Entity<TblEmployee>(entity =>
        {
            entity.HasKey(e => e.EmployeeId).HasName("PK__tbl_Empl__7AD04FF1F1B1E8E4");

            entity.ToTable("tbl_Employees");

            entity.Property(e => e.EmployeeId).HasColumnName("EmployeeID");
            entity.Property(e => e.EmployeeCity).HasMaxLength(50);
            entity.Property(e => e.EmployeeDob).HasColumnName("EmployeeDOB");
            entity.Property(e => e.EmployeeGender).HasMaxLength(10);
            entity.Property(e => e.EmployeeName).HasMaxLength(100);
            entity.Property(e => e.EmployeeSalary).HasColumnType("decimal(18, 2)");
        });

        OnModelCreatingPartial(modelBuilder);
    }

    partial void OnModelCreatingPartial(ModelBuilder modelBuilder);
}
