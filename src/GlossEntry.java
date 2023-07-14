import org.json.JSONObject;

public class GlossEntry {
        private String ID;

        public String getID() {
            return ID;
        }

        public void setID(String ID) {
            this.ID = ID;
        }

        // Method tipe 2 untuk menangkap entitas JSON 'GlossEntry' dan atribut 'ID'
        public static GlossEntry fromJson(JSONObject jsonObject) {
            GlossEntry glossEntry = new GlossEntry();
            glossEntry.setID(jsonObject.optString("ID"));
            return glossEntry;
        }
    }


