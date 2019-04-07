package com.metaring.framework.auth;

import com.metaring.framework.functionality.FunctionalityInfo;
import com.metaring.framework.functionality.FunctionalitiesManager;
import com.metaring.framework.functionality.GeneratedFunctionalitiesManager;
import com.metaring.framework.functionality.Functionality;
import java.util.concurrent.CompletableFuture;
import com.metaring.framework.auth.PreliminaryEnableData;
import java.lang.Boolean;
import com.metaring.framework.type.DataRepresentation;

public class AuthFunctionalitiesManager extends FunctionalitiesManager implements GeneratedFunctionalitiesManager {

    public static final FunctionalityInfo VERIFY_ENABLE = FunctionalityInfo.create("com.metaring.framework.auth.verifyEnable", true, true, false, "com.metaring.framework.auth.PreliminaryEnableData", "java.lang.Boolean");

    public static final FunctionalityInfo VERIFY_IDENTIFICATION = FunctionalityInfo.create("com.metaring.framework.auth.verifyIdentification", true, false, false, "com.metaring.framework.type.DataRepresentation", "java.lang.Boolean");

    public static final CompletableFuture<Boolean> verifyEnable(PreliminaryEnableData preliminaryEnableData) {
        return call(VERIFY_ENABLE, VerifyEnableFunctionality.class, getCallingFunctionality(), preliminaryEnableData, result -> result.asTruth());
    }

    public static final CompletableFuture<Boolean> verifyEnable(Functionality functionality, PreliminaryEnableData preliminaryEnableData) {
        return call(VERIFY_ENABLE, VerifyEnableFunctionality.class, functionality, preliminaryEnableData, result -> result.asTruth());
    }

    public static final CompletableFuture<Boolean> verifyEnableFromJson(String preliminaryEnableDataJson) {
        return callFromJson(VERIFY_ENABLE, VerifyEnableFunctionality.class, getCallingFunctionality(), preliminaryEnableDataJson, result -> result.asTruth());
    }

    public static final CompletableFuture<Boolean> verifyEnableFromJson(Functionality callingFunctionality, String preliminaryEnableDataJson) {
        return callFromJson(VERIFY_ENABLE, VerifyEnableFunctionality.class, callingFunctionality, preliminaryEnableDataJson, result -> result.asTruth());
    }

    public static final CompletableFuture<Boolean> verifyIdentification(DataRepresentation dataRepresentation) {
        return call(VERIFY_IDENTIFICATION, VerifyIdentificationFunctionality.class, getCallingFunctionality(), dataRepresentation, result -> result.asTruth());
    }

    public static final CompletableFuture<Boolean> verifyIdentification(Functionality functionality, DataRepresentation dataRepresentation) {
        return call(VERIFY_IDENTIFICATION, VerifyIdentificationFunctionality.class, functionality, dataRepresentation, result -> result.asTruth());
    }

    public static final CompletableFuture<Boolean> verifyIdentificationFromJson(String dataRepresentationJson) {
        return callFromJson(VERIFY_IDENTIFICATION, VerifyIdentificationFunctionality.class, getCallingFunctionality(), dataRepresentationJson, result -> result.asTruth());
    }

    public static final CompletableFuture<Boolean> verifyIdentificationFromJson(Functionality callingFunctionality, String dataRepresentationJson) {
        return callFromJson(VERIFY_IDENTIFICATION, VerifyIdentificationFunctionality.class, callingFunctionality, dataRepresentationJson, result -> result.asTruth());
    }

}
