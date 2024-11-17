package com.example.business.repository;
import com.example.business.domain.Member;
import java.util.*;
public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
