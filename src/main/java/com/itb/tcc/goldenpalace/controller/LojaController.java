package com.itb.tcc.goldenpalace.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.tcc.goldenpalace.model.Produto;

@Controller
@RequestMapping("/goldenpalace/produtos")
public class LojaController {
List<Produto> produtos = new ArrayList<Produto>();
	
	
	@GetMapping("/listar")
	public String listarProdutos(Model model) {
		
		Produto produto = new Produto();
		produto.setNome("Televisor 70' Samsung");
		produto.setCodigoBarras("JFALJFDOE2514");
		produto.setPreco(6541.25);

		return "produtos";
	}
}
