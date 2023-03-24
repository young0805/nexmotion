package com.nexmotion.nexedu.video;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface VideoMapper {
	
	/**
	 * 비디오 리스트를 가져온다. 
	 * 
	 * @param statussimilarity 유사도에 대한 상태(0: 미검토, 1: 신고(표절), 2: 검토완료)
	 * @param startNum 현재 페이지에서 보여줄 첫 게시물의 index
	 * @param scrNum 한페이지당 보여줄 게시물 수
	 * @return Video Object 에 대한 배열
	 * @throws Throwable
	 */
	public ArrayList<Video> getVideoList(@Param("statussimilarity") int statussimilarity,
			@Param("seqno") int seqno,
            @Param("scrnum") int scrNum) throws Throwable;	

}
