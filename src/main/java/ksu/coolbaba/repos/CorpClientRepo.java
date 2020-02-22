package ksu.coolbaba.repos;


import ksu.coolbaba.domain.CorpClient;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CorpClientRepo extends CrudRepository<CorpClient, Long> {

    List<CorpClient> findByClientEDRPOW(String EDRPOW);



}
