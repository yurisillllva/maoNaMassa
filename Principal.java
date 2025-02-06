import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Principal {
    public static void main(String[] args) {
        // Add funcionários
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("Maria", LocalDate.of(2000, 10, 18), new BigDecimal("2009.44"), "Operador"));
        funcionarios.add(new Funcionario("João", LocalDate.of(1990, 5, 12), new BigDecimal("2284.38"), "Operador"));
        funcionarios.add(new Funcionario("Caio", LocalDate.of(1961, 5, 02), new BigDecimal("9836.14"), "Coordenador"));
        funcionarios.add(new Funcionario("Miguel", LocalDate.of(1988, 10, 14), new BigDecimal("19119.88"), "Diretor"));
        funcionarios.add(new Funcionario("Alice", LocalDate.of(1995, 1, 05), new BigDecimal("2234.68"), "Recepcionista"));
        funcionarios.add(new Funcionario("Heitor", LocalDate.of(1999, 11, 19), new BigDecimal("1582.72"), "Operador"));
        funcionarios.add(new Funcionario("Arthur", LocalDate.of(1993, 3, 31), new BigDecimal("2234.68"), "Contador"));
        funcionarios.add(new Funcionario("Laura", LocalDate.of(1994, 7, 8), new BigDecimal("3017.45"), "Gerente"));
        funcionarios.add(new Funcionario("Heloisa", LocalDate.of(2003, 5, 24), new BigDecimal("2234.68"), "Eletricista"));
        funcionarios.add(new Funcionario("Alice", LocalDate.of(1996, 9, 02), new BigDecimal("2799.93"), "Gerente"));
        
        // Removendo o funcionário João
        funcionarios.removeIf(funcionario -> funcionario.getNome().equals("João"));

        // Imprimindo os funcionários com todas as suas informações
        System.out.println("Funcionários: ");
        funcionarios.forEach(funcionario -> System.out.println(funcionario));

        // Gerando aumento de 10%
        funcionarios.forEach(Funcionario::aplicarAumento);

        // Funcionários agrupados pela função
        Map<String, List<Funcionario>> funcionariosPorFuncao = funcionarios.stream()
                .collect(Collectors.groupingBy(Funcionario::getFuncao));

        // Agrupando pela função
        System.out.println("\nFuncionários agrupados por função: ");
        funcionariosPorFuncao.forEach((funcao, lista) -> {
            System.out.println("\nFunção: " + funcao);
            lista.forEach(funcionario -> System.out.println(funcionario));
        });

        // Exibindo funcionários que fazem aniversário em outubro e dezembro
        System.out.println("\nFuncionários com aniversário em Outubro ou Dezembro: ");
        funcionarios.stream()
                .filter(funcionario -> funcionario.getDataNascimento().getMonthValue() == 10 ||
                        funcionario.getDataNascimento().getMonthValue() == 12)
                .forEach(funcionario -> System.out.println(funcionario));

        // Exibindo o funcionário com a maior idade
        Funcionario funcionarioMaisVelho = funcionarios.stream()
                .max(Comparator.comparingInt(Funcionario::calcularIdade))
                .orElseThrow(() -> new RuntimeException("Lista de funcionários vazia"));
        System.out.println("\nFuncionário mais velho(a): " + funcionarioMaisVelho.getNome() +
                " - Idade: " + funcionarioMaisVelho.calcularIdade());

        // Exibindo a lista de funcionários por ordem alfabética
        System.out.println("\nFuncionários ordenados alfabeticamente: ");
        funcionarios.stream()
                .sorted(Comparator.comparing(Funcionario::getNome))
                .forEach(funcionario -> System.out.println(funcionario));

        // Exibindo o valor total dos salários dos funcionários
        BigDecimal totalSalarios = funcionarios.stream()
                .map(Funcionario::getSalario)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println("\nTotal dos salários: " + totalSalarios);

        // Verificando quantos salários mínimos cada funcionário ganha
        System.out.println("\nQuantos salários mínimos cada funcionário ganha (considerando R$1212,00): ");
        BigDecimal salarioMinimo = new BigDecimal("1212.00");
        funcionarios.forEach(funcionario -> {
            BigDecimal quantSalariosMinimos = funcionario.getSalario().divide(salarioMinimo, 2, java.math.RoundingMode.HALF_UP);
            System.out.println(funcionario.getNome() + ": " + quantSalariosMinimos + " salários mínimos");
        });
    }
}

