# Service Notification 📣

## Descrição
Microserviço responsável pelo envio de notificações (e-mail, push ou SMS).

## Funcionalidades
- Recebimento de mensagens via REST


## Tecnologias
- Java 17+
- Spring Boot
- Maven

## Como rodar
```bash
git clone https://github.com/Mateus-R-De-Lima/service.notification.git
cd service.notification
./mvnw spring-boot:run
```

## Endpoints principais
- `POST /notify` – envia notificação com os dados: `type`, `to`, `message`
---

## ℹ️ Observações
Este projeto faz parte de um conjunto de estudos sobre arquitetura de microserviços com Java e Spring Boot. O objetivo principal é praticar conceitos como:
- Separação de responsabilidades entre serviços
- Comunicação entre microserviços
- Centralização de configuração
- Escalabilidade e resiliência

Embora funcionais, esses projetos não possuem foco em produção, e podem conter implementações simplificadas com fins exclusivamente didáticos.

## 👨‍💻 Autor
Desenvolvido por [Mateus Lima](https://github.com/Mateus-R-De-Lima)

## 🔗 Projetos Relacionados

Este projeto faz parte de um ecossistema de microserviços criado para estudo. Os repositórios relacionados são:

- [service.main](https://github.com/Mateus-R-De-Lima/service.main) – Serviço principal/orquestrador
- [service.one](https://github.com/Mateus-R-De-Lima/service.one) – Serviço base simples
- [config-server](https://github.com/Mateus-R-De-Lima/config-server) – Servidor de configuração central
- [service.tasks](https://github.com/Mateus-R-De-Lima/service.tasks) – Serviço de gerenciamento de tarefas
- [service.notification](https://github.com/Mateus-R-De-Lima/service.notification) – Serviço de envio de notificações
