package com.wesley.cursojavaloiane;

public interface BancoDados extends SqlDCL, SqlDML, SqlDDL {

    void abrirConexao();
    void fecharConexao();
}
