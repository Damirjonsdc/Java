import org.json.JSONObject;

public class Main {

    public static void main(String[] args) {
        JSONObject filterParams = new JSONObject("{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}");

        StringBuilder whereBuilder = new StringBuilder("WHERE ");

        for (String key : filterParams.keySet()) {
            String value = filterParams.getString(key);
            if (!value.equals("null")) {
                whereBuilder.append(key).append("='").append(value).append("' AND ");
            }
        }

        String whereClause = whereBuilder.toString();
        if (whereClause.endsWith("AND ")) {
            whereClause = whereClause.substring(0, whereClause.length() - 4);
        }

        System.out.println(whereClause);
        // Результат: WHERE name='Ivanov' AND country='Russia' AND city='Moscow'

    }
}