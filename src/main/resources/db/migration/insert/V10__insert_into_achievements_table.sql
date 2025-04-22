INSERT INTO achievements (code, name, description) SELECT 'BEGINNER', 'Новичок', 'Пройдите первую мини-игру'
    WHERE NOT EXISTS (SELECT 1 FROM achievements WHERE code = 'BEGINNER');
INSERT INTO achievements (code, name, description) SELECT 'POLYGLOT_NUMBERS', 'Полиглот: Numbers', 'Пройдите все мини-игры по теме Numbers and days of the week'
    WHERE NOT EXISTS (SELECT 1 FROM achievements WHERE code = 'POLYGLOT_NUMBERS');
INSERT INTO achievements (code, name, description) SELECT 'POLYGLOT_ANIMALS', 'Полиглот: Animals', 'Пройдите все мини-игры по теме Animals'
    WHERE NOT EXISTS (SELECT 1 FROM achievements WHERE code = 'POLYGLOT_ANIMALS');
INSERT INTO achievements (code, name, description) SELECT 'POLYGLOT_FOOD', 'Полиглот: Food', 'Пройдите все мини-игры по теме Food'
    WHERE NOT EXISTS (SELECT 1 FROM achievements WHERE code = 'POLYGLOT_FOOD');
INSERT INTO achievements (code, name, description) SELECT 'POLYGLOT_EXPLORER', 'Полиглот: Explorer', 'Пройдите все мини-игры по теме Explore the World'
    WHERE NOT EXISTS (SELECT 1 FROM achievements WHERE code = 'POLYGLOT_EXPLORER');
INSERT INTO achievements (code, name, description) SELECT 'EXPERT', 'Эксперт', 'Пройдите все мини-игры во всех темах'
    WHERE NOT EXISTS (SELECT 1 FROM achievements WHERE code = 'EXPERT');