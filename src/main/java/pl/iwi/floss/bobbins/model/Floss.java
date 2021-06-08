package pl.iwi.floss.bobbins.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Floss {
    @Id
    private long id;
    private long flossTypeId;
    private String color;
    private String name;
    private String rgb;
}
