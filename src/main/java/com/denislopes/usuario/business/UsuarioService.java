package com.denislopes.usuario.business;

import com.denislopes.usuario.business.converter.UsuarioConverter;
import com.denislopes.usuario.business.dto.UsuarioDTO;
import com.denislopes.usuario.infrastructure.entity.Usuario;
import com.denislopes.usuario.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioConverter usuarioConverter;

    public UsuarioDTO salvaUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuario = usuarioConverter.paraUsuario(usuarioDTO);
        return usuarioConverter.paraUsuarioDTO(usuarioRepository.save(usuario));
    }
}
