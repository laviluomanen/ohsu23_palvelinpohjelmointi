package eventRegister;

import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Events extends AbstractPersistable<Long> {
    private String event_title;
    private String event_description;
    @DateTimeFormat(pattern = "dd.MM.yyyy")
    private LocalDate event_date;
    @DateTimeFormat(pattern = "HH:mm")
    private LocalTime event_time;
    @DateTimeFormat(pattern = "dd.MM.yyyy")
    private LocalDate due_date;

}
