package com.apt.moviecatalogservice.resourse;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.apt.moviecatalogservice.models.CatalogItem;;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResourse {
	
	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId)
	{
		return Collections.singletonList( new CatalogItem("BigB","Super", 4));
             
             
	}

}
