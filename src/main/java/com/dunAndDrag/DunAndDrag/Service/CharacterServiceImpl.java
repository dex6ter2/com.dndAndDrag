package com.dunAndDrag.DunAndDrag.Service;

import com.dunAndDrag.DunAndDrag.DTO.CharacterDTO;
import com.dunAndDrag.DunAndDrag.model.Character;
import com.dunAndDrag.DunAndDrag.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("characterService")
public class CharacterServiceImpl implements CharacterService {
    @Autowired
    private CharacterRepository characterRepository;
    //TODO Test
    @Override
    public CharacterDTO saveCharacter(CharacterDTO characterDTO) {
        characterRepository.save(transformCharacterToEntity(characterDTO));
        return characterDTO;
    }
//TODO Test
    private Character transformCharacterToEntity(CharacterDTO characterDTO) {
        Character character = new Character();
        character.setHeight(characterDTO.getHeight());
        character.setName(characterDTO.getName());
        character.setWeight(characterDTO.getWeight());
        character.setSex(characterDTO.getSex());
        return character;
    }
}
