package sut.sa.g18.Entity;
import javax.persistence.*;
import lombok.*;



@Entity
@Data
@Getter @Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name = "COMPANY")
public class CompanyEntity {
    @Id
    @SequenceGenerator(name="company_seq",sequenceName="company_seq")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="company_seq")
    @Column(name="companyId",unique = true, nullable = false)
    private @NonNull Long companyId;
    private @NonNull String companyName;

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
