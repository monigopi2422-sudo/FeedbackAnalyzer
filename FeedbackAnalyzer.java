import java.io.*;

public class FeedbackAnalyzer
{
    public static void main(String[] args)
    {
        int lines = 0, words = 0, characters = 0;

        try
        {
            BufferedReader br = new BufferedReader(
                new FileReader("feedback.txt"));

            String line;

            while ((line = br.readLine()) != null)
            {
                lines++;
                characters += line.length();

                if (!line.trim().isEmpty())
                {
                    words += line.trim().split("\\\\s+").length;
                }
            }

            br.close();
            System.out.println("Number of Lines: " + lines);
            System.out.println("Number of Words: " + words);
            System.out.println("Number of Characters: " + characters);
        }
        catch (IOException e)
        {
            System.out.println("Error reading file.");
        }
    }
}
