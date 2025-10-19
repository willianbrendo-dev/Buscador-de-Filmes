<div align="center">

# 🎬 Buscador de Filmes

<p align="center">
  <img src="https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java 17+">
  <img src="https://img.shields.io/badge/API-OMDb-F5C518?style=for-the-badge&logo=imdb&logoColor=black" alt="API OMDb">
  <img src="https://img.shields.io/badge/Status-Concluído-4CAF50?style=for-the-badge" alt="Status Concluído">
  <img src="https://img.shields.io/badge/Gson-Library-2196F3?style=for-the-badge" alt="Gson">
</p>

<p align="center">
  <strong>Seu assistente pessoal para descobrir tudo sobre seus filmes favoritos! 🍿</strong>
</p>

<p align="center">
  Aplicativo de console que consome a <strong>OMDb API</strong> para buscar informações detalhadas sobre qualquer filme em tempo real.
</p>

</div>

---

## 📖 Sobre o Projeto

O **Buscador de Filmes** é uma aplicação de console desenvolvida em **Java puro**, criada como projeto de portfólio para demonstrar habilidades em:

- 🌐 Consumo de APIs REST
- 📦 Desserialização de JSON com Gson
- 🎯 Organização de código com arquitetura em camadas
- ✨ Uso de recursos modernos do Java (Records)
- 🛡️ Tratamento de exceções e validações

O projeto permite que você busque **qualquer filme** e receba uma ficha técnica completa com informações do IMDb, Rotten Tomatoes e muito mais!

---

## ✨ Funcionalidades

<table>
<tr>
<td width="50%">

### 🎯 Recursos Principais
- ✅ **Menu Interativo** no console
- ✅ **Busca em Tempo Real** via OMDb API
- ✅ **Tratamento Inteligente** de nomes compostos
- ✅ **Codificação Automática** de URLs
- ✅ **Exibição Formatada** de resultados

</td>
<td width="50%">

### 📊 Informações Exibidas
- 🎭 Título, Ano e Gênero
- ⏱️ Duração do filme
- 🎬 Diretor e Elenco
- 📝 Sinopse completa
- ⭐ Avaliações IMDb e Rotten Tomatoes

</td>
</tr>
</table>

---

## 💻 Demonstração

### Exemplo de Busca

```plaintext
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
🎬 BUSCADOR DE FILMES - OMDb API
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

Digite o nome do filme para busca (ou '0' para sair): Inception

╔═══════════════════════════════════════════════════════════╗
║                    FICHA TÉCNICA                          ║
╚═══════════════════════════════════════════════════════════╝

🎬 Filme: Inception (2010)
🎭 Gênero: Action, Adventure, Sci-Fi
⏱️  Duração: 148 min

─────────────────────────────────────────────────────────────
👤 Diretor: Christopher Nolan
🎭 Atores: Leonardo DiCaprio, Joseph Gordon-Levitt, Elliot Page
─────────────────────────────────────────────────────────────

📝 Sinopse:
A thief who steals corporate secrets through the use of 
dream-sharing technology is given the inverse task of planting 
an idea into the mind of a C.E.O., but his tragic past may 
doom the project and his team to disaster.

─────────────────────────────────────────────────────────────
⭐ Avaliações:
  • IMDb: 8.8/10
  • Rotten Tomatoes: 87%
═════════════════════════════════════════════════════════════

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
Digite o nome do filme para busca (ou '0' para sair): 0

✅ Programa finalizado. Volte sempre! 🎬
```

---

## 🛠️ Tecnologias Utilizadas

```text
☕ Java 17+              → Linguagem base com Records
📦 Gson (Google)         → Desserialização de JSON
🌐 Java HTTP Client      → Requisições HTTP nativas
🎬 OMDb API              → Base de dados de filmes
```

---

## 📁 Estrutura do Projeto

```plaintext
BuscadorDeFilmes/
│
├── 📂 src/
│   ├── 📂 http/
│   │   └── 📄 ClienteHttp.java       # Comunicação com a API
│   │
│   ├── 📂 modelo/
│   │   ├── 📄 FilmeInfo.java         # Record dos dados do filme
│   │   └── 📄 Rating.java            # Record das avaliações
│   │
│   ├── 📂 principal/
│   │   └── 📄 Principal.java         # Menu e orquestração
│   │
│   └── 📂 util/
│       └── (Reservado para utilitários futuros)
│
└── 📄 README.md                       # Documentação
```

---

## 🚀 Como Executar

### ⚙️ Pré-requisitos

- ☕ **Java JDK 17** (ou superior)
- 📦 **Biblioteca Gson** (JAR ou Maven/Gradle)
- 🔑 **API Key da OMDb** (gratuita)

---

### 🔑 Configuração da API Key

#### 1️⃣ Obtenha sua chave gratuita

Acesse [OMDb API Key](http://www.omdbapi.com/apikey.aspx) e registre-se para receber sua chave.

#### 2️⃣ Configure no projeto

Abra o arquivo `src/principal/Principal.java` e insira sua chave:

```java
// Localize esta linha:
String suaApiKey = "SUA_CHAVE_VEM_AQUI"; // ← Cole sua chave aqui

// Exemplo:
String suaApiKey = "a1b2c3d4"; 
String url = "http://www.omdbapi.com/?t=" + buscaCodificada + "&apikey=" + suaApiKey;
```

---

### 📥 Instalação

#### Via IDE (IntelliJ, Eclipse, VS Code)

```bash
# 1. Clone o repositório
git clone https://github.com/seu-usuario/buscador-filmes.git
cd buscador-filmes

# 2. Abra na sua IDE favorita

# 3. Adicione o JAR do Gson ao classpath (se não usar Maven)

# 4. Execute Principal.java
```

#### Via Maven (opcional)

Se preferir usar Maven, adicione ao `pom.xml`:

```xml
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.10.1</version>
</dependency>
```

---

## 🎯 Como Usar

1. **Execute** o programa
2. **Digite** o nome do filme que deseja buscar
3. **Visualize** a ficha técnica completa
4. **Digite '0'** para sair do programa

### 💡 Dicas

- Funciona com **títulos em inglês** (base OMDb)
- Aceita **nomes compostos** (ex: "Meu Malvado Favorito")
- **Codificação automática** de caracteres especiais

---

## 🎨 Exemplo de Uso

```java
// Buscar informações de um filme
System.out.print("Digite o nome do filme: ");
String nomeFilme = scanner.nextLine();

// O sistema automaticamente:
// 1. Codifica o nome para URL
// 2. Faz a requisição à API
// 3. Desserializa o JSON
// 4. Exibe a ficha formatada
```

---

## 📝 Possíveis Melhorias

- [ ] Implementar busca por **ano** ou **ID do IMDb**
- [ ] Adicionar cache local para **reduzir requisições**
- [ ] Criar **histórico de buscas** persistente
- [ ] Implementar busca por **séries de TV**
- [ ] Adicionar **interface gráfica** (JavaFX/Swing)
- [ ] Exportar fichas em **PDF** ou **JSON**
- [ ] Suporte a **múltiplos idiomas**
- [ ] Adicionar **favoritos** do usuário

---

## 🐛 Tratamento de Erros

O sistema lida com:

- ✅ Filmes não encontrados
- ✅ Erros de conexão com a API
- ✅ Entrada inválida do usuário
- ✅ JSON malformado
- ✅ Timeout de requisições

---

## 📄 Licença

Este projeto está sob a licença **MIT**. Você pode usar, modificar e distribuir livremente.

---

## 🤝 Contribuindo

Contribuições são bem-vindas! Sinta-se livre para:

1. Fazer um **fork** do projeto
2. Criar uma **branch** para sua feature (`git checkout -b feature/nova-feature`)
3. **Commitar** suas mudanças (`git commit -m 'Adiciona nova feature'`)
4. Fazer **push** para a branch (`git push origin feature/nova-feature`)
5. Abrir um **Pull Request**

---

## 👨‍💻 Autor

<div align="center">

**Willian Brendo**

Desenvolvedor Back-End Java

[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/willianbrendo-dev)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](www.linkedin.com/in/willian-brendo-alves-batista)
[![Email](https://img.shields.io/badge/Email-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:willianbrendo.dev@gmail.com)

---

<p align="center">
  <em>Feito com ❤️ e ☕ para estudos e portfólio</em>
</p>

<p align="center">
  ⭐ Se este projeto te ajudou, considere dar uma estrela!
</p>

</div>

---

## 📚 Recursos Adicionais

- 📖 [Documentação OMDb API](http://www.omdbapi.com/)
- 📖 [Documentação Gson](https://github.com/google/gson)
- 📖 [Java HTTP Client Guide](https://docs.oracle.com/en/java/javase/17/docs/api/java.net.http/java/net/http/HttpClient.html)
- 📖 [Java Records Tutorial](https://docs.oracle.com/en/java/javase/17/language/records.html)

---

<div align="center">

### 🎬 Happy Coding! 🍿

</div>
