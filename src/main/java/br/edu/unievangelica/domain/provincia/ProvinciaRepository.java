package br.edu.unievangelica.domain.provincia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProvinciaRepository extends JpaRepository<Provincia, Long> {

    @Query("SELECT p FROM Provincia p WHERE pais.id =:pais_id ORDER BY nome ASC")
    public List<Provincia> listarPorPais(@Param("pais_id") long pais_id);

//    @Query("SELECT DISTINCT 'tem' FROM Municipio m WHERE provincia.id=:provincia_id")
//    public String verificaVinculo(@Param("provincia_id") long provincia_id);
}
