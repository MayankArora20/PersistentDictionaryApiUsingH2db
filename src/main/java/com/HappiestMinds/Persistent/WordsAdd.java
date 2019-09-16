package com.HappiestMinds.Persistent;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.HappiestMinds.Persistent.Word;


public interface WordsAdd extends JpaRepository<Word,String>
{
	
	boolean existsByWrd(String w);

}
