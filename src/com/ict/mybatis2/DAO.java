package com.ict.mybatis2;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

// DB처리하는 클래스 : DBService.getFactory()로 SqlSessionFactory를 호출하고
// SqlSessionFactory를 이용해서 자바에서 사용할 수 있는 SqlSession

public class DAO {
	private static SqlSession ss;
	
	private synchronized static SqlSession getSession() {
		if (ss == null) {
			// 수동 커밋
			ss = DBService.getFactory().openSession();
		}
		return ss;
	}
	
	// DB 처리하는 메서드들 -> mapper.xml를 호출하는 메서드
	
	// 전체 보기
	public static List<VO> getList(){
		List<VO> list = null;
		list = getSession().selectList("members.selectAll");
		return list;
	}
	
	// 특정 데이터 보기
	public static VO getOne(String idx) {
		VO vo = null;
		vo = getSession().selectOne("members.selectOne", idx);
		return vo;
	}
	
	// 데이터 삭제
	public static int getDel(VO vo) {
		int result = 0;
		result = getSession().delete("members.delete", vo);
		if (result > 0) {
			ss.commit();
		}
		return result;
	}
	
	// 데이터 삽입
	public static int getIns(VO vo2) {
		int result = 0;
		result = getSession().insert("members.insert", vo2);
		if (result > 0) {
			ss.commit();
		}
		return result;
	}
	
	// 데이터 수정
	public static int getUp(VO vo3) {
		int result = 0;
		result = getSession().update("members.update", vo3);
		if (result > 0) {
			ss.commit();
		}
		return result;
	}
	
	// 로그인
	public static VO getLogin(VO vo4) {
		VO vo = null;
		vo = getSession().selectOne("members.login", vo4);
		
		// 아이디가 없으면 null이 되므로 return null;
		if (vo != null) {
			// pw를 얻어내자 (db에 암호화가 되어있다.)
			String pw = vo.getPw();
			
			// 우리가 입력한 pw를 암호화 하자. (나중에)
			// String s_pw = vo4.getPw.암호화 메서드 사용;
			
			// db에서 꺼낸 pw와 암호화된 pw를 비교하자 (나중에)
			// 이것이 true면 성공, false면 실패
			boolean res = true;
			
			if (true) {
				return vo;			
			} else {
				return null;			
			}
		} else {
			return null;
		}
	}
}
