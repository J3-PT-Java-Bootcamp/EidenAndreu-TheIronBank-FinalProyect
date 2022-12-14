package com.example.theironbankfinalproyect.service.users;


import com.example.theironbankfinalproyect.model.users.ThirdParty;
import com.example.theironbankfinalproyect.repository.users.ThirdPartyRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface ThirdPartyService {

    List<ThirdParty> findAll();

    ThirdParty findById(Long id);

    ThirdParty save(ThirdParty thirdParty);

    void deleteById(Long id);
}
