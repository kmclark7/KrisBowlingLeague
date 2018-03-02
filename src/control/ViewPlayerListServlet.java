package control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Player;
import control.PlayerHelper;

/**
 * Servlet implementation class ViewPlayerListServlet
 */
@WebServlet("/ViewPlayerListServlet")
public class ViewPlayerListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewPlayerListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PlayerHelper playerHelper = new PlayerHelper();
		
		List<Player> allPlayers = playerHelper.
	
		request.setAttribute("allPlayers", allPlayers);
		if (allPlayers.isEmpty()) {
			request.setAttribute("allPlayers", " ");
		}
		getServletContext().getRequestDispatcher("/player-list.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
