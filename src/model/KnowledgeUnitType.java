package model;

public enum KnowledgeUnitType {
    TECHNICAL,
    MANAGEMENT,
    DOMAIN,
    EXPERIENCE;

    /**
     * Returns the enum value based on 
     * @param intType int to 
     * @return the selected enum value.
     */
    public static KnowledgeUnitType getType(int intType) {
        KnowledgeUnitType type = null;

        switch(intType) {
            case 1: type = TECHNICAL;
                break;
            case 2: type = MANAGEMENT;
                break;
            case 3: type = DOMAIN;
                break;
            case 4: type = EXPERIENCE;
                break;
        }
        return type;
    }
}