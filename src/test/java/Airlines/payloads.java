package Airlines;

public class payloads {

    public static String getCreateAirlinePayload(String id, String name, String country, String logo, String slogan, String head_quarters, String websites, String established ){

        String Payload = "{\n" +
                "    \"id\": "+id+",\n" +
                "    \"name\": \""+name+"\",\n" +
                "    \"country\": \""+country+"\",\n" +
                "    \"logo\": \""+logo+"\",\n" +
                "    \"slogan\": \""+slogan+"\",\n" +
                "    \"head_quaters\": \""+head_quarters+"\",\n" +
                "    \"website\": \""+websites+"\",\n" +
                "    \"established\": \""+established+"\"\n" +
                "}";
        return Payload;
    }
}
