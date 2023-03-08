package com.example.emailtransaction.coupon;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface CouponRepository extends JpaRepository<Coupon, Long> {

}