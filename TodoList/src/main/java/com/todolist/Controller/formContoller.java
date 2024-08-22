package com.todolist.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.todolist.Model.DAO.TodoListDAO;
import com.todolist.Model.DTO.TodoListDTO;

@Controller
public class formContoller {

	
	
	private static final String TodoListDTO = null;

	@GetMapping("/form")
	//フォームから入力したデータをDTOに格納
    public String form(Model model) {
		TodoListDTO todolistDTO = new TodoListDTO();
		model.addAttribute("dto",todolistDTO);
        return "form.html";
	}
	
	@PostMapping("/create")
	
	//DTOからDAOへ
	public String form(@ModelAttribute TodoListDTO dto, Model model) {
		if(dto != null ) {
        //DAOを呼び出して処理
        TodoListDAO todolistDAO = new TodoListDAO();
        todolistDAO.insert(dto);
        //getMappingの処理を同じ処理をさせたい
		} else {
			return "from.html";
		}
        
        
        return "redirect:/";
	}
}
