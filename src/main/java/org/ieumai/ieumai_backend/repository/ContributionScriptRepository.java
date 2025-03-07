package org.ieumai.ieumai_backend.repository;

import org.ieumai.ieumai_backend.domain.ContributionScript;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContributionScriptRepository extends JpaRepository<ContributionScript, Long> {
    List<ContributionScript> findByIsActiveTrue();
}
