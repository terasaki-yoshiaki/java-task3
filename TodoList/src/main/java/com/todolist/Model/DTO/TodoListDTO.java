package com.todolist.Model.DTO;

import lombok.Data;

//import lombok.Data;

/**
 
TodoListDTOクラス*/
@Data
public class TodoListDTO {
    private int ID;
    private String Todo;
    private String Place;
    private String Datetime;
    private String Memo;
}
