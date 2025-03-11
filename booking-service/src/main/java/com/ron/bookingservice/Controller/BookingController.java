package com.ron.bookingservice.Controller;

import com.ron.bookingservice.Entity.Booking;
import com.ron.bookingservice.Service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/booking")
public class BookingController {

    BookingService bookingService;

    @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping
    List<Booking> getAllBookings() {
        return bookingService.getAllExistingBookings();
    }

    @GetMapping("/{userId}")
    List<Booking> getBookings(@PathVariable Long userId) {
        return bookingService.getBookingsByUser(userId);
    }
}
