package sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sample.entity.SampleBean;

public interface SampleRepository extends JpaRepository<SampleBean, Integer>{

}
