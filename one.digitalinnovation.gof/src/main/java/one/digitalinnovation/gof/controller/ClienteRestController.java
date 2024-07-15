package one.digitalinnovation.gof.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.service.ClienteService;

@RestController
@RequestMapping("/clientes")
@Tag(name = "API cep")
public class ClienteRestController {

	@Autowired
	private ClienteService clienteService;


	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Motorista editado com sucesso"),
			@ApiResponse(responseCode = "417", description = "Algum erro de validação de dados ocorreu"),
			@ApiResponse(responseCode = "500", description = "Erro interno do servidor")
	})
	@Operation(summary = "Obtem todos os clientes", description = "Operação para obter todos os clientes")
	@GetMapping
	public ResponseEntity<Iterable<Cliente>> buscarTodos() {
		return ResponseEntity.ok(clienteService.buscarTodos());
	}
	@Operation(summary = "Obtem o cliente pelo id")
	@GetMapping("/{id}")
	@ApiResponses(value = {@ApiResponse(responseCode = "200", description = "cliente obtido com sucesso") })
	public ResponseEntity<Cliente> buscarPorId(@PathVariable Long id) {
		return ResponseEntity.ok(clienteService.buscarPorId(id));
	}
	@Operation(summary = "Insere um novo cliente")
	@ApiResponses(value = @ApiResponse(responseCode = "200", description = "Cliente inserido com sucesso"))
	@PostMapping
	public ResponseEntity<Cliente> inserir(@RequestBody Cliente cliente) {
		clienteService.inserir(cliente);
		return ResponseEntity.ok(cliente);
	}
	@Operation(summary = "Atualiza o cliente")
	@ApiResponses(value = @ApiResponse(responseCode = "200", description = "Cliente atualizado com sucesso"))
	@PutMapping("/{id}")
	public ResponseEntity<Cliente> atualizar(@PathVariable Long id, @RequestBody Cliente cliente) {
		clienteService.atualizar(id, cliente);
		return ResponseEntity.ok(cliente);
	}

	@Operation(summary = "deleta o cliente")
	@ApiResponses(value = @ApiResponse(responseCode = "200", description = "Cliente deletado com sucesso"))
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletar(@PathVariable Long id) {
		clienteService.deletar(id);
		return ResponseEntity.ok().build();
	}
}
