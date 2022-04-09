using System;
using System.IO;

namespace Zad1
{
    class Program
    {
        static void Main(string[] args)
        {
            var FileUrl = @"D:\Users\danylo.sydorchuk\Documents\kod.txt";

            //file lines
            string[] lines = File.ReadAllLines(FileUrl);

            //loop through each file line
            foreach (string line in lines)
            {
                Console.WriteLine(line);
            }
        }
    }
}
