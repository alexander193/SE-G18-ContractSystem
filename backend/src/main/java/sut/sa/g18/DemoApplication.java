package sut.sa.g18;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import sut.sa.g18.Repository.*;
import sut.sa.g18.Entity.*;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Bean
	ApplicationRunner init(ContractRepository contractRepository, CompanyRepository companyRepository,
                           MaidSelectRepository maidSelectRepository, PromotionRepository promotionRepository){
		return args -> {
		    CompanyEntity c1 = new CompanyEntity();
		    c1.setCompanyName("CHEESE");
		    companyRepository.save(c1);

		    MaidSelectEntity m1 = new MaidSelectEntity();
		    m1.setName("KK");
		    maidSelectRepository.save(m1);

		    PromotionEntity p1 = new PromotionEntity();
		    p1.setTitle("55555");
		    promotionRepository.save(p1);

            ContractEntity con = new ContractEntity();
            CompanyEntity company = companyRepository.findBycompanyName("CHEESE");
            con.setCompany(company);

            MaidSelectEntity maid = maidSelectRepository.findByname("KK");
            con.setMaidSelect(maid);

            PromotionEntity pro = promotionRepository.findBytitle("55555");
            con.setPromotion(pro);
            contractRepository.save(con);
		};


	}
}
