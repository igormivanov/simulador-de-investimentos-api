package br.com.igorivanov.sdi.repositories;

import br.com.igorivanov.sdi.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface StockRepository extends JpaRepository<UUID, Stock> {
}
