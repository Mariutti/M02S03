

import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    static ArrayList<Colaborador> colaboradores = new ArrayList<>();
    static ArrayList<Cargo> cargos = new ArrayList<>();
    public static void main(String[] args) {
        cargos.add(new Cargo("Dev Frons-end Junior", 3000.0, Nivel.JUNIOR));
        cargos.add(new Cargo("Dev Frons-end Pleno", 5000.0, Nivel.PLENO));
        cargos.add(new Cargo("Dev Frons-end Senior", 8000.0, Nivel.SENIOR));


        colaboradores.add(new Colaborador("Pedro", new Date(), cargos.get(0)));
        colaboradores.add(new Colaborador("Julio", new Date(), cargos.get(1)));
        colaboradores.add(new Colaborador("João", new Date(), cargos.get(2)));


//        exercício 05
//        listarColaboradoresAtivos(colaboradores);
//        for(Colaborador c : colaboradores){
//            if(c.getDataDesligamento() == null){
//                System.out.println(c);
//            }
//        }

//        exercício 06
//        listarColaboradoresPorCargo(cargos, colaboradores);
//        for (Cargo cargo : cargos){
//            System.out.println("Lista de colaboradores de Cargos " + cargo.getDescricao());
//            for( Colaborador colaborador : colaboradors){
//                if(colaborador.getCargo() == cargo){
//                    System.out.println(colaborador);
//                }
//            }
//        }
//        exercício 07
//        Colaborador colaborador = setColaborador();
//        if(colaborador != null){
//            addColaborador(colaborador);
//        }

//        exercício 08
//        desligarColaborador();

//        exercício 09
//        promoverColaborador();

//        exercício 10
        listarPorSalario();

//        System.out.println(colaboradores);
//        Colaborador colab1 = new Colaborador("José",
//                new Date(2020, 04,21),
//                cargos.get(0));
//
//        colab1.setSalario(4500.00);
//        colab1.setDataDesligamento(new Date(2023, 05,22));
//        System.out.println(colab1);
//        Colaborador colab2 = new Colaborador("Pedro",
//                new Date(2020, 04,21),
//                new Cargo("Frontend Javascript",2500.50, Nivel.JUNIOR));
//
//        System.out.println(Colaborador.listarColaboradores());
//        System.out.println(Colaborador.listarColaboradoresAtivos());
    }
//    ex 05
    public static void listarColaboradoresAtivos(ArrayList<Colaborador> colaboradores){
        for(Colaborador c : colaboradores){
            if(c.getDataDesligamento() == null){
                System.out.println(c);
            }
        }
    }
//    ex 06
    public static void listarColaboradoresPorCargo(ArrayList<Cargo> listaCargos,
                                                    ArrayList<Colaborador> colaboradores) {
        //        exercício 06
        for (Cargo cargo : listaCargos){
            System.out.println("Lista de colaboradores de Cargos " + cargo.getDescricao());
            for( Colaborador colaborador : colaboradores){
                if(colaborador.getCargo() == cargo){
                    System.out.println(colaborador);
                }
            }
        }
    }
//    ex 07
    public static Colaborador setColaborador(){
        String nome = JOptionPane.showInputDialog(null, "Digite o nome do colaborador: ");
        Date dtAdmissão = new Date();
        Cargo cargo = (Cargo) JOptionPane.showInputDialog(
                null,
                "Selecione um cargo",
                "Seleção de cargo",
                JOptionPane.PLAIN_MESSAGE,
                null,
                cargos.toArray(),
                cargos.get(0)
        );
        Colaborador colaborador = new Colaborador(nome, dtAdmissão, cargo);
        return colaborador;
    }
//ex 07 continuação
    public static void addColaborador(Colaborador colaborador){
        colaboradores.add(colaborador);
    }

//    ex 08
    public static void desligarColaborador(){
        String nome = JOptionPane.showInputDialog(null, "Digite o nome do colaborador que deseja desligar: ");
        Date dtDesligamento = new Date();
        for(Colaborador colaborador : colaboradores){
            if(colaborador.getNome().equalsIgnoreCase(nome)){
                colaborador.setDataDesligamento(dtDesligamento);
            }
        }
    }

    //    ex 09
    public static void promoverColaborador(){
        String nome = JOptionPane.showInputDialog(null, "Digite o nome do colaborador a ser promovido: ");
        Cargo cargo = (Cargo) JOptionPane.showInputDialog(
                null,
                "Selecione um cargo",
                "Seleção de cargo",
                JOptionPane.PLAIN_MESSAGE,
                null,
                cargos.toArray(),
                cargos.get(0)
        );
        for(Colaborador colaborador : colaboradores){
            if(colaborador.getNome().equalsIgnoreCase(nome)){
                colaborador.setCargo(cargo);
            }
        }
    }

    public static void listarPorSalario(){
        ArrayList<Colaborador> _colaboradores = (ArrayList<Colaborador>) colaboradores.clone();
        _colaboradores.sort((c1, c2) -> {
            return c1.getSalario() - c2.getSalario() > 0 ? -1 :c2.getSalario() - c1.getSalario() > 0? 1:0;
        });
        _colaboradores.forEach(System.out::println);
    }
}

//Arrays.sort(employees, new Comparator<Employee>() {
//@Override
//public int compare(Employee o1, Employee o2) {
//        return Double.compare(o1.getSalary(), o2.getSalary());
//        }
//        });
//TODO Ex 1 - Classe Enum Nível ( JUNIOR , PLENO, SENIOR )
//
//TODO Ex 2 - Classe Cargo ( Descrição, Salário base , Nível (classe Enum)  )
//
//TODO Ex 3 - Classe Colaborador ( Nome, data admissão, data desligamento, Cargo, Salário )
//
//TODO Ex 4 - Fazer inclusão de novo colaborador em lista de Colaboradores
//
//TODO Ex 5 - Listar colaboradores ativos ( que não possuem data desligamento )
//
//TODO Ex 6 - Listar colaboradores por Cargo
//
//TODO Ex 7 - Desenvolver um método que será responsável por admitir um colaborador ( incluir na lista de colaboradores )
//
//TODO Ex 8 - Desenvolver um método que será responsável por desligar um colaborador ( alterar o objeto incluindo uma data de desligamento )
//
//TODO Ex 9 - Desenvolver um método que será responsável por promover um colaborador de Cargo
//
//TODO Ex 10 - Listar colaboradores ordenado por salário decrescente