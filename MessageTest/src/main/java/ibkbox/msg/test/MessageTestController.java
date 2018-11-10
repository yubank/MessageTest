package ibkbox.msg.test;

import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MessageTestController {
	@Resource(name="boxMsg")
	BOXMessageSource boxMsg ;
	
	@RequestMapping("index.do")
	public ModelAndView Index() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("test", "....");
		mv.addObject("msg", boxMsg.getMessage("title.sample.id"));
		mv.addObject("kr_msg", boxMsg.getMessage("title.sample.id", Locale.KOREA));
		mv.addObject("en_msg", boxMsg.getMessage("title.sample.id", Locale.ENGLISH));
		return mv;
	}
}
