# openapi-demo

Demo project for openapi specification using spring boot. This code is just for reference purpose final code might look
different in production environment.

You can check out this project locally and play around with the code. Make the changes in and then try to generate the
openapi specs.

You can read more about what is springdoc documentation using openapi specification [here](https://medium.com/@bais_hariom/spring-rest-api-documentation-using-openapi-specifications-400da816c840)

# Auto generate openapi specs

Use below command to auto generated openapi sepcs
> mvn verify -DskipTests -Dspringdoc.writer-with-default-pretty-printer=true