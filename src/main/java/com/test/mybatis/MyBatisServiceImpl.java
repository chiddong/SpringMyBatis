package com.test.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//다른 곳에서 @Autowired 에 의해서 의존 주입을 당할 자격을 부여
@Service
public class MyBatisServiceImpl implements MyBatisService{
	
	@Autowired
	private MyBatisDAO dao;
	
//	@Autowired
//	public MyBatisServiceImpl(MyBatisDAO dao) {
//			this.dao = dao;
//	}
	
	//인터페이스의 추상 메소드
	@Override
	public void m1() {
		
		//MyBatisDAO dao = new MyBatisDAOImpl();
		
		dao.m1();
		
	}

	@Override
	public void m2() {
		
		dao.m2();
		
	}

	@Override
	public int m3(String item) {

		return dao.m3(item);
	}
	
	@Override
	public int m4(String item) {
		
		return dao.m4(item);
	}
	
	@Override
	public int m5(MyBatisDTO dto) {

		return dao.m5(dto);
	}
	
	@Override
	public String m6() {

		return dao.m6();
	}
	
	@Override
	public MyBatisDTO m7(String item) {
		
		return dao.m7(item);
	}
	
	@Override
	public List<MyBatisDTO> m8() {

		return dao.m8();
	}

	@Override
	public List<MyBatisDTO> m9(String word) {

		return dao.m9(word);
	}
	
	@Override
	public int m10(String table) {
		
		return dao.m10(table);
	}
	
	@Override
	public List<MyBatisDTO> m11(int order) {

		return dao.m11(order);
	}
	
}













