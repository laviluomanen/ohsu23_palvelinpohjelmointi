package eventRegister;


import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Categories, Long> {
}