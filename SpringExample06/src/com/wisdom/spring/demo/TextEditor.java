package com.wisdom.spring.demo;

public class TextEditor {

	private SpellChecker spellChecker;

	/*example06
	 * public TextEditor(SpellChecker spellChecker) {
		System.out.println("Inside texteditor constructor");
		this.spellChecker = spellChecker;
	}*/
	
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Inside setSpellchecker");
		this.spellChecker = spellChecker;
	}
	public void spellCheck()
	{
		spellChecker.checkSpelling();
	}

	
}
