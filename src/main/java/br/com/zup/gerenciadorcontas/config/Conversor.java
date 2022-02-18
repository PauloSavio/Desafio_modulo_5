package br.com.zup.gerenciadorcontas.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Conversor {

    @Bean
    public ModelMapper modelMapper(){
        return  new ModelMapper();
    }
}