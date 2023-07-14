import org.json.JSONObject;

    public class Main {
        public static void main(String[] args) {
            // Contoh JSON yang diberikan
            String json = "{\n" +
                    "  \"glossary\": {\n" +
                    "    \"title\": \"example glossary\",\n" +
                    "    \"GlossDiv\": {\n" +
                    "      \"title\": \"S\",\n" +
                    "      \"GlossList\": {\n" +
                    "        \"GlossEntry\": {\n" +
                    "          \"ID\": \"SGML\",\n" +
                    "          \"SortAs\": \"SGML\",\n" +
                    "          \"GlossTerm\": \"Standard Generalized Markup Language\",\n" +
                    "          \"Acronym\": \"SGML\",\n" +
                    "          \"Abbrev\": \"ISO 8879:1986\",\n" +
                    "          \"GlossDef\": {\n" +
                    "            \"para\": \"A meta-markup language, used to create markup languages such as DocBook.\",\n" +
                    "            \"GlossSeeAlso\": [\n" +
                    "              \"GML\",\n" +
                    "              \"XML\"\n" +
                    "            ]\n" +
                    "          },\n" +
                    "          \"GlossSee\": \"markup\"\n" +
                    "        }\n" +
                    "      }\n" +
                    "    }\n" +
                    "  }\n" +
                    "}";

            JSONObject jsonObject = new JSONObject(json);

            // Membuat objek GlossEntry dari JSON
            JSONObject glossEntryJson = jsonObject.getJSONObject("glossary")
                    .getJSONObject("GlossDiv")
                    .getJSONObject("GlossList")
                    .getJSONObject("GlossEntry");
            GlossEntry glossEntry = GlossEntry.fromJson(glossEntryJson);

            // Mengakses atribut ID
            String ID = glossEntry.getID();
            System.out.println("ID: " + ID);
        }
    }


