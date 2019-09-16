package com.HappiestMinds.Persistent;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Word {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	private String wrd;
	
	/*public Word(int id, String wrd) {
		super();
		System.out.println(id+" "+wrd);
		this.id = id;
		this.wrd = wrd;
	}*/
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getWrd() {
		return wrd;
	}

	public void setWrd(String wrd) {
		this.wrd = wrd;
	}

	@Override
	public String toString() {
		return  wrd+" " ;
	}

	
}
