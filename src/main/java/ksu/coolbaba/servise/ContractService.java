package ksu.coolbaba.servise;

import ksu.coolbaba.domain.Client;
import ksu.coolbaba.domain.Contract;
import ksu.coolbaba.domain.CorpClient;
import ksu.coolbaba.domain.Servise;


import java.util.List;

public interface ContractService {
   Contract addContract (Contract contract);
   void delete(long id);
   Contract getByNumber (String number);
   List<Contract> findByNumber (String number);
   Iterable<Contract> getAllContract ();
    Iterable <Contract> getAllContractByClient (Client client);
   List<Contract> getAllContractByServise (Servise servise);
    List<Contract> getContractByCorpClient (CorpClient corpClient);
}
