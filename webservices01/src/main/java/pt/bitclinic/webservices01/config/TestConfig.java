package pt.bitclinic.webservices01.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import pt.bitclinic.webservices01.entities.Category;
import pt.bitclinic.webservices01.entities.Order;
import pt.bitclinic.webservices01.entities.OrderItem;
import pt.bitclinic.webservices01.entities.Payment;
import pt.bitclinic.webservices01.entities.Product;
import pt.bitclinic.webservices01.entities.User;
import pt.bitclinic.webservices01.entities.enums.OrderStatus;
import pt.bitclinic.webservices01.repositories.CategoryRepository;
import pt.bitclinic.webservices01.repositories.OrderItemRepository;
import pt.bitclinic.webservices01.repositories.OrderRepository;
import pt.bitclinic.webservices01.repositories.PaymentRepository;
import pt.bitclinic.webservices01.repositories.ProductRepository;
import pt.bitclinic.webservices01.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner { //to run when program starts	

	// Dependence injection

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private OrderItemRepository orderItemRepository;

	@Autowired
	private PaymentRepository paymentRepository;

	@Override
	public void run(String... args) throws Exception {

		// tables seed with dummy data

		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Clothing");
		Category cat4 = new Category(null, "Home & Garden");
		Category cat5 = new Category(null, "Toys");
		Category cat6 = new Category(null, "Sports & Outdoors");
		Category cat7 = new Category(null, "Computers & Tablets");

		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6, cat7));

		User user1 = new User(null, "David Wilson", "david.wilson@examplemail.com", "77777777", "864209");
		User user2 = new User(null, "Olivia Garcia", "olivia.garcia@testmail.com", "22222222", "753951");
		User user3 = new User(null, "James Martinez", "james.martinez@mail.com", "66666666", "987654");
		User user4 = new User(null, "Emma Lopez", "emma.lopez@example.com", "55555555", "135790");
		User user5 = new User(null, "Alexander Turner", "alexander.turner@mail.com", "88888888", "654321");
		User user6 = new User(null, "Ava Mitchell", "ava.mitchell@testmail.com", "44444444", "123456");

		userRepository.saveAll(Arrays.asList(user1, user2, user3, user4, user5, user6));

		Product p1 = new Product(null, "Shoes", "Black pair of shoes, made with..", 30.44, cat3,
				"http://wwww.bitclinic.pt/products/img/1.jpg");
		Product p2 = new Product(null, "Watch", "Elegant wristwatch with a leather strap..", 99.99, cat3,
				"http://wwww.bitclinic.pt/products/img/2.jpg");
		Product p3 = new Product(null, "Phone Case", "Durable phone case for various models..", 15.99, cat1,
				"http://wwww.bitclinic.pt/products/img/3.jpg");
		Product p4 = new Product(null, "Headphones", "Wireless headphones with noise-canceling..", 79.95, cat1,
				"http://wwww.bitclinic.pt/products/img/4.jpg");
		Product p5 = new Product(null, "Backpack", "Spacious backpack with multiple compartments..", 49.99, cat6,
				"http://wwww.bitclinic.pt/products/img/5.jpg");
		Product p6 = new Product(null, "Gaming Mouse", "High-precision gaming mouse with customizable..", 39.99, cat7,
				"http://wwww.bitclinic.pt/products/img/6.jpg");
		Product p7 = new Product(null, "Laptop Stand", "Adjustable laptop stand for ergonomic..", 29.95, cat7,
				"http://wwww.bitclinic.pt/products/img/7.jpg");

		productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6, p7));

		Payment payment1 = new Payment(null, Instant.parse("2018-12-30T19:34:50Z"));
		Payment payment2 = new Payment(null, Instant.parse("2022-01-22T09:14:03Z"));
		Payment payment3 = new Payment(null, Instant.now());

		paymentRepository.saveAll(Arrays.asList(payment1, payment2, payment3));

		Order order1 = new Order(null, Instant.now(), OrderStatus.WAITING_PAYMENT, null, user1);
		Order order2 = new Order(null, Instant.now(), OrderStatus.CANCELED, null, user3);
		Order order3 = new Order(null, Instant.parse("2022-12-23T02:12:30Z"), OrderStatus.DELIVERED, payment2, user1);
		Order order4 = new Order(null, Instant.parse("2018-01-02T10:14:10Z"), OrderStatus.PAID, payment1, user3);
		Order order5 = new Order(null, Instant.now(), OrderStatus.PAID, payment3, user2);
		Order order6 = new Order(null, Instant.now(), OrderStatus.WAITING_PAYMENT, null, user1);

		orderRepository.saveAll(Arrays.asList(order1, order2, order3, order4, order5, order6));

		OrderItem oi1 = new OrderItem(p1, order1, 2, 0.10);
		OrderItem oi2 = new OrderItem(p3, order1, 2, 0.10);
		OrderItem oi3 = new OrderItem(p1, order2, 10, 0.20);
		OrderItem oi4 = new OrderItem(p6, order2, 1, 0.10);
		OrderItem oi5 = new OrderItem(p5, order3, 4, 0.10);
		OrderItem oi6 = new OrderItem(p3, order3, 2, 0.00);
		OrderItem oi7 = new OrderItem(p2, order2, 9, 0.20);
		OrderItem oi8 = new OrderItem(p4, order1, 1, 0.00);

		orderItemRepository.saveAll(Arrays.asList(oi1, oi2, oi3, oi4, oi5, oi6, oi7, oi8));

	}

}
