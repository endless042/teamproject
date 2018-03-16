package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sist.msk.Action;

public class PageController extends Action {

	public String main(HttpServletRequest req, HttpServletResponse res) throws Throwable {
		
		

		return "/view/main.jsp";
	}
	
public String about(HttpServletRequest req, HttpServletResponse res) throws Throwable {
		
		

		return "/view/about.jsp";
	}


public String study_board(HttpServletRequest req, HttpServletResponse res) throws Throwable {
	
	

	return "/view/study_board.jsp";
}


public String study_album(HttpServletRequest req, HttpServletResponse res) throws Throwable {
	
	

	return "/view/study_album.jsp";
}

}
