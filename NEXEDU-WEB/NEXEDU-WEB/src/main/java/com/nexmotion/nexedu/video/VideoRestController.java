package com.nexmotion.nexedu.video;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nexmotion.openapi.code.StatusCode;
import com.nexmotion.openapi.response.ResponseObject;

@RestController
public class VideoRestController {
	
	private Logger errlogger = LoggerFactory.getLogger("com.nexmotion.error");
	
	@Autowired
	private VideoService videoService;
	
	@RequestMapping("/video/list")
	public ResponseObject getVideoList(@ModelAttribute Video video) {
		ResponseObject ret = new ResponseObject();
		
		if (video.getScrnum() == 0)
			video.setScrnum(50); // default
		
		ArrayList<Video> list = null;
				
		try {
			list = videoService.getVideoList(video.getStatussimilarity(), video.getSeqno(), video.getScrnum());
		} catch (Throwable e) {
			//e.printStackTrace();
			ret.setReturnCode(StatusCode.ERROR_SERVICE);
			errlogger.error("getVideoList", e);
			return ret;
		}
		
		ret.setData(list);
		ret.setReturnCode(StatusCode.OK);
		
		return ret;	
	}

}
