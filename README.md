# StudySession – Simple Study Tracking API / API per tracciare sessioni di studio

---

## 🇬🇧 English

StudySession is a lightweight Spring Boot application that allows users to record, validate, and retrieve study sessions through a clean REST API.  
It is designed as a compact learning project focused on API design, validation, custom error handling, and basic in-memory persistence.

---

### 🚀 Features

- Create study sessions via a POST endpoint  
- List all saved sessions  
- Validation for required fields and constraints:
  - subject (3–50 chars)
  - date (non-null)
  - duration (1–600 min)
  - focus level (1–5)
- Default focus level set to **2** if omitted  
- Custom exceptions for missing or invalid fields  
- Centralized error handling with `@RestControllerAdvice`  
- In-memory repository for storing sessions

---

### 📡 API Endpoints

#### ➤ Create a new study session  
**POST /sessions**

Example request:

```json
{
  "subject": "Mathematics",
  "duration": 90,
  "date": "2025-01-22T14:00:00",
  "focuslvl": 3
}
```

#### ➤ Retrieve all sessions  
**GET /sessions**

---

### 🛠️ Technologies Used

- Java 21+  
- Spring Boot  
- Spring Web  
- In-memory storage (HashMap)

---

### 📦 How to Run

```bash
./mvnw spring-boot:run
```

Then visit:

```
http://localhost:8080/sessions
```

---

---

## 🇮🇹 Italiano

StudySession è una piccola applicazione Spring Boot che permette di registrare, validare e recuperare sessioni di studio tramite una REST API semplice e pulita.  
È pensata come progetto didattico per esercitarsi con design delle API, validazione, gestione degli errori ed una persistenza in memoria.

---

### 🚀 Funzionalità

- Creazione di sessioni di studio tramite endpoint POST  
- Recupero di tutte le sessioni salvate  
- Validazione con vincoli su:
  - subject (3–50 caratteri)
  - date (non nulla)
  - duration (1–600 minuti)
  - focus level (1–5)
- Default automatico del focus level a **2**  
- Eccezioni personalizzate per campi mancanti o invalidi  
- Gestione centralizzata degli errori con `@RestControllerAdvice`  
- Repository in memoria

---

### 📡 Endpoint API

#### ➤ Creare una nuova sessione  
**POST /sessions**

Esempio:

```json
{
  "subject": "Matematica",
  "duration": 90,
  "date": "2025-01-22T14:00:00",
  "focuslvl": 3
}
```

#### ➤ Recuperare tutte le sessioni  
**GET /sessions**

---

### 🛠️ Tecnologie usate

- Java 21+  
- Spring Boot  
- Spring Web  
- Persistenza in memoria (HashMap)

---

### 📦 Come eseguire il progetto

```bash
./mvnw spring-boot:run
```

Poi visita:

```
http://localhost:8080/sessions
```
