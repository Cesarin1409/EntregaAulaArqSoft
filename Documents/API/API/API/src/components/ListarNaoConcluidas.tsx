import React, { useEffect, useState } from 'react';
import axios from 'axios';

const ListarNaoConcluidas: React.FC = () => {
  const [tarefas, setTarefas] = useState<any[]>([]);

  useEffect(() => {
    async function fetchTarefasNaoConcluidas() {
      const response = await axios.get('/api/tarefa/naoconcluidas');
      setTarefas(response.data);
    }
    fetchTarefasNaoConcluidas();
  }, []);

  return (
    <div>
      <h2>Listar Tarefas Não Concluídas</h2>
      <table>
        <thead>
          <tr>
            <th>ID</th>
            <th>Nome</th>
            <th>Descrição</th>
            <th>Status</th>
            <th>Categoria</th>
          </tr>
        </thead>
        <tbody>
          {tarefas.map((tarefa) => (
            <tr key={tarefa.id}>
              <td>{tarefa.id}</td>
              <td>{tarefa.nome}</td>
              <td>{tarefa.descricao}</td>
              <td>{tarefa.status}</td>
              <td>{tarefa.categoria.nome}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default ListarNaoConcluidas;