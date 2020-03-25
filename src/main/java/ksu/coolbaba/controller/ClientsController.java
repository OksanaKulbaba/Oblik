package ksu.coolbaba.controller;


import ksu.coolbaba.domain.Client;
import ksu.coolbaba.domain.CorpClient;
import ksu.coolbaba.domain.OrgForm;

import ksu.coolbaba.repos.LegalFormRepo;
import ksu.coolbaba.servise.CorpClientService;

import ksu.coolbaba.servise.imp.ClientServiceImp;
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
    public LegalFormRepo legalFormRepo;
    @Autowired
    CorpClientService corpClientService;

    @Autowired
    ClientServiceImp clientServiceImp;


    @GetMapping("/clientSearch")
    public String main2(@RequestParam(required = false, defaultValue = "") String filter, Model model) {
        Iterable<CorpClient> clientsF;

        if (filter != null && !filter.isEmpty()) {
            clientsF = corpClientService.findCorpClientByEDRPOW(filter);
        } else {
            clientsF = corpClientService.findAll();
        }
        List<CorpClient> clients = new ArrayList<>();
        clientsF.forEach(clients::add);

        model.addAttribute("clients", clients);
        model.addAttribute("filter", filter);

        return "clientSearch";
    }


    @PostMapping("/clientAdd")
    public String addClientsFull
            (
                    @RequestParam  String shortName,
                    @RequestParam String fullName,
                    @RequestParam String edrpow,
                    @RequestParam Date dateOfReg,
                     @RequestParam Long orgForm,

                    @ModelAttribute CorpClient newCorpClient,
                    Model model  )  {




         OrgForm orgForm1 = legalFormRepo.getOrgFormByID(orgForm);


        CorpClient corpClient = new CorpClient();
        corpClient.setFullName(fullName);
        corpClient.setShortName(shortName);


        corpClient.setDataStart(dateOfReg);
        corpClient.setEDRPOW(edrpow);
        corpClient.setOrgForm(orgForm1);


        model.addAttribute("client", corpClientService.findAll());

        corpClientService.addCorpClient(corpClient);

        return "clientAdd";
    }


    @GetMapping("/clientAdd")
    public String client(Model model) {
        Iterable<OrgForm> orgForms = legalFormRepo.findAll();
        model.addAttribute("orgForms",orgForms);

        return "clientAdd";
    }

}
