import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("E001", "山田一郎", 28, "開発部"));
        employees.add(new Employee("E002", "佐藤次郎", 35, "営業部"));
        employees.add(new Employee("E003", "田中三郎", 42, "開発部"));
        employees.add(new Employee("E004", "鈴木四郎", 25, "人事部"));
        employees.add(new Employee("E005", "高橋", 31, "営業部"));

        System.out.println("30歳以上の社員一覧");

        List<Employee> overThirtyEmployees = employees.stream()
                .filter(employee -> employee.getAge() >= 30)
                .collect(Collectors.toList());

        for (Employee employee : overThirtyEmployees) {
            System.out.println(employee.getName());
        }

        System.out.println("部署ごとの人数");

        Map<String, Long> departmentCount = employees.stream()
                .collect(Collectors.groupingBy(
                        employee -> employee.getDepartment(),
                        Collectors.counting()
                ));

        departmentCount.forEach((department, count) -> {
            System.out.println(department + "：" + count + "人");
        });
    }
}