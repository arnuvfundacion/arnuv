package com.core.arnuv.service;

import java.util.List;

import com.core.arnuv.model.Tarifario;

public interface ITarifarioService {
	List<Tarifario> listarTarifarios();

	List<Tarifario> buscarPorEstado(Boolean estado);

	public Tarifario insertarTarifario(Tarifario data);

	public Tarifario actualizarTarifario(Tarifario data);

	public Tarifario buscarPorId(int id);

	public boolean eliminarTarifario(int id);
}
