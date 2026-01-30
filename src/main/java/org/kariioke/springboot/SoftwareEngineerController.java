package org.kariioke.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/{id}")
    public SoftwareEngineer getEngineer(@PathVariable Integer id) {
        return new SoftwareEngineer(
                id,
                "John Doe",
                "Can code with the eyes closed"
        );
    }


}
