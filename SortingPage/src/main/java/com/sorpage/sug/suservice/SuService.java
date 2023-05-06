package com.sorpage.sug.suservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.sorpage.sug.modal.SuModal;
import com.sorpage.sug.surepository.SuRepository;

@Service

public class SuService {
@Autowired
 SuRepository ai;

public List<SuModal> sortmodal(String field) {
	// TODO Auto-generated method stub
	return ai.findAll(Sort.by(Direction.DESC, field));
}

public List<SuModal> paggingmodal(int offset, int pagesize) {
	 Page<SuModal> paging=ai.findAll(PageRequest.of(offset,pagesize));
	return paging.getContent();
}

public List<SuModal> paggingmodal(int offset, int pagesize, String field) {
	 Page<SuModal> paging=ai.findAll(PageRequest.of(offset,pagesize).withSort(Sort.by(field)));
	 return paging.getContent();
}
}
