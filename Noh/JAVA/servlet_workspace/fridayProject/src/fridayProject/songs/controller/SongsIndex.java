package fridayProject.songs.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fridayProject.songs.entity.Artist;

@WebServlet("/SongsIndex")
public class SongsIndex extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String DBurl = "jdbc:mysql://localhost:3306/artist";
		String uid = "root";
		String pwd = "0307";
		String sql = "SELECT * FROM ARTISTS ORDER BY NAME";
		
		List<Artist> artists = new ArrayList<>();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(DBurl, uid, pwd);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
					int id = rs.getInt("_ID");
					String name = rs.getString("NAME");
					
					Artist artist = new Artist(id, name);
					
					artists.add(artist);
//					System.out.println(artists);
					
			}
			
			rs.close();
			st.close();
			con.close();			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//redirect
		//forward
		request.setAttribute("artists", artists );
		request.getRequestDispatcher("/SongsIndex.jsp").forward(request, response);
	}
}
