package ksu.coolbaba.servise.imp;

import ksu.coolbaba.domain.Client;
import ksu.coolbaba.domain.Contract;
import ksu.coolbaba.domain.CorpClient;
import ksu.coolbaba.domain.Servise;
import ksu.coolbaba.repos.ContractRepo;
import ksu.coolbaba.servise.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContractServiceImp implements ContractService {
    @Autowired
    ContractRepo contractrRepo;


    @Override
    public Contract addContract(Contract contract) {

        contractrRepo.save(contract);
        return contract;
    }

    @Override
    public void delete(long id) {
        contractrRepo.deleteById(id);

    }

    @Override
    public Contract getByNumber(String number) {

        return contractrRepo.getByNumberOFContract(number);
    }

    @Override
    public List<Contract> findByNumber(String number) {
        return contractrRepo.findByNumberOFContract(number);
    }

    @Override
    public Iterable<Contract> getAllContract() {
       return  contractrRepo.findAll();
    }

    @Override
    public Iterable<Contract> getAllContractByClient(Client client) {


        return contractrRepo.findByClient(client);
    }
    @Override
    public List<Contract> getAllContractByServise(Servise servise) {
        return null;
    }

    @Override
    public List<Contract> getContractByCorpClient(CorpClient corpClient) {

        return contractrRepo.findByClient(corpClient.getClient());}
}
