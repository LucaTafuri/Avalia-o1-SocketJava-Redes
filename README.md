# Avaliacao01-SocketJava-Redes
Implementação de servidor web
Integrantes: Luca Tafuri RA: 1706314
Link github: https://github.com/LucaTafuri/Avalia-o1-SocketJava-Redes

Passo 1 -
Servidor de web de java em sockets
Classe do servidor a ser executada ServidorTarefas.java

Passo 2 - 
executar navegador fazer requisicao as pagina index. em casa de ser uma pagina com rota errada o navegado devolve o status 404 e uma pagina de erro para o cliente.


resumo da modelagem e funcionamento 

projeto tem 4 arquivos 

ServidorTarefas.java
index.html
404.html
threndTarefas.java

ServidorTarefas.Java deve ser execultada e chama a threndTarefas.java a cada nova solicitação de criente

com o limite de 5 trends definida na linha 29 da Classe ServidorTarefas.java no metodo  ExecutorService threadPool = Executors.newFixedThreadPool(5); 

