import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instanciando 5 objetos Veículo
        for (int i = 0; i < 5; i++) {
        Veiculo veiculo = new Veiculo("RENANVDO", "Ferrari", "La Ferrari", "vermelha", 200, 4, new Motor(4,962));

            Veiculo carro = new Veiculo("RENANVDO", "Ferrari", "La Ferrari", "vermelha", 200, 4, new Motor(4,962));
            Veiculo ferrari = new Veiculo("RENANVDO", "Ferrari", "La Ferrari", "vermelha", 200, 4, new Motor(4,962));
            Veiculo automovel = new Veiculo("RENANVDO", "Ferrari", "La Ferrari", "vermelha", 200, 4, new Motor(4,962));
            Veiculo transporte = new Veiculo("RENANVDO", "Ferrari", "La Ferrari", "vermelha", 200, 4, new Motor(4,962));


            // Permitindo a entrada de dados pelo usuário
            System.out.println("Informe o modelo do veículo:");
            veiculo.setModelo(scanner.nextLine());

            System.out.println("Informe o ano do veículo:");
            veiculo.setAno(scanner.nextInt());
            scanner.nextLine(); // Consumindo a quebra de linha

            // Imprimindo os dados processados na tela
            System.out.println("Veículo " + (i + 1) + ":");
            System.out.println("Modelo: " + veiculo.getModelo());
            System.out.println("Ano: " + veiculo.getAno());
            System.out.println("Potência do Motor: " + veiculo.getMotor().getPotencia());
            System.out.println("----------------------------------------");
        }
        scanner.close();
    }
}