package com.test.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	//의존 주입 지역변수 하나, 여기에 Autowired를 걸면 굳이 생성자를 만들지 않아도 자동으로 의존 주입이 발생한다.
	@Autowired
	private MyBatisService service;
	
	//생성자 만들어줌
	//Autowired > 의존 객체를 자동으로 생성해서 아래에 주입시켜! 라는 의미
//	@Autowired
//	public MyController(MyBatisService service) {
//		this.service = service;
//	}

	
	
	//의존관계를 표현하던 xml을 아래의 어노테이션으로 적다보니, 주입을 할수가없는 상태가 됨
	//때문에 의존 주입을 xml로 하는것이 아니라 의존 주입도 어노테이션 형태로 하게 된다.
	@GetMapping(value="/m1")
	public String m1() {
		
		//http://localhost:8090/mybatis/
		//자동으로 spring 이 mybatis로 변경되어 있는 것을 확인할 수 있음
		//STS가 자동으로 루트 컨텍스트 이름을 package이름에서 가져온다
		
		//MyBatisService service = new MyBatisServiceImpl();
		
		System.out.println(this.service == null);
		
		service.m1();
		
		System.out.println("m1");
		
		return "result";
		
	} //m1
	
	@GetMapping(value="/m2")
	public String m2() {
		
		//insert
		
		service.m2();

		return "result";
		
	}//m2
	
	@GetMapping(value="/m3")
	public String m3(Model model, String item) {
		//model은 jsp에게 뭔가 주겠단 의미임
		
		//http:/localhost:8090/mybatis/m3?item=마우스 로 넘기겠단 의미
		
		//가격 인상, update
		
		int result = service.m3(item);
		
		model.addAttribute("result", result);

		return "result";
		
	}//m3
	
	@GetMapping(value="/m4")
	public String m4(Model model, String item) {
		
		//m4?item=마우스
		//delete
		
		int result = service.m4(item);
		
		model.addAttribute("result", result);
		
		return "result";
		
	}//m4
	
	@GetMapping(value="/m5")
	public String m5(Model model, MyBatisDTO dto) {
		
		//데이터 넘겨서 insert하기
		//m5?item=마우스&price=35000
		
		int result = service.m5(dto);
		
		model.addAttribute("result", result);

		return "result";
		
	}//m5
	
	
	//@RequestMapping(value="/m6", method=RequestMethod.GET) 을 아래처럼 쓸 수 있다. Post는 PostMapping
	@GetMapping(value="/m6")
	public String m6(Model model) {
		
		//가격이 가장 비싼 상품명
		String item = service.m6();
		
		model.addAttribute("item", item);
		
		return "result";
		
		
	} //m6
	
	@GetMapping(value="/m7")
	public String m7(Model model, String item) {
		
		//가격이 가장 비싼 상품명
		MyBatisDTO dto = service.m7(item);
		
		model.addAttribute("dto", dto);
		
		return "result";
		
		
	} //m7
	
	@GetMapping(value="/m8")
	public String m8(Model model) {
		
		List<MyBatisDTO> list = service.m8();
		
		model.addAttribute("list", list);
		
		return "result";
		
		
	} //m8
	
	
	@GetMapping(value="/m9")
	public String m9(Model model, String word) {
		
		//m9?word=키
		
		List<MyBatisDTO> list = service.m9(word);
		
		model.addAttribute("list", list);
		
		return "result";
		
		
	} //m9
	
	@GetMapping(value="/m10")
	public String m10(Model model, String table) {

		//m10?table=테이블명
		
		int count = service.m10(table);
		
		model.addAttribute("count", count);
		
		return "result";
		
		
	} //m10
	
	@GetMapping(value="/m11")
	public String m11(Model model, int order) {
		
		//m11?order=1
		//m11?order=2
		
		List<MyBatisDTO> list = service.m11(order);
		
		model.addAttribute("list", list);
		
		return "result";
		
		
	} //m11

}








