package guru.springframework.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @Project mb2g-mm-maven
 * Created by @Author Parinit on 4/24/2020
 * at 10:55 PM
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class User {

    @Id
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
}
