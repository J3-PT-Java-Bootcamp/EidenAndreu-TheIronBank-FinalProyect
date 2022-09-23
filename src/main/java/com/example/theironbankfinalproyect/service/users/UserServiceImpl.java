package com.example.theironbankfinalproyect.service.users;


import com.example.theironbankfinalproyect.model.users.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

        @Override
    public User createUser(Long id, String name, UserType userType) {
            switch (userType) {
                case ADMIN:
                    Admin adminAccount = new Admin(name);
                    break;
                case THIRDPARTY:
                    ThirdParty thirdPartyAccount = new ThirdParty(name);
                    break;
                case ACCOUNTHOLDER:
                    AccountHolder accountHolderAccount = new AccountHolder(name);
                    break;

            }
            return null;
        }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
