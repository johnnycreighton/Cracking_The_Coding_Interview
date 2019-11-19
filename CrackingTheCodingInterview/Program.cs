using System;
using System.Collections.Generic;
using System.IO;
using CrackingTheCodingInterview.Chapters.ChapterOne;
using Newtonsoft.Json;

namespace CrackingTheCodingInterview
{
    class Program
    {
        private static List<Question> Questions;
        private static bool invalidInput = true;
        private static int questionNumber = 0;

        static void Main()
        {
            LoadJson();
            Console.WriteLine("****Welcome To Cracking The Coding Interview****\n\n");
            Console.WriteLine("Which Question would you like to answer?");
            Console.WriteLine("Please Choose a number:\n");

            foreach(var question in Questions)
            {
                Console.WriteLine($"{question.id}: {question.desc}\n");
            }

            while (true)
            {
                GetQuestionNumberFromUser();

                switch (questionNumber)
                {
                    case 1:
                        Console.WriteLine($"You have chosen Question: {questionNumber}.\n{Questions[questionNumber].desc}");
                        QuestionOne_IsUnique.Run();
                        break;
                    case 2:
                        Console.WriteLine($"You have chosen Question: {questionNumber}.\n{Questions[questionNumber].desc}");
                        QuestionOne_IsUnique.Run();
                        break;

                    default:
                        Console.WriteLine($"Question Number:{questionNumber} has not been implemented yet.");
                        break;
                }
                invalidInput = true;
            }
        }

        public static void LoadJson()
        {
            using (StreamReader r = new StreamReader("Questions.json"))
            {
                string json = r.ReadToEnd();
                Questions = JsonConvert.DeserializeObject<List<Question>>(json);
            }
        }

        private static void GetQuestionNumberFromUser()
        {
            while (invalidInput)
            {
                try
                {
                    questionNumber = int.Parse(Console.ReadLine());
                    invalidInput = false;
                }
                catch
                {
                    Console.WriteLine("Please choose only the number.\nAny Other input will be ignored:");
                }
            }
        }
    }
}
   