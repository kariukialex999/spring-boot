package org.kariioke.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

    public SoftwareEngineerService softwareEngineerService;

    @GetMapping
    public List<SoftwareEngineer> getEngineers() {
        return List.of(
                new SoftwareEngineer(
                        1,
                        "Alex",
                        "js, node, react, tailwindcss,"
                ),
                new SoftwareEngineer(
                        2,
                        "James",
                        "java, springboot, postgres, docker, microservices"
                )
        );
    }

    @GetMapping
    public void getEngineer(Integer id) {
        return fetchEngineer(id);
    }


}
