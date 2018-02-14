package com.wisdom.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ctx = new AnnotationConfigApplicationContext(TextEditorConfig.class);
		TextEditor te = ctx.getBean(TextEditor.class);
		te.spellCheck();
	}
}
