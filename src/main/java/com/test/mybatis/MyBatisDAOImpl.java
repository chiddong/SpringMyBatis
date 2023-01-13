package com.test.mybatis;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//@Component (일반적인 자바 객체), @Service (주업무를 하는 Service 객체), @Repository (DB관리하는 객체) > 전부 동일한 역할인데 그냥 별칭이 다른것 : @Autowired의 대상이란 의미임

@Repository
public class MyBatisDAOImpl implements MyBatisDAO {

	@Autowired
	private SqlSessionTemplate template;
	//쿼리를 날리는 역할 > Statement, ResultSet 역할 > 근데 이전에 sessionfactory를 만들어야함 > 그럼 이전에 dataSource를 만들어야함
	
	@Override
	public void m1() {
		
		System.out.println("m1");
		
	}

	@Override
	public void m2() {
		
		//DB연결이 끝나있는 상태이기 때문에 따로 연결해줄 것이 없이 바로 쿼리를 날리면 된다!
		//executeUpdate()
		// - template.insert()
		// - template.update()
		// - template.delete()
		
		//executeQuery()
		// - template.selectOne()
		// - template.selectList()
		
		this.template.insert("test.m2");	//test.xml에 있는 namespace가 test인 애를 찾아서 그 내부의 id가 m2인 얘를 찾는다.
		
	}
	
	@Override
	public int m3(String item) {
		
		//insert, update는 return값이 int > 적용한 행의 갯수 > excuteUpdate
		return this.template.update("test.m3", item);
	}
	
	@Override
	public int m4(String item) {

		
		return this.template.delete("test.m4", item);
	}

	@Override
	public int m5(MyBatisDTO dto) {
		
		//넘기는 데이터가 Object 형으로 되어있으므로 뭘 넘기든 그냥 적어서 넘겨주면 된다.
		return this.template.insert("test.m5", dto);
	}
	
	@Override
	public String m6() {

		//executeQuery()
		//어떤 값으로 선언되었는지에 따라서 반환값이 그때그때 달라진다.
		// - template.selectOne() 	> 결과셋의 레코드 1개	> if(rs.next()) {}
		// - template.selectList()	> 결과셋의 레코드 N개	> while(rs.next()) {}
		
		return this.template.selectOne("test.m6");
	}
	
	@Override
	public MyBatisDTO m7(String item) {
		
		//원래 dto에 옮겨담아줘야 했던 그 과정이 selectOne에 다 들어가있는 상황임
		return this.template.selectOne("test.m7", item);
	}
	
	@Override
	public List<MyBatisDTO> m8() {
		
		return this.template.selectList("test.m8");
	}
	
	@Override
	public List<MyBatisDTO> m9(String word) {

		return this.template.selectList("test.m9", word);
	}
	
	@Override
	public int m10(String table) {
		
		return this.template.selectOne("test.m10", table);
	}
	
	@Override
	public List<MyBatisDTO> m11(int order) {

		return this.template.selectList("test.m11", order);
	}
}





















