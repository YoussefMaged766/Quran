package com.example.quran.api

data class Response(
	val language: List<LanguageItem?>? = null
)

data class LanguageItem(
	val language: String? = null,
	val id: String? = null,
	val radioUrl: String? = null
)

