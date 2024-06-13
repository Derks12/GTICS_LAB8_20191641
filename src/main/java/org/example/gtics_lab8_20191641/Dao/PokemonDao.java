package org.example.gtics_lab8_20191641.Dao;
import org.example.gtics_lab8_20191641.Dto.PokemonDto;
import org.example.gtics_lab8_20191641.entity.Pokemon;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PokemonDao {

    public Pokemon obtenerLocacionPorNombre(String  name) throws JSONException {
        RestTemplate restTemplate = new RestTemplateBuilder()
                .basicAuthentication("a20191641@pucp.edu.pe", "20191641")
                .build();

        String url = "https://pokeapi.co/api/v2/pokemon/" + name + "/encounters" ;

        String  responseMap = restTemplate.getForObject(url, String.class);
        JSONObject jsonObject= new JSONObject(responseMap );
        String locationareaJson = jsonObject.getString( "location_area");


        return responseMap.;
    }

}
