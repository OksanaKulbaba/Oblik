package ksu.coolbaba.servise.imp;


import ksu.coolbaba.domain.Client;
import ksu.coolbaba.domain.CorpClient;
import ksu.coolbaba.repos.ClientsRepo;
import ksu.coolbaba.repos.CorpClientRepo;
import ksu.coolbaba.servise.ClientServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImp  implements ClientServise {

    @Autowired
    private ClientsRepo clientsRepo;



    @Override
    public Client getClientById(Long id) {
        return clientsRepo.getByID(id);
    }

    @Override
    public Iterable<Client> findAll() {
        return clientsRepo.findAll();
    }

    @Override
    public Client getClientByName(String name) {
//        CorpClient  corpClient=  corpClientRepo.getByShortName(name);
        return null;
    }
}
