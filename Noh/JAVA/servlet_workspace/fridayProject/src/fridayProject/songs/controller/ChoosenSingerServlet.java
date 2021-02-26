package fridayProject.songs.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fridayProject.songs.dao.ChoiceSongs;
import fridayProject.songs.entity.Album;

/**
 * Servlet implementation class ChoosenSingerServlet
 */
@WebServlet("/ChoosenSingerServlet")
public class ChoosenSingerServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String singer = (String)request.getParameter("singer");
		ChoiceSongs choiceSongs = new ChoiceSongs();
		List<Album> results = choiceSongs.querysongArtist(singer);
		request.setAttribute("results", results);
		request.getRequestDispatcher("/SongsResult.jsp").forward(request, response);
		System.out.println(singer);
		
	}

}
