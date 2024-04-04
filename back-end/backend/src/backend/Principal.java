package backend;

import java.sql.*;

public class Principal {

	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/uninove","root","");
		String sql = "insert into aluno values (ra,nome,curso,senha) values(null, 'diego', 'defesa', '123'";
		
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.execute();
	}
}
