package guru.spring.api.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AbilityData {

    private Ability ability;
    private boolean is_hidden;
    private int slot;

}
