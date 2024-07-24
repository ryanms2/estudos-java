package estudos.me.api.service.impl;

import estudos.me.api.domain.model.Users;
import estudos.me.api.domain.repository.UsersRepository;
import estudos.me.api.service.TodoService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class TodoServiceImpl implements TodoService {

    private final UsersRepository userRepository;

    public TodoServiceImpl(UsersRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public Users findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Users createUser(Users usersToCreate) {

        return userRepository.save(usersToCreate);
    }
}
