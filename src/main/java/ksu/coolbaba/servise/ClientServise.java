package ksu.coolbaba.servise;

import ksu.coolbaba.domain.Client;
import ksu.coolbaba.domain.CorpClient;

import org.springframework.stereotype.Service;


public interface ClientServise  {

        Client getClientById(Long id);
        Iterable<Client> findAll();
        Client getClientByName(String  name);

}
