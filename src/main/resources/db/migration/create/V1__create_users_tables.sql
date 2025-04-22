CREATE TABLE IF NOT EXISTS users
(
    id            BIGSERIAL PRIMARY KEY,
    user_name     VARCHAR(255)        NOT NULL,
    login         VARCHAR(255) UNIQUE NOT NULL,
    password      VARCHAR(255)        NOT NULL,
    refresh_token VARCHAR(255),
    level         INT DEFAULT 1       NOT NULL
);

CREATE TABLE IF NOT EXISTS user_roles
(
    user_id BIGINT    NOT NULL,
    role    VARCHAR(255) NOT NULL,
    PRIMARY KEY (user_id, role),
    FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE
);

