namespace CrackingTheCodingInterview.Chapters.ChapterOne
{
    public class QuestionOne_IsUnique
    {
        public bool CheckUnique(string isUnique)
        {
            char[] charInput = isUnique.ToCharArray();

            return CheckIfValid(charInput);
        }

        private bool CheckIfValid(char[] charInput)
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
