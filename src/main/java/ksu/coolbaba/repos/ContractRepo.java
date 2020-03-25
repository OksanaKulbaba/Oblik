package ksu.coolbaba.repos;

import ksu.coolbaba.domain.Client;
import ksu.coolbaba.domain.Contract;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ContractRepo extends CrudRepository <Contract,Long>{

        Contract getByNumberOFContract(String number);
        List<Contract> findByClient(Client client);
        List<Contract> findByNumberOFContract (String number);
}
