package khateeb.crm.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="profiles")
public class Profile {
    @Id
    private long id;
    @Column(nullable = true)
    private String bio;
    @Column(nullable = true, name = "phone_number")
    private String phoneNumber;
    @Column(nullable = true, name = "date_of_birth")
    private LocalDate dateOfBirth;
    @Column(nullable = true, name = "loyalty_points")
    private int loyaltyPoints;

    @OneToOne
    @JoinColumn(name = "id")
    @MapsId
    private User user;
}
