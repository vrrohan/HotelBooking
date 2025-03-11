package com.ron.bookingservice.Service;

import com.ron.bookingservice.Entity.Booking;
import com.ron.bookingservice.Repository.BookingRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    final BookingRepository bookingRepository;

    @Autowired
    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }


    public List<Booking> getAllExistingBookings() {
       return bookingRepository.findAll();
    }

    public List<Booking> getBookingsByUser(Long userId) {
        List<Booking> existingBookingByUserId = bookingRepository.findAll(new Specification() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery query, CriteriaBuilder criteriaBuilder) {
                return criteriaBuilder.and(root.get("userId").in(userId));
            }
        });

        System.out.println(existingBookingByUserId);
        return existingBookingByUserId;
    }
}
