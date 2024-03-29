package Atividade3.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Atividade3.domain.Proposta;
import Atividade3.domain.User;
import Atividade3.domain.Veiculo;

public interface IPropostaDAO extends JpaRepository<Proposta, Long> {
    public List<Proposta> findAllByUsuario(User user);

    public List<Proposta> findAllByVeiculo(Veiculo veiculo);
}
