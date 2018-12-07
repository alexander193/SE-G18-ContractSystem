package sut.sa.g18.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sut.sa.g18.Entity.CompanyEntity;

@RepositoryRestResource
public interface CompanyRepository extends JpaRepository<CompanyEntity, Long> {
    CompanyEntity findBycompanyName(String companyName);
}
