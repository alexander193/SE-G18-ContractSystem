package sut.sa.g18.Entity;
import javax.persistence.*;
import lombok.*;



@Entity
@Data
@Getter @Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name = "MAIDSELECT")
public class MaidSelectEntity {
    @Id
    @SequenceGenerator(name="maidSelect_seq",sequenceName="maidSelect_seq")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="maidSelect_seq")
    @Column(name="maidSelectId",unique = true, nullable = false)
    private @NonNull Long maidSelectId;
    private @NonNull String name;

    public Long getMaidSelectId() {
        return maidSelectId;
    }

    public void setMaidSelectId(Long maidSelectId) {
        this.maidSelectId = maidSelectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
