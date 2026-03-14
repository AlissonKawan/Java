package dao;

import connection.ConnectionFactory;
import model.CriancaAdolescente;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CriancaAdolescenteDAO {

    // CREATE
    public void inserir(CriancaAdolescente crianca) {
        Connection conn = null;
        try {
            conn = ConnectionFactory.getConnection();
            conn.setAutoCommit(false);

            // INSERIR NA PESSOA_ATENDIDA
            // id é GENERATED ALWAYS AS IDENTITY
            String sqlPessoa = "INSERT INTO pessoa_atendida " +
                    "(nome_codificado, data_cadastro, telefone, email, tipo) " +
                    "VALUES (?, ?, ?, ?, ?)";

            int pessoaId;
            try (PreparedStatement stmt = conn.prepareStatement(sqlPessoa, new String[]{"id"})) {
                stmt.setString(1, crianca.getNomeCodificado());
                stmt.setObject(2, crianca.getData());   // LocalDate → DATE
                stmt.setString(3, crianca.getTelefone());
                stmt.setString(4, crianca.getEmail());
                stmt.setString(5, "CRIANCA");
                stmt.executeUpdate();

                // Captura o ID gerado pelo banco
                try (ResultSet rs = stmt.getGeneratedKeys()) {
                    if (rs.next()) {
                        pessoaId = rs.getInt(1);
                        System.out.println("ID gerado pela identity: " + pessoaId);
                    } else {
                        throw new SQLException("Falha ao obter ID gerado de pessoa_atendida");
                    }
                }
                System.out.println("Inserido na PESSOA_ATENDIDA");
            }

            // INSERIR NA CRIANCA_ADOLESCENTE
            String sqlCrianca = "INSERT INTO crianca_adolescente " +
                    "(pessoa_id, idade, nome_responsavel, escola, gravidade_bucal) " +
                    "VALUES (?, ?, ?, ?, ?)";

            try (PreparedStatement stmt = conn.prepareStatement(sqlCrianca)) {
                stmt.setInt(1, pessoaId);
                stmt.setInt(2, crianca.getIdade());
                stmt.setString(3, crianca.getNomeResponsavel());
                stmt.setString(4, crianca.getEscola());
                stmt.setInt(5, crianca.getGravidadeBucal());
                stmt.executeUpdate();
                System.out.println("Inserido na CRIANCA_ADOLESCENTE");
            }

            conn.commit();
            crianca.setId(pessoaId);
            System.out.println("SUCESSO! ID: " + pessoaId);

        } catch (SQLException e) {
            System.err.println("ERRO: " + e.getMessage());
            if (conn != null) {
                try {
                    conn.rollback();
                    System.err.println("Rollback executado");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            throw new RuntimeException("Erro ao inserir criança/adolescente: " + e.getMessage(), e);
        } finally {
            if (conn != null) {
                try {
                    conn.setAutoCommit(true);
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // READ por ID
    public CriancaAdolescente buscarPorId(int id) {
        // JOIN traz dados de ambas as tabelassem precisar de colunas duplicadas
        String sql = "SELECT ca.pessoa_id, ca.idade, ca.nome_responsavel, ca.escola, " +
                "ca.gravidade_bucal, " +
                "pa.nome_codificado, pa.data_cadastro, pa.telefone, pa.email " +
                "FROM crianca_adolescente ca " +
                "JOIN pessoa_atendida pa ON ca.pessoa_id = pa.id " +
                "WHERE ca.pessoa_id = ?";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return mapearResultSet(rs);
            }

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar criança/adolescente: " + e.getMessage(), e);
        }
        return null;
    }

    // READ todos
    public List<CriancaAdolescente> buscarTodos() {
        String sql = "SELECT ca.pessoa_id, ca.idade, ca.nome_responsavel, ca.escola, " +
                "ca.gravidade_bucal, " +
                "pa.nome_codificado, pa.data_cadastro, pa.telefone, pa.email " +
                "FROM crianca_adolescente ca " +
                "JOIN pessoa_atendida pa ON ca.pessoa_id = pa.id";

        List<CriancaAdolescente> lista = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                lista.add(mapearResultSet(rs));
            }

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar crianças/adolescentes: " + e.getMessage(), e);
        }
        return lista;
    }

    // UPDATE
    public void atualizar(CriancaAdolescente crianca) {
        Connection conn = null;
        try {
            conn = ConnectionFactory.getConnection();
            conn.setAutoCommit(false);

            // Atualiza PESSOA_ATENDIDA
            String sqlPessoa = "UPDATE pessoa_atendida SET " +
                    "nome_codificado = ?, data_cadastro = ?, telefone = ?, email = ? " +
                    "WHERE id = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sqlPessoa)) {
                stmt.setString(1, crianca.getNomeCodificado());
                stmt.setObject(2, crianca.getData());
                stmt.setString(3, crianca.getTelefone());
                stmt.setString(4, crianca.getEmail());
                stmt.setInt(5, crianca.getId());
                stmt.executeUpdate();
            }

            // Atualiza CRIANCA_ADOLESCENTE somente campos próprios
            String sqlCrianca = "UPDATE crianca_adolescente SET " +
                    "idade = ?, nome_responsavel = ?, escola = ?, gravidade_bucal = ? " +
                    "WHERE pessoa_id = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sqlCrianca)) {
                stmt.setInt(1, crianca.getIdade());
                stmt.setString(2, crianca.getNomeResponsavel());
                stmt.setString(3, crianca.getEscola());
                stmt.setInt(4, crianca.getGravidadeBucal());
                stmt.setInt(5, crianca.getId());
                stmt.executeUpdate();
            }

            conn.commit();

        } catch (SQLException e) {
            if (conn != null) {
                try { conn.rollback(); } catch (SQLException ex) { ex.printStackTrace(); }
            }
            throw new RuntimeException("Erro ao atualizar criança/adolescente: " + e.getMessage(), e);
        } finally {
            if (conn != null) {
                try {
                    conn.setAutoCommit(true);
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // DELETE
    public void excluir(int id) {
        Connection conn = null;
        try {
            conn = ConnectionFactory.getConnection();
            conn.setAutoCommit(false);

            // Ordem importante filho antes do pai
            String sqlCrianca = "DELETE FROM crianca_adolescente WHERE pessoa_id = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sqlCrianca)) {
                stmt.setInt(1, id);
                stmt.executeUpdate();
            }

            String sqlPessoa = "DELETE FROM pessoa_atendida WHERE id = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sqlPessoa)) {
                stmt.setInt(1, id);
                stmt.executeUpdate();
            }

            conn.commit();

        } catch (SQLException e) {
            if (conn != null) {
                try { conn.rollback(); } catch (SQLException ex) { ex.printStackTrace(); }
            }
            throw new RuntimeException("Erro ao excluir criança/adolescente: " + e.getMessage(), e);
        } finally {
            if (conn != null) {
                try {
                    conn.setAutoCommit(true);
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // MAPEAMENTO
    private CriancaAdolescente mapearResultSet(ResultSet rs) throws SQLException {
        CriancaAdolescente c = new CriancaAdolescente();
        c.setId(rs.getInt("pessoa_id"));
        c.setIdade(rs.getInt("idade"));
        c.setNomeResponsavel(rs.getString("nome_responsavel"));
        c.setEscola(rs.getString("escola"));
        c.setGravidadeBucal(rs.getInt("gravidade_bucal"));
        // Dados vindos de pessoa_atendida via JOIN
        c.setNomeCodificado(rs.getString("nome_codificado"));
        c.setData(rs.getObject("data_cadastro", LocalDate.class)); // ← nome correto da coluna
        c.setTelefone(rs.getString("telefone"));
        c.setEmail(rs.getString("email"));
        return c;
    }
}