# Santander Dev Week 2023 Java API

RESTful API da Santander Dev Week 2023 construída em Java 17 com Spring Boot 3.

## Principais Tecnologias
 - **Java 17**: Utilizaremos a versão LTS mais recente do Java para tirar vantagem das últimas inovações que essa linguagem robusta e amplamente utilizada oferece;
 - **Spring Boot 3**: Trabalharemos com a mais nova versão do Spring Boot, que maximiza a produtividade do desenvolvedor por meio de sua poderosa premissa de autoconfiguração;
 - **Spring Data JPA**: Exploraremos como essa ferramenta pode simplificar nossa camada de acesso aos dados, facilitando a integração com bancos de dados SQL;
 - **OpenAPI (Swagger)**: Vamos criar uma documentação de API eficaz e fácil de entender usando a OpenAPI (Swagger), perfeitamente alinhada com a alta produtividade que o Spring Boot oferece;
 - **Railway**: facilita o deploy e monitoramento de nossas soluções na nuvem, além de oferecer diversos bancos de dados como serviço e pipelines de CI/CD.




## Diagrama de Classes (Domínio da API)


```mermaid
classDiagram
    class User {
        -String id
        -String name
        -String email
        -String password
        -Preferences preferences
        -List<Playlist> playlists
    }
    
    class Preferences {
        -List<String> genres
        -List<String> artists
    }
    
    class Playlist {
        -String id
        -String name
        -String userId
        -Boolean private
        -List<Music> music
    }

    class Album {
        -String id
        -String name
        -String artist
        -List<Music> music
    }
    
    class Music {
        -String id
        -String title
        -String artist
        -String album
        -Number duration
        -String genre
        -Date releaseDate
    }

    User "1" --* "1" Preferences : has
    User "1" --* "0..*" Playlist : creates
    User "1" --* "0..*" Album : creates
    User "1" --* "0..*" Music: creates
    Playlist "1" --> "0..*" Music : contains
    Album "1" *--> "1..*" Music: contains
```