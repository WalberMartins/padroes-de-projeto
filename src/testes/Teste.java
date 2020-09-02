package testes;

import java.sql.Connection;

import db.DBPool;

public class Teste {

	public static void main(String[] args) {
		Connection conn = DBPool.getConnection();
		Connection conn1 = DBPool.getConnection();
		Connection conn2 = DBPool.getConnection();
		Connection conn3 = DBPool.getConnection();
		Connection conn4 = DBPool.getConnection();
		
		System.out.println(conn);
		System.out.println(conn1);
		System.out.println(conn2);
		System.out.println(conn3);
		System.out.println(conn4);
	}

}
