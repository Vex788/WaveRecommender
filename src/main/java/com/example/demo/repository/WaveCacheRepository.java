package com.example.demo.repository;

import com.example.demo.model.WaveCache;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface WaveCacheRepository extends JpaRepository<WaveCache, Long> {

    ArrayList<WaveCache> findAll();
}
