package sut.sa.g18.Entity;
import javax.persistence.*;
import lombok.*;

@Entity
@Data
@Getter @Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name = "CONTRACT")
public class ContractEntity {
    @Id
    @SequenceGenerator(name="contract_seq",sequenceName="contract_seq")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="contract_seq")
    @Column(name="contractId",unique = true, nullable = false)
    private @NonNull Long contractId;
    /*private @NonNull Date dateStart;
    private @NonNull Date dateEnd;*/

    //Many To One with Promotion
    @ManyToOne(fetch = FetchType.EAGER, targetEntity = PromotionEntity.class)
    private PromotionEntity promotion;

    //Many To One with Company
    @ManyToOne(fetch = FetchType.EAGER, targetEntity = CompanyEntity.class)
    private CompanyEntity company;

    //One To One with MaidSelectEntity
    @OneToOne(fetch = FetchType.EAGER,targetEntity = MaidSelectEntity.class)
    private MaidSelectEntity maidSelect;

    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }

    /*public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }*/

    public PromotionEntity getPromotion() {
        return promotion;
    }

    public void setPromotion(PromotionEntity promotion) {
        this.promotion = promotion;
    }

    public CompanyEntity getCompany() {
        return company;
    }

    public void setCompany(CompanyEntity company) {
        this.company = company;
    }

    public MaidSelectEntity getMaidSelect() {
        return maidSelect;
    }

    public void setMaidSelect(MaidSelectEntity maidSelect) {
        this.maidSelect = maidSelect;
    }
}
