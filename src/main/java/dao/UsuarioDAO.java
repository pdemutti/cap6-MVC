package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.Usuario;

public class UsuarioDAO implements DAO<Usuario>{
	
	private DataSource dataSource;
	
	public UsuarioDAO(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void create(Usuario object) {
		try {
			String sql = "INSERT INTO public.usuarios (nome,email,senha)"
					+ "	VALUES (?,?,?);";
			PreparedStatement stm = this.dataSource.getConnection().prepareStatement(sql);
			stm.setString(1, object.getNome());
			stm.setString(2, object.getEmail());
			stm.setString(3, object.getSenha());
			
			ResultSet rs = stm.executeQuery();
			
			rs.next();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao cadastrar usuario = " + e.getMessage());
		}
		
	}

	@Override
	public Usuario read(Usuario object) {
		try {
			String sql = "select NOME, EMAIL from usuarios where email=? and senha=?";
			
			PreparedStatement stm = this.dataSource.getConnection().prepareStatement(sql);
			stm.setString(1, object.getEmail());
			stm.setString(2, object.getSenha());
			
			ResultSet rs = stm.executeQuery();
			
			if (rs.next()) {
				Usuario usuario = new Usuario(rs.getString("NOME"), rs.getString("EMAIL"));			
				return usuario;
			} else {
				throw new Exception("Usuario nao encontrado");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao efetuar Leitura de usuario = " + e.getMessage());
			
		}
		return null;
	}

	@Override
	public void update(Usuario object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Usuario object) {
		// TODO Auto-generated method stub
		
	}

}
