/**
 * 
 */
package net.brilliance.repository.auth;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import net.brilliance.domain.entity.admin.Authority;
import net.brilliance.framework.repository.JBaseRepository;

/**
 * @author ducbq
 *
 */
@Repository
public interface AuthorityRepository extends JBaseRepository<Authority, Long> {
	Optional<Authority> findByName(String name);
}
