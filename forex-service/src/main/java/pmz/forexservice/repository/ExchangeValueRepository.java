package pmz.forexservice.repository;

import org.springframework.stereotype.Repository;
import pmz.forexservice.domain.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {

      ExchangeValue findByFromAndTo(String from, String to);

      List<ExchangeValue> findAll();
}
