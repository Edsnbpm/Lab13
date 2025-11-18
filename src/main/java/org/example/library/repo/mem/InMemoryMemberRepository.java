package org.example.library.repo.mem;

import org.example.library.model.Member;
import org.example.library.repo.MemberRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class InMemoryMemberRepository implements MemberRepository {
    private final Map<String, Member> data = new HashMap<>();

    @Override
    public Optional<Member> findById(String id) {
        return Optional.ofNullable(data.get(id));
    }

    @Override
    public void save(Member member) {
        data.put(member.getId(), member);
    }
}
