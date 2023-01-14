package com.cbu.backend.authaccount.query.service;

import com.cbu.backend.authaccount.command.domain.AuthAccount;
import com.cbu.backend.authaccount.query.infra.AuthAccountDao;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.security.Principal;
import java.util.Collection;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AuthAccountQueryService {
    private final AuthAccountDao authAccountDao;

    public AuthAccount getLoginUser(Principal principal) {
        return getByUUID(UUID.fromString(principal.getName()));
    }

    public Collection<? extends GrantedAuthority> getAuthority(UUID id) {
        AuthAccount account = getByUUID(id);
        return account.getRole();
    }

    private AuthAccount getByUUID(UUID id) {
        return authAccountDao.findById_Id(id)
                .orElseThrow(EntityNotFoundException::new);
    }
}