package Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class Users {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "profession")
    private String profession;

    public Users(String name,String profession){
        this.name = name;
        this.profession = profession;
    }
    @Override
    public String toString(){
        return "{" + "id = " + id + ", name = " + name  + ", profession = " + profession + '}';
    }
}
