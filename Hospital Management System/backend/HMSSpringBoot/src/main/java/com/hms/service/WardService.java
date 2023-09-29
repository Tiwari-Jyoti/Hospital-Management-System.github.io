package com.hms.service;

import java.util.List;
import java.util.Map;

import com.hms.dto.WardDTO;

public interface WardService {

	public WardDTO save(WardDTO ward);
    public WardDTO update(WardDTO ward,  long wid) throws Exception;
	public WardDTO getById(long wid) throws Exception;
	public List<WardDTO> getAll();
	public Map<String, Boolean> delete(long wid) throws Exception;
}
