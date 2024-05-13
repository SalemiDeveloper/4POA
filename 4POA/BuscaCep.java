package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cep.Endereco;
import cep.ServicoDeCep;

/**
 * Servlet implementation class BuscaCep
 */
@WebServlet("/BuscaCep")
public class BuscaCep extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuscaCep() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cep = request.getParameter("cep");
		Endereco endereco = null;
		try {
			 endereco = ServicoDeCep.buscaEnderecoPelo(cep);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 HttpSession session = request.getSession();
		 session.setAttribute("End", endereco);
		 
		 session.setAttribute("nome", request.getParameter("nome"));
		 String[] contatos = request.getParameterValues("contato");
		 String contatoStr = (contatos != null) ? String.join(", ", contatos) : "Nenhum contato selecionado";
		 session.setAttribute("contato", contatoStr);

		    session.setAttribute("escolaridade", request.getParameter("escolaridade"));
		    session.setAttribute("etnia", request.getParameter("etnia"));
		    session.setAttribute("cep", request.getParameter("cep"));
		 
         response.sendRedirect("pag/pagina1.jsp");	
 	}

}
