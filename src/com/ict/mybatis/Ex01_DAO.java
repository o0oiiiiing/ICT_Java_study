package com.ict.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

// DB 처리하는 메서드들을 가지고 있는 클래스
public class Ex01_DAO {
	// MyBatis에서 실제 사용하는 클래스 : SqlSession
	private static SqlSession ss;
	
	// 싱글턴 패턴 (동기화 처리까지)
	private synchronized static SqlSession getSession() {
		if (ss == null) {
			// 수동 커밋을 해야 한다.
			ss = Ex01_DBService.getFactory().openSession();
		}
		return ss;
	}
	
	// DB 처리하는 메서드들 → mapper.xml를 호출하는 메서드
	// select : 결과(resultType) 여러개/하나 구분
	//			파라미터 X/하나/둘 이상
	
	// customer 테이블의 전체 내용 보기 : 결과 - 여러개 - List<VO>
	//							   파라미터는 없다.
	public static List<Ex01_VO> getList(){
		List<Ex01_VO> list = null;
		// getSession().selectList(mapper.xml의 namespace.id); // selectList는 결과가 여러개일 때
		list = getSession().selectList("customer.getSelectAll");
		return list;
	}
	
	// customer 테이블의 특정 데이터 보기
	// select : 하나 (VO, int, String...)
	//			파라미터가 있으므로 인자를 넣어준다.
	public static Ex01_VO getOne(String custid) {
		Ex01_VO vo = null;
		vo = getSession().selectOne("customer.getSelectOne", custid);
		return vo;
	}
	
	public static int getCnt() {
		int result = 0;
		result = getSession().selectOne("customer.getCount");
		return result;
	}
	
	// insert, update, delete
	// 결과 무조건 int
	// 결과 commit
	// 파라미터 타입이 하나일 때 vo, String, int...
	// 파라미터 타입이 여러개일 때 무조건 VO 만들어서 넣자
	public static int getIns(Ex01_VO vo) {
		int result = 0;
		result = getSession().insert("customer.getInsert", vo);
		if (result > 0) {
			ss.commit();
		}
		return result;
	}
	
	public static int getDel(Ex01_VO vo) {
		int result = 0;
		result = getSession().delete("customer.getDelete", vo);
		if (result > 0) {
			ss.commit();
		}
		return result;
	}
	
	public static int getUp(Ex01_VO vo) {
		int result = 0;
		result = getSession().update("customer.getUpdate", vo);
		if (result > 0) {
			ss.commit();
		}
		return result;
	}
}
