package repository;

import modules.Song;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
@Service
public interface SongRepository extends CrudRepository<Song, Long> {
}
