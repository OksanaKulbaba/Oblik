package ksu.coolbaba.controller;


import ksu.coolbaba.domain.Client;
import ksu.coolbaba.repos.ClientsRepo;
import ksu.coolbaba.repos.CorpClientPepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RequestMapping("/client")
@Controller
public class ClientsController {
    @Autowired
    public ClientsRepo clientsRepo;

    @Autowired
    public CorpClientPepo corpClientPepo;

    @GetMapping("/all")
    public String clients(Model model) {
       Iterable<Client> clientsF = clientsRepo.findAll();
        List<Client> clients = new ArrayList<>();
        clientsF.forEach(clients::add);
       model.addAttribute("clients",clients);
        return "client";
    }
    @GetMapping("/filter")
    public String main(@RequestParam(required = false, defaultValue = "") String filter, Model model) {
        Iterable<Client> clients = clientsRepo.findAll();

        if (filter != null && !filter.isEmpty()) {
            clients = clientsRepo.findByEDRPOW(filter);
        } else {
            clients = clientsRepo.findAll();
        }
        List<Client> clientsF = new ArrayList<>();
        clients.forEach(clientsF::add);

        model.addAttribute("clientsF", clientsF);
        model.addAttribute("filter", filter);

        return "client";
    }


    @PostMapping("/save")
     public String addClients (@ModelAttribute Client newClient,
                               Model model  )  {

        model.addAttribute("client", clientsRepo.findAll());

        clientsRepo.save(newClient);
        return "save";
    }

}
