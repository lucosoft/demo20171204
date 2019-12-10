package com.example.demo.service;

import org.apache.camel.Exchange;

import java.util.HashMap;

public interface CamelService {
    public String echo();
    public HashMap getData();
    public void procData(Exchange exchange);
    public void procDataValidate(Exchange exchange);
    public String getProcData();
}
