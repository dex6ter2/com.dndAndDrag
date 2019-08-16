package com.dunAndDrag.DunAndDrag.Service;

import com.dunAndDrag.DunAndDrag.DTO.CharacterDTO;

public interface CharacterService {
    /**
     * Creates a Character and stores in the Database
     * @param characterDTO
     * @return charaterDTO that was sent to be saved
     */
    public CharacterDTO saveCharacter(CharacterDTO characterDTO);
}
