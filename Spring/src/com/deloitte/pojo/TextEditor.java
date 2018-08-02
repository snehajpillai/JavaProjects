package com.deloitte.pojo;

import org.springframework.beans.factory.annotation.Required;

public class TextEditor {
	private SpellChecker spellChecker;
	private String name;
	public TextEditor() {
		
	}
	
	
	public void getName() {
		System.out.println("Name: "+name);
		
	}

	@Required          //add this annotation at set method 
	public void setName(String name) {
		this.name = name;
	}


	public TextEditor(SpellChecker spellChecker) {
		System.out.println("Inside text editor constructor. ");
		this.spellChecker=spellChecker;
	}
	public void spellCheck() {
		spellChecker.checkSpelling();
	}
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}
	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Inside Set Spell checker. ");
		this.spellChecker = spellChecker;
	}

}
