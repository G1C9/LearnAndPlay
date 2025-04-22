CREATE TABLE IF NOT EXISTS words
(
    id          BIGSERIAL PRIMARY KEY,
    word        VARCHAR(255) NOT NULL,
    translation VARCHAR(255) NOT NULL,
    image_url   VARCHAR(255),
    theme_id    BIGINT    NOT NULL,
    FOREIGN KEY (theme_id) REFERENCES themes (id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS sentences
(
    id       BIGSERIAL PRIMARY KEY,
    text     TEXT      NOT NULL,
    theme_id BIGINT NOT NULL,
    FOREIGN KEY (theme_id) REFERENCES themes (id) ON DELETE CASCADE
)