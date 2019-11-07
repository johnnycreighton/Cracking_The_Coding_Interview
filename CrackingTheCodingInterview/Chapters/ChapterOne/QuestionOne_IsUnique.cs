using System;

namespace CrackingTheCodingInterview.Chapters.ChapterOne
{
    public class QuestionOne_IsUnique
    {
        public static void Run()
        {
            Console.WriteLine("Please enter a string in which you wish to check for uniqueness.");
            var isUnique = Console.ReadLine();
            
            if (CheckUnique(isUnique))
                Console.WriteLine($"{isUnique} is a unique string.");
            else
                Console.WriteLine($"{isUnique} is NOT a unique string.");

            Console.WriteLine("Press the any key to continue.");
            Console.ReadKey();
        }

        public static bool CheckUnique(string isUnique)
        {
            char[] charInput = isUnique.ToCharArray();

            return CheckIfValid(charInput);
        }

        private static bool CheckIfValid(char[] charInput)
        {
            char[] comparer = new char[charInput.Length];
            
            for(var i = 0; i < charInput.Length; ++i)
            {
                comparer[i] = charInput[i];

                for (var j = i+1; j < comparer.Length; ++j)
                {
                    if (comparer[j-1] == 0)
                        break;
                    if (charInput[j] == comparer[i])
                    {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
