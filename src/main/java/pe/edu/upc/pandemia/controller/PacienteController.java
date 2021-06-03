package pe.edu.upc.pandemia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/inicio")
public class PacienteController {

		@GetMapping
		public String response() {
			return "/index.html";
		}
}
