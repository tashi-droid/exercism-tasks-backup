import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        return LocalDateTime.parse(appointmentDateDescription, formatter);
        
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        return appointmentDate.isBefore(currentDateTime);
        }
    
     public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int hour = appointmentDate.getHour();
         return hour>= 12 && hour <18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("h:mm a");
        String date = appointmentDate.format(dateFormatter);
        String time = appointmentDate.format(timeFormatter);
        return "You have an appointment on " + date + ", at " + time + ".";
    }

    public LocalDate getAnniversaryDate() {
      int currentYear = LocalDate.now().getYear();
        return LocalDate.of(currentYear, 9, 15);
    }
}
