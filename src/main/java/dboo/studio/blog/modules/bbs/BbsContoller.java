package dboo.studio.blog.modules.bbs;

import dboo.studio.blog.modules.bbs.domain.Bbs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class BbsContoller {

    @Autowired
    BbsRepository bbsRepository;
    BbsService bbsService;

    @GetMapping("/bbs/main")
    public String bbsMain(Model model) {
        Page<Bbs> bbsPage = bbsRepository.findAll(PageRequest.of(0, 10));
        model.addAttribute(bbsPage);
        return "billboards/bbs-main";
    }

    @GetMapping("/bbs/wirte")
    public String bbsWrite(Model model){
        model.addAttribute(new BbsWriteForm());
        return "billboards/bbs-write";
    }

    @PostMapping("/bbs/write")
    public String bbsWrite(BbsWriteForm bbsWriteForm){
        Bbs bbs = bbsService.bbsFormToEntity(bbsWriteForm);
        bbsRepository.save(bbs);
        return "billboard/bbs-mail";
    }

}
