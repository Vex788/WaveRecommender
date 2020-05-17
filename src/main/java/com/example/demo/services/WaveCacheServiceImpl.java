package com.example.demo.services;

import com.example.demo.model.WaveCache;
import com.example.demo.repository.WaveCacheRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.List;

import javax.transaction.Transactional;

@Service
@EnableTransactionManagement
public class WaveCacheServiceImpl implements WaveCacheService {
    //@Transactional
    @Autowired
    private WaveCacheRepository waveCacheRepository;
    
    @Override
    public List<WaveCache> getAllWaveCache() {
        return waveCacheRepository.findAll();
    }

    @Override
    public WaveCache getWaveCacheById(Long id) {
    	WaveCache cache = null;

        if (id != null && id > 0L) {
        	cache = waveCacheRepository.findById(id).get();
        }

        return cache;
    }

    @Override
    public boolean save(WaveCache cache) {
        if (cache != null) {
        	waveCacheRepository.save(cache);
            
            return true;
        }
        return false;
    }

    @Override
    public boolean update(WaveCache cache) {
        if (cache != null) {
        	waveCacheRepository.save(cache);
            
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(WaveCache cache) {
        if (cache != null) {
        	waveCacheRepository.delete(cache);
            
            return true;
        }
        return false;
    }
}
