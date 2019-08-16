package com.dunAndDrag.DunAndDrag.controller;

import com.dunAndDrag.DunAndDrag.DTO.CharacterDTO;
import com.dunAndDrag.DunAndDrag.Service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/character")
public class CharacterController {

    @Autowired
    private CharacterService characterService;

    @GetMapping
    public String all(){
        return "heelo";
    }

    //TODO create ERROR Global Handling

    @PostMapping
    public ResponseEntity<Object> createCharacter(@RequestBody @Valid CharacterDTO characterDTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()){
            return new ResponseEntity<>("Error",HttpStatus.BAD_REQUEST);
        }
        characterService.saveCharacter(characterDTO);
        return new ResponseEntity<Object>(characterDTO,HttpStatus.OK);
    }
}
