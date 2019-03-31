package website.advertisement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import website.advertisement.Model.Client;

@Repository
public interface RepositoryClient extends JpaRepository<Client,Long> {
}

