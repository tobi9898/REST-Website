import com.sun.net.httpserver.HttpServer;
import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;

public class Starter
{
	public static void main(String[] args)
	{
		URI baseUri = UriBuilder.fromUri("http://localhost/").port(8080).build();
		ResourceConfig config = new ResourceConfig(SocialNetwork.class);
		HttpServer server = JdkHttpServerFactory.createHttpServer(baseUri, config);
	}
}
