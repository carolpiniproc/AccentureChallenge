# AccentureChallenge
E2E Automation test. Using Java + Selenium + Junit + Cucumber

## Requirements  
1 - JDK > 15     
2 - Maven project  
3 - ChromeDriver file must be the same version as your Chrome browser's   
4 - Framework : [frameworkWebAutomation](https://github.com/carolpiniproc/frameworkWebAutomation)  

### Steps
run "mvn test" to execute the test which are on Runner Test File
run "mvn verify" to generate the reports and after that check them on target/reports/cucumber-html-reports 
___________________________________________________
#### Projeto criado com Intellij IDEA
- [x] 1 : Criar um projeto em selenium webdrive(java)  e cucumber usando Page objects
  (precisamos executar o script através da feature  
2 : Passo a passo para o teste automático (Colocar algum verificador do objeto antes de fazer as ações):    
  - [x] Entrar no site [http://sampleapp.tricentis.com/101/app.php]
  - [x] Preencher o formulário, aba “Enter Vehicle Data” e pressione next   
  - [x] Preencher o formulário, aba “Enter Insurant Data” e pressione next  
  • Preencher o formulário, aba “Enter Product Data” e pressione next   
  • Preencher o formulário, aba “Select Price Option” e pressione next  
  • Preencher o formulário, aba “Send Quote” e pressione Send   
  - [x] Verificar a mensagem “Sending e-mail success!” na tela  
- [x] 3 : Disponibilizar o projeto no repositório GIT : 
___________________________________________________

##### Observações:
Os formulários apresentam aviso de campos obrigatórios , mas ao clicar no botão "Next" 
não há validação e é possível prosseguir para as demais páginas sem preeenche-las.  
Não há tipagem nos campos, em alguns inseri Double, em outros Integer e em outros String.  
Criei duas classes de stepDefinitions: VehicleDataSteps e InsurantDataSteps.   
- A 1ª contém chamadas para uma classe Page
- A 2ª está com sem chamadas para uma Page.   
  Pois já vi projetos das duas formas, são apenas exemplos de como podemos trabalhar. 