package com.rockcor.strategydesingpattern.service;

public interface Strategy<T>{
    T buildRoute();
}
