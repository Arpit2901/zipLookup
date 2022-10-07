package com.bhavna.SpringMvc.Demo2MavenSpring.repo;

import java.util.List;

import com.bhavna.SpringMvc.Demo2MavenSpring.domain.Member;

public interface MemberDao
{
    public Member findById(Long id);

    public Member findByEmail(String email);

    public List<Member> findAllOrderedByName();

    public void register(Member member);
}
