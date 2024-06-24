import React, { useState } from 'react';
import axios from 'axios';

const AlterarTarefa: React.FC = () => {
  const [id, setId] = useState('');
  const [status, setStatus] = useState('');

  const handleSubmit = async (e: React.FormEvent) => {
    e.preventDefault();
    await axios.patch(/api/AlterarTarefa?id=${id});
    alert('Status da tarefa alterado com sucesso!');
    setId('');
    setStatus('');
  };

  return (
    <div>
      <h2>Alterar Tarefa</h2>
      <form onSubmit={handleSubmit}>
        <label>
          ID da Tarefa:
          <input type="text" value={id} onChange={(e) => setId(e.target.value)} />
        </label>
        <br />
        <button type="submit">Alterar Status</button>
      </form>
    </div>
  );
};

export default AlterarTarefa;