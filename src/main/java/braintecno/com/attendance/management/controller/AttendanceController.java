package braintecno.com.attendance.management.controller;

import braintecno.com.attendance.management.entity.Attendance;
import braintecno.com.attendance.management.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/attendance")
public class AttendanceController {

    @Autowired
    private AttendanceService attendanceService;

    @PostMapping("/checkin")
    public ResponseEntity<Attendance> checkIn(@RequestParam Long userId) {
        Attendance attendance = attendanceService.checkIn(userId);
        return ResponseEntity.ok(attendance);
    }

    @PostMapping("/checkout")
    public ResponseEntity<Attendance> checkOut(@RequestParam Long userId) {
   Attendance attendance = attendanceService.checkOut(userId);
        return ResponseEntity.ok(attendance);
    }
}
