package sample.project.studentservice.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sample.project.studentservice.project.domain.Attendance;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
}
