package DS;
import java.util.*;
// 1️⃣ Define an Enum
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
public class EnumMapExample {
    public static void main(String[] args) {
        // 2️⃣ Create EnumMap
        EnumMap<Day, String> schedule = new EnumMap<>(Day.class);
        // 3️⃣ Add elements
        schedule.put(Day.MONDAY, "Math Class");
        schedule.put(Day.WEDNESDAY, "Science Class");
        schedule.put(Day.FRIDAY, "Sports Day");
        schedule.put(Day.SUNDAY, "Holiday");
        // 4️⃣ Display EnumMap
        System.out.println("EnumMap: " + schedule);
        // 5️⃣ Access a value
        System.out.println("Activity on FRIDAY: " + schedule.get(Day.FRIDAY));
        // 6️⃣ Replace a value
        schedule.replace(Day.WEDNESDAY, "Computer Lab");
        System.out.println("After replace: " + schedule);
        // 7️⃣ Check existence
        System.out.println("Contains key MONDAY? " + schedule.containsKey(Day.MONDAY));
        System.out.println("Contains value 'Holiday'? " + schedule.containsValue("Holiday"));
        // 8️⃣ Remove
        schedule.remove(Day.FRIDAY);
        System.out.println("After remove: " + schedule);
        // 9️⃣ Iterate
        for (Map.Entry<Day, String> entry : schedule.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
        // 🔟 Clear
        schedule.clear();
        System.out.println("After clear: " + schedule);
    }
}