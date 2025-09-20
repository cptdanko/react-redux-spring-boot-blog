# 📝 Blog Engine – React + Spring Boot  

A **full-stack blogging platform** built with modern technologies:

- **Frontend**: React 18 + Redux for state management  
- **Backend**: Java 21 + Spring Boot 3.4 + H2 in-memory database  
- **CI/CD**: Automated builds & tests with GitHub Actions  

This project demonstrates a clean separation of concerns, easy local development, and out-of-the-box CI/CD for hobby projects or learning full-stack development.

---

## ✨ Features

- 📰 **View posts** – List of blog posts with title, author, date, and content  
- ✍️ **Create/edit posts** – (coming soon) Create new posts and edit existing ones  
- 🗑️ **Delete posts** – Remove posts with a single click  
- 🔄 **Redux-powered state management** – Global store for posts  
- ⚡ **Instant backend** – Spring Boot REST API with H2 database  
- ✅ **Continuous Integration** – Automatically build and test with every push via GitHub Actions  

---

## 📂 Project Structure

```

root/
├── blog-frontend/   # React + Redux frontend
└── blog-backend/    # Java 21 Spring Boot backend

````

---

## 🚀 Getting Started

### 1. Clone or Fork

```bash
git clone https://github.com/<your-username>/<your-repo>.git
cd <your-repo>


Or click **Fork** on GitHub to make your own copy and experiment freely.

---

### 2. Start the Backend (Spring Boot)

```bash
cd blog-backend
./mvnw spring-boot:run
```

This runs the backend on `http://localhost:8080` with an H2 in-memory database (no setup needed).
Open `http://localhost:8080/h2-console` to inspect the DB.

---

### 3. Start the Frontend (React + Redux)

```bash
cd blog-frontend
npm install
npm start
```

This runs the frontend on `http://localhost:3000` and proxies API calls to the backend automatically.

---

## ⚙️ Technologies Used

| Layer        | Tech Stack                                                      |
| ------------ | --------------------------------------------------------------- |
| **Frontend** | React 18, Redux 5, React Router 6, Jest + React Testing Library |
| **Backend**  | Java 21, Spring Boot 3.4, Spring Data JPA, H2 Database          |
| **CI/CD**    | GitHub Actions (build & test pipelines for frontend + backend)  |

---

## 🛠️ Running Tests

### Frontend tests

```bash
cd blog-frontend
npm test
```

### Backend tests

```bash
cd blog-backend
./mvnw test
```

All tests run automatically on every push via GitHub Actions.

---

## 📸 Screenshots

| List of Posts                               | View/Edit Post                         |
| ------------------------------------------- | -------------------------------------- |
| ![List of posts screenshot](docs/posts.png) | ![View post screenshot](docs/view.png) |

---

## 🤝 Contributing

Contributions, forks, and issues are welcome!

* 🍴 **Fork** this repository to add your own features
* 🔧 Open a **Pull Request** if you improve the code
* 🐛 Create an **Issue** for bug reports or ideas

This project is perfect for learning React + Redux on the frontend and Spring Boot on the backend.

---

## 🗺️ Roadmap

* ✅ View posts
* ✍️ Add create/edit post functionality
* 🔐 Add authentication (JWT)
* 🚀 Deploy demo automatically with GitHub Pages & Render/Heroku

---

## 📜 License

This project is released under the [MIT License](LICENSE) – you’re free to use, modify, and distribute it.

---

### ⭐ If you find this useful, **star** the repo on GitHub and share it!

Fork it, break it, improve it – and learn full-stack development while you’re at it.

```

Would you like me to also generate the **GitHub Actions workflow YAML** files for both the frontend and backend to go along with this README?
```



Have a read of the blogposts written to support this repository.

**https://mydaytodo.com/build-blog-engine-with-react-spring-boot-1/**

**https://mydaytodo.com/build-blog-engine-with-react-spring-boot-2/**

**https://mydaytodo.com/build-blog-engine-with-react-spring-boot-3/**

## Tutorials

Have a read of some of the tutorials with code samples on my blog,

- [Call Rest API with Spring WebClient]
- [Jokes API with Spring RestTemplate]
- [AWS DynamoDB how to] (NodeJS/Express & Typescript)
- [AWS DynamoDB query by non-primary] (NodeJS/Express & Typescript)

and you can find more at https://www.mydaytodo.com/blog/

# More great tutorials and code samples

I will be writing a detailed tutorial on how to work with this repo on my blog. Until then refer to [my blog] for other
tutorials and "how-to" articles with detailed code samples.

Until next time, live long and prosper!


[How to Catch ExpiredJwtException in Spring OncePerRequestFilter]: https://mydaytodo.com/how-to-catch-expiredjwtexception-in-spring-onceperrequestfilter/

[Upload to AWS S3 bucket from Java Spring Boot app]: https://mydaytodo.com/upload-to-aws-s3-bucket-from-java-spring-boot-app/

[File share app - social file share feature]: https://mydaytodo.com/epic-social-file-share-feature/

[How to build a Spring Boot API with reactjs frontend]: https://mydaytodo.com/spring-boot-api-with-reactjs/

[Jokes API with Spring RestTemplate]: https://mydaytodo.com/how-to-build-a-jokes-client-in-java-spring-boot-with-resttemplate/

[Call Rest API with Spring WebClient]: https://mydaytodo.com/how-to-call-rest-api-with-webclient/

[Node Typescript CRUD Notes]: https://github.com/cptdanko/node_typescript_crud_notes

[AWS DynamoDB query by non-primary]: https://mydaytodo.com/how-to-query-dynamodb-with-non-primary-key-column/

[AWS DynamoDB how to]: https://mydaytodo.com/aws-dynamodb-typescript-how-to/

[frontend in the repo]: https://github.com/cptdanko/react_typescript_todo_list

[native iOS app]: https://apps.apple.com/au/app/my-day-to-do-smart-task-list/id1020072048

[line 16]: https://github.com/cptdanko/nodetypescriptcrudnotes/blob/main/src/db.ts#L16

[my blog]: https://mydaytodo.com/blog/

[line 17]: https://github.com/cptdanko/nodetypescriptcrudnotes/blob/main/src/db.ts#L17

[AWS docs]: https://docs.aws.amazon.com/cli/latest/userguide/cli-configure-envvars.html
