public class Record {
    enum Type {
        Record,
        Array,
        Number,
        Boolean,
        String
    }

    private String key;
    private Record value;

    public Record(String key, Record value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public Record getValue() {
        return value;
    }

    public Type getType() {
        return Type.Record;
    }

    public String toString() {
        String result = "";
        if (this.key.equals("root")) {
            result += "{\n" + value.toString() + "}";
        }
        else {
            result += "\"" + this.key + "\" : " + value.toString() + "\n";
        }
        return result;
    }
}
