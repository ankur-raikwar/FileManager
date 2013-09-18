package com.ankur.coreutils;

import android.content.SearchRecentSuggestionsProvider;

public class SearchSuggestions extends SearchRecentSuggestionsProvider {
	public final static String AUTHORITY = "com.ankur.core";
	public final static int MODE = DATABASE_MODE_QUERIES;

	public SearchSuggestions() {
		setupSuggestions(AUTHORITY, MODE);
	}
}