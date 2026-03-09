package dao;

import connection.ConnectionFactory;
import model.CanalComunicacao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CanalComunicacaoDAO {

    // CREATE
    public void inserir(CanalComunicacao canal) {
        String sql = "INSERT INTO canal_comunicacao (nome, descricao) VALUES (?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, canal.getNome());
            stmt.setString(2, canal.getDescricao());

            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir canal: " + e.getMessage());
        }
    }

    // READ por ID
    public CanalComunicacao buscarPorId(int id) {
        String sql = "SELECT * FROM canal_comunicacao WHERE id = ?";
        CanalComunicacao canal = null;

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                canal = new CanalComunicacao();
                canal.setId(rs.getInt("id"));
                canal.setNome(rs.getString("nome"));
                canal.setDescricao(rs.getString("descricao"));
            }

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar canal: " + e.getMessage());
        }

        return canal;
    }

    // READ todos
    public List<CanalComunicacao> buscarTodos() {
        String sql = "SELECT * FROM canal_comunicacao";
        List<CanalComunicacao> canais = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                CanalComunicacao canal = new CanalComunicacao();
                canal.setId(rs.getInt("id"));
                canal.setNome(rs.getString("nome"));
                canal.setDescricao(rs.getString("descricao"));
                canais.add(canal);
            }

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar canais: " + e.getMessage());
        }

        return canais;
    }

    // UPDATE
    public void atualizar(CanalComunicacao canal) {
        String sql = "UPDATE canal_comunicacao SET nome = ?, descricao = ? WHERE id = ?";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, canal.getNome());
            stmt.setString(2, canal.getDescricao());
            stmt.setInt(3, canal.getId());

            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar canal: " + e.getMessage());
        }
    }

    // DELETE
    public void excluir(int id) {
        String sql = "DELETE FROM canal_comunicacao WHERE id = ?";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao excluir canal: " + e.getMessage());
        }
    }
}
