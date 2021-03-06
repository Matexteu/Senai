package br.trimestral.senai.trimestral.repository;

import br.trimestral.senai.trimestral.model.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FuncionarioRepository extends JpaRepository<Fornecedor, Long> {

    public Fornecedor findByNome(String nome);
    public Fornecedor findByEmail(String email);
    public List<Fornecedor> findByTelefone(String telefone);

}
