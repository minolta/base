package me.pixka.data.s;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.repository.CrudRepository;

public class DefaultService implements ServiceInterface {

	public Pageable getPage(Long page, Long limit) {
		PageRequest request = new PageRequest(page.intValue(), limit.intValue());
		return request;
	}

	public Pageable getPage(Long page, Long limit, Direction d, String feild) {
		PageRequest request = new PageRequest(page.intValue(), limit.intValue(), d, feild);
		return request;
	}
	
	

}
