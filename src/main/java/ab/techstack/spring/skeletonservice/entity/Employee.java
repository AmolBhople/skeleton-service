package ab.techstack.spring.skeletonservice.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name= "TBL_EMPLOYEES")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Employee {

    @Id
    @Column(name="id")
    @GeneratedValue
    private Long id;

    @Column(name="first_name")
    private String first_name;

    @Column(name="last_name")
    private String last_name;

    @Column(name="email")
    private String email;


}
