package Task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Doctors {
    public static void main(String[] args) {
        List<String> doctors = new ArrayList<>();
        doctors.add("Szpital:Chirurg:Radiolog:Chirurg Szczękowy:Pediatra");
        doctors.add("Przychodnia:Pediatra");
        doctors.add("Przychodnia:Internista:Laryngolog:Pediatra");

        Set<String> splittedDoctors =
                doctors
                        .stream()
                        .flatMap(Pattern.compile(":")::splitAsStream)
                        .collect(Collectors.toSet());
        splittedDoctors.remove("Przychodnia");
        splittedDoctors.remove("Szpital");

        System.out.println(splittedDoctors);

    }
}
