package com.robsonbittencourt.demoacmeap.repository;

import com.robsonbittencourt.demoacmeap.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    public Optional<Cliente> findByCpf(String cpf);

}