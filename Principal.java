public class Principal {
 public static void main(String[] args) {
     PessoaFisica PessoaFisica = new PessoaFisica();
     PessoaJuridica PessoaJuridica = new PessoaJuridica();

     // Inserir informações pelo método SET
     PessoaFisica.setCPF("511.184.438-45");
     PessoaFisica.setNome("Thiago H.");
     PessoaFisica.setEndereco("Tupã-SP");

     PessoaJuridica.setCNPJ("25.366.988/00001-74");
     PessoaJuridica.setNome("Adalberto");
     PessoaJuridica.setEndereco("Salvador-BA");


     // Exibir informações pelo método GET
     System.out.println("\nInformações de " + PessoaFisica.getNome() + ":");
     System.out.println("CPF:" + PessoaFisica.getCPF() + ".");
     System.out.println("Endereço:" + PessoaFisica.getEndereco() + ".");


     System.out.println("\nInformações de " + PessoaJuridica.getNome() + ":");
     System.out.println("CPF:" + PessoaJuridica.getCNPJ() + ".");
     System.out.println("Endereço:" + PessoaJuridica.getEndereco() + ".");
 }   
}
