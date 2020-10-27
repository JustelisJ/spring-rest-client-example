package guru.spring.api.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pokemon {

    private Set<AbilityData> abilities;
    private int base_experience;
    private Set<Form> forms;
    private int height;
    private int id;
    private boolean is_default;
    private String location_area_encounters;
    private String name;
    private int order;
    private Set<TypeData> types;
    private int weight;

}
