package hello;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiCtrl {

    @RequestMapping("/create")
    public Content create(@RequestParam(value="content") String content) {
        Content c = new Content();
        hhhh
        c.setContent(content);
        c.setTimeStamp(LocalDateTime.now().toString());

        return c;
    }

}
