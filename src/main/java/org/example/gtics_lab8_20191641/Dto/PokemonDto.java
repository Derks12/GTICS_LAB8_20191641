package org.example.gtics_lab8_20191641.Dto;
import lombok.Getter;
import lombok.Setter;
import org.example.gtics_lab8_20191641.entity.Pokemon;

@Getter
@Setter


public class PokemonDto {
    private String location_area;
    private String version_details;
    private Pokemon pokemon;
}
