package msgraphconnector.actions.custom;

import com.mendix.core.Core;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.impl.nio.client.HttpAsyncClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * Created by skruger on 6/26/2017.
 */
public class GetHttpRequest {
	/*
	 *  makes a GET request to url and returns body as a string
	 */
	protected String get(String url, String authToken) throws ClientProtocolException, IOException, InterruptedException, ExecutionException {
		Core.getLogger("MSGraph").trace("URI is: "+ url);
		CloseableHttpAsyncClient httpclient = HttpAsyncClients.createDefault();
		try {
			httpclient.start();
			HttpGet get = new HttpGet(url);
			get.setHeader("Authorization", authToken);
			Future<HttpResponse> future = httpclient.execute(get, null);
			HttpResponse response = future.get(10, TimeUnit.SECONDS);
			HttpEntity entity = response.getEntity();
	        String body = EntityUtils.toString(entity);
			return body;
		}
		catch (Exception e) {
			Core.getLogger("MSGraph").error("Exception occurred while processing request " + e);
			Core.getLogger("MSGraph").info("Using lib: \n" + org.apache.http.nio.reactor.ssl.SSLIOSession.class.getProtectionDomain().getCodeSource().getLocation().getPath()
					+ "Should be: \n~\\httpcore-nio-4.4.10.jar");
			return null;
		}
		finally {
			httpclient.close();
		}
	}
}
