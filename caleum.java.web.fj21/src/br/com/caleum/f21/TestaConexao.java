package br.com.caleum.f21;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {

	public static void main(String[] args) {
		
		try {
			Connection con = new ConnectionFactory().getConnection();
			System.out.println("Conexão Aberta!");
			con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
		

	}

}
