package model;

public enum StageType {
    START,
    ANALYSIS,
    DESIGN,
    DEVELOPMENT,
    CLOSING_AND_MAINTENANCE,
    PROJECT_CONTROL;


    /**
     * @param intType
     * @return
     */
    public static StageType getType(int intType) {
        StageType type = null;
        switch(intType) {
            case 1: type = START;
                break;
            case 2: type = ANALYSIS;
                break;
            case 3: type = DESIGN;
                break;
            case 4: type = DEVELOPMENT;
                break;
            case 5: type = CLOSING_AND_MAINTENANCE;
                break;
            case 6: type = PROJECT_CONTROL;
                break;
        }
        return type;
    }
}
