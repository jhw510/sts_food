package com.hw.web.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hw.web.mappers.TxMapper;

@Service
@Transactional
public class TxServiceImpl implements TxService {
	@Autowired TxMapper mapper;

	//public void insert
}
