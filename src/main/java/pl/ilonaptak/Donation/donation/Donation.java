package pl.ilonaptak.Donation.donation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import pl.ilonaptak.Donation.category.Category;
import pl.ilonaptak.Donation.institution.Institution;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = Donation.TABLE_NAME)
public class Donation {

    static final String TABLE_NAME = "donations";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @NotEmpty
    Integer quantity; // liczba worków

    @OneToMany
    List<Category> categoryList = new ArrayList<>();

    @ManyToOne
    Institution institution;

    String street;

    String city;

    String zipCode;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    LocalDate pickUpDate;

    LocalTime pickUpTime;

    String pickUpComment;

}
