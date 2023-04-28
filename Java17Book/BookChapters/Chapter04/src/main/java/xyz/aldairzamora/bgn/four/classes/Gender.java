package xyz.aldairzamora.bgn.four.classes;

public enum Gender {
    // CREATE A NUMBER AND STRING REPRESENTATION FOR THE ENUMS
    FEMALE(1, "f"),
    MALE(2, "m"),
    UNSPECIFIED(3, "u") {
        @Override
        public String comment() {
            return "to be decided later: " + getRepr() + ", " + getDescr();
        }
    };

    // fields
    private final int repr;
    private final String descr;

    // constructor
    Gender(int repr, String descr) {
        this.repr = repr;
        this.descr = descr;
    }

    // methods
    public String comment() {
    return repr + ": " + descr;
    }



    // getters
    public int getRepr() {
        return repr;
    }

    public String getDescr() {
        return descr;
    }
}
