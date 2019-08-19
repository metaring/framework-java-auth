package com.metaring.framework.auth;

import com.metaring.framework.Tools;
import com.metaring.framework.type.DataRepresentation;
import com.metaring.framework.GeneratedCoreType;

public class PreliminaryEnableData implements GeneratedCoreType {

    public static final String FULLY_QUALIFIED_NAME = "com.metaring.framework.auth.preliminaryEnableData";

    private DataRepresentation data;
    private String functionalityName;
    private DataRepresentation functionalityParam;

    private PreliminaryEnableData(DataRepresentation data, String functionalityName, DataRepresentation functionalityParam) {
        this.data = data;
        this.functionalityName = functionalityName;
        this.functionalityParam = functionalityParam;
    }

    public DataRepresentation getData() {
        return this.data;
    }

    public String getFunctionalityName() {
        return this.functionalityName;
    }

    public DataRepresentation getFunctionalityParam() {
        return this.functionalityParam;
    }

    public static PreliminaryEnableData create(DataRepresentation data, String functionalityName, DataRepresentation functionalityParam) {
        return new PreliminaryEnableData(data, functionalityName, functionalityParam);
    }

    public static PreliminaryEnableData fromJson(String jsonString) {

        if(jsonString == null) {
            return null;
        }

        jsonString = jsonString.trim();
        if(jsonString.isEmpty()) {
            return null;
        }

        if(jsonString.equalsIgnoreCase("null")) {
            return null;
        }

        DataRepresentation dataRepresentation = Tools.FACTORY_DATA_REPRESENTATION.fromJson(jsonString);

        DataRepresentation data = null;
        if(dataRepresentation.hasProperty("data")) {
            try {
                data = dataRepresentation.get("data");
            } catch (Exception e) {
            }
        }

        String functionalityName = null;
        if(dataRepresentation.hasProperty("functionalityName")) {
            try {
                functionalityName = dataRepresentation.getText("functionalityName");
            } catch (Exception e) {
            }
        }

        DataRepresentation functionalityParam = null;
        if(dataRepresentation.hasProperty("functionalityParam")) {
            try {
                functionalityParam = dataRepresentation.get("functionalityParam");
            } catch (Exception e) {
            }
        }

        PreliminaryEnableData preliminaryEnableData = create(data, functionalityName, functionalityParam);
        return preliminaryEnableData;
    }

    public static PreliminaryEnableData fromObject(Object object) {

        if(object == null) {
            return null;
        }

        DataRepresentation dataRepresentation = Tools.FACTORY_DATA_REPRESENTATION.fromObject(object);

        DataRepresentation data = null;
        if(dataRepresentation.hasProperty("data")) {
            try {
                data = dataRepresentation.get("data");
            } catch (Exception e) {
            }
        }

        String functionalityName = null;
        if(dataRepresentation.hasProperty("functionalityName")) {
            try {
                functionalityName = dataRepresentation.getText("functionalityName");
            } catch (Exception e) {
            }
        }

        DataRepresentation functionalityParam = null;
        if(dataRepresentation.hasProperty("functionalityParam")) {
            try {
                functionalityParam = dataRepresentation.get("functionalityParam");
            } catch (Exception e) {
            }
        }

        PreliminaryEnableData preliminaryEnableData = create(data, functionalityName, functionalityParam);
        return preliminaryEnableData;
    }

    public DataRepresentation toDataRepresentation() {
        DataRepresentation dataRepresentation = Tools.FACTORY_DATA_REPRESENTATION.create();
        if (data != null) {
            dataRepresentation.add("data", data);
        }

        if (functionalityName != null) {
            dataRepresentation.add("functionalityName", functionalityName);
        }

        if (functionalityParam != null) {
            dataRepresentation.add("functionalityParam", functionalityParam);
        }

        return dataRepresentation;
    }

    @Override
    public String toJson() {
        return toDataRepresentation().toJson();
    }

    @Override
    public String toString() {
        return this.toJson();
    }
}