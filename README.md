<div style="text-align:center">

[![img](/assets/header.png)](https://github.com/rocketseat-education)

# ToDoList - Java/Spring Boot</div>

Curso gratuito de Java oferecido pela [Rocketseat](https://github.com/rocketseat-education), entre os dias 9 e 13 de Outubro de 2023.

O projeto é o backend de uma API de uma ToDoList, onde é possível cadastrar um usuário, cadastrar tarefas relacionadas ao usuário, listar e alterar as tarefas por usuário.

Algumas das tecnologias e recursos utilizados foram Java, SpringBoot, H2Database, Lombok, entre outros.

A API está disponível no endereço https://todolist-m9qj.onrender.com/


## HTTP Requests

### Create User

> POST: https://todolist-m9qj.onrender.com/users/

```
{
    "name": "Aylmer Bolzan",
    "username": "aylmerbolzan",
    "password": "123456"
}
```


### Create Task

> POST: https://todolist-m9qj.onrender.com/tasks/

```
{
    "description": "Montar README.md do projeto 'ToDoList - Java/Spring Boot'",
    "title": "ToDoList - Java",
    "priority": "ALTA",
    "startAt": "2023-10-20T08:00:00",
    "endAt": "2023-10-21T12:00:00"
}

```

### Update Task

> PUT: https://todolist-m9qj.onrender.com/tasks/{id}

```
{
    "title": "Todolist - Java & RocketSeat"
}

```

### Get Tasks List

> GET: https://todolist-m9qj.onrender.com/tasks/