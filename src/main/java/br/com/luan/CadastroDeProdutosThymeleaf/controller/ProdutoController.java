package br.com.luan.CadastroDeProdutosThymeleaf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.luan.CadastroDeProdutosThymeleaf.service.ProdutoServiceImplements;

@Controller
public class ProdutoController {
	
	@Autowired
	private ProdutoServiceImplements produtoService;

	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("allList", produtoService.getAllProduct());
		return "index";
	}

}
