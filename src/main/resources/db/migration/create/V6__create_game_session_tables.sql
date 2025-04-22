CREATE TABLE IF NOT EXISTS drug_and_drop_sessions
(
    id         uuid PRIMARY KEY,
    user_id    BIGINT                NOT NULL,
    completed  BOOLEAN DEFAULT FALSE NOT NULL,
    start_time TIMESTAMP             NOT NULL,
    end_time   TIMESTAMP,
    theme_name VARCHAR(255)          NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS drug_and_drop_session_words
(
    drug_and_drop_session_id uuid,
    word_id                  BIGINT,
    PRIMARY KEY (drug_and_drop_session_id, word_id),
    FOREIGN KEY (drug_and_drop_session_id) REFERENCES drug_and_drop_sessions (id) ON DELETE CASCADE,
    FOREIGN KEY (word_id) REFERENCES words (id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS quiz_sessions
(
    id           uuid PRIMARY KEY,
    user_id      BIGINT                NOT NULL,
    correct_word VARCHAR(255)          NOT NULL,
    completed    BOOLEAN DEFAULT FALSE NOT NULL,
    start_time   TIMESTAMP             NOT NULL,
    end_time     TIMESTAMP,
    theme_name   VARCHAR(255)          NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS quiz_session_options
(
    quiz_session_id UUID,
    options         TEXT,
    PRIMARY KEY (quiz_session_id, options),
    FOREIGN KEY (quiz_session_id) REFERENCES quiz_sessions (id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS sentence_sessions
(
    id                uuid PRIMARY KEY,
    user_id           BIGINT                NOT NULL,
    original_sentence TEXT                  NOT NULL,
    completed         BOOLEAN DEFAULT FALSE NOT NULL,
    start_time        TIMESTAMP             NOT NULL,
    end_time          TIMESTAMP,
    theme_name        VARCHAR(255)          NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS sentence_session_shuffled_words
(
    sentence_session_id UUID,
    shuffled_words      VARCHAR(255),
    PRIMARY KEY (sentence_session_id, shuffled_words),
    FOREIGN KEY (sentence_session_id) REFERENCES sentence_sessions (id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS typing_sessions
(
    id             uuid PRIMARY KEY,
    user_id        BIGINT                NOT NULL,
    word_id        BIGINT                NOT NULL,
    image_url      VARCHAR(255),
    correct_answer VARCHAR(255)          NOT NULL,
    completed      BOOLEAN DEFAULT FALSE NOT NULL,
    start_time     TIMESTAMP             NOT NULL,
    end_time       TIMESTAMP,
    theme_name     VARCHAR(255)          NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE
)