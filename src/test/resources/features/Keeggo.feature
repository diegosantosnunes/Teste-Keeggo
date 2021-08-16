#Author: diegosn.51@gmail.com

@cadastrar
Feature: Cadastrar novo cliente
Como usuario quero cadastrar um cliente para acessar o site


@cadastrar
 Scenario: Cadastrar cliente
 Given que acesso o site "http://advantageonlineshopping.com/#/"
 And acesso o formulario de abertura de conta 
 When preencher todos os campos obrigatorios
 And preencher todos os campos nao obrigatorios
 Then cliente cadastro com sucesso 

@login
 Scenario: Realizar login
 Given que acesso o site "http://advantageonlineshopping.com/#/"
 And acessar a tela de login
 When preencher login e senha
 Then login com sucesso
 
