INSERT INTO games (name, description)
SELECT 'Drag and Drop', 'Connect a word and its translation'
WHERE NOT EXISTS (SELECT 1 FROM games WHERE name = 'Drag and Drop');

INSERT INTO games (name, description)
SELECT 'Quiz', 'Answer the question'
WHERE NOT EXISTS (SELECT 1 FROM games WHERE name = 'Quiz');

INSERT INTO games (name, description)
SELECT 'Make a sentence', 'Make a sentence from the words'
WHERE NOT EXISTS (SELECT 1 FROM games WHERE name = 'Make a sentence');

INSERT INTO games (name, description)
SELECT 'Enter a word', 'Enter a word from the keyboard'
WHERE NOT EXISTS (SELECT 1 FROM games WHERE name = 'Enter a word');



INSERT INTO themes (name, required_level)
SELECT 'Numbers and days of the week', 1
WHERE NOT EXISTS (SELECT 1 FROM themes WHERE name = 'Numbers and days of the week');

INSERT INTO themes (name, required_level)
SELECT 'Animals', 2
WHERE NOT EXISTS (SELECT 1 FROM themes WHERE name = 'Animals');

INSERT INTO themes (name, required_level)
SELECT 'Food', 3
WHERE NOT EXISTS (SELECT 1 FROM themes WHERE name = 'Food');

INSERT INTO themes (name, required_level)
SELECT 'Explore the World', 4
WHERE NOT EXISTS (SELECT 1 FROM themes WHERE name = 'Explore the World');



INSERT INTO game_theme (game_id, theme_id)
SELECT g.id, t.id FROM games g, themes t
WHERE g.name = 'Drag and Drop' AND t.name = 'Numbers and days of the week'
  AND NOT EXISTS (SELECT 1 FROM game_theme WHERE game_id = g.id AND theme_id = t.id);

INSERT INTO game_theme (game_id, theme_id)
SELECT g.id, t.id FROM games g, themes t
WHERE g.name = 'Quiz' AND t.name = 'Numbers and days of the week'
  AND NOT EXISTS (SELECT 1 FROM game_theme WHERE game_id = g.id AND theme_id = t.id);

INSERT INTO game_theme (game_id, theme_id)
SELECT g.id, t.id FROM games g, themes t
WHERE g.name = 'Make a sentence' AND t.name = 'Numbers and days of the week'
  AND NOT EXISTS (SELECT 1 FROM game_theme WHERE game_id = g.id AND theme_id = t.id);

INSERT INTO game_theme (game_id, theme_id)
SELECT g.id, t.id FROM games g, themes t
WHERE g.name = 'Enter a word' AND t.name = 'Numbers and days of the week'
  AND NOT EXISTS (SELECT 1 FROM game_theme WHERE game_id = g.id AND theme_id = t.id);