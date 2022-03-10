public class grade {
    public String gradeLetter(double cgpa)
    {
        if(cgpa >= 5.0 && cgpa < 5.75)
            return "Pass Class";
        else if(cgpa >= 5.75 && cgpa < 6.75)
            return "Second Class";
        else if(cgpa >= 6.75 && cgpa < 7.75)
            return "First Class";
        else if(cgpa >= 7.75 && cgpa < 9.50)
            return "First Class with Distinction";
        else
            return "First Class with Honors";
    }
}
