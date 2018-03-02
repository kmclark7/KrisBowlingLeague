package control;
import model.Team;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddTeamServlet
 */
@WebServlet("/AddTeamServlet")
public class AddTeamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddTeamServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String teamName = request.getParameter("teamName");
		
		if (teamName != null) {
			TeamHelper teamHelper = new TeamHelper();		
			String teamType = request.getParameter("teamType");
			String preferredNight = request.getParameter("preferredNight");
			
			Team teamToAdd = new Team(teamName, teamType, preferredNight);
			teamHelper.insertTeam(teamToAdd);
		}
		
		getServletContext().getRequestDispatcher("/ViewListServlet").forward(request, response);

		
	}

}
