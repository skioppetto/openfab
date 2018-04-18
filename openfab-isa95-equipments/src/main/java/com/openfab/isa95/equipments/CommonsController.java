package com.openfab.isa95.equipments;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class CommonsController {

	@GetMapping("/commons/data-type")
	@ResponseBody
	public List<String> getDataTypes(){
		List<String> array = new ArrayList<String>();
		for (DataTypeEnum d : DataTypeEnum.values())
			array.add(d.toString());
		 return array;
	}  
	
}
