package repositories;
import models.SourceModel;
import org.springframework.data.repository.CrudRepository;

public interface SourceRepository extends CrudRepository<SourceModel, Long>
{
}