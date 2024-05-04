# verkonsulta
microservices of doctor - patient appointments

# run service using console
# & is use to run the service at the background
> mvn spring-boot:run &

# run the same service on a different port
# change director (cd) to the root folder of the service
# change XXXX port to the desired port
> mvn spring-boot:run -Dspring-boot.run.jvmArguments='-Dserver.port=XXXX' &
