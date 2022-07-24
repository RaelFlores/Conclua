package classes_p_add_db;

import conclua.conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class conexao_prof {
    
    private conexao conct;
    private Connection conn;
    
    public conexao_prof(){
    this.conct = new conexao();
    this.conn = this.conct.getConexao();
  }

  public void inserir(professor prof){
    String sql = "INSERT INTO orientador(MatriculaOrient, Nome_Orient, Email_Orient, Telefone_Orient, Formacao, Area, SubArea, Disponibilidade)  VALUES " +
    "(?, ?, ?, ?, ?, ?, ?, ?)";
    try {
      PreparedStatement stmt = this.conn.prepareStatement(sql);
      stmt.setInt(1, prof.getmatricula());
      stmt.setString(2, prof.getnome());
      stmt.setString(3, prof.getemail());
      stmt.setString(4, prof.getcelulcar());
      stmt.setString(5, prof.getformacao());
      stmt.setString(6, prof.getarea());
      stmt.setString(7, prof.getsub_area());
      stmt.setInt(8, prof.getdisponibilidade());      
      stmt.execute();
    } catch(Exception e){
      System.out.println("Erro " + e.getMessage());
    }
  }
    
}