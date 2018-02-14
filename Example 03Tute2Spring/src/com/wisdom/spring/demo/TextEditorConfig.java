package com.wisdom.spring.demo;

import org.springframework.context.annotation.*;

@Configuration
public class TextEditorConfig {

	@Bean
	public TextEditor textEditor() {
		return new TextEditor(spellChecker());
	}

	@Bean
	public SpellChecker spellChecker() {
		return new SpellChecker();
	}
}
