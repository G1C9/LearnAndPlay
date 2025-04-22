CREATE TABLE IF NOT EXISTS achievements
(
    id          BIGSERIAL PRIMARY KEY,
    code        VARCHAR(255) NOT NULL,
    name        VARCHAR(255) NOT NULL,
    description TEXT
);

CREATE TABLE IF NOT EXISTS user_achievements
(
    id             BIGSERIAL PRIMARY KEY,
    user_id        BIGINT    NOT NULL,
    achievement_id BIGINT    NOT NULL,
    unlocked_at    TIMESTAMP NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE,
    FOREIGN KEY (achievement_id) REFERENCES achievements (id) ON DELETE CASCADE
);