package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class WaveCache {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
   

    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date updated;

    public void setTime() {
        this.created = created == null ? new Date(System.currentTimeMillis()) : created;
        this.updated = new Date(System.currentTimeMillis());
    }

    public WaveCache() {
        setTime();
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}
}
