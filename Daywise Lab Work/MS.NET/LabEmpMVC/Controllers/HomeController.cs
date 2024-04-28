using LabEmpMVC.Models;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.Rendering;
using Microsoft.EntityFrameworkCore;
using System.Diagnostics;

namespace LabEmpMVC.Controllers
{
    public class HomeController : Controller
    {
        private readonly ILogger<HomeController> _logger;
        private readonly ActsDec2023Context _context;
        public HomeController(ILogger<HomeController> logger, ActsDec2023Context context)
        {
            _logger = logger;
            _context = context;
        }

        public IActionResult Index()
        {
            return View();
        }
        public async Task<IActionResult> ViewEmployee()
        {
            var actsDec2023Context = _context.Emps.Include(e => e.DeptNoNavigation);
            return View(await actsDec2023Context.ToListAsync());
        }
        //GET
        public IActionResult AddEmployee()
        {
            ViewData["DeptName"] = new SelectList(_context.Depts, "DeptNo", "DeptName");
           
            return View();

        }

        [HttpPost]
        [ValidateAntiForgeryToken]
        public async Task<IActionResult> AddEmployee(Emp emp)
        {
            if (emp.DeptNo == 0)
            {
               // ModelState.AddModelError("DeptNo", "Please select a valid department.");
                
                ViewData["DeptNo"] = new SelectList(_context.Depts, "DeptNo", "DeptNo", emp.DeptNo);
                ViewBag.msg = "Please select a valid department";
                return View(emp);
            }

            if (ModelState.IsValid)
            {
                _context.Add(emp);
                await _context.SaveChangesAsync();
                return RedirectToAction(nameof(Index));
            }

            // If ModelState is not valid for other reasons, repopulate the dropdown list
            ViewData["DeptNo"] = new SelectList(_context.Depts, "DeptNo", "DeptNo", emp.DeptNo);
            return View(emp);
        }
        public IActionResult Privacy()
        {
            return View();
        }

        [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
        public IActionResult Error()
        {
            return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
        }
    }
}
