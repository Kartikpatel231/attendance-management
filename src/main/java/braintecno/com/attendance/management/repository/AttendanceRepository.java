package braintecno.com.attendance.management.repository;

import braintecno.com.attendance.management.entity.Attendance;
import braintecno.com.attendance.management.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

 @Repository
    public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
       /* boolean existsByUserAndDate(User user, LocalDate date);
*/
      /*  @Query("SELECT a FROM Attendance a WHERE a.user.id = :userId AND a.checkoutTime IS NULL")*/
//        Optional<Attendance> findOpenAttendanceByUser(@Param("userId") Long userId);
    }


