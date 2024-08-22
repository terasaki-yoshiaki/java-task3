package com.todolist.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.todolist.Model.DAO.TodoListDAO;
import com.todolist.Model.DTO.TodoListDTO;

@Controller
public class customController {
	
	
	@PostMapping("/custom")
	//DTOからDAOへ
	public String editform(@ModelAttribute TodoListDTO dto, Model model) {
        
        //DAOを呼び出して処理
        TodoListDAO todolistDAO = new TodoListDAO();
        todolistDAO.update(dto);
        //getMappingの処理を同じ処理をさせたい
        return "redirect:/";
	}
}