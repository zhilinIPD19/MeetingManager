package com.sg.jdbctcomplexexample.entity;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kylerudy
 */
public class Meeting {
    int id;
    String name;
    LocalDateTime time;
    Room room;
    List<Employee> attendees = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public List<Employee> getAttendees() {
        return attendees;
    }

    public void setAttendees(List<Employee> attendees) {
        this.attendees = attendees;
    }

    public static final class MeetingMapper implements RowMapper<Meeting> {

        @Override
        public Meeting mapRow(ResultSet resultSet, int i) throws SQLException {
            Meeting meeting = new Meeting();
            meeting.setId(resultSet.getInt("id"));
            meeting.setName(resultSet.getString("name"));
            meeting.setTime(resultSet.getTimestamp("time").toLocalDateTime());
            return meeting;
        }
    }
    
}
