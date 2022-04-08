555553import java.sql.*;
import java.util.*;
class Userpassword
{
	public static void main(String args[])throws SQLException,ClassNotFoundException
{
try
{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	System.out.println("Loaded");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","IPC115","IPC115");
	System.out.println("Established");
	Scanner s=new Scanner(System.in);
	System.out.println("enter employee id");
	int empno=s.nextInt();
	Statement sct=con.createStatement();
	String sql="SELECT * from emp";
	ResultSet rs=sct.executeQuery(sql);
	boolean result=false;
	while(rs.next())
{
//to check rows line by line until all records are completed
//verify input with emp number
if(empno==rs.getInt(1))
{
System.out.println("you are valid user");
System.out.println("Hello"+rs.getString(2));
result=true;
break;
}
}//while-closing
if(result==false)
System.out.println("invalid user");
}
catch(Exception e)
{
	System.out.println(e);
}
}
}