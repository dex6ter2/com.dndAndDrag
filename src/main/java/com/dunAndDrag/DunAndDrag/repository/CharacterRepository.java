package com.dunAndDrag.DunAndDrag.repository;

import com.dunAndDrag.DunAndDrag.model.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository<Character,Long> {
}
