package br.com.caelum.fj21.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.caleum.f21.ConnectionFactory;

public class TestaConexao {

	public static void main(String[] args) {
		
		try {
			Connection con = new ConnectionFactory().getConnection();
			System.out.println("Conexão realizado com sucesso!");
			con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
		

	}

}
