package pl.ilonaptak.Donation.category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = Category.TABLE_NAME)
public class Category {
// encja reprezentuje dane znajdujące się w aplikacji, np. name: ubrania, zabawki
    static final String TABLE_NAME = "categories";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @NotEmpty
    String name;

}
