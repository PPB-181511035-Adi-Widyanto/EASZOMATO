package com.example.easzomato.viewmodels;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.example.easzomato.model.Search;
import com.example.easzomato.repositories.SearchRepository;

public class SearchViewModel extends ViewModel {
    private static final String API_KEY = "ea21eeff2a2dfcbb16b4fcc192d27726";
    private SearchRepository searchRepository;
    private MutableLiveData<Search> searchMutableLiveData;

    public void init() {
        searchRepository = new SearchRepository();
        searchMutableLiveData = searchRepository.getSearchMutableLiveData();
    }

    public void search(String keyword) {
        searchRepository.search(keyword, API_KEY);
    }

    public LiveData<Search> getSearchLiveData() {
        return searchMutableLiveData;
    }
}
