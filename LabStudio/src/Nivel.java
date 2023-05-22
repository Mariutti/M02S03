import java.util.Arrays;
import java.util.List;

public enum Nivel {
    JUNIOR(0, "Junior"),
    PLENO(1, "Pleno"),
    SENIOR(2, "Senior");

    private final int value;
    private final String description;
    Nivel(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

//    public static void listarNivel(){
//
//        List<Nivel> nivelList = Arrays.asList(Nivel.values());
//            for (Enum nivel: nivelList
//                 ) {
//            System.out.println(nivel);
//        }
//    }

}
