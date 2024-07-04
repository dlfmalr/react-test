package com.korea.test.Repository;

import com.korea.test.OptionList;
import com.korea.test.Repository.Custom.OptionListRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OptionListRepository extends JpaRepository<OptionList, Long>, OptionListRepositoryCustom {
}
