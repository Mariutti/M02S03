import java.util.ArrayList;
import java.util.Date;

public class Colaborador {
    private String nome;
    private Date dataAdmissao;
    private Date dataDesligamento;
    private Cargo cargo;
    private Double salario;

    private static ArrayList<Colaborador> colaboradores = new ArrayList<>();

    public Colaborador(String nome, Date dataAdmissao, Cargo cargo) {
        this.nome = nome;
        this.dataAdmissao = dataAdmissao;
        this.cargo = cargo;
//        this.dataDesligamento = null;
        this.salario = cargo.getSalarioBase();
        this.colaboradores.add(this);
    }

    public ArrayList<Colaborador> getColaboradores() {
        return colaboradores;
    }

    public static String listarColaboradores() {
        return "Colaborador{" +
                "colaboradores=" + colaboradores.toString() +
                '}';
    }
    public static String listarColaboradoresAtivos() {
        ArrayList<Colaborador> colabAtivos = new ArrayList<>();
        for (Colaborador colab : colaboradores) {
            if (colab.getDataDesligamento() == null) {
                colabAtivos.add(colab);
            }
        }
        return "Colaboradores ativos: {" +
                colabAtivos.toString() +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public Date getDataDesligamento() {
        return dataDesligamento;
    }

    public void setDataDesligamento(Date dataDesligamento) {
        this.dataDesligamento = dataDesligamento;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    @Override
    public String toString() {
        return "Colaborador{" +
                "nome='" + nome + '\'' +
                ", dataAdmissao=" + dataAdmissao +
                ", dataDesligamento=" + dataDesligamento +
                ", cargo=" + cargo +
                ", salario=" + salario +
                '}';
    }
}
