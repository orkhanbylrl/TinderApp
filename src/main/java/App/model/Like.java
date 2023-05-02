package App.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "like_table")
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    Integer likerId;
    Integer likedId;
}
