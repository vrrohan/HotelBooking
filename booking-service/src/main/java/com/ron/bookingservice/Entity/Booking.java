package com.ron.bookingservice.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "booking")
public class Booking {

    @Id
    @Column(name = "booking_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long bookingId;

    @Column(name = "book_date_from")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    LocalDate bookDateFrom;

    @Column(name = "book_date_till")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    LocalDate getBookDateTill;

    @Column(name = "user_id")
    Long userId;

    @Column(name = "hotel_id")
    Long hotelId;

    @Column(name = "room_number")
    int roomNumber;

    @Column(name = "is_completed")
    boolean isCompleted;

    @Column(name = "is_cancelled")
    boolean isCancelled;


    public Long getBookingId() {
        return bookingId;
    }

    public Booking setBookingId(Long bookingId) {
        this.bookingId = bookingId;
        return this;
    }

    public LocalDate getBookDateFrom() {
        return bookDateFrom;
    }

    public Booking setBookDateFrom(LocalDate bookDateFrom) {
        this.bookDateFrom = bookDateFrom;
        return this;
    }

    public LocalDate getGetBookDateTill() {
        return getBookDateTill;
    }

    public Booking setGetBookDateTill(LocalDate getBookDateTill) {
        this.getBookDateTill = getBookDateTill;
        return this;
    }

    public Long getUserId() {
        return userId;
    }

    public Booking setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public Long getHotelId() {
        return hotelId;
    }

    public Booking setHotelId(Long hotelId) {
        this.hotelId = hotelId;
        return this;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public Booking setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
        return this;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public Booking setCompleted(boolean completed) {
        isCompleted = completed;
        return this;
    }

    public boolean isCancelled() {
        return isCancelled;
    }

    public Booking setCancelled(boolean cancelled) {
        isCancelled = cancelled;
        return this;
    }
}
