# To-do List - Java/Spring Boot

O projeto consiste no desenvolvimento do backend de uma API para uma aplicação de lista de tarefas (To-do List). Esta API permite operações como:

- Cadastro de usuários
- Registro de tarefas associadas a esses usuários
- Listagem de tarefas e
- Modificação das tarefas conforme o usuário.

As tecnologias e recursos empregados durante o desenvolvimento incluem Java, SpringBoot, H2Database, Lombok, e outras ferramentas.


## HTTP Requests

### Create User

> **POST**: https://todolist-m9qj.onrender.com/users/

```
{
    "name": "Aylmer Bolzan",
    "username": "aylmerbolzan",
    "password": "123456"
}
```


### Create Task

> **POST**: https://todolist-m9qj.onrender.com/tasks/

```
{
    "description": "Montar README.md do projeto 'To-do List - Java/Spring Boot'",
    "title": "To-do List - Java",
    "priority": "ALTA",
    "startAt": "2023-10-20T08:00:00",
    "endAt": "2023-10-21T12:00:00"
}

```
*`• Necessário autenticar o usuário.`*

### Update Task

> **PUT**: https://todolist-m9qj.onrender.com/tasks/{id}

```
{
    "title": "To-do List - Java & SpringBoot"
}
```
*`• Necessário autenticar o usuário.`*

### Get Tasks List

> **GET**: https://todolist-m9qj.onrender.com/tasks/

*`• Necessário autenticar o usuário.`*
