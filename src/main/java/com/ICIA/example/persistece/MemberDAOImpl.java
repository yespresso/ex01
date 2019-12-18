package com.ICIA.example.persistece;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.ICIA.example.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO{
    @Inject
    private SqlSession session;//데이타베이스 Connection 객체
    private static final String namespace="*memberMapper";
    
	@Override
	public List<MemberVO> list() {
		return session.selectList(namespace + ".list");
	}

	@Override
	public void insert(MemberVO vo) {
		
	}

}
