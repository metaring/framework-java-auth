package com.metaring.framework.auth;

import java.util.concurrent.CompletableFuture;
import com.metaring.framework.Tools;
import com.metaring.framework.functionality.AbstractFunctionality;
import com.metaring.framework.functionality.GeneratedFunctionality;
import com.metaring.framework.functionality.FunctionalityInfo;
import com.metaring.framework.type.DataRepresentation;

abstract class VerifyIdentificationFunctionality extends AbstractFunctionality implements GeneratedFunctionality {

    static final FunctionalityInfo INFO = FunctionalityInfo.create("com.metaring.framework.auth.verifyIdentification", true, false, false, "com.metaring.framework.type.DataRepresentation", "java.lang.Boolean");

    static final VerifyIdentificationFunctionality INSTANCE = new VerifyIdentificationFunctionalityImpl();

    protected VerifyIdentificationFunctionality() {
        super(INFO, Boolean.class);
    }

    @Override
    protected final CompletableFuture<Void> beforePreConditionCheck(Object input) throws Exception {
        CompletableFuture<Void> response = beforePreConditionCheck(input == null ? null : (DataRepresentation) input);
        return response == null ? end : response;
    }

    protected CompletableFuture<Void> beforePreConditionCheck(DataRepresentation input) throws Exception {
        return end;
    }

    @Override
    protected final CompletableFuture<Void> preConditionCheck(Object input) throws Exception {
        CompletableFuture<Void> response = preConditionCheck(input == null ? null : (DataRepresentation) input);
        return response == null ? end : response;
    }

    protected abstract CompletableFuture<Void> preConditionCheck(DataRepresentation input) throws Exception;

    @Override
    protected final CompletableFuture<Void> afterPreConditionCheck(Object input) throws Exception {
        CompletableFuture<Void> response = afterPreConditionCheck(input == null ? null : (DataRepresentation) input);
        return response == null ? end : response;
    }

    protected CompletableFuture<Void> afterPreConditionCheck(DataRepresentation input) throws Exception {
        return end;
    }

    @Override
    protected final CompletableFuture<Void> beforeCall(Object input) throws Exception {
        CompletableFuture<Void> response = beforeCall(input == null ? null : (DataRepresentation) input);
        return response == null ? end : response;
    }

    protected CompletableFuture<Void> beforeCall(DataRepresentation input) throws Exception {
        return end;
    }

    @Override
    protected final CompletableFuture<Object> call(Object input) throws Exception {
        CompletableFuture<Boolean> call = call((DataRepresentation) input);
        if(call == null) {
            return end(null);
        }
        final CompletableFuture<Object> response = new CompletableFuture<>();
        call.whenCompleteAsync((result, error) -> {
            if(error != null) {
                response.completeExceptionally(error);
                return;
            }
            response.complete(result);
        }, EXECUTOR);
        return response;
    }

    protected abstract CompletableFuture<Boolean> call(DataRepresentation input) throws Exception;

    @Override
    protected final CompletableFuture<Void> afterCall(Object input, Object output) throws Exception {
        CompletableFuture<Void> response = afterCall(input == null ? null : (DataRepresentation) input, output == null ? null : (Boolean) output);
        return response == null ? end : response;
    }

    protected CompletableFuture<Void> afterCall(DataRepresentation input, Boolean output) throws Exception {
        return end;
    }

    @Override
    protected final CompletableFuture<Void> beforePostConditionCheck(Object input, Object output) throws Exception {
        CompletableFuture<Void> response = beforePostConditionCheck(input == null ? null : (DataRepresentation) input, output == null ? null : (Boolean) output);
        return response == null ? end : response;
    }

    protected CompletableFuture<Void> beforePostConditionCheck(DataRepresentation input, Boolean output) throws Exception {
        return end;
    }

    @Override
    protected final CompletableFuture<Void> postConditionCheck(Object input, Object output) throws Exception {
        CompletableFuture<Void> response = postConditionCheck(input == null ? null : (DataRepresentation) input, output == null ? null : (Boolean) output);
        return response == null ? end : response;
    }

    protected abstract CompletableFuture<Void> postConditionCheck(DataRepresentation input, Boolean output) throws Exception;

    @Override
    protected final CompletableFuture<Void> afterPostConditionCheck(Object input, Object output) throws Exception {
        CompletableFuture<Void> response = afterPostConditionCheck(input == null ? null : (DataRepresentation) input, output == null ? null : (Boolean) output);
        return response == null ? end : response;
    }

    protected CompletableFuture<Void> afterPostConditionCheck(DataRepresentation input, Boolean output) throws Exception {
        return end;
    }

    @Override
    protected final Object getInputFromJsonWork(String inputJson) {
        return Tools.FACTORY_DATA_REPRESENTATION.fromJson(inputJson);
    }
}