package file1;
import java.util.*;
public class email
{
  private String firstName;
  private String lastName;
  private String password;
  private String department;
  private String email;
  private int mailboxCapacity = 500;
  private int defaultPasswordLength = 10;
  private String alternateEmail;
  private String companySuffix ="company.com";

  // Constructor to recieve first name and lastName
  public email(String firstName , String lastName){
    this.firstName=firstName;
    this.lastName=lastName;
    //System.out.println("Email Created := "+ this.firstName+" "+this.lastName);


    // Call a method asking for a department - return the department

    this.department = setDepartment(); // class variable department  change to setDepartment
  //  System.out.println("department is "+ this.department);

    // Call a method that generate the random_passwords
    this.password=randomPasswords(defaultPasswordLength);
    System.out.println("Your password is: "+ this.password);
  // combine elements to generate email

    email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
  //  System.out.println("Your email  is:"+email);
  }

  // Ask for the department

  private String setDepartment(){
    System.out.print("New Worker: "+firstName + ". Department Codes are :\n1 for Sales \n2 for Development \n3 for Acconting \n4 for None \nEnter department code:");
    Scanner sc=new Scanner(System.in);
    int department_choice=sc.nextInt();
    if(department_choice == 1) {
      return("sales"); }
    else  if(department_choice==2) {
      return ("development");}
    else if (department_choice==3) {
        return("acconting");  }
    else    {
      return(""); }
  }

  // generate a random password
  private String randomPasswords(int length){
    String passwordset="ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789#$%@!";
    char []password=new char[length];
    for (int i=0;i<length ;i++ ) {
      int rand = (int) (Math.random() * passwordset.length());
      password[i]=passwordset.charAt(rand);
    }
    return(new String(password));
  }

  // set the mail box Capacity
  public void setMaiBoxCapacity(int Capacity){
    this.mailboxCapacity = Capacity;
  }

  // set the alternate Email
public void setAlternativeEmail(String altemail){
this.alternateEmail=altemail;
}
  // change the password
  public void changePassword(String password)
  {
    this.password = password;
  }

//--------getting

public int getMailBoxCapacity()
{
  return(mailboxCapacity);
}
public String getAlternativeEmail()
{
  return(alternateEmail);
}

public String getPassword()
{
  return(password);
}

public String showInfo()
{
  return("\nDISPLAY NAME: "+ firstName+" "+ lastName+
          "\nCOMPANY EMAIL: "+ email+
          "\nMAILBOX CAPACITY: "+ mailboxCapacity+"mb"
            );
}
}
