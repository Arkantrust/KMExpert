package model;

public enum StageType {
    START,
    ANALYSIS,
    DESIGN,
    DEVELOPMENT,
    CLOSINGANDMAINTENANCE,
    PROJECTCONTROL;


    /**
     * @param intType
     * @return
     */
    public static StageType getType(int intType) {
        StageType type = null;
        switch(intType) {
            case 0: type = START;
                break;
            case 1: type = ANALYSIS;
                break;
            case 2: type = DESIGN;
                break;
                case 3: type = DEVELOPMENT;
                break;
            case 4: type = CLOSINGANDMAINTENANCE;
                break;
            case 5: type = PROJECTCONTROL;
            break;
        }
        return type;
    }
}
