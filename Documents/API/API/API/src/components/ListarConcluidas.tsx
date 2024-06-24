import React, { useEffect, useState } from 'react';
import axios from 'axios';

const ListarConcluidas: React.FC = () => {
  const [tarefas, setTarefas] = useState<any[]>([]);

  useEffect(() => {
    async function fetchTarefasConcluidas() {
      const response = await axios.get('/api/tarefa/concluidas');
      setTarefas(response.data);
    }
    fetchTarefasConcluidas();
  }, []);

  return (
    <div>
      <h2>Listar Tarefas Concluídas</h2>
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

export default ListarConcluidas;