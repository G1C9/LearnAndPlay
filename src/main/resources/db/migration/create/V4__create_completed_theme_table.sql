CREATE TABLE IF NOT EXISTS completed_theme
(
    id           BIGSERIAL PRIMARY KEY,
    user_id      BIGINT    NOT NULL,
    theme_name   VARCHAR(255) NOT NULL,
    completed_at TIMESTAMP    NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE
);