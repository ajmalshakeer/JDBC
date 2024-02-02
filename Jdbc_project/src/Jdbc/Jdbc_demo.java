package Jdbc;

import java.sql.*;

public class Jdbc_demo {

	public static void datacon() {
		try {

			String url = "jdbc:mysql://localhost:3306/ajmaldb";
			String username = "root";
			String passWord = "root123";
			String query = "select * from book";

			Connection con = DriverManager.getConnection(url, username, passWord);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {
				System.out.println("BookId: " + rs.getString(1) + "------" + "Bookname: " + rs.getString(2) + "-----"
						+ "Authorname: " + rs.getString(3));

			}
			con.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	//inserting a new record to the data base using insert query

	public static void insertvalue() {
		try {

			String url = "jdbc:mysql://localhost:3306/ajmaldb";
			String username = "root";
			String passWord = "root123";
			String query = "insert into book values(9,'Ente kadha','Kamala surayya')";

			Connection con = DriverManager.getConnection(url, username, passWord);
			Statement stmt = con.createStatement();
			int row = stmt.executeUpdate(query);

			System.out.println("no of rows affected is: "+row);
			
			con.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	
	//inserting a new record to the data base using variable of the data
	public static void insertvariable() {
		try {

			String url = "jdbc:mysql://localhost:3306/ajmaldb";
			String username = "root";
			String passWord = "root123";
			
			int id=10;
			String bookname ="Hangwomen";
			String authorname="K R Meera";
			
			
			
			String query = "insert into book values("+id+",'"+bookname+"','"+authorname+"')";

			Connection con = DriverManager.getConnection(url, username, passWord);
			Statement stmt = con.createStatement();
			int row = stmt.executeUpdate(query);

			System.out.println("no of rows affected is: "+row);
			
			con.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	
    //deleting a record from the table
	public static void delete() {
		try {

			String url = "jdbc:mysql://localhost:3306/ajmaldb";
			String username = "root";
			String passWord = "root123";
			
			int id=6;
			
			String query = "delete from book where bookid="+id;

			Connection con = DriverManager.getConnection(url, username, passWord);
			Statement stmt = con.createStatement();
			int row = stmt.executeUpdate(query);

			System.out.println("no of rows affected is: "+row+"record succesfully deleted");
			
			con.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	
    //updating a record	
	public static void update() {
		try {

			String url = "jdbc:mysql://localhost:3306/ajmaldb";
			String username = "root";
			String passWord = "root123";
			
			int id=9;
			
			String query = "update book set bookname='ente kadha' where bookid="+id;

			Connection con = DriverManager.getConnection(url, username, passWord);
			Statement stmt = con.createStatement();
			int row = stmt.executeUpdate(query);

			System.out.println("no of rows affected is: "+row+"record succesfully updated");
			
			con.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	

	public static void main(String[] args) {
		datacon();
//		insertvalue();
//		insertvariable();
//		delete();
//      update();
		
	}
}
