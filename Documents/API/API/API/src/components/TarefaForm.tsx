import React, { useState } from 'react';


const TarefaForm = () => {
    const [titulo, setTitulo] = useState('');
    const [descricao, setDescricao] = useState('');
    const [categoriaId, setCategoriaId] = useState('');

    const handleSubmit = async (event) => {
        event.preventDefault();

        const novaTarefa = {
            titulo,
            descricao,
            categoriaId,
        };

        try {
            const response = await fetch('http://localhost:5273/tarefas/cadastrar', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json',
                },
                body: JSON.stringify(novaTarefa),
            });

            if (response.ok) {
                alert('Tarefa cadastrada com sucesso!');
                setTitulo('');
                setDescricao('');
                setCategoriaId('');
            } else {
                alert('Erro ao cadastrar tarefa');
            }
        } catch (error) {
            console.error('Erro ao cadastrar tarefa:', error);
            alert('Erro ao cadastrar tarefa');
        }
    };

    return (
        <div>
            <h2>Cadastrar Nova Tarefa</h2>
            <form onSubmit={handleSubmit}>
                <div>
                    <label>Título:</label>
                    <input
                        type="text"
                        value={titulo}
                        onChange={(e) => setTitulo(e.target.value)}
                        required
                    />
                </div>
                <div>
                    <label>Descrição:</label>
                    <textarea
                        value={descricao}
                        onChange={(e) => setDescricao(e.target.value)}
                        required
                    ></textarea>
                </div>
                <div>
                    <label>Categoria ID:</label>
                    <input
                        type="text"
                        value={categoriaId}
                        onChange={(e) => setCategoriaId(e.target.value)}
                        required
                    />
                </div>
                <button type="submit">Cadastrar</button>
            </form>
        </div>
    );
};

export default TarefaForm;