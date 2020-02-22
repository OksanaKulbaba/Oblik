package ksu.coolbaba.controller;

import ksu.coolbaba.domain.Client;
import ksu.coolbaba.domain.Contract;
import ksu.coolbaba.repos.ClientsRepo;
import ksu.coolbaba.repos.ContractrRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;

@RequestMapping("")
@Controller
public class ContractController {
    @Autowired
    ContractrRepo contractrRepo;



    @Autowired
    ClientsRepo clientsRepo;

//
//    @GetMapping("/contract")
//    public String contracts (Model model) {
//        Iterable<Contract> corpClients = contractrRepo.findAll();
////       List<CorpClient> clients = new ArrayList<>();
////       corpClients.forEach(clients::add);
//        model.addAttribute("contracts",corpClients);
//        return "contract";
//    }

    @GetMapping("/contract")
    public String contract(){
        return "contract";
    }


    @GetMapping("/contractfilter")
    public String main(@RequestParam(required = false, defaultValue = "") String filter, Model model) {
        Iterable<Contract> contracts;

        if (filter != null && !filter.isEmpty()) {
            contracts = contractrRepo.findByNumberOFContract(filter);
        } else {
            contracts = contractrRepo.findAll();
        }

        model.addAttribute("contracts", contracts);
        model.addAttribute("filter", filter);


        return "contractFilter";
    }

    @PostMapping("/contractsave")
    public String addContract
            (
                    @RequestParam  String numberOfContract,
                    @RequestParam Date DateOfStart,
                    @RequestParam Date DateOfEnd,
                     @RequestParam String client,
//
                //   @ModelAttribute Contract newContract,
//                    @ModelAttribute CorpClient newCorpClient,
                    Model model  )  {


        Contract contract = new Contract();
        contract.setNumberOFContract(numberOfContract);
        contract.setDateOfRer(DateOfStart);
        contract.setDateOfEnd(DateOfEnd);
//       List<Client> client1 = clientsRepo.findByEDRPOW(client);

//        if (client2 !=null) {
//            contract.setClient(client2);
//            model.addAttribute("clients", clientsRepo.findAll());
//        }
//        else {
//              contract.setClient(new Client());
//        }
//        contract.setClient(newClient);
//        model.addAttribute("contract", contractrRepo.findAll());

        contractrRepo.save(contract);
        return "contractSave";
    }
    @GetMapping("/contractsave")

    public String saveGet( Model model)
    { Iterable<Client> clients = clientsRepo.findAll();
    model.addAttribute("clients", clients);
               return "contractSave";
    }


}
