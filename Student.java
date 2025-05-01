public class Student
{
    private final String firstName = "";
    private final String lastName = "";
    public final String studentNumber = "";

    public String getFullName()
    {
        return firstName + " " + lastName;
    }

    public String getCommaName()
    {
        return lastName + ", " + firstName;
    }

    public boolean studentChecker(String firstName, String lastName, String studentNumber)
    {
        if(firstName.equals("John") && lastName.equals("Smith") && studentNumber.equals("js123"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
