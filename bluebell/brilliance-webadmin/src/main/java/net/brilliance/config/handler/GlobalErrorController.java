/**
 * 
 */
package net.brilliance.config.handler;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ducbq
 *
 */
@RestController
@Controller
public class GlobalErrorController implements ErrorController {

	private static final String PATH = "/error";

	@RequestMapping(value = PATH)
	public void error(HttpServletResponse response) throws IOException {
		int status = response.getStatus();
		switch (status) {
		case 404:
			response.sendRedirect("/404");
			break;
		case 401:
			response.sendRedirect("/401");
			break;
		case 403:
			response.sendRedirect("/401");
			break;
		default:
			response.sendRedirect("/404");
		}
	}

	@Override
	public String getErrorPath() {
		return PATH;
	}
}
