# API REST - París: Lugares Turísticos y Platos Típicos 
## Hecho por Alejandra Botín Lehm

Este proyecto implementa una API REST con Spring Boot para gestionar:
- Lugares turísticos de París 🏛️
- Platos típicos parisinos 🍽️

(Se ha hecho de esta manera porque mi Práctica 2 era una página web sobre turismo en París).

---

## 🔧 Tecnologías utilizadas

- Java 17
- Spring Boot 3.4.3
- Spring Web
- Spring Data JPA
- H2 Database
- Maven

---

## 🚀 ¿Cómo ejecutar?

1. Se clona o se descarga este repositorio
2. Se abre el proyecto con IntelliJ
3. Se ejecuta la clase `MvcApplication.java`
4. Se accede a `http://localhost:8080` para probar los endpoints

---

## 📂 Endpoints disponibles

### 📍 Lugares turísticos

| Método | Endpoint             | Descripción                       |
|--------|----------------------|-----------------------------------|
| GET    | `/lugares`           | Listar todos los lugares          |
| GET    | `/lugares/{id}`      | Obtener un lugar por su ID        |
| POST   | `/lugares`           | Crear un nuevo lugar              |
| PUT    | `/lugares/{id}`      | Actualizar un lugar existente     |
| DELETE | `/lugares/{id}`      | Eliminar un lugar por ID          |

---

### 🍽️ Platos típicos

| Método | Endpoint             | Descripción                       |
|--------|----------------------|-----------------------------------|
| GET    | `/platos`            | Listar todos los platos           |
| GET    | `/platos/{id}`       | Obtener un plato por su ID        |
| POST   | `/platos`            | Crear un nuevo plato              |
| PUT    | `/platos/{id}`       | Actualizar un plato existente     |
| DELETE | `/platos/{id}`       | Eliminar un plato por ID          |

---

## 🧪 Datos de ejemplo


Se utilizan herramientas como Postman para enviar datos de prueba. Algunos ejemplos están incluidos en JSON debajo:

### Ejemplo Lugares:
```json
{
    "nombre": "Torre Eiffel",
    "descripcion": "El monumento más icónico de París.",
    "direccion": "Champ de Mars, 5 Avenue Anatole France",
}
```
### Ejemplo Platos:
```json
{
"nombre": "Croissant",
"descripcion": "Bollo de mantequilla típico del desayuno francés.",
"tipo": "Desayuno",
}
```
## 📌 Notas

- La base de datos es en memoria (H2) y se reinicia cada vez que se ejecuta la aplicación.
- Se puede acceder a la consola H2 en `http://localhost:8080/h2-console`

---

