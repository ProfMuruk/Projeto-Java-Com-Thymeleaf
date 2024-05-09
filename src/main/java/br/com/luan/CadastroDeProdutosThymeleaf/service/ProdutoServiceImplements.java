package br.com.luan.CadastroDeProdutosThymeleaf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.luan.CadastroDeProdutosThymeleaf.entity.Produto;
import br.com.luan.CadastroDeProdutosThymeleaf.repository.ProdutoRepository;

@Service
public class ProdutoServiceImplements implements ProdutoService {
	
	@Autowired
	private ProdutoRepository repository;
	
	@Override
	public List<Produto> getAllProduct(){
		return repository.findAll();
	}
}
