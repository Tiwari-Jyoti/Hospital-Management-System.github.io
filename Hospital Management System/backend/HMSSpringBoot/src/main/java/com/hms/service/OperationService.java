package com.hms.service;

import java.util.List;
import java.util.Map;

import com.hms.dto.OperationDTO;

public interface OperationService {

	public OperationDTO save(OperationDTO operation);
    public OperationDTO update(OperationDTO operation,  long oid)  throws Exception;
	public OperationDTO getById(long oid) throws Exception;
	public List<OperationDTO> getAll();
	public Map<String, Boolean> delete(long oid) throws Exception;
}
