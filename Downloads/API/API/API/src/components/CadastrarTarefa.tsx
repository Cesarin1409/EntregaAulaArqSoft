import React, { useState, useEffect } from 'react';
import axios from 'axios';

const CadastrarTarefa: React.FC = () => {
  const [nome, setNome] = useState('');
  const [descricao, setDescricao] = useState('');
  const [categoriaId, setCategoriaId] = useState(0);

  useEffect(() => {
    async function fetchCategorias() {
      const response = await axios.get('/api/categoria/listar');
      // Aqui você pode implementar a lógica para usar as categorias na UI, se necessário
    }
    fetchCategorias();
  }, []);

  const handleSubmit = async (e: React.FormEvent) => {
    e.preventDefault();
    const novaTarefa = {
      nome: nome,
      descricao: descricao,
      categoriaId: categoriaId
    };
    await axios.post('/api/tarefa/cadastrar', novaTarefa);
    alert('Tarefa cadastrada com sucesso!');
    setNome('');
    setDescricao('');
    setCategoriaId(0);
  };

  return (
    <div>
      <h2>Cadastrar Tarefa</h2>
      <form onSubmit={handleSubmit}>
        <label>
          Nome:
          <input type="text" value={nome} onChange={(e) => setNome(e.target.value)} />
        </label>
        <br />
        <label>
          Descrição:
          <textarea value={descricao} onChange={(e) => setDescricao(e.target.value)} />
        </label>
        <br />
        <label>
          Categoria:
          {/* Implemente um dropdown ou select aqui para selecionar a categoria */}
        </label>
        <br />
        <button type="submit">Cadastrar</button>
      </form>
    </div>
  );
};

export default CadastrarTarefa;