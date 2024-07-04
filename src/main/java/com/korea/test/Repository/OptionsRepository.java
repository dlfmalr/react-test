package com.korea.test.Repository;

import com.korea.test.Options;
import com.korea.test.Repository.Custom.OptionsRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.nio.file.LinkOption;

@Repository
public interface OptionsRepository extends JpaRepository<Options, Long>, OptionsRepositoryCustom {
}
