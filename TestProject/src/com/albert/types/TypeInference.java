package com.albert.types;

//更好的类型推测机制
public class TypeInference {
	public static void main(String[] args) {
		final Value<String> value = new Value<>();
		value.getOrDefault("22", Value.defaultValue());
	}
}