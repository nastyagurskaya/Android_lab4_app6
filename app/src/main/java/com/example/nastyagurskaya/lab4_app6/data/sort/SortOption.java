package com.example.nastyagurskaya.lab4_app6.data.sort;

public enum SortOption {
    ASC, DESC;

    public SortOption revert(){
        switch (this){
            case ASC:
                return DESC;
            case DESC:
                return ASC;
            default:
                return null;
        }
    }

    @Override
    public String toString() {
        switch (this){
            case ASC:
                return "ASC";
            case DESC:
                return "DESC";
            default:
                return "";
        }
    }
}
