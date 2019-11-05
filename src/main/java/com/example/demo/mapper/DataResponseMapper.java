package com.example.demo.mapper;

import com.example.demo.model.DataDTO;
import org.springframework.stereotype.Component;

@Component
public class DataResponseMapper {

    DataDTO dataDTO = new DataDTO();

    public DataDTO mapFrom (String data){
        if (null!=data) dataDTO.setData(data);
        return dataDTO;
    }

    public String mapTo (){
        return dataDTO.getData() != null ? dataDTO.getData() : "";
    }
}
