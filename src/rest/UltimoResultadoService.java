
package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;

import model.Resultado;

@Path("resultadoservice")
public class UltimoResultadoService {

	@GET
	@Produces("application/json")
	public Response ultimoResultado() throws JSONException {
		JSONObject jsonObject = new JSONObject();
		UltimoResultado ur = new UltimoResultado();
		Resultado resultado = ur.extraiResultado();
		jsonObject.put("Concurso", resultado.getNumeroConcurso());
	    jsonObject.put("numeros sorteados", resultado.getNumerosSorteados());
		String result = jsonObject.toString();
		System.out.println(jsonObject.toString());
		return Response.status(200).entity(result).build();

	}

}
