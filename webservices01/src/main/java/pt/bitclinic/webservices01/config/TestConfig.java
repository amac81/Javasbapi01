package pt.bitclinic.webservices01.config;

import java.time.LocalDateTime;
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
public class TestConfig implements CommandLineRunner {

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
		
		Payment payment1 = new Payment(null, LocalDateTime.parse("2018-12-30T19:34:50.63"));
		Payment payment2 = new Payment(null, LocalDateTime.now());
		
		
		paymentRepository.saveAll(Arrays.asList(payment1, payment2));
		
		
		Order order1 = new Order(null, LocalDateTime.now(),  OrderStatus.WAITING_PAYMENT, null, user1);
		Order order2 = new Order(null, LocalDateTime.now(),  OrderStatus.CANCELED, payment1, user3);
		Order order3 = new Order(null, LocalDateTime.now(),  OrderStatus.PAID, payment2, user6);
		
		orderRepository.saveAll(Arrays.asList(order1, order2, order3));
		
		
		//public OrderItem(Product product, Order order, Integer quantity, Double discount) {
		
		OrderItem oi1 = new OrderItem(p1, order1, 2, 0.10);
	
		
		orderItemRepository.saveAll(Arrays.asList(oi1));
		

	}

}
