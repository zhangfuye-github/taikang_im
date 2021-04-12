package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: 张夫业
 * @Date: 2021/4/11
 * @Description:
 */
@Controller
@RestController
@SpringBootApplication
public class SampleController {
    @RequestMapping("/" )
    @ResponseBody
    public String home(){
        return "hellowolrd";
    }
    public static void main(String[] args) {
        SpringApplication.run(SampleController.class,args);
    }
}
