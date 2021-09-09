package br.com.zup.edu.pizzaria.ingredientes;

import br.com.zup.edu.pizzaria.ingredientes.Ingrediente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IngredienteRepository extends JpaRepository<Ingrediente,Long> {
    Optional<Ingrediente> findByNome(String nome);
}




