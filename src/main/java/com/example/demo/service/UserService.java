package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    /**
     * Конструктор
     * @param userRepository
     */
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * Получение списка всех пользователей
     * @return
     */
    public List<User> findAll() {
        return userRepository.findAll();
    }

    /**
     * Сохранение данных о пользователе
     * @param user
     * @return
     */
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    /**
     * Удаление пользователя
     * @param id
     */
    public void deleteById(int id) {
        userRepository.deleteById(id);
    }

    /**
     * Обновление данных о пользователе
     * @param user
     */
    public void updateUser(User user) {
        userRepository.update(user, user.getId());
    }
}
