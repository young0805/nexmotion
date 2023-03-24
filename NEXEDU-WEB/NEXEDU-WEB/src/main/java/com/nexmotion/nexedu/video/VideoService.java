package com.nexmotion.nexedu.video;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoService implements VideoMapper {
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public ArrayList<Video> getVideoList(int statussimilarity, int seqno, int scrNum) throws Throwable {
		// TODO Auto-generated method stub
		VideoMapper mapper = sqlSession.getMapper(VideoMapper.class);
	
		return mapper.getVideoList(statussimilarity, seqno, scrNum);
	}

}
