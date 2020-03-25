package ksu.coolbaba.controller;

import ksu.coolbaba.domain.Client;
import ksu.coolbaba.domain.Contract;
import ksu.coolbaba.repos.ClientsRepo;
import ksu.coolbaba.servise.imp.ClientServiceImp;
import ksu.coolbaba.servise.imp.ContractServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;

@RequestMapping("")
@Controller
public class ContractController {
   @Autowired
    private  ContractServiceImp contractServiceImp;

    @Autowired
    ClientServiceImp clientServiceImp;


    @GetMapping("/contractSearch")
    public String main(@RequestParam(required = false, defaultValue = "")  String filter,
            //   @RequestParam Long idClient,
                                 //  @RequestParam String nameClient,
                                   Model model) {
        Iterable<Contract> contracts;
        Long idClient4 = new Long(20);


        if (filter != null && !filter.isEmpty()) {
            contracts = contractServiceImp.findByNumber(filter);
        }
//        else if (nameClient !=null) {
//              contracts = contractServiceImp.getAllContractByClient(clientServiceImp.getClientByName(nameClient));
//        }
        else {
            contracts = contractServiceImp.getAllContract();
        }

        model.addAttribute("contracts", contracts);
        model.addAttribute("filter", filter);
        model.addAttribute("clients",clientServiceImp.findAll());

        return "contractSearch";
    }

    @PostMapping("/contractAdd")
    public String addContract
            (
                    @RequestParam  String number,
                    @RequestParam Date Date,
                      @RequestParam Long idClient,

                //   @ModelAttribute Contract newContract,
//                    @ModelAttribute CorpClient newCorpClient,
                    Model model  )  {


        Contract contract = new Contract();
        contract.setNumberOFContract(number);
        contract.setDataStart(Date);



        if (idClient !=null) {
            contract.setClient(clientServiceImp.getClientById(idClient));
            model.addAttribute("clients", clientServiceImp.findAll());
        }
        else {
              contract.setClient(new Client());
        }

        model.addAttribute("contract", contractServiceImp.getAllContract());

        contractServiceImp.addContract(contract);
        return "contractAdd";
    }
    @GetMapping("/contractAdd")

    public String client(Model model) {
        Iterable<Client> clients = clientServiceImp.findAll();
        model.addAttribute("clients",clients);

        return "contractAdd";
    }

    @GetMapping("/contractSearch2")

    public String client2(Model model) {
        Iterable<Client> clients = clientServiceImp.findAll();
        model.addAttribute("clients",clients);

        return "contractSearch";
    }

}
