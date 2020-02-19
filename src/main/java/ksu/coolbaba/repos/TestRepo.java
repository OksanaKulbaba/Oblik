package ksu.coolbaba.repos;

import ksu.coolbaba.domain.Test;
import org.springframework.data.repository.CrudRepository;

public interface TestRepo extends CrudRepository<Test, Long> {
}
