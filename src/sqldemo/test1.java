package sqldemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class test1 {

	public static void main(String[] args) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {

		String sql = "select * from test";  
		  
		//连接字符串，格式： "jdbc:数据库驱动名称:  
		//数据库服务器ip:端口号/数据库名称:INFORMIXSERVER=服务器名;  
		//user=用户名;password=密码"  
		String url = "jdbc:informix-sqli://10.185.100.13:9088/share_fdmprddb:INFORMIXSERVER=gbaseserver; GB18030-2000;CLIENT_LOCALE=zh_cn.GB18030-2000;NEWCODESET=GB18030,GB18030-2000,5488;";
		  
		Class.forName("com.informix.jdbc.IfxDriver").newInstance();  
		  
		Connection conn = DriverManager.getConnection(url);   
		Statement  stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE  
		                                     , ResultSet.CONCUR_UPDATABLE);  
		ResultSet  rs   = stmt.executeQuery(sql);  
		  
		rs.close();  
		stmt.close();  
		conn.close();  
		
		
	}

}
