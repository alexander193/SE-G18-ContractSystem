package sut.sa.g18.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sut.sa.g18.Entity.MaidSelectEntity;

@RepositoryRestResource
public interface MaidSelectRepository extends JpaRepository<MaidSelectEntity, Long> {
    MaidSelectEntity findByname(String name);
}
