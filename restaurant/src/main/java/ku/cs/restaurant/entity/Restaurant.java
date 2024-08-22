// 6510450569 Panithan Champahom

package ku.cs.restaurant.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.ToString;

import java.util.UUID;

@Data   // auto-generated getter, setter
@Entity
public class Restaurant {

    @Id
    @GeneratedValue
    private UUID id;

    private String name;
    private double rating;
    private String location;

}
