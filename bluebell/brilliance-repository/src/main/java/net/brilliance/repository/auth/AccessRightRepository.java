/**
 * 
 */
package net.brilliance.repository.auth;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import net.brilliance.domain.entity.security.AccessRight;
import net.brilliance.framework.repository.JBaseRepository;

/**
 * @author ducbq
 *
 */
@Repository
public interface AccessRightRepository extends JBaseRepository<AccessRight, Long> {
	Optional<AccessRight> findByName(String name);
}
