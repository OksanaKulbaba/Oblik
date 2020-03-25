package ksu.coolbaba.servise;

import ksu.coolbaba.domain.CorpClient;
import ksu.coolbaba.repos.CorpClientRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface CorpClientService {


    CorpClient addCorpClient (CorpClient corpClient);
    Iterable<CorpClient> findAll();
    CorpClient getCorpClintByEDRPOW(String EDRPOW);
    Iterable<CorpClient> findCorpClientByEDRPOW (String EDRPOW);
//    CorpClient getByShortName(String name);
}
