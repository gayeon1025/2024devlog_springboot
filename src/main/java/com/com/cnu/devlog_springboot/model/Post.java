package com.com.cnu.devlog_springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@Entity(name = "posts")
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
public class Post {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Integer id;
        String title;
        String contents;
}
