package com.enn.uuidFor8451.springToolSuiteProject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.enn.uuidFor8451.springToolSuiteProject.service.IdComputingService;

@RestController
public class UUIDGeneratorController {

    @RequestMapping("/uuid")
    public String computeUuid(@RequestParam(value="x", defaultValue="2") int x, @RequestParam(value="y", defaultValue="7") int y, @RequestParam(value="z", defaultValue="5") int z) {
        return "Hello!! Your new UUID sequence of numbers with x="+x+"and y="+y+" and z="+z+ " is this! => "+IdComputingService.generateUUID(x,y,z);
	
}
}
