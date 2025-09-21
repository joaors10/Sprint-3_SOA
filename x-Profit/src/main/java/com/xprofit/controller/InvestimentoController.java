package com.xprofit.controller;

import com.xprofit.dto.InvestimentoDTO;
import com.xprofit.service.InvestimentoService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/investimentos")
public class InvestimentoController {

    private final InvestimentoService investimentoService;

    public InvestimentoController(InvestimentoService investimentoService) {
        this.investimentoService = investimentoService;
    }

    @PostMapping
    public ResponseEntity<InvestimentoDTO> criar(@Valid @RequestBody InvestimentoDTO dto) {
        return ResponseEntity.ok(investimentoService.salvar(dto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<InvestimentoDTO> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(investimentoService.buscarPorId(id));
    }

    @GetMapping
    public ResponseEntity<List<InvestimentoDTO>> listarTodos() {
        return ResponseEntity.ok(investimentoService.listarTodos());
    }

    @PutMapping("/{id}")
    public ResponseEntity<InvestimentoDTO> atualizar(@PathVariable Long id, @Valid @RequestBody InvestimentoDTO dto) {
        return ResponseEntity.ok(investimentoService.atualizar(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        investimentoService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
