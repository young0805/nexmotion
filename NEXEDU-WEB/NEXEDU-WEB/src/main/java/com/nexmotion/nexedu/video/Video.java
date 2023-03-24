package com.nexmotion.nexedu.video;

import java.sql.Timestamp;

public class Video {

	private int seqno; 
	private String userid;
	private String subjectno;	
	private String subject; 
	private Timestamp regdate;	 
	private Timestamp createdate; 
	private Timestamp processdate;	 
	private String filepathmov; 
	private String filepathstt;	 
	private int statusprocess;	
	private int statussimilarity;
	private String memo;
	private String reporteruserid;
	private Timestamp reporterdate;
	private String major;
	private float plagrate;
	private String week;
	private int scrnum;

	/**
	 * 일련번호 반환
	 * @return 일련번호
	 */
	public int getSeqno() {
		return seqno;
	}

	/**
	 * 강좌 생성자 아이디 반환
	 * @return 강좌 생성자 아이디
	 */
	public String getUserid() {
		return userid;
	}

	/**
	 * 강좌번호 반환
	 * @return 강좌번호
	 */
	public String getSubjectno() {
		return subjectno;
	}

	/**
	 * 강좌명 반환
	 * @return 강좌명
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * 동영상 데이터 수신일시 반환
	 * @return 동영상 데이터 수신일시
	 */
	public Timestamp getRegdate() {
		return regdate;
	}

	/**
	 * 동영상 생성일자 반환
	 * @return 동영상 생성일자
	 */
	public Timestamp getCreatedate() {
		return createdate;
	}

	/**
	 * 엔진에서 statusprocess 값이 변경될때마다 now() 값을 처리시간에 기록한다.
	 * 처리시간을 반환한다.
	 * 
	 * @return 처리시간
	 */
	public Timestamp getProcessdate() {
		return processdate;
	}

	/**
	 * 강좌 동영상 파일의 위치 반환
	 * @return 강좌 동영상 파일의 위치
	 */
	public String getFilepathmov() {
		return filepathmov;
	}

	/**
	 * 음성인식 후 생성된 텍스트 파일의 위치 반환
	 * @return 음성인식이 완료된 텍스트 파일 위치
	 */
	public String getFilepathstt() {
		return filepathstt;
	}

	/**
	 * 동영상 처리에 대한 상태 정보 반환
	 * 
	 * 동영상 처리에 대한 상태 정보는 아래와 같다.
	 * 
	 * 0: 강좌동영상 정보 수신 완료
	 * 1: 강좌동영상 데이터 수신 중
	 * 2: 음성인식 수행 중
	 * 3: 유사도 조사중
	 * 4: 처리 완료
	 * 
	 * @return 동영상 처리에 대한 상태 정보
	 */
	public int getStatusprocess() {
		return statusprocess;
	}

	/**
	 * 유사도에 대한 상태값 반환
	 * 
	 * 유사도에 대한 상태 정보값은 아래와 같다.
	 * 
	 * 0: 미검토
	 * 1: 신고(표절)
	 * 2: 검토완료
	 * 
	 * @return 유사도에 대한 상태값
	 */
	public int getStatussimilarity() {
		return statussimilarity;
	}

	/**
	 * 신고사유 반환
	 * @return 신고사유
	 */
	public String getMemo() {
		return memo;
	}

	/**
	 * 신고자 아이디 반환
	 * @return 신고자 아이디
	 */
	public String getReporteruserid() {
		return reporteruserid;
	}

	/**
	 * 신고일시 반환
	 * @return 신고일시
	 */
	public Timestamp getReporterdate() {
		return reporterdate;
	}
	
	/**
	 * 학과명 반환
	 * @return 학과명
	 */
	public String getMajor() {
		return major;
	}

	/**
	 * 유사도 반환
	 * @return 유사도
	 */
	public float getPlagrate() {
		return plagrate;
	}

	/**
	 * 주차 반환
	 * @return 주차
	 */
	public String getWeek() {
		return week;
	}
	
	/**
	 * 한페이지에 보여줄 동영상 강좌 개수
	 * @return
	 */
	public int getScrnum() {
		return scrnum;
	}
	
	public void setSeqno(int seqno) {
		this.seqno = seqno;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public void setSubjectno(String subjectno) {
		this.subjectno = subjectno;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}

	public void setCreatedate(Timestamp createdate) {
		this.createdate = createdate;
	}

	public void setProcessdate(Timestamp processdate) {
		this.processdate = processdate;
	}

	public void setFilepathmov(String filepathmov) {
		this.filepathmov = filepathmov;
	}

	public void setFilepathstt(String filepathstt) {
		this.filepathstt = filepathstt;
	}

	public void setStatusprocess(int statusprocess) {
		this.statusprocess = statusprocess;
	}

	public void setStatussimilarity(int statussimilarity) {
		this.statussimilarity = statussimilarity;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public void setReporteruserid(String reporteruserid) {
		this.reporteruserid = reporteruserid;
	}

	public void setReporterdate(Timestamp reporterdate) {
		this.reporterdate = reporterdate;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public void setPlagrate(float plagrate) {
		this.plagrate = plagrate;
	}

	public void setWeek(String week) {
		this.week = week;
	}	

	public void setScrnum(int scrnum) {
		this.scrnum = scrnum;
	}

}
