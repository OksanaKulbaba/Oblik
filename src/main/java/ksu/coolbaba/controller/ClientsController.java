package ksu.coolbaba.controller;


import ksu.coolbaba.domain.Client;
import ksu.coolbaba.domain.CorpClient;
import ksu.coolbaba.repos.ClientsRepo;
import ksu.coolbaba.repos.CorpClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


@RequestMapping("")
@Controller
public class ClientsController {
    @Autowired
    public ClientsRepo clientsRepo;

    @Autowired
    public CorpClientRepo corpClientRepo;

    @GetMapping("/client")
    public String clients(Model model) {
       Iterable<CorpClient> corpClients = corpClientRepo.findAll();
//       Iterable<Client> clientsF = clientsRepo.findAll();
//       List<CorpClient> clients = new ArrayList<>();
//       corpClients.forEach(clients::add);
       model.addAttribute("clients",corpClients);
        return "client";
    }
    @GetMapping("/clientfilter")
    public String main(@RequestParam(required = false, defaultValue = "") String filter, Model model) {
        Iterable<CorpClient> clientsF = corpClientRepo.findAll();

        if (filter != null && !filter.isEmpty()) {
            clientsF = corpClientRepo.findByClientEDRPOW(filter);
        } else {
            clientsF = corpClientRepo.findAll();
        }
        List<CorpClient> clients = new ArrayList<>();
        clientsF.forEach(clients::add);

        model.addAttribute("clients", clients);
        model.addAttribute("filter", filter);

        return "clientFilter";
    }

    @PostMapping("/clientsave")
     public String addClients
            (
            @RequestParam  String shortName,
            @RequestParam String fullName,
            @RequestParam String edrpow,
            @RequestParam Date dateOfReg,
            @ModelAttribute Client newClient,
            @ModelAttribute CorpClient newCorpClient,
                     Model model  )  {


        CorpClient corpClient = new CorpClient();
        corpClient.setFullName(fullName);
        corpClient.setShortName(shortName);

        Client client = new Client();
        client.setDateOfReg(dateOfReg);
        client.setEDRPOW(edrpow);;
         corpClient.setClient(client);

        model.addAttribute("client", corpClientRepo.findAll());

        corpClientRepo.save(corpClient);
        return "clientSave";
    }

    @GetMapping("/clientsave")
    public String save(){
        return "clientSave";
    }



}
