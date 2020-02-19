package ksu.coolbaba.repos;

import ksu.coolbaba.domain.Client;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface ClientsRepo extends CrudRepository<Client, Long> {

    List<Client> findByEDRPOW(String edrpow);
}
