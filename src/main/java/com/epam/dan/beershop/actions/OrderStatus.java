package com.epam.dan.beershop.actions;


public enum OrderStatus {
    SELECTED(false), ACCEPTED(false), ASSEMBLED(false), DELIVERED(false);
    OrderStatus(boolean option){
    }
}
