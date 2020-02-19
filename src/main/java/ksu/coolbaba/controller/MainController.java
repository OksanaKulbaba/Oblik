package ksu.coolbaba.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("")
    public String greeting() {

        return "index";
    }
    @GetMapping("/home")
    public String greeting2() {
        return "index";
    }

//    @GetMapping("/main")
//    public String main(@RequestParam(required = false, defaultValue = "") String filter, Model model) {
//        Iterable<Message> messages = messageRepo.findAll();
//
//        if (filter != null && !filter.isEmpty()) {
//            messages = messageRepo.findByTag(filter);
//        } else {
//            messages = messageRepo.findAll();
//        }
//
//        model.addAttribute("messages", messages);
//        model.addAttribute("filter", filter);
//
//        return "main";
//    }

//    @PostMapping("/main")
//    public String add(
//            @AuthenticationPrincipal User user,
//            @RequestParam String text,
//            @RequestParam String tag, Map<String, Object> model,
//            @RequestParam("file") MultipartFile file
//    ) throws IOException {
//        Message message = new Message(text, tag, user);
//
//        if (file != null && !file.getOriginalFilename().isEmpty()) {
//            File uploadDir = new File(uploadPath);
//
//            if (!uploadDir.exists()) {
//                uploadDir.mkdir();
//            }
//
//            String uuidFile = UUID.randomUUID().toString();
//            String resultFilename = uuidFile + "." + file.getOriginalFilename();
//
//            file.transferTo(new File(uploadPath + "/" + resultFilename));
//
//            message.setFilename(resultFilename);
//        }
//
//        messageRepo.save(message);
//
//        Iterable<Message> messages = messageRepo.findAll();
//
//        model.put("messages", messages);
//
//        return "main";
//    }
}
