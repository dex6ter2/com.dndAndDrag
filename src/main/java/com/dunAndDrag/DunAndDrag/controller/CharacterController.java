package com.dunAndDrag.DunAndDrag.controller;

import com.dunAndDrag.DunAndDrag.model.Character;
import com.dunAndDrag.DunAndDrag.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class CharacterController {

    @Autowired
    private CharacterRepository characterRepository;

    @PostMapping
    public void createCharacter(@RequestBody Character character) {
        characterRepository.save(character);

    }


}
