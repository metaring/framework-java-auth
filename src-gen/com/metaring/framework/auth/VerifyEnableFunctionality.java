package com.metaring.framework.auth;

import com.metaring.framework.SysKB;
import java.util.concurrent.CompletableFuture;
import com.metaring.framework.functionality.AbstractFunctionality;
import com.metaring.framework.functionality.GeneratedFunctionality;
import com.metaring.framework.auth.PreliminaryEnableData;

public abstract class VerifyEnableFunctionality extends AbstractFunctionality implements GeneratedFunctionality {

    protected VerifyEnableFunctionality(SysKB sysKB) {
        super(sysKB, AuthFunctionalitiesManager.VERIFY_ENABLE, Boolean.class);
    }

    @Override
    protected final CompletableFuture<Void> beforePreConditionCheck(Object input) throws Exception {
        CompletableFuture<Void> response = beforePreConditionCheck(input == null ? null : (PreliminaryEnableData) input);
        return response == null ? end : response;
    }

    protected CompletableFuture<Void> beforePreConditionCheck(PreliminaryEnableData input) throws Exception {
        return end;
    }

    @Override
    protected final CompletableFuture<Void> preConditionCheck(Object input) throws Exception {
        CompletableFuture<Void> response = preConditionCheck(input == null ? null : (PreliminaryEnableData) input);
        return response == null ? end : response;
    }

    protected abstract CompletableFuture<Void> preConditionCheck(PreliminaryEnableData input) throws Exception;

    @Override
    protected final CompletableFuture<Void> afterPreConditionCheck(Object input) throws Exception {
        CompletableFuture<Void> response = afterPreConditionCheck(input == null ? null : (PreliminaryEnableData) input);
        return response == null ? end : response;
    }

    protected CompletableFuture<Void> afterPreConditionCheck(PreliminaryEnableData input) throws Exception {
        return end;
    }

    @Override
    protected final CompletableFuture<Void> beforeCall(Object input) throws Exception {
        CompletableFuture<Void> response = beforeCall(input == null ? null : (PreliminaryEnableData) input);
        return response == null ? end : response;
    }

    protected CompletableFuture<Void> beforeCall(PreliminaryEnableData input) throws Exception {
        return end;
    }

    @Override
    protected final CompletableFuture<Object> call(Object input) throws Exception {
        CompletableFuture<Boolean> call = call((PreliminaryEnableData) input);
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

    protected abstract CompletableFuture<Boolean> call(PreliminaryEnableData input) throws Exception;

    @Override
    protected final CompletableFuture<Void> afterCall(Object input, Object output) throws Exception {
        CompletableFuture<Void> response = afterCall(input == null ? null : (PreliminaryEnableData) input, output == null ? null : (Boolean) output);
        return response == null ? end : response;
    }

    protected CompletableFuture<Void> afterCall(PreliminaryEnableData input, Boolean output) throws Exception {
        return end;
    }

    @Override
    protected final CompletableFuture<Void> beforePostConditionCheck(Object input, Object output) throws Exception {
        CompletableFuture<Void> response = beforePostConditionCheck(input == null ? null : (PreliminaryEnableData) input, output == null ? null : (Boolean) output);
        return response == null ? end : response;
    }

    protected CompletableFuture<Void> beforePostConditionCheck(PreliminaryEnableData input, Boolean output) throws Exception {
        return end;
    }

    @Override
    protected final CompletableFuture<Void> postConditionCheck(Object input, Object output) throws Exception {
        CompletableFuture<Void> response = postConditionCheck(input == null ? null : (PreliminaryEnableData) input, output == null ? null : (Boolean) output);
        return response == null ? end : response;
    }

    protected abstract CompletableFuture<Void> postConditionCheck(PreliminaryEnableData input, Boolean output) throws Exception;

    @Override
    protected final CompletableFuture<Void> afterPostConditionCheck(Object input, Object output) throws Exception {
        CompletableFuture<Void> response = afterPostConditionCheck(input == null ? null : (PreliminaryEnableData) input, output == null ? null : (Boolean) output);
        return response == null ? end : response;
    }

    protected CompletableFuture<Void> afterPostConditionCheck(PreliminaryEnableData input, Boolean output) throws Exception {
        return end;
    }

    @Override
    protected final Object getInputFromJsonWork(String inputJson) {
        return PreliminaryEnableData.fromJson(inputJson);
    }

    protected static final VerifyEnableFunctionality create(SysKB sysKB) {
        return new VerifyEnableFunctionalityImpl(sysKB);
    }
}