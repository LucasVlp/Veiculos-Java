//Lucas Volpe, Edson Fernando e Eduardo Franco

package model;

public class Veiculo {

    private String modelo;
    private String marca;
    private int ano;
    private double valor;

    public Veiculo() {
    }

    public Veiculo(String modelo, String marca, int ano, double valor) {
        this.modelo = modelo;
        this.marca = marca;
        setAno(ano);
        setValor(valor);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo != null && !modelo.isEmpty()) {
            this.modelo = modelo;
        } else {
            System.out.println("Modelo inválido!");
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca != null && !marca.isEmpty()) {
            this.marca = marca;
        } else {
            System.out.println("Marca inválida!");
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano > 1885) {
            this.ano = ano;
        } else {
            System.out.println("Ano inválido!");
        }
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor >= 0) {
            this.valor = valor;
        } else {
            System.out.println("Valor não pode ser negativo!");
        }
    }

    public double calcularDesconto(double porcentagem) {
        if (porcentagem > 0 && porcentagem <= 100) {
            return valor - (valor * porcentagem / 100);
        } else {
            System.out.println("Porcentagem inválida!");
            return valor;
        }
    }

    public String verificarCategoria() {
        if (ano >= 2020) {
            return "Novo";
        } else if (ano >= 2015) {
            return "Seminovo";
        } else {
            return "Usado";
        }
    }

    @Override
    public String toString() {
        return "\n--- DADOS DO VEÍCULO ---" +
               "\nModelo: " + modelo +
               "\nMarca: " + marca +
               "\nAno: " + ano +
               "\nValor: R$ " + valor +
               "\nCategoria: " + verificarCategoria();
    }
}