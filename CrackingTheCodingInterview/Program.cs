using System;
using CrackingTheCodingInterview.Chapters.ChapterOne;

namespace CrackingTheCodingInterview
{
    class Program
    {
        static void Main()
        {
            Console.WriteLine("****Cracking The Coding Interview****\n\n");
            Console.WriteLine("Question 1.1:\nCheck to see if a string contains only unique characters, ie. one and only occurence of a char.\nInput the string you want to check.");
            
            while (true)
            {
                var isUnique = Console.ReadLine();
                var chapterOne = new QuestionOne_IsUnique();

                if (chapterOne.CheckUnique(isUnique)) 
                    Console.WriteLine($"{isUnique} is a unique string.");
                else
                    Console.WriteLine($"{isUnique} is NOT a unique string.");
                
                Console.WriteLine("Press the any key to continue.");
                Console.ReadKey();
            }
        }
    }
}
