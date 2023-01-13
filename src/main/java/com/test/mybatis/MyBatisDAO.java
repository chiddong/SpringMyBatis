package com.test.mybatis;

import java.util.List;

public interface MyBatisDAO {

	void m1();

	void m2();

	int m3(String item);

	int m4(String item);

	int m5(MyBatisDTO dto);

	String m6();

	MyBatisDTO m7(String item);

	List<MyBatisDTO> m8();

	List<MyBatisDTO> m9(String word);

	int m10(String table);

	List<MyBatisDTO> m11(int order);

}
