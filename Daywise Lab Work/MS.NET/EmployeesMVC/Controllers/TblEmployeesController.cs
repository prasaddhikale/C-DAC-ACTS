using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.Rendering;
using Microsoft.EntityFrameworkCore;
using EmployeesMVC.Models;

namespace EmployeesMVC.Controllers
{
    public class TblEmployeesController : Controller
    {
        private readonly EmployeesMvcContext _context;

        public TblEmployeesController(EmployeesMvcContext context)
        {
            _context = context;
        }

        // GET: TblEmployees
        public async Task<IActionResult> Index()
        {
            return View(await _context.TblEmployees.ToListAsync());
        }

        // GET: TblEmployees/Details/5
        public async Task<IActionResult> Details(int? id)
        {
            if (id == null)
            {
                return NotFound();
            }

            var tblEmployee = await _context.TblEmployees
                .FirstOrDefaultAsync(m => m.EmployeeId == id);
            if (tblEmployee == null)
            {
                return NotFound();
            }

            return View(tblEmployee);
        }

        // GET: TblEmployees/Create
        public IActionResult Create()
        {
            return View();
        }

        // POST: TblEmployees/Create
        // To protect from overposting attacks, enable the specific properties you want to bind to.
        // For more details, see http://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public async Task<IActionResult> Create([Bind("EmployeeId,EmployeeName,EmployeeCity,EmployeeDob,EmployeeGender,EmployeeSalary")] TblEmployee tblEmployee)
        {
            if (ModelState.IsValid)
            {
                _context.Add(tblEmployee);
                await _context.SaveChangesAsync();
                return RedirectToAction(nameof(Index));
            }
            return View(tblEmployee);
        }

        // GET: TblEmployees/Edit/5
        public async Task<IActionResult> Edit(int? id)
        {
            if (id == null)
            {
                return NotFound();
            }

            var tblEmployee = await _context.TblEmployees.FindAsync(id);
            if (tblEmployee == null)
            {
                return NotFound();
            }
            return View(tblEmployee);
        }

        // POST: TblEmployees/Edit/5
        // To protect from overposting attacks, enable the specific properties you want to bind to.
        // For more details, see http://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public async Task<IActionResult> Edit(int id, [Bind("EmployeeId,EmployeeName,EmployeeCity,EmployeeDob,EmployeeGender,EmployeeSalary")] TblEmployee tblEmployee)
        {
            if (id != tblEmployee.EmployeeId)
            {
                return NotFound();
            }

            if (ModelState.IsValid)
            {
                try
                {
                    _context.Update(tblEmployee);
                    await _context.SaveChangesAsync();
                }
                catch (DbUpdateConcurrencyException)
                {
                    if (!TblEmployeeExists(tblEmployee.EmployeeId))
                    {
                        return NotFound();
                    }
                    else
                    {
                        throw;
                    }
                }
                return RedirectToAction(nameof(Index));
            }
            return View(tblEmployee);
        }

        // GET: TblEmployees/Delete/5
        public async Task<IActionResult> Delete(int? id)
        {
            if (id == null)
            {
                return NotFound();
            }

            var tblEmployee = await _context.TblEmployees
                .FirstOrDefaultAsync(m => m.EmployeeId == id);
            if (tblEmployee == null)
            {
                return NotFound();
            }

            return View(tblEmployee);
        }

        // POST: TblEmployees/Delete/5
        [HttpPost, ActionName("Delete")]
        [ValidateAntiForgeryToken]
        public async Task<IActionResult> DeleteConfirmed(int id)
        {
            var tblEmployee = await _context.TblEmployees.FindAsync(id);
            if (tblEmployee != null)
            {
                _context.TblEmployees.Remove(tblEmployee);
            }

            await _context.SaveChangesAsync();
            return RedirectToAction(nameof(Index));
        }

        private bool TblEmployeeExists(int id)
        {
            return _context.TblEmployees.Any(e => e.EmployeeId == id);
        }
    }
}
