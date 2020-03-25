package ksu.coolbaba.servise.imp;

import ksu.coolbaba.domain.CorpClient;
import ksu.coolbaba.repos.CorpClientRepo;
import ksu.coolbaba.servise.CorpClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CorpClientServiceImp implements CorpClientService {

    @Autowired
    private   CorpClientRepo corpClientRepo;



    @Override
    public CorpClient addCorpClient(CorpClient corpClient) {
        corpClientRepo.save(corpClient);
        return corpClient;
    }

    @Override
    public Iterable<CorpClient> findAll() {
        return corpClientRepo.findAll();
    }

    @Override
    public CorpClient getCorpClintByEDRPOW(String EDRPOW) {
        return null;

    }

//    @Override
//    public CorpClient getByShortName(String name) {
//        return corpClientRepo.getByShortName(name);
//    }

    @Override
    public Iterable<CorpClient> findCorpClientByEDRPOW(String EDRPOW) {
        return corpClientRepo.findByClientEDRPOW(EDRPOW);
    }
}
