import java.sql.*;
class example
{
	public static void main(String args[])
{
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println("Loaded");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","IPC115","IPC115");
System.out.println("Established");
	Statement sct=con.createStatement();
	String sql1="insert into student values(1,'kishor')";
	String sql2="insert into student values(2,'honey')";
	String sql3="insert into student values(3,'teja')";
	sct.executeQuery(sql1);
	sct.executeQuery(sql2);
	sct.executeQuery(sql3);
	String sql="SELECT * from student";
	sct.executeQuery(sql);
}
catch(Exception e)
{
System.out.println(e);
}
}
}