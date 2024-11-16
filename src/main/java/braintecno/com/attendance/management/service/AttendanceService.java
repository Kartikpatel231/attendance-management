package braintecno.com.attendance.management.service;

import braintecno.com.attendance.management.entity.Attendance;
import braintecno.com.attendance.management.entity.User;
import braintecno.com.attendance.management.repository.AttendanceRepository;
import braintecno.com.attendance.management.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@Service
public class AttendanceService {
    @Autowired
    private AttendanceRepository attendanceRepository;

    @Autowired
    private UserRepository userRepository;

    public Attendance checkIn(Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        // Check if already checked in for the day
        LocalDate today = LocalDate.now();
      /*  if (attendanceRepository.existsByUserAndDate(user, today)) {
            throw new RuntimeException("Already checked in today");
        }*/

        Attendance attendance = new Attendance();

        attendance.setUser(user);
        attendance.setCheckinTime(LocalDateTime.now());
        attendance.setStatus("Checked-In");

        return attendanceRepository.save(attendance);
    }

  public Attendance checkOut(Long userId) {
   /*     Attendance attendance = attendanceRepository
                .findOpenAttendanceByUser(userId)
                .orElseThrow(() -> new RuntimeException("No active check-in found"));

        attendance.setCheckoutTime(LocalDateTime.now());

        // Calculate duration
        long duration = ChronoUnit.HOURS.between(attendance.getCheckinTime(), attendance.getCheckoutTime());
        attendance.setDuration((double) duration);

        if (duration >= 6) {
            attendance.setStatus("Present");
        } else {
            attendance.setStatus("Incomplete");
        }

        return attendanceRepository.save(attendance);
    }*/
  return null;
    }
}

