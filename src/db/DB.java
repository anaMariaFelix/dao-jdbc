package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DB {

	private static Connection conne = null; //objeto de conexao do banco de dados do JDBC
	
	public static Connection getConnection() {//segleton
		if(conne == null) {
			try {
				Properties props = loardProperties();
				String url = props.getProperty("dburl");
				conne = DriverManager.getConnection(url, props);//faz a conexao com o banco
			}catch(SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
		return conne;
	}
	
	//classe para ler o meu dpProperties que contem a conexao com meu banco
	public static Properties loardProperties() {
		try(FileInputStream fs = new FileInputStream("db.properties")){//abre o arquivo
			Properties props = new Properties();
			
			props.load(fs);//carrega as propriedades que estao no arquivo
			return props;
			
		} catch (IOException e) {
			throw new DbException(e.getMessage());
		}
	}
	
	public static void closeConnection() {//fecha a conexao com o banco
		if(conne != null) {
			try {				
				conne.close();
				
			}catch(SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}
	public static void closeStatement(Statement st) {//fecha a conexao com o banco
		if(st != null) {
			try {				
				st.close();
				
			}catch(SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}
	public static void closeResultSet(ResultSet rs) {//fecha a conexao com o banco
		if(rs != null) {
			try {				
				rs.close();
				
			}catch(SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}
}
