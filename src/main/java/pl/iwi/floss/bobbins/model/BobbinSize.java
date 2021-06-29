package pl.iwi.floss.bobbins.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class BobbinSize {
    @Id
    private long id;
    private String name;
}
