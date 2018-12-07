package sut.sa.g18.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sut.sa.g18.Entity.PromotionEntity;

@RepositoryRestResource
public interface PromotionRepository extends JpaRepository<PromotionEntity, Long> {
    PromotionEntity findBytitle(String title);
}
