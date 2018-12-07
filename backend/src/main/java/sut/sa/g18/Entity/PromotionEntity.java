package sut.sa.g18.Entity;
import javax.persistence.*;
import lombok.*;

@Entity
@Data
@Getter @Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name = "PROMOTION")
public class PromotionEntity {
    @Id
    @SequenceGenerator(name="promotion_seq",sequenceName="promotion_seq")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="promotion_seq")
    @Column(name="promotionId",unique = true, nullable = false)
    private @NonNull Long promotionId;
    private @NonNull String title;

    public Long getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(Long promotionId) {
        this.promotionId = promotionId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
