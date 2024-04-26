using System;
using System.Collections.Generic;

namespace BooksMVC.Models;

public partial class TblBook
{
    public int BookId { get; set; }

    public string BookName { get; set; } = null!;

    public string BookAuthor { get; set; } = null!;

    public int BookPrice { get; set; }
}
