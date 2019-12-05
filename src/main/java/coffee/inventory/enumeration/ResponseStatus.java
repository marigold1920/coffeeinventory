package coffee.inventory.enumeration;

public enum ResponseStatus {
    SUCCESS() {
        @Override
        public String getValue() {

            return "";
        }
    },
    RESOURCE_NOT_FOUND() {
        @Override
        public String getValue() {

            return " was not recored in system inventory!";
        }
    },
    INVALID_RESOURCE() {
        @Override
        public String getValue() {

            return " may be wrong format!";
        }
    };

    public abstract String getValue();
}