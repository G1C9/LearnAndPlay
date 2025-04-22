-- Theme 1: Numbers and Days
INSERT INTO words (word, theme_id, translation)
SELECT 'One', 1, '1'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'One' AND theme_id = 1);
INSERT INTO words (word, theme_id, translation)
SELECT 'Two', 1, '2'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Two' AND theme_id = 1);
INSERT INTO words (word, theme_id, translation)
SELECT 'Three', 1, '3'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Three' AND theme_id = 1);
INSERT INTO words (word, theme_id, translation)
SELECT 'Four', 1, '4'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Four' AND theme_id = 1);
INSERT INTO words (word, theme_id, translation)
SELECT 'Five', 1, '5'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Five' AND theme_id = 1);
INSERT INTO words (word, theme_id, translation)
SELECT 'Six', 1, '6'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Six' AND theme_id = 1);
INSERT INTO words (word, theme_id, translation)
SELECT 'Seven', 1, '7'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Seven' AND theme_id = 1);
INSERT INTO words (word, theme_id, translation)
SELECT 'Eight', 1, '8'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Eight' AND theme_id = 1);
INSERT INTO words (word, theme_id, translation)
SELECT 'Nine', 1, '9'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Nine' AND theme_id = 1);
INSERT INTO words (word, theme_id, translation)
SELECT 'Ten', 1, '10'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Ten' AND theme_id = 1);
INSERT INTO words (word, theme_id, translation)
SELECT 'Monday', 1, 'Понедельник'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Monday' AND theme_id = 1);
INSERT INTO words (word, theme_id, translation)
SELECT 'Tuesday', 1, 'Вторник'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Tuesday' AND theme_id = 1);
INSERT INTO words (word, theme_id, translation)
SELECT 'Wednesday', 1, 'Среда'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Wednesday' AND theme_id = 1);
INSERT INTO words (word, theme_id, translation)
SELECT 'Thursday', 1, 'Четверг'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Thursday' AND theme_id = 1);
INSERT INTO words (word, theme_id, translation)
SELECT 'Friday', 1, 'Пятница'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Friday' AND theme_id = 1);
INSERT INTO words (word, theme_id, translation)
SELECT 'Saturday', 1, 'Суббота'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Saturday' AND theme_id = 1);
INSERT INTO words (word, theme_id, translation)
SELECT 'Sunday', 1, 'Воскресенье'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Sunday' AND theme_id = 1);

-- Theme 2: Animals
INSERT INTO words (word, theme_id, translation)
SELECT 'Lion', 2, 'Лев'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Lion' AND theme_id = 2);
INSERT INTO words (word, theme_id, translation)
SELECT 'Tiger', 2, 'Тигр'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Tiger' AND theme_id = 2);
INSERT INTO words (word, theme_id, translation)
SELECT 'Elephant', 2, 'Слон'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Elephant' AND theme_id = 2);
INSERT INTO words (word, theme_id, translation)
SELECT 'Giraffe', 2, 'Жираф'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Giraffe' AND theme_id = 2);
INSERT INTO words (word, theme_id, translation)
SELECT 'Monkey', 2, 'Обезьяна'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Monkey' AND theme_id = 2);
INSERT INTO words (word, theme_id, translation)
SELECT 'Wolf', 2, 'Волк'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Wolf' AND theme_id = 2);
INSERT INTO words (word, theme_id, translation)
SELECT 'Fox', 2, 'Лиса'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Fox' AND theme_id = 2);
INSERT INTO words (word, theme_id, translation)
SELECT 'Hare', 2, 'Заяц'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Hare' AND theme_id = 2);
INSERT INTO words (word, theme_id, translation)
SELECT 'Squirrel', 2, 'Белка'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Squirrel' AND theme_id = 2);
INSERT INTO words (word, theme_id, translation)
SELECT 'Bear', 2, 'Медведь'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Bear' AND theme_id = 2);
INSERT INTO words (word, theme_id, translation)
SELECT 'Cat', 2, 'Кошка'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Cat' AND theme_id = 2);
INSERT INTO words (word, theme_id, translation)
SELECT 'Dog', 2, 'Собака'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Dog' AND theme_id = 2);
INSERT INTO words (word, theme_id, translation)
SELECT 'Cow', 2, 'Корова'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Cow' AND theme_id = 2);
INSERT INTO words (word, theme_id, translation)
SELECT 'Horse', 2, 'Лошадь'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Horse' AND theme_id = 2);
INSERT INTO words (word, theme_id, translation)
SELECT 'Sheep', 2, 'Овца'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Sheep' AND theme_id = 2);
INSERT INTO words (word, theme_id, translation)
SELECT 'Goat', 2, 'Коза'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Goat' AND theme_id = 2);
INSERT INTO words (word, theme_id, translation)
SELECT 'Pig', 2, 'Свинья'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Pig' AND theme_id = 2);
INSERT INTO words (word, theme_id, translation)
SELECT 'Chicken', 2, 'Курица'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Chicken' AND theme_id = 2);
INSERT INTO words (word, theme_id, translation)
SELECT 'Duck', 2, 'Утка'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Duck' AND theme_id = 2);
INSERT INTO words (word, theme_id, translation)
SELECT 'Goose', 2, 'Гусь'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Goose' AND theme_id = 2);

-- Theme 3: Food
INSERT INTO words (word, theme_id, translation)
SELECT 'Bread', 3, 'Хлеб'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Bread' AND theme_id = 3);
INSERT INTO words (word, theme_id, translation)
SELECT 'Pasta', 3, 'Паста'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Pasta' AND theme_id = 3);
INSERT INTO words (word, theme_id, translation)
SELECT 'Rice', 3, 'Рис'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Rice' AND theme_id = 3);
INSERT INTO words (word, theme_id, translation)
SELECT 'Potato', 3, 'Картофель'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Potato' AND theme_id = 3);
INSERT INTO words (word, theme_id, translation)
SELECT 'Tomato', 3, 'Помидор'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Tomato' AND theme_id = 3);
INSERT INTO words (word, theme_id, translation)
SELECT 'Carrot', 3, 'Морковь'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Carrot' AND theme_id = 3);
INSERT INTO words (word, theme_id, translation)
SELECT 'Apple', 3, 'Яблоко'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Apple' AND theme_id = 3);
INSERT INTO words (word, theme_id, translation)
SELECT 'Banana', 3, 'Банан'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Banana' AND theme_id = 3);
INSERT INTO words (word, theme_id, translation)
SELECT 'Cheese', 3, 'Сыр'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Cheese' AND theme_id = 3);
INSERT INTO words (word, theme_id, translation)
SELECT 'Egg', 3, 'Яйцо'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Egg' AND theme_id = 3);
INSERT INTO words (word, theme_id, translation)
SELECT 'Meat', 3, 'Мясо'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Meat' AND theme_id = 3);
INSERT INTO words (word, theme_id, translation)
SELECT 'Fish', 3, 'Рыба'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Fish' AND theme_id = 3);
INSERT INTO words (word, theme_id, translation)
SELECT 'Milk', 3, 'Молоко'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Milk' AND theme_id = 3);
INSERT INTO words (word, theme_id, translation)
SELECT 'Butter', 3, 'Масло'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Butter' AND theme_id = 3);
INSERT INTO words (word, theme_id, translation)
SELECT 'Sugar', 3, 'Сахар'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Sugar' AND theme_id = 3);
INSERT INTO words (word, theme_id, translation)
SELECT 'Flour', 3, 'Мука'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Flour' AND theme_id = 3);
INSERT INTO words (word, theme_id, translation)
SELECT 'Pepper', 3, 'Перец'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Pepper' AND theme_id = 3);
INSERT INTO words (word, theme_id, translation)
SELECT 'Salt', 3, 'Соль'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Salt' AND theme_id = 3);
INSERT INTO words (word, theme_id, translation)
SELECT 'Honey', 3, 'Мёд'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Honey' AND theme_id = 3);

-- Theme 4: Explore the World
INSERT INTO words (word, theme_id, translation)
SELECT 'Airplane', 4, 'Самолет'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Airplane' AND theme_id = 4);
INSERT INTO words (word, theme_id, translation)
SELECT 'Train', 4, 'Поезд'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Train' AND theme_id = 4);
INSERT INTO words (word, theme_id, translation)
SELECT 'Car', 4, 'Автомобиль'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Car' AND theme_id = 4);
INSERT INTO words (word, theme_id, translation)
SELECT 'Bus', 4, 'Автобус'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Bus' AND theme_id = 4);
INSERT INTO words (word, theme_id, translation)
SELECT 'Boat', 4, 'Лодка'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Boat' AND theme_id = 4);
INSERT INTO words (word, theme_id, translation)
SELECT 'Ship', 4, 'Корабль'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Ship' AND theme_id = 4);
INSERT INTO words (word, theme_id, translation)
SELECT 'Bicycle', 4, 'Велосипед'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Bicycle' AND theme_id = 4);
INSERT INTO words (word, theme_id, translation)
SELECT 'Suitcase', 4, 'Чемодан'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Suitcase' AND theme_id = 4);
INSERT INTO words (word, theme_id, translation)
SELECT 'Map', 4, 'Карта'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Map' AND theme_id = 4);
INSERT INTO words (word, theme_id, translation)
SELECT 'Camera', 4, 'Камера'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Camera' AND theme_id = 4);
INSERT INTO words (word, theme_id, translation)
SELECT 'Hotel', 4, 'Отель'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Hotel' AND theme_id = 4);
INSERT INTO words (word, theme_id, translation)
SELECT 'Museum', 4, 'Музей'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Museum' AND theme_id = 4);
INSERT INTO words (word, theme_id, translation)
SELECT 'Monument', 4, 'Памятник'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Monument' AND theme_id = 4);
INSERT INTO words (word, theme_id, translation)
SELECT 'Beach', 4, 'Пляж'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Beach' AND theme_id = 4);
INSERT INTO words (word, theme_id, translation)
SELECT 'Mountain', 4, 'Гора'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Mountain' AND theme_id = 4);
INSERT INTO words (word, theme_id, translation)
SELECT 'River', 4, 'Река'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'River' AND theme_id = 4);
INSERT INTO words (word, theme_id, translation)
SELECT 'City', 4, 'Город'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'City' AND theme_id = 4);
INSERT INTO words (word, theme_id, translation)
SELECT 'Country', 4, 'Страна'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Country' AND theme_id = 4);
INSERT INTO words (word, theme_id, translation)
SELECT 'Luggage', 4, 'Багаж'
    WHERE NOT EXISTS (SELECT 1 FROM words WHERE word = 'Luggage' AND theme_id = 4);