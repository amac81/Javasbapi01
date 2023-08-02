INSERT INTO tb_user (name, email, phone, password) VALUES
    ('John Doe', 'john.doe@example.com', '+1 (123) 456-7890', 'password123'),
    ('Jane Smith', 'jane.smith@example.com', '+44 20 7123 4567', 'secretword'),
    ('Michael Johnson', 'michael.johnson@example.com', '+61 2 8765 4321', 'test123'),
    ('Emily Williams', 'emily.williams@example.com', '+33 1 23 45 67 89', 'myp@ssw0rd'),
    ('Robert Brown', 'robert.brown@example.com', '+49 30 98765432', 'pass123word'),
    ('Alice Johnson', 'alice.johnson@example.com', '+1 (987) 654-3210', 'alicepass'),
    ('David Lee', 'david.lee@example.com', '+44 20 1111 2222', 'david1234'),
    ('Sarah Taylor', 'sarah.taylor@example.com', '+61 2 3333 4444', 'sarahtay'),
    ('Michael Smith', 'michael.smith@example.com', '+33 1 5555 6666', 'smithpass'),
    ('Jennifer Wilson', 'jennifer.wilson@example.com', '+49 30 7777 8888', 'jennypass'),
    ('William Johnson', 'william.johnson@example.com', '+1 (222) 333-4444', 'willpass'),
    ('Emma Davis', 'emma.davis@example.com', '+44 20 9999 8888', 'emmadav'),
    ('Christopher Martin', 'christopher.martin@example.com', '+61 2 7777 6666', 'martinchris'),
    ('Olivia Rodriguez', 'olivia.rodriguez@example.com', '+33 1 4444 5555', 'oliviarod'),
    ('Daniel Thompson', 'daniel.thompson@example.com', '+49 30 2222 1111', 'thompsond'),
    ('Sophia Garcia', 'sophia.garcia@example.com', '+1 (555) 444-3333', 'sophiagar'),
    ('Matthew Martinez', 'matthew.martinez@example.com', '+44 20 6666 7777', 'matthewmart'),
    ('Ava Hernandez', 'ava.hernandez@example.com', '+61 2 8888 9999', 'avahern'),
    ('Ethan Lopez', 'ethan.lopez@example.com', '+33 1 6666 7777', 'ethanlop'),
    ('Isabella Hill', 'isabella.hill@example.com', '+49 30 9999 8888', 'hillisa');


INSERT INTO tb_category (id, name) VALUES
(1, 'Electronics'),
(2, 'Clothing'),
(3, 'Books'),
(4, 'Home and Kitchen'),
(5, 'Sports and Outdoors'),
(6, 'Beauty and Personal Care'),
(7, 'Toys and Games'),
(8, 'Health and Wellness'),
(9, 'Furniture'),
(10, 'Automotive'),
(11, 'Jewelry'),
(12, 'Office Supplies'),
(13, 'Pet Supplies'),
(14, 'Music'),
(15, 'Movies and TV Shows'),
(16, 'Groceries'),
(17, 'Fitness and Exercise'),
(18, 'Electrical Appliances'),
(19, 'Garden and Outdoor'),
(20, 'Art and Craft'),
(21, 'Baby Products'),
(22, 'Party and Celebration'),
(23, 'Tools and Hardware'),
(24, 'Stationery'),
(25, 'Travel and Luggage'),
(26, 'Fashion Accessories'),
(27, 'Home Decor'),
(28, 'Mobile Phones and Accessories'),
(29, 'Gourmet Food'),
(30, 'Outdoor Recreation'),
(31, 'Personal Electronics'),
(32, 'Kitchen Appliances'),
(33, 'Books and Magazines'),
(34, 'Musical Instruments'),
(35, 'Automotive Parts and Accessories'),
(36, 'Fine Jewelry'),
(37, 'School and Educational Supplies'),
(38, 'Pet Food'),
(39, 'Video Games'),
(40, 'Health and Fitness'),
(41, 'Home Improvement'),
(42, 'Party Supplies'),
(43, 'Hand Tools'),
(44, 'Writing Instruments'),
(45, 'Luggage and Travel Gear'),
(46, 'Pet Care'),
(47, 'Digital Music'),
(48, 'Movies and DVDs'),
(49, 'Baby Clothing'),
(50, 'Gardening Supplies'),
(51, 'Craft Supplies'),
(52, 'Baby Gear'),
(53, 'Sports Equipment');


-- Generating 100 sample products
INSERT INTO tb_product (name, description, price, img_url) VALUES
-- Electronics
('High-end Smartphone', 'High-end smartphone with advanced features.', 799.99, 'https://example.com/smartphone.jpg'),
('Powerful Laptop', 'Powerful laptop for productivity and gaming.', 1299.99, 'https://example.com/laptop.jpg'),
('Bluetooth Earbuds', 'Bluetooth earbuds with noise cancellation.', 99.99, 'https://example.com/earbuds.jpg'),
('Large LED TV', 'Large LED TV with 4K resolution.', 899.99, 'https://example.com/tv.jpg'),
('Mirrorless Camera', 'Mirrorless camera with 24MP sensor.', 699.99, 'https://example.com/camera.jpg'),
('Waterproof Fitness Tracker', 'Waterproof fitness tracker with heart rate monitor.', 49.99, 'https://example.com/fitness-tracker.jpg'),
('Latest Gaming Console', 'Latest gaming console with a large game library.', 399.99, 'https://example.com/gaming-console.jpg'),
('Smartwatch', 'Smartwatch with various health and fitness features.', 149.99, 'https://example.com/smart-watch.jpg'),
('Portable Bluetooth Speaker', 'Portable Bluetooth speaker with excellent sound quality.', 79.99, 'https://example.com/speaker.jpg'),
('High-Performance Tablet', 'High-performance tablet with a large display.', 299.99, 'https://example.com/tablet.jpg'),
-- Clothing
('Stylish Sneakers', 'Stylish and comfortable sneakers for daily wear.', 79.99, 'https://example.com/sneakers.jpg'),
('Cotton Graphic T-Shirt', 'Cotton graphic t-shirt with a unique design.', 19.99, 'https://example.com/graphic-tshirt.jpg'),
('Classic Denim Jeans', 'Classic denim jeans for a casual look.', 49.99, 'https://example.com/jeans.jpg'),
('Lightweight Summer Dress', 'Lightweight summer dress for a chic outfit.', 39.99, 'https://example.com/summer-dress.jpg'),
-- Books
('Bestseller Novel', 'Bestseller novel with an engaging plot.', 14.99, 'https://example.com/novel.jpg'),
('Educational Children''s Book', 'Educational children''s book with colorful illustrations.', 9.99, 'https://example.com/childrens-book.jpg'),
-- Home and Kitchen
('Non-Stick Cookware Set', 'Non-stick cookware set for everyday cooking.', 149.99, 'https://example.com/cookware.jpg'),
('Powerful Blender', 'Powerful blender for making smoothies and sauces.', 79.99, 'https://example.com/blender.jpg'),
('Drip Coffee Maker', 'Drip coffee maker for brewing delicious coffee.', 59.99, 'https://example.com/coffee-maker.jpg'),
('Fast Electric Kettle', 'Fast electric kettle for boiling water.', 39.99, 'https://example.com/electric-kettle.jpg'),
('High-Quality Knife Set', 'High-quality knife set for culinary enthusiasts.', 89.99, 'https://example.com/knife-set.jpg'),
-- Sports and Outdoors
('Spacious Camping Tent', 'Spacious camping tent for outdoor adventures.', 199.99, 'https://example.com/camping-tent.jpg'),
('Lightweight Sleeping Bag', 'Lightweight sleeping bag for camping and hiking.', 79.99, 'https://example.com/sleeping-bag.jpg'),
('Sturdy Hiking Boots', 'Sturdy hiking boots for rugged terrains.', 129.99, 'https://example.com/hiking-boots.jpg'),
('Eco-Friendly Yoga Mat', 'Eco-friendly yoga mat for comfortable workouts.', 29.99, 'https://example.com/yoga-mat.jpg'),
('Adjustable Dumbbell Set', 'Adjustable dumbbell set for home workouts.', 119.99, 'https://example.com/dumbbell-set.jpg'),
-- Beauty and Personal Care
('Skin Moisturizer', 'Skin moisturizer for hydrated and soft skin.', 19.99, 'https://example.com/moisturizer.jpg'),
('Natural Hair Shampoo', 'Natural hair shampoo for healthy and shiny hair.', 12.99, 'https://example.com/shampoo.jpg'),
('Organic Face Mask', 'Organic face mask for glowing skin.', 9.99, 'https://example.com/face-mask.jpg'),
('Men''s Grooming Kit', 'Men''s grooming kit for a clean and fresh look.', 29.99, 'https://example.com/grooming-kit.jpg'),
('Fragrance Set for Women', 'Fragrance set for women with floral notes.', 49.99, 'https://example.com/fragrance-set.jpg'),
-- Toys and Games
('Educational Building Blocks', 'Educational building blocks for creative play.', 24.99, 'https://example.com/building-blocks.jpg'),
('Interactive Robot Toy', 'Interactive robot toy for fun and learning.', 39.99, 'https://example.com/robot-toy.jpg'),
('Board Game Set', 'Set of classic board games for family entertainment.', 34.99, 'https://example.com/board-game.jpg'),
('Remote Control Car', 'Remote control car for racing adventures.', 49.99, 'https://example.com/rc-car.jpg'),
-- Health and Wellness
('Essential Oil Set', 'Set of essential oils for aromatherapy.', 29.99, 'https://example.com/essential-oils.jpg'),
('Yoga and Meditation Guide', 'Yoga and meditation guide for mindfulness.', 19.99, 'https://example.com/yoga-guide.jpg'),
('Fitness Resistance Bands', 'Fitness resistance bands for effective workouts.', 14.99, 'https://example.com/resistance-bands.jpg'),
-- Furniture
('Modern Sofa', 'Modern sofa for stylish and comfortable seating.', 599.99, 'https://example.com/sofa.jpg'),
('Elegant Dining Table', 'Elegant dining table for family gatherings.', 799.99, 'https://example.com/dining-table.jpg'),
('Cozy Armchair', 'Cozy armchair for relaxation and reading.', 349.99, 'https://example.com/armchair.jpg'),
-- Automotive
('Car Cleaning Kit', 'Car cleaning kit for maintaining a clean vehicle.', 24.99, 'https://example.com/car-cleaning-kit.jpg'),
('Car Phone Mount', 'Car phone mount for hands-free navigation.', 9.99, 'https://example.com/car-phone-mount.jpg'),
('Automotive Tool Set', 'Automotive tool set for basic car repairs.', 49.99, 'https://example.com/auto-tool-set.jpg'),
-- Jewelry
('Diamond Stud Earrings', 'Diamond stud earrings for an elegant look.', 399.99, 'https://example.com/diamond-earrings.jpg'),
('Stylish Men''s Watch', 'Stylish men''s watch for everyday wear.', 149.99, 'https://example.com/mens-watch.jpg'),
-- Office Supplies
('Ergonomic Office Chair', 'Ergonomic office chair for comfortable work.', 199.99, 'https://example.com/office-chair.jpg'),
('Modern Desk', 'Modern desk for a stylish and organized workspace.', 299.99, 'https://example.com/desk.jpg'),
('Wireless Keyboard and Mouse', 'Wireless keyboard and mouse combo for productivity.', 69.99, 'https://example.com/keyboard-mouse.jpg'),
-- Pet Supplies
('Pet Food Set', 'Set of nutritious pet food for your furry friend.', 19.99, 'https://example.com/pet-food.jpg'),
('Cozy Pet Bed', 'Cozy pet bed for your pet''s comfort.', 29.99, 'https://example.com/pet-bed.jpg'),
-- Music
('Acoustic Guitar', 'Acoustic guitar for music enthusiasts.', 199.99, 'https://example.com/guitar.jpg'),
('Professional Microphone', 'Professional microphone for recording and performances.', 149.99, 'https://example.com/microphone.jpg'),
-- Movies and TV Shows
('Action Movie Collection', 'Collection of action movies for entertainment.', 39.99, 'https://example.com/action-movies.jpg'),
('TV Series Box Set', 'Box set of popular TV series for binge-watching.', 79.99, 'https://example.com/tv-series.jpg'),
-- Groceries
('Organic Fresh Fruits Basket', 'Organic fresh fruits basket for a healthy diet.', 34.99, 'https://example.com/fruits-basket.jpg'),
('Gourmet Chocolate Collection', 'Collection of gourmet chocolates for indulgence.', 24.99, 'https://example.com/chocolate.jpg'),
-- Fine Jewelry
('Pearl Necklace', 'Elegant pearl necklace for a sophisticated look.', 299.99, 'https://example.com/pearl-necklace.jpg'),
('Gold Bracelet', 'Stylish gold bracelet for any occasion.', 149.99, 'https://example.com/gold-bracelet.jpg'),
-- School and Educational Supplies
('Back-to-School Essentials', 'Essential supplies for the new school year.', 29.99, 'https://example.com/school-supplies.jpg'),
('Educational Globe', 'Educational globe for geography learning.', 49.99, 'https://example.com/educational-globe.jpg'),
-- Travel and Luggage
('Durable Suitcase', 'Durable suitcase for hassle-free travel.', 99.99, 'https://example.com/suitcase.jpg'),
('Travel Organizer Set', 'Set of travel organizers for efficient packing.', 19.99, 'https://example.com/travel-organizer.jpg'),
-- Fashion Accessories
('Classic Leather Wallet', 'Classic leather wallet for organizing essentials.', 39.99, 'https://example.com/leather-wallet.jpg'),
('Stylish Sunglasses', 'Stylish sunglasses for UV protection.', 29.99, 'https://example.com/sunglasses.jpg'),
-- Home Decor
('Decorative Throw Pillows', 'Decorative throw pillows for a cozy home.', 24.99, 'https://example.com/throw-pillows.jpg'),
('Elegant Table Lamp', 'Elegant table lamp for ambient lighting.', 49.99, 'https://example.com/table-lamp.jpg'),
-- Mobile Phones and Accessories
('Phone Case with Stand', 'Phone case with stand for hands-free use.', 14.99, 'https://example.com/phone-case.jpg'),
('Wireless Earphones', 'True wireless earphones with long battery life.', 69.99, 'https://example.com/wireless-earphones.jpg'),
-- Gourmet Food
('Premium Coffee Beans', 'Premium coffee beans for a rich and flavorful brew.', 19.99, 'https://example.com/coffee-beans.jpg'),
('Artisanal Cheese Collection', 'Collection of artisanal cheeses for a gourmet experience.', 29.99, 'https://example.com/cheese-collection.jpg'),
-- Party Supplies
('Party Balloon Set', 'Set of colorful party balloons for celebrations.', 9.99, 'https://example.com/party-balloons.jpg'),
('Party Hats and Accessories', 'Party hats and accessories for festive fun.', 14.99, 'https://example.com/party-accessories.jpg'),
-- Art and Craft
('Watercolor Paint Set', 'Watercolor paint set for artistic expression.', 14.99, 'https://example.com/watercolor-paint.jpg'),
('Sketching and Drawing Kit', 'Sketching and drawing kit for aspiring artists.', 19.99, 'https://example.com/sketching-kit.jpg'),
-- Baby Products
('Baby Stroller', 'Baby stroller for easy transportation.', 149.99, 'https://example.com/baby-stroller.jpg'),
('Soft Baby Blanket', 'Soft baby blanket for warmth and comfort.', 24.99, 'https://example.com/baby-blanket.jpg'),
-- Tools and Hardware
('Drill and Driver Set', 'Drill and driver set for DIY projects.', 79.99, 'https://example.com/drill-set.jpg'),
('Toolbox Kit', 'Toolbox kit for organizing and storing tools.', 49.99, 'https://example.com/toolbox.jpg'),
-- Stationery
('Colorful Marker Set', 'Colorful marker set for creative writing and drawing.', 9.99, 'https://example.com/marker-set.jpg'),
('Notebook Set', 'Set of notebooks for jotting down ideas.', 12.99, 'https://example.com/notebook-set.jpg'),
-- Fashion Accessories
('Classic Leather Wallet', 'Classic leather wallet for organizing essentials.', 39.99, 'https://example.com/leather-wallet.jpg'),
('Stylish Sunglasses', 'Stylish sunglasses for UV protection.', 29.99, 'https://example.com/sunglasses.jpg'),
-- Luggage and Travel Gear
('Durable Suitcase', 'Durable suitcase for hassle-free travel.', 99.99, 'https://example.com/suitcase.jpg'),
('Travel Organizer Set', 'Set of travel organizers for efficient packing.', 19.99, 'https://example.com/travel-organizer.jpg'),
-- Pet Care
('Pet Food Set', 'Set of nutritious pet food for your furry friend.', 19.99, 'https://example.com/pet-food.jpg'),
('Cozy Pet Bed', 'Cozy pet bed for your pet''s comfort.', 29.99, 'https://example.com/pet-bed.jpg'),
-- Digital Music
('Top Hits Collection', 'Collection of top hit songs for music lovers.', 19.99, 'https://example.com/music-collection.jpg'),
('Classical Music Compilation', 'Compilation of classical music masterpieces.', 24.99, 'https://example.com/classical-music.jpg'),
-- Movies and DVDs
('Action Movie Collection', 'Collection of action movies for entertainment.', 39.99, 'https://example.com/action-movies.jpg'),
('Classic Movie Box Set', 'Box set of classic movies for film enthusiasts.', 49.99, 'https://example.com/classic-movies.jpg'),
-- Baby Clothing
('Baby Onesie Set', 'Set of adorable baby onesies for newborns.', 19.99, 'https://example.com/baby-onesies.jpg'),
('Cute Baby Socks', 'Cute baby socks to keep tiny feet warm.', 9.99, 'https://example.com/baby-socks.jpg'),
-- Gardening Supplies
('Garden Tool Set', 'Garden tool set for gardening enthusiasts.', 29.99, 'https://example.com/garden-tools.jpg'),
('Fertilizer and Plant Food', 'Fertilizer and plant food for healthy plants.', 14.99, 'https://example.com/plant-food.jpg'),
-- Craft Supplies
('Assorted Craft Paper', 'Assorted craft paper for creative projects.', 9.99, 'https://example.com/craft-paper.jpg'),
('Colorful Craft Paint', 'Colorful craft paint for art and craft projects.', 12.99, 'https://example.com/craft-paint.jpg'),
-- Baby Gear
('Baby Stroller', 'Baby stroller for easy transportation.', 149.99, 'https://example.com/baby-stroller.jpg'),
('Soft Baby Blanket', 'Soft baby blanket for warmth and comfort.', 24.99, 'https://example.com/baby-blanket.jpg'),
-- Sports Equipment
('Durable Soccer Ball', 'Durable soccer ball for outdoor play.', 19.99, 'https://example.com/soccer-ball.jpg'),
('Adjustable Jump Rope', 'Adjustable jump rope for cardiovascular workouts.', 14.99, 'https://example.com/jump-rope.jpg');




-- tb_product_category (product_id, category_id) associations
INSERT INTO tb_product_category (product_id, category_id)
VALUES
-- Electronics
(1, 1),
(2, 1),
(3, 1),
(4, 1),
(5, 1),
(6, 1),
(7, 1),
(8, 1),
(9, 1),
(10, 1),
(11, 1),
(12, 1),
(13, 1),
(14, 1),
(15, 1),
(16, 1),
(17, 1),
(18, 1),
(19, 1),
(20, 1),
(21, 1),
(22, 1),
(23, 1),
(24, 1),
(25, 1),
(26, 1),
(27, 1),
(28, 1),
(29, 1),
(30, 1),
(31, 1),
(32, 1),
(33, 1),
(34, 1),
(35, 1),
(36, 1),
(37, 1),
(38, 1),
(39, 1),
(40, 1),
(41, 1),
(42, 1),
(43, 1),
(44, 1),
(45, 1),
(46, 1),
(47, 1),
(48, 1),
-- Clothing
(1, 2),
(21, 2),
(22, 2),
(23, 2),
(24, 2),
(25, 2),
(26, 2),
(27, 2),
-- Books
(3, 3),
(12, 3),
(33, 3),
-- Home and Kitchen
(13, 4),
(14, 4),
(15, 4),
(16, 4),
(30, 4),
(31, 4),
(32, 4),
(33, 4),
(34, 4),
-- Sports and Outdoors
(5, 5),
(17, 5),
(30, 5),
(31, 5),
(32, 5),
(33, 5),
(34, 5),
(35, 5),
(36, 5),
(37, 5),
(38, 5),
(39, 5),
(40, 5),
(41, 5),
(42, 5),
(43, 5),
(44, 5),
(45, 5),
-- Beauty and Personal Care
(6, 6),
(26, 6),
-- Toys and Games
(7, 7),
(30, 7),
(31, 7),
(32, 7),
(33, 7),
(34, 7),
(35, 7),
(36, 7),
(37, 7),
(38, 7),
(39, 7),
(40, 7),
(41, 7),
(42, 7),
(43, 7),
(44, 7),
(45, 7),
-- Health and Wellness
(8, 8),
(17, 8),
(37, 8),
(40, 8),
-- Furniture
(9, 9),
(19, 9),
(29, 9),
-- Automotive
(10, 10),
(35, 10),
-- Jewelry
(11, 11),
(36, 11),
-- Office Supplies
(12, 12),
(27, 12),
-- Pet Supplies
(13, 13),
(38, 13),
-- Music
(14, 14),
(34, 14),
-- Movies and TV Shows
(15, 15),
(48, 15),
-- Groceries
(16, 16),
(29, 16),
-- Fitness and Exercise
(17, 17),
(36, 17),
(37, 17),
(38, 17),
(40, 17),
-- Electrical Appliances
(18, 18),
(13, 18),
(14, 18),
(15, 18),
(16, 18),
(17, 18),
-- Garden and Outdoor
(19, 19),
(33, 19),
(34, 19),
(35, 19),
-- Art and Craft
(20, 20),
(33, 20),
(34, 20),
(35, 20),
-- Baby Products
(21, 21),
(46, 21),
(47, 21),
(48, 21),
-- Party and Celebration
(22, 22),
(41, 22),
(42, 22),
-- Tools and Hardware
(23, 23),
(43, 23),
(44, 23),
-- Stationery
(24, 24),
(34, 24),
(35, 24),
(36, 24),
(37, 24),
(38, 24),
(39, 24),
-- Travel and Luggage
(25, 25),
(45, 25),
(46, 25),
-- Fashion Accessories
(26, 26),
(36, 26),
-- Home Decor
(27, 27),
(28, 27),
-- Mobile Phones and Accessories
(1, 28),
(7, 28),
(26, 28),
(46, 28),
-- Gourmet Food
(29, 29),
(30, 29),
-- Outdoor Recreation
(30, 30),
(31, 30),
(32, 30),
(33, 30),
(34, 30),
(35, 30),
(36, 30),
(37, 30),
(38, 30),
(39, 30),
(40, 30),
(41, 30),
(42, 30),
(43, 30),
(44, 30),
(45, 30),
(46, 30),
(47, 30),
(48, 30),
-- Personal Electronics
(7, 31),
(26, 31),
-- Kitchen Appliances
(9, 32),
(13, 32),
(14, 32),
(15, 32),
(16, 32),
(17, 32),
(25, 32),
(27, 32),
-- Books and Magazines
(3, 33),
(12, 33),
(33, 33),
-- Musical Instruments
(14, 34),
-- Automotive Parts and Accessories
(10, 35),
-- Fine Jewelry
(36, 36),
-- School and Educational Supplies
(33, 37),
-- Pet Food
(38, 38),
-- Video Games
(7, 39),
(30, 39),
(31, 39),
(32, 39),
(33, 39),
(34, 39),
(35, 39),
(36, 39),
(37, 39),
(38, 39),
(39, 39),
(40, 39),
(41, 39),
(42, 39),
(43, 39),
(44, 39),
(45, 39),
-- Health and Fitness
(6, 40),
(17, 40),
(37, 40),
(38, 40),
(40, 40),
-- Home Improvement
(12, 41),
(13, 41),
(14, 41),
(15, 41),
(16, 41),
(17, 41),
(18, 41),
(19, 41),
(20, 41),
(21, 41),
(22, 41),
(23, 41),
(24, 41),
(25, 41),
(26, 41),
(27, 41),
(28, 41),
(29, 41),
(30, 41),
(31, 41),
(32, 41),
(33, 41),
(34, 41),
(35, 41),
(36, 41),
(37, 41),
(38, 41),
(39, 41),
(40, 41),
(41, 41),
(42, 41),
(43, 41),
(44, 41),
(45, 41),
(46, 41),
(47, 41),
(48, 41),
-- Party Supplies
(42, 42),
-- Hand Tools
(23, 43),
(43, 43),
(44, 43),
-- Writing Instruments
(24, 44),
(34, 44),
(35, 44),
(36, 44),
(37, 44),
(38, 44),
(39, 44),
(40, 44),
(41, 44),
(42, 44),
(43, 44),
(44, 44),
(45, 44),
(46, 44),
(47, 44),
(48, 44),
-- Luggage and Travel Gear
(25, 45),
(46, 45),
-- Pet Care
(46, 46),
(47, 46),
-- Digital Music
(14, 47),
-- Movies and DVDs
(15, 48),
-- Baby Clothing
(21, 49),
-- Gardening Supplies
(19, 50),
-- Craft Supplies
(20, 51),
-- Baby Gear
(21, 52),
-- Sports Equipment
(5, 53),
(10, 53),
(35, 53),
(42, 53),
(43, 53),
(46, 53);

INSERT INTO tb_order (moment, order_status, user_id) 
VALUES ('2023-08-02T16:48:32.043678Z', 1, 1);

INSERT INTO tb_order (moment, order_status, user_id) 
VALUES ('2023-08-02T16:48:32.043678Z', 5, 3);

INSERT INTO tb_order (moment, order_status, user_id) 
VALUES ('2022-12-23T02:12:30Z', 4, 1);

INSERT INTO tb_order (moment, order_status, user_id) 
VALUES ('2018-01-02T10:14:10Z', 2, 3);

INSERT INTO tb_order (moment, order_status, user_id) 
VALUES ('2023-08-02T16:48:32.047677Z', 2, 2);

INSERT INTO tb_order (moment, order_status, user_id) 
VALUES ('2023-08-02T16:48:32.047677Z', 1, 1);

INSERT INTO tb_order (moment, order_status, user_id) 
VALUES ('2021-06-15T08:30:00Z', 3, 2);

INSERT INTO tb_order (moment, order_status, user_id) 
VALUES ('2019-11-20T14:22:45Z', 4, 4);

INSERT INTO tb_order (moment, order_status, user_id) 
VALUES ('2023-02-10T21:55:01Z', 2, 5);

INSERT INTO tb_order (moment, order_status, user_id) 
VALUES ('2022-09-05T09:12:30Z', 1, 6);

INSERT INTO tb_order (moment, order_status, user_id) 
VALUES ('2020-04-12T18:09:22Z', 3, 7);

INSERT INTO tb_order (moment, order_status, user_id) 
VALUES ('2019-08-29T05:30:15Z', 5, 8);

INSERT INTO tb_order (moment, order_status, user_id) 
VALUES ('2022-03-17T11:11:11Z', 1, 9);

INSERT INTO tb_order (moment, order_status, user_id) 
VALUES ('2021-12-05T23:59:59Z', 4, 10);

INSERT INTO tb_order (moment, order_status, user_id) 
VALUES ('2023-01-30T12:30:00Z', 2, 11);

INSERT INTO tb_payment (moment, order_id) VALUES ('2022-01-22T09:14:03Z', 3);
INSERT INTO tb_payment (moment, order_id) VALUES ('2018-12-30T19:34:50Z', 4);
INSERT INTO tb_payment (moment, order_id) VALUES ('2023-08-02T16:48:32.067Z', 5);
INSERT INTO tb_payment (moment, order_id) VALUES ('2022-01-22T09:14:03Z', 6);
INSERT INTO tb_payment (moment, order_id) VALUES ('2018-12-30T19:34:50Z', 7);
INSERT INTO tb_payment (moment, order_id) VALUES ('2023-08-02T16:48:32.067Z', 8);
INSERT INTO tb_payment (moment, order_id) VALUES ('2022-01-22T09:14:03Z', 9);
INSERT INTO tb_payment (moment, order_id) VALUES ('2018-12-30T19:34:50Z', 10);
INSERT INTO tb_payment (moment, order_id) VALUES ('2023-08-02T16:48:32.067Z', 11);
INSERT INTO tb_payment (moment, order_id) VALUES ('2022-01-22T09:14:03Z', 12);
INSERT INTO tb_payment (moment, order_id) VALUES ('2018-12-30T19:34:50Z', 13);
INSERT INTO tb_payment (moment, order_id) VALUES ('2023-08-02T16:48:32.067Z', 14);
