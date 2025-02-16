package ai.ieum.ieumai_backend.repository;

import ai.ieum.ieumai_backend.domain.ContributionScriptVoiceFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContributionScriptVoiceFileRepository extends JpaRepository<ContributionScriptVoiceFile, Long> {
    List<ContributionScriptVoiceFile> findByContributionId(Long contributionId);
    List<ContributionScriptVoiceFile> findByContributionScriptId(Long contributionScriptId);
}
