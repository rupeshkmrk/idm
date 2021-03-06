package com.happiestminds.internal.idm.dataaccess.repository;

import com.happiestminds.internal.idm.dataaccess.entities.UserActivationKey;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserActivationKeyRepository extends CrudRepository<UserActivationKey, Long> {
}
