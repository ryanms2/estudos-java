package estudos.me.api.service;

import estudos.me.api.domain.model.Users;

public interface TodoService {

    Users createUser(Users userToCreate);

    Users findById(Long id);
}
