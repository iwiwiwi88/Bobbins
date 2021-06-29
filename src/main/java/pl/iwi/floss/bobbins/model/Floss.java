package pl.iwi.floss.bobbins.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
public class Floss {
    @Id
    private long id;
    @ManyToOne
    @JoinColumn(name="FLOSS_TYPE_ID", nullable=false)
    private FlossType flossType;
    private String color;
    private String name;
    private String rgb;
}
