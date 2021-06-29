package pl.iwi.floss.bobbins.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Bobbin {
    @Id
    private long id;
    @ManyToOne
    @JoinColumn(name="FLOSS_ID", nullable=false)
    private Floss floss;
    private boolean original;
    @ManyToOne
    @JoinColumn(name="BOBBIN_SIZE_ID", nullable=false)
    private BobbinSize bobbinSize;
}
