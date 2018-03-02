package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TeamListServlet
 */
@WebServlet("/TeamListServlet")
public class TeamOptionsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeamOptionsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String toDo = request.getParameter("doThisToTeam");
		System.out.println("THIS IS toDo: "+toDo);
		
		
		if (toDo.equals("Add New Team")) {
			System.out.println("ADD NEW TEAM");
			getServletContext().getRequestDispatcher("/add-team.html").forward(request, response);
		} else if (toDo.equals("Delete Team")) {
			System.out.println("TO DO --- DELETE TEAM");
			getServletContext().getRequestDispatcher("/ViewTeamServlet").forward(request, response);
		} else if (toDo.equals("Edit Team")) {
			System.out.println("TO DO --- EDIT TEAM");
			getServletContext().getRequestDispatcher("/ViewTeamServlet").forward(request, response);
		} else {
			getServletContext().getRequestDispatcher("/ViewTeamServlet").forward(request, response);

		}
	}

}
