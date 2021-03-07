#!/usr/bin/env bash
mkdir -p src/main/resources
echo "------- Generating Certificates -------"
openssl req -x509 -sha256 -nodes -days 2048 -newkey rsa:4096 -keyout src/main/resources/server.key -out src/main/resources/server.crt
echo "------- Create password -------"
openssl pkcs12 -export -out src/main/resources/keyStore.p12 -in src/main/resources/server.crt -inkey src/main/resources/server.key -name 'alias'
echo "------- Create no password -------"
openssl pkcs12 -export -out src/main/resources/keyStore_nopass.pfx -in src/main/resources/server.crt -inkey src/main/resources/server.key
