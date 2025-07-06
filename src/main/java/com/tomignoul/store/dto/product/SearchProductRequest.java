package com.tomignoul.store.dto.product;

public class SearchProductRequest {
    private String keyword;
    private String category;

    public SearchProductRequest(){}

    public SearchProductRequest(String keyword, String category){
        this.keyword=keyword;
        this.category=category;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
