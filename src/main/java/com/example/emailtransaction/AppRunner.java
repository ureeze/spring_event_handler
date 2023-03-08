package com.example.emailtransaction;

import com.example.emailtransaction.cart.Cart;
import com.example.emailtransaction.cart.CartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AppRunner implements ApplicationRunner {

    private final CartRepository cartRepository;

    @Override
    public void run(ApplicationArguments args) {
        cartRepository.save(new Cart(1L));
        cartRepository.save(new Cart(2L));
        cartRepository.save(new Cart(3L));
        cartRepository.save(new Cart(4L));
        cartRepository.save(new Cart(5L));
        cartRepository.save(new Cart(6L));
    }
}