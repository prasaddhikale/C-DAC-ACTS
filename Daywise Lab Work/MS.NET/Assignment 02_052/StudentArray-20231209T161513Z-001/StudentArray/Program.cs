namespace StudentArray
{
    internal class Program
    {
        static void Main(string[] args)
        {
           
            Console.WriteLine("Enter number of batches");
            int numberOfBatches = Convert.ToInt32(Console.ReadLine());
            int[][] batches = new int[numberOfBatches][];
            for (int i = 0; i < numberOfBatches; i++)
            {
                Console.WriteLine($"Enter number of students in batch {i + 1}");
                int studentBatches = Convert.ToInt32(Console.ReadLine());
                batches[i] = new int[studentBatches];
                for (int j = 0; j < studentBatches; j++)
                {
                    Console.Write($"Enter marks of {j + 1}th student: ");
                    batches[i][j] = Convert.ToInt32(Console.ReadLine());
                }
                Console.WriteLine();
            }

            for (int i = 0; i < numberOfBatches; i++)
            {
                for (int j = 0; j < batches[i].Length; j++)
                {
                    Console.WriteLine($"Marks of student {j + 1} in batch {i + 1} is {batches[i][j]}");
                }
            }
        }
    }
}
