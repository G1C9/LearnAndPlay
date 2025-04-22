CREATE TABLE IF NOT EXISTS games
(
    id          BIGSERIAL PRIMARY KEY,
    name        VARCHAR(255) UNIQUE NOT NULL,
    description TEXT
);

CREATE TABLE IF NOT EXISTS themes
(
    id             BIGSERIAL PRIMARY KEY,
    name           VARCHAR(255) UNIQUE NOT NULL,
    required_level INT                 NOT NULL
);

CREATE TABLE IF NOT EXISTS game_theme
(
    game_id  BIGINT NOT NULL,
    theme_id BIGINT NOT NULL,
    PRIMARY KEY (game_id, theme_id),
    FOREIGN KEY (game_id) REFERENCES games (id) ON DELETE CASCADE,
    FOREIGN KEY (theme_id) REFERENCES themes (id) ON DELETE CASCADE
);