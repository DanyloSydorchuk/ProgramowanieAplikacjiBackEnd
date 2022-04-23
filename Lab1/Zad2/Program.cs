using System;
using System.Diagnostics;
using System.IO;
using System.Text;

namespace Zad2
{
    class Program
    {
        static void Main(string[] args)
        {
            var path = @"D:\Users\danylo.sydorchuk\Documents\kodnowy.txt";

            // Delete the file if it exists.
            if (File.Exists(path))
            {
                File.Delete(path);
            }

            using (FileStream fs = File.Create(path))
            {
                Console.WriteLine();
                AddText(fs, Console.ReadLine());
                for (int i = 1; i < 120; i++)
                {
                    
                    AddText(fs, Convert.ToChar(i).ToString());
                }
            }

            //Open the stream and read it back.
            using (FileStream fs = File.OpenRead(path))
            {
                byte[] b = new byte[1024];
                UTF8Encoding temp = new UTF8Encoding(true);
                while (fs.Read(b, 0, b.Length) > 0)
                {
                    Console.WriteLine(temp.GetString(b));
                }
            }
        }

        private static void AddText(FileStream fs, string value)
        {
            byte[] info = new UTF8Encoding(true).GetBytes(value);
            fs.Write(info, 0, info.Length);
        }
    }
}
