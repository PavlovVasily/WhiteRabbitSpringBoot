CREATE TABLE `trustmeenglish`.`users`
(
    `id`       BIGINT(20)  NOT NULL AUTO_INCREMENT,
    `email`    VARCHAR(45) NOT NULL,
    `password` VARCHAR(45) NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE
);

INSERT INTO trustmeenglish.users (email, password)
VALUES ('abc@mail.ru', '12345');
INSERT INTO trustmeenglish.users (email, password)
VALUES ('cba@mail.ru', '54321');

CREATE TABLE `trustmeenglish`.`roles`
(
    `id`   BIGINT(20)  NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(45) NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `name_UNIQUE` (`name` ASC) VISIBLE
);

CREATE TABLE `trustmeenglish`.`users_roles`
(
    `user_id` BIGINT(20) NOT NULL,
    `role_id` BIGINT(20) NOT NULL,
    INDEX `fk_users_idx` (`user_id` ASC) VISIBLE,
    INDEX `fk_roles_idx` (`role_id` ASC) VISIBLE,
    CONSTRAINT `fk_users`
        FOREIGN KEY (`user_id`)
            REFERENCES `trustmeenglish`.`users` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION,
    CONSTRAINT `fk_roles`
        FOREIGN KEY (`role_id`)
            REFERENCES `trustmeenglish`.`roles` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION
);

INSERT INTO `trustmeenglish`.`roles` (`name`)
VALUES ('USER');
INSERT INTO `trustmeenglish`.`roles` (`name`)
VALUES ('MANAGER');
INSERT INTO `trustmeenglish`.`roles` (`name`)
VALUES ('ADMIN');

INSERT INTO `trustmeenglish`.`users_roles` (`user_id`, `role_id`)
VALUES ('1', '1');

CREATE TABLE `trustmeenglish`.`en_words`
(
    `id`      BIGINT(20)  NOT NULL AUTO_INCREMENT,
    `meaning` VARCHAR(45) NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `meaning_UNIQUE` (`meaning` ASC) VISIBLE
);

CREATE TABLE `trustmeenglish`.`ru_words`
(
    `id`      BIGINT(20)  NOT NULL AUTO_INCREMENT,
    `meaning` VARCHAR(45) NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `meaning_UNIQUE` (`meaning` ASC) VISIBLE
);

CREATE TABLE `trustmeenglish`.`cards`
(
    `id`         BIGINT(20) NOT NULL AUTO_INCREMENT,
    `en_word_id` BIGINT(20) NOT NULL,
    `ru_word_id` BIGINT(20) NOT NULL,
    `rating`     BIGINT(20) NULL,
    PRIMARY KEY (`id`),
    INDEX `fk_en_word_idx` (`en_word_id` ASC) VISIBLE,
    INDEX `fk_ru_word_idx` (`ru_word_id` ASC) VISIBLE,
    CONSTRAINT `fk_en_word`
        FOREIGN KEY (`en_word_id`)
            REFERENCES `trustmeenglish`.`en_words` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION,
    CONSTRAINT `fk_ru_word`
        FOREIGN KEY (`ru_word_id`)
            REFERENCES `trustmeenglish`.`ru_words` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION
);

INSERT INTO `trustmeenglish`.`en_words` (meaning) VALUES ('hello');
INSERT INTO `trustmeenglish`.`ru_words` (meaning) VALUES ('привет');
INSERT INTO `trustmeenglish`.`cards` (en_word_id, ru_word_id, rating) VALUES ('1', '1', '1');


