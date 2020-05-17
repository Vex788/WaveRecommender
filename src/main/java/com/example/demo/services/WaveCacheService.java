package com.example.demo.services;

import com.example.demo.model.WaveCache;

import java.util.List;

public interface WaveCacheService {
    // --- WaveCache ---
    List<WaveCache> getAllWaveCache();

    WaveCache getWaveCacheById(Long id);

    boolean save(WaveCache cache);

    boolean update(WaveCache cache);

    boolean delete(WaveCache cache);
}
