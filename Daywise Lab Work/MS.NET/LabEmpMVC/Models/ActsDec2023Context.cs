using System;
using System.Collections.Generic;
using Microsoft.EntityFrameworkCore;

namespace LabEmpMVC.Models;

public partial class ActsDec2023Context : DbContext
{
    public ActsDec2023Context()
    {
    }

    public ActsDec2023Context(DbContextOptions<ActsDec2023Context> options)
        : base(options)
    {
    }

    public virtual DbSet<Dept> Depts { get; set; }

    public virtual DbSet<Emp> Emps { get; set; }

    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
#warning To protect potentially sensitive information in your connection string, you should move it out of source code. You can avoid scaffolding the connection string by using the Name= syntax to read it from configuration - see https://go.microsoft.com/fwlink/?linkid=2131148. For more guidance on storing connection strings, see https://go.microsoft.com/fwlink/?LinkId=723263.
        => optionsBuilder.UseSqlServer("Data Source=(localdb)\\MsSqlLocalDb;Initial Catalog=ActsDec2023;Integrated Security=true");

    protected override void OnModelCreating(ModelBuilder modelBuilder)
    {
        modelBuilder.Entity<Dept>(entity =>
        {
            entity.HasKey(e => e.DeptNo).HasName("PK__depts__0148CAAE911462D5");

            entity.ToTable("depts");

            entity.Property(e => e.DeptNo).ValueGeneratedNever();
            entity.Property(e => e.DeptName)
                .HasMaxLength(50)
                .IsUnicode(false);
        });

        modelBuilder.Entity<Emp>(entity =>
        {
            entity.HasKey(e => e.EmpNo).HasName("PK__emps__AF2D66D3CBD7D82B");

            entity.ToTable("emps");

            entity.Property(e => e.EmpNo).ValueGeneratedNever();
            entity.Property(e => e.Basic).HasColumnType("decimal(18, 2)");
            entity.Property(e => e.EmpName)
                .HasMaxLength(50)
                .IsUnicode(false);

            entity.HasOne(d => d.DeptNoNavigation).WithMany(p => p.Emps)
                .HasForeignKey(d => d.DeptNo)
                .HasConstraintName("FK_emps");
        });

        OnModelCreatingPartial(modelBuilder);
    }

    partial void OnModelCreatingPartial(ModelBuilder modelBuilder);
}
