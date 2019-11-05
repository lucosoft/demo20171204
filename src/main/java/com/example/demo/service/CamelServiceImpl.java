package com.example.demo.service;

import com.example.demo.mapper.DataResponseMapper;
import org.apache.camel.Exchange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service("CamelService")
public class CamelServiceImpl implements CamelService {

    @Autowired
    private DataResponseMapper dataResponseMapper;

    public String echo() {
        return "Demo20171204 camel echo";
    }

    public HashMap getData() {
        return new HashMap<String, String>() {{
            put("key1", "value1");
            put("key2", "value2");
        }};
    }

    public void procData(Exchange exchange) {

            String responseData = (String) exchange.getIn().getBody().toString();
            dataResponseMapper.mapFrom(responseData);
            System.out.println("procData: " + responseData
        );
    }

    public String getProcData() {
        return dataResponseMapper.mapTo();
    }
}
