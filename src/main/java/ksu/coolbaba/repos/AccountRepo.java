package ksu.coolbaba.repos;

import ksu.coolbaba.domain.Account;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AccountRepo extends CrudRepository<Account,Long> {


}
