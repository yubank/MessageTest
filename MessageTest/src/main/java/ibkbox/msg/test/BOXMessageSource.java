package ibkbox.msg.test;

import java.util.Locale;

import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Service;

@Service
public class BOXMessageSource {
	private ReloadableResourceBundleMessageSource msgSrc;
	
	public void setReloadableResourceBundleMessageSource(ReloadableResourceBundleMessageSource messageSource) {
		msgSrc = messageSource;
	}
	
	public String getMessage(String code) {
		return msgSrc.getMessage(code, null, Locale.getDefault());
	}

	public String getMessage(String code, Locale locale) {
		return msgSrc.getMessage(code, null, locale);
	}
}
