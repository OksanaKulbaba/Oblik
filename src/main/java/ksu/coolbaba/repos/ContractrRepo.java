package ksu.coolbaba.repos;

import ksu.coolbaba.domain.Contract;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ContractrRepo extends CrudRepository <Contract,Long>{

        List<Contract> findByNumberOFContract(String numberOfContract);

}
