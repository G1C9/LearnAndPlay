-- Theme 1: Numbers and Days
INSERT INTO sentences (text, theme_id)
SELECT 'A cat has one tail', 1
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'A cat has one tail' AND theme_id = 1);
INSERT INTO sentences (text, theme_id)
SELECT 'There are two eyes on a face', 1
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'There are two eyes on a face' AND theme_id = 1);
INSERT INTO sentences (text, theme_id)
SELECT 'I have three apples in my bag', 1
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'I have three apples in my bag' AND theme_id = 1);
INSERT INTO sentences (text, theme_id)
SELECT 'She has four legs on her chair', 1
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'She has four legs on her chair' AND theme_id = 1);
INSERT INTO sentences (text, theme_id)
SELECT 'We need five minutes to finish', 1
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'We need five minutes to finish' AND theme_id = 1);
INSERT INTO sentences (text, theme_id)
SELECT 'He has six books on the shelf', 1
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'He has six books on the shelf' AND theme_id = 1);
INSERT INTO sentences (text, theme_id)
SELECT 'There are seven days in a week', 1
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'There are seven days in a week' AND theme_id = 1);
INSERT INTO sentences (text, theme_id)
SELECT 'I saw eight birds in the tree', 1
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'I saw eight birds in the tree' AND theme_id = 1);
INSERT INTO sentences (text, theme_id)
SELECT 'She has nine flowers in her garden', 1
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'She has nine flowers in her garden' AND theme_id = 1);
INSERT INTO sentences (text, theme_id)
SELECT 'There are ten fingers on your hands', 1
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'There are ten fingers on your hands' AND theme_id = 1);
INSERT INTO sentences (text, theme_id)
SELECT 'Monday is the first day of the week', 1
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'Monday is the first day of the week' AND theme_id = 1);
INSERT INTO sentences (text, theme_id)
SELECT 'Tuesday comes after Monday', 1
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'Tuesday comes after Monday' AND theme_id = 1);
INSERT INTO sentences (text, theme_id)
SELECT 'I have a meeting on Wednesday', 1
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'I have a meeting on Wednesday' AND theme_id = 1);
INSERT INTO sentences (text, theme_id)
SELECT 'Thursday is often busy for me', 1
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'Thursday is often busy for me' AND theme_id = 1);
INSERT INTO sentences (text, theme_id)
SELECT 'Friday is the last workday of the week', 1
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'Friday is the last workday of the week' AND theme_id = 1);
INSERT INTO sentences (text, theme_id)
SELECT 'Saturday is perfect for relaxing', 1
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'Saturday is perfect for relaxing' AND theme_id = 1);
INSERT INTO sentences (text, theme_id)
SELECT 'Sunday is a day for family', 1
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'Sunday is a day for family' AND theme_id = 1);

-- Theme 2: Animals
INSERT INTO sentences (text, theme_id)
SELECT 'The lion is big', 2
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'The lion is big' AND theme_id = 2);
INSERT INTO sentences (text, theme_id)
SELECT 'The tiger has stripes', 2
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'The tiger has stripes' AND theme_id = 2);
INSERT INTO sentences (text, theme_id)
SELECT 'The elephant is huge', 2
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'The elephant is huge' AND theme_id = 2);
INSERT INTO sentences (text, theme_id)
SELECT 'The giraffe has a long neck', 2
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'The giraffe has a long neck' AND theme_id = 2);
INSERT INTO sentences (text, theme_id)
SELECT 'The monkey climbs trees', 2
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'The monkey climbs trees' AND theme_id = 2);
INSERT INTO sentences (text, theme_id)
SELECT 'The wolf howls at night', 2
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'The wolf howls at night' AND theme_id = 2);
INSERT INTO sentences (text, theme_id)
SELECT 'The fox is red', 2
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'The fox is red' AND theme_id = 2);
INSERT INTO sentences (text, theme_id)
SELECT 'The hare runs fast', 2
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'The hare runs fast' AND theme_id = 2);
INSERT INTO sentences (text, theme_id)
SELECT 'The squirrel jumps from tree to tree', 2
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'The squirrel jumps from tree to tree' AND theme_id = 2);
INSERT INTO sentences (text, theme_id)
SELECT 'The bear eats berries', 2
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'The bear eats berries' AND theme_id = 2);
INSERT INTO sentences (text, theme_id)
SELECT 'The cat sleeps in the sun', 2
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'The cat sleeps in the sun' AND theme_id = 2);
INSERT INTO sentences (text, theme_id)
SELECT 'The dog guards the house', 2
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'The dog guards the house' AND theme_id = 2);
INSERT INTO sentences (text, theme_id)
SELECT 'The cow eats grass', 2
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'The cow eats grass' AND theme_id = 2);
INSERT INTO sentences (text, theme_id)
SELECT 'The horse runs quickly', 2
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'The horse runs quickly' AND theme_id = 2);
INSERT INTO sentences (text, theme_id)
SELECT 'The sheep has fluffy wool', 2
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'The sheep has fluffy wool' AND theme_id = 2);
INSERT INTO sentences (text, theme_id)
SELECT 'The goat climbs hills', 2
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'The goat climbs hills' AND theme_id = 2);
INSERT INTO sentences (text, theme_id)
SELECT 'The pig rolls in the mud', 2
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'The pig rolls in the mud' AND theme_id = 2);
INSERT INTO sentences (text, theme_id)
SELECT 'The chicken pecks at the ground', 2
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'The chicken pecks at the ground' AND theme_id = 2);
INSERT INTO sentences (text, theme_id)
SELECT 'The duck swims in the water', 2
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'The duck swims in the water' AND theme_id = 2);
INSERT INTO sentences (text, theme_id)
SELECT 'The goose makes a loud sound', 2
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'The goose makes a loud sound' AND theme_id = 2);

-- Theme 3: Food
INSERT INTO sentences (text, theme_id)
SELECT 'The fresh bread is warm', 3
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'The fresh bread is warm' AND theme_id = 3);
INSERT INTO sentences (text, theme_id)
SELECT 'I love to eat pasta', 3
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'I love to eat pasta' AND theme_id = 3);
INSERT INTO sentences (text, theme_id)
SELECT 'Rice is a staple food', 3
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'Rice is a staple food' AND theme_id = 3);
INSERT INTO sentences (text, theme_id)
SELECT 'Potatoes are a versatile vegetable', 3
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'Potatoes are a versatile vegetable' AND theme_id = 3);
INSERT INTO sentences (text, theme_id)
SELECT 'Juicy tomatoes make an excellent salad ingredient', 3
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'Juicy tomatoes make an excellent salad ingredient' AND theme_id = 3);
INSERT INTO sentences (text, theme_id)
SELECT 'Crunchy carrots are a healthy snack', 3
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'Crunchy carrots are a healthy snack' AND theme_id = 3);
INSERT INTO sentences (text, theme_id)
SELECT 'Crisp apples are a favorite fruit for many people', 3
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'Crisp apples are a favorite fruit for many people' AND theme_id = 3);
INSERT INTO sentences (text, theme_id)
SELECT 'Bananas are a healthy snack', 3
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'Bananas are a healthy snack' AND theme_id = 3);
INSERT INTO sentences (text, theme_id)
SELECT 'Cheese is a dairy product', 3
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'Cheese is a dairy product' AND theme_id = 3);
INSERT INTO sentences (text, theme_id)
SELECT 'Eggs are a good source of protein', 3
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'Eggs are a good source of protein' AND theme_id = 3);
INSERT INTO sentences (text, theme_id)
SELECT 'Meat provides essential nutrients', 3
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'Meat provides essential nutrients' AND theme_id = 3);
INSERT INTO sentences (text, theme_id)
SELECT 'Fish is a lean protein', 3
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'Fish is a lean protein' AND theme_id = 3);
INSERT INTO sentences (text, theme_id)
SELECT 'Milk is a nutritious drink', 3
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'Milk is a nutritious drink' AND theme_id = 3);
INSERT INTO sentences (text, theme_id)
SELECT 'Butter makes food taste richer', 3
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'Butter makes food taste richer' AND theme_id = 3);
INSERT INTO sentences (text, theme_id)
SELECT 'Sugar sweetens many foods', 3
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'Sugar sweetens many foods' AND theme_id = 3);
INSERT INTO sentences (text, theme_id)
SELECT 'Flour is used to make baked goods', 3
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'Flour is used to make baked goods' AND theme_id = 3);
INSERT INTO sentences (text, theme_id)
SELECT 'Pepper adds spice to dishes', 3
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'Pepper adds spice to dishes' AND theme_id = 3);
INSERT INTO sentences (text, theme_id)
SELECT 'Salt enhances the flavor of food', 3
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'Salt enhances the flavor of food' AND theme_id = 3);
INSERT INTO sentences (text, theme_id)
SELECT 'Honey is a natural sweetener', 3
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'Honey is a natural sweetener' AND theme_id = 3);

-- Theme 4: Explore the World
INSERT INTO sentences (text, theme_id)
SELECT 'The airplane flies high in the sky', 4
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'The airplane flies high in the sky' AND theme_id = 4);
INSERT INTO sentences (text, theme_id)
SELECT 'The train travels quickly across the countryside', 4
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'The train travels quickly across the countryside' AND theme_id = 4);
INSERT INTO sentences (text, theme_id)
SELECT 'The car takes me to my destination', 4
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'The car takes me to my destination' AND theme_id = 4);
INSERT INTO sentences (text, theme_id)
SELECT 'The bus transports many passengers at once', 4
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'The bus transports many passengers at once' AND theme_id = 4);
INSERT INTO sentences (text, theme_id)
SELECT 'The boat sails smoothly across the water', 4
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'The boat sails smoothly across the water' AND theme_id = 4);
INSERT INTO sentences (text, theme_id)
SELECT 'The ship carries cargo and passengers', 4
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'The ship carries cargo and passengers' AND theme_id = 4);
INSERT INTO sentences (text, theme_id)
SELECT 'The bicycle is an eco-friendly mode of transport', 4
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'The bicycle is an eco-friendly mode of transport' AND theme_id = 4);
INSERT INTO sentences (text, theme_id)
SELECT 'The suitcase holds all my belongings', 4
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'The suitcase holds all my belongings' AND theme_id = 4);
INSERT INTO sentences (text, theme_id)
SELECT 'The map helps me navigate to new places', 4
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'The map helps me navigate to new places' AND theme_id = 4);
INSERT INTO sentences (text, theme_id)
SELECT 'The camera captures beautiful memories', 4
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'The camera captures beautiful memories' AND theme_id = 4);
INSERT INTO sentences (text, theme_id)
SELECT 'The hotel provides a comfortable stay', 4
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'The hotel provides a comfortable stay' AND theme_id = 4);
INSERT INTO sentences (text, theme_id)
SELECT 'The museum displays fascinating artifacts', 4
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'The museum displays fascinating artifacts' AND theme_id = 4);
INSERT INTO sentences (text, theme_id)
SELECT 'The monument honors important historical events', 4
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'The monument honors important historical events' AND theme_id = 4);
INSERT INTO sentences (text, theme_id)
SELECT 'The beach offers a relaxing getaway', 4
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'The beach offers a relaxing getaway' AND theme_id = 4);
INSERT INTO sentences (text, theme_id)
SELECT 'The mountain provides stunning views', 4
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'The mountain provides stunning views' AND theme_id = 4);
INSERT INTO sentences (text, theme_id)
SELECT 'The river flows through the countryside', 4
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'The river flows through the countryside' AND theme_id = 4);
INSERT INTO sentences (text, theme_id)
SELECT 'The city is a bustling hub of activity', 4
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'The city is a bustling hub of activity' AND theme_id = 4);
INSERT INTO sentences (text, theme_id)
SELECT 'The country has a rich cultural heritage', 4
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'The country has a rich cultural heritage' AND theme_id = 4);
INSERT INTO sentences (text, theme_id)
SELECT 'The luggage is packed for the journey', 4
    WHERE NOT EXISTS (SELECT 1 FROM sentences WHERE text = 'The luggage is packed for the journey' AND theme_id = 4);