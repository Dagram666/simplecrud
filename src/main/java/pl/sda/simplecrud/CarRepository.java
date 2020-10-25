package pl.sda.simplecrud;

import org.springframework.data.jpa.repository.JpaRepository;

interface CarRepositor extends JpaRepository<Car , Integer> {}
