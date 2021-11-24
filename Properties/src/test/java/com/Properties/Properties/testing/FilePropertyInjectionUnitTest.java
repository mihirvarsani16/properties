package com.Properties.Properties.testing;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource("/bar.properties")
@TestPropertySource("/foo.properties")

// @TestPropertySource(properties = { "bar=foo" })
public class FilePropertyInjectionUnitTest {

    // @Value("${database.username}")
    // private String foo;

    @Value("${bar-database.url}")
    private String bar;

    @Value("${foo-database.url}")
    private String foo;

    @Test
    void test() {
        assertThat(bar).isEqualTo(foo);

    }

    @BeforeEach
    void setUp() {
        System.out.println("setting up");
    }

    @AfterEach
    void tearDown() {
        System.out.println("tearing down");
        // Long id = (long) 19;
        // this.bookRepository.deleteById(id);
    }
}
