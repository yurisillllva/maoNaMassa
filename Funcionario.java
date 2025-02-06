import java.math.BigDecimal;
import java.util.Locale;
import java.time.LocalDate;

public class Funcionario extends Pessoa {
    private BigDecimal salario;
    private String funcao;

    public Funcionario(String nome, LocalDate dataNascimento, BigDecimal salario, String funcao) {
        super(nome, dataNascimento);
        this.salario = salario;
        this.funcao = funcao;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void aplicarAumento() {
        this.salario = salario.multiply(BigDecimal.valueOf(1.10));  // 10% de aumento
    }

    public String getSalarioFormatado() {
        return String.format(Locale.forLanguageTag("pt-BR"), "%,.2f", salario);
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + ", Data Nascimento: " + getDataNascimentoFormatada() +
               ", Salário: " + getSalarioFormatado() + ", Função: " + getFuncao();
    }
}
