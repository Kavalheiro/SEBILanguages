package com.octavio.sebi_languages.web.dto.mapper;

import com.octavio.sebi_languages.entity.Cliente;
import com.octavio.sebi_languages.web.dto.ClienteCreateDto;
import com.octavio.sebi_languages.web.dto.ClienteResponseDto;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@NoArgsConstructor(access = AccessLevel.PRIVATE) // AccessLevel.PRIVATE é para garantir que a classe não seja instanciada
public class ClienteMapper {

    public static Cliente toCliente(ClienteCreateDto dto) {
        return new ModelMapper().map(dto, Cliente.class);
    }

    public static ClienteResponseDto toDto(Cliente cliente) {
        return new ModelMapper().map(cliente, ClienteResponseDto.class);
    }
}