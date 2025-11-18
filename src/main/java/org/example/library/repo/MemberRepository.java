package org.example.library.repo;

import java.util.Optional;
import org.example.library.model.Member

public interface MemberRepository {
    Optional<Member> findById(String id);
    void save(Member member);
}
