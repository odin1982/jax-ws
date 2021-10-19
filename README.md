# JAX-WS
## Que es SOAP?
    Simple Object Access Protocol.
    Es un protocolo de comunicación, normalmente via HTTPS o JMS, en el que el intercambio de mensajes se realiza mediante un formato de XML llamado WSDL(Web Service DEscription Language).

    Son independientes de la plataforma y del lenguaje.

## Generar cliente con wsdl
    wsimport -keep -verbose [url]
    
    wsimport -keep -verbose http://localhost:1516/WS/Users?wsdl
