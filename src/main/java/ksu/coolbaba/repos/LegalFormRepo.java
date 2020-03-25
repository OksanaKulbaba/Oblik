package ksu.coolbaba.repos;

import ksu.coolbaba.domain.OrgForm;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface LegalFormRepo extends CrudRepository<OrgForm, Long> {

    OrgForm getOrgFormByShortName(String shortName);
    OrgForm getOrgFormByID(Long id);


}

