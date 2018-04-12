package br.edu.unievangelica.domain.pais;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Long> {

    public List<Pais> findAllByOrderByNomeAsc();
}
