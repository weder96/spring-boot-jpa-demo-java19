# spring-boot-jpa-demo-java19

Spring Boot 3.0, Postgres Java19 Usando Record com PageResult

Introdução
Spring é um dos Frameworks baseado em Java mais utilizado no  desenvolvimento de aplicações corporativas.

O Spring Framework fornece um amplo e completo ecossistema de projetos que engloba varios pontos que podem auxiliar a criação de aplicativos, Algum deles São:

Spring Data: Simplifica o acesso a dados relacionais e NoSQL armazenamentos de dados

Spring Batch: fornece uma poderosa estrutura de processamento em lote

Spring Security: estrutura de segurança robusta para proteger aplicativos

Spring Cloud: fornece um conjunto de ferramentas para os desenvolvedores implementarem padrões comuns de sistemas distribuídos, como Service Discovery,  Gerenciamento de configuração, disjuntor e muito mais.

Spring Integration: Uma implementação de integração empresarial  padrões para facilitar a integração com outros aplicativos corporativos  usando mensagens leves e adaptadores declarativos

Spring Boot Actuator : Obter os vários detalhes de um aplicativo em execução na produção é crucial para muitos formulários. 

O Spring é uma estrutura muito flexível e tambem personalizável, tendo várias maneiras de configurar um aplicativo. 

Embora tenham essas facildades e muitas opções, pode ser um pouco complexa para desenvolvedores que estão em seus primeiros passos e que as vezes não possuem habilidades especificas em Programação Orientada a Objetos. 

O Spring Boot vem para facilitar as configurações este problema de “aplicativos Spring precisam de configuração complexa” que no Spring Boot tem poderosos mecanismos de autoconfiguração.

Neste Artigo usaremos como Ferramentas:
- Java 19
- Spring boot
- Maven
- Docker-Compose

- Dependencias Maven:
  - Lombok
  - PostgreSQL Driver
  - Spring Web
  - Spring Data JPA
  - Spring Configuration Processor
- Database server:
  - Postgres

- IDE:
  - IntelliJ IDEA
    
Para começar usaremos o https://start.spring.io/ que te auxiliar na criação do Projeto inicial, abaixo uma imagem de como o projeto será iniciado:

![SpringInitializ](https://github.com/weder96/spring-boot-jpa-demo-java19/blob/main/documentation/springInitializ.png)

Lancamento Java (https://www.oracle.com/br/news/announcement/oracle-releases-java-19-2022-09-20/), (20-09-2022),  Download https://www.oracle.com/br/java/technologies/downloads/,

Nesta Nova versão oferece sete propostas de aprimoramento do JDK para aumentar a produtividade do desenvolvedor, melhorar a linguagem Java com desempenho, a estabilidade e a segurança da plataforma.

O JDK 19 conta com melhorias de linguagem do projeto OpenJDK Amber (Record Patterns e Pattern Matching for Switch); biblioteca para interoperação com código não-Java (Foreign Function e Memory API) e impulsionamento de instruções vetoriais (Vector API) do OpenJDK Project Panamá; e as primeiras visualizações do Project Loom (Virtual Threads e Structured Concurrency), que reduzirão drasticamente os esforços necessários para escrever e manter aplicações simultâneas de alto rendimento em Java.

O tipo Record:

Esta funcionalidade da linguagem apareceu pela primeira vez na versão 14 (https://openjdk.org/jeps/359) como experimental e assim continuou até a versão 15 (https://openjdk.org/jeps/384). 

Agora liberada de forma definitiva no Java 16(https://openjdk.org/jeps/395).

E sobre os métodos equals, hashCode e toString? 
    Os Metodos no Records são gerados automaticamente para nós.

Porém o Tipo Record tem algumas restrições referentes a este tipo de classe:
- Uma Record class não possui uma cláusula extends
- Uma Record class não pode ser abstrata
- Os atributos derivados da classe Record são todos finais
- Não pode declarar campos de instância
- Não pode declarar métodos nativos

Fora as restrições acima, uma classe de registro se comporta como uma classe normal:
- Uma instância de Record é criada com a expressão new
- Pode ser declarada como um tipo genérico
- Pode declarar métodos, atributos e inicializadores estáticos
- Pode declarar métodos de instância
- Pode implementar interfaces
- Utilizar annotations
- Podem ser serializados e desserializado

Todas as classes do tipo Record estendem da classe abstrata java.lang.Record

Os registros são uma representação concisa da classe de dados imutáveis.

Antes de Records, é assim que geralmente criamos uma classe imutável.


Usando Records no SpringBoot 3 (https://spring.io/blog/2022/11/24/spring-boot-3-0-goes-ga),

Fruto de 12 meses de trabalho e mais de 5700 commits de 151 indivíduos diferentes. 
Onde muitos contribuíram e a todos os primeiros usuários que forneceram feedback vital sobre os marcos.

O que chama a tenção nesta versão é que a mesma faz parte de uma grande revisão do Spring Boot desde de sua versão 2.0 foi lançado há 4,5 anos. 
É também a primeira versão GA do Spring Boot que fornece suporte para Spring Framework 6.0 e GraalVM.

Os destaques do novo lançamento incluem:
- baseline para o Java 17
- Suporte para geração de imagens nativas com GraalVM, substituindo o projeto experimental Spring Native
- Observabilidade aprimorada com micrômetro e Micrometer Tracing
- Support for Jakarta EE 10 with an EE 9 baseline


Referências:

https://openjdk.java.net/jeps/395

https://www.baeldung.com/java-record-keyword

https://angiejones.tech/deserializing-api-responses-into-java-records/

https://medium.com/@gaozhixiang/records-vs-lombok-in-java-15-193306340ca0

https://softwaregarden.dev/en/posts/new-java/records/vs-lombok/





