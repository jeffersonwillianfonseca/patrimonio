package controller;

import model.Campus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemPatrimonioController {

//    @Autowired
//    ItemPatrimonioRepository itemPatrimonioRepository;
//
//    @RequestMapping("/lista")
//    public List<Campus> retornaLista(){
//        return itemPatrimonioRepository.listaOsCampus();
//    }

    @RequestMapping("retorno")
    public Campus retorna1() {
        return new Campus(1, "212", "utfpr");
        //return itemPatrimonioRepository.retorna1();
    }
}
