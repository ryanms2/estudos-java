package estudos.me.api.controller;

import estudos.me.api.domain.model.Users;
import estudos.me.api.service.TodoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/users")
@Tag(name = "Todo API", description = "Uma API de gerenciamento de tarefas")
public class UserController {

    private final TodoService todoService;

    public UserController(TodoService todoService) {
        this.todoService = todoService;
    }


    @GetMapping("/{id}")
    @Operation(summary = "Obtem um usuário.")
    @ApiResponse(responseCode = "200", description = "Usuário obtido com sucesso.")
    public ResponseEntity<Users> findById(@PathVariable Long id) {
        var user = todoService.findById(id);
        return ResponseEntity.ok(user);
    }

    @PostMapping
    @Operation(summary = "Cria o usuário")
    @ApiResponse(responseCode = "200", description = "Usuário criado com sucesso")
    @ApiResponse(responseCode = "402", description = "Insira o usuário corretamente")
    public ResponseEntity<Users> createUser(@RequestBody Users User) {
        var user = todoService.createUser(User);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(user.getId())
                .toUri();
        return ResponseEntity.created(location).body(user);
    }
}
