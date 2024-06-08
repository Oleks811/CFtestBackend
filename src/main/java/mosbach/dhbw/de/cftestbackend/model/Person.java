package mosbach.dhbw.de.cftestbackend.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Person {
    @Id
    @GeneratedValue
    private Long id;

    @JsonProperty ("name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
