# openapi-demo

Demo project for openapi specification using spring boot. This code is just for reference purpose final code might look
different in production environment.

You can checkout this project locally and play around with the code. Make the changes in and then try to generate the
openapi specs.

# Auto generate openapi specs

Use below command to auto generated openapi sepcs
> mvn verify -DskipTests -Dspringdoc.writer-with-default-pretty-printer=true