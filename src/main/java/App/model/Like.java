package App.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

//@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Like {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    Integer likerId;
    Integer likedId;
}
