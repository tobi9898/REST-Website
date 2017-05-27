import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("")
public class SocialNetwork
{
	@GET
	@Produces("text/plain")
	public String home()
	{
		return "Das ist mein soziales Netzwerk";
	}

	@Path("user/{user}")
	@GET
	@Produces("text/plain")
	public String welcome(@PathParam("user")String user)
	{
		return "Herzlich willkommen " + user;
	}

	@Path("freunde")
	@GET
	@Produces("text/plain")
	public String freunde(@PathParam("user")String user)
	{
		// Es könnten auch die Freunde aus der Datenbank ausgelesen werden, hier werden die Freunde statisch eingegeben

		return user + " deine Freunde sind: Hans, Markus, Michael und 88 weitere Freunde";
	}

	@GET
	@Produces("application/json")
	public String freunde1()
	{
		return "{\"name\": \"Hans\"}";
	}

	@Path("posts/anzeigen")
	@GET
	@Produces("text/plain")
	public String postsAnzeigen()
	{
		// Posts holen und mit einer Schleife in einen String schreiben

		return "Deine Posts: ...";
	}

	@Path("posts/{text}")
	@GET
	@Produces("text/plain")
	public String posts(@PathParam("text")String text)
	{
		// Speichern der Posts

		return "'" + text + "' wurde gepostet";
	}


}
