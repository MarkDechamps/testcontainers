package be.md;

import be.md.Person;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@SpringBootTest
@ActiveProfiles("it")
@Transactional
class PersonTest {

    @PersistenceContext
    private EntityManager entityManager;

    @Test
    public void shouldBeStored() {
        entityManager.persist(new Person());
    }

}
