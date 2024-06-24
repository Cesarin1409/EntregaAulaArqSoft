import React, { useEffect, useState } from 'react';
import axios from 'axios';

const ListarTarefas: React.FC = () => {
  const [tarefas, setTarefas] = useState<any[]>([]);

  useEffect(() => {
    async function fetchTarefas() {
      const response = await axios.get('/api/tarefa/listar');
      setTarefas(response.data);
    }
    fetchTarefas();
  }, []);

  return (
    <div>
      <h2>Listar Tarefas</h2>
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

export default ListarTarefas;