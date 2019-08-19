/**
 *    Copyright 2019 MetaRing s.r.l.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.metaring.framework.auth;

import java.util.concurrent.CompletableFuture;

import com.metaring.framework.functionality.CriticalMissingValuesException;
import com.metaring.framework.functionality.FunctionalitiesManager;
import com.metaring.framework.type.DataRepresentation;

class VerifyIdentificationFunctionalityImpl extends VerifyIdentificationFunctionality {

    @Override
    protected CompletableFuture<Void> preConditionCheck(DataRepresentation payload) throws Exception {
        if (payload == null) {
            throw new CriticalMissingValuesException(this.getContext().getStackElementSeries(), "payload");
        }
        return end;
    }

    @Override
    protected CompletableFuture<Boolean> call(DataRepresentation input) throws Exception {
        return FunctionalitiesManager.callFromJson(AuthModuleHelper.IDENTIFICATION_FUNCTIONALITY_INFO, this, input.toJson(), DataRepresentation::asTruth);
    }

    @Override
    protected CompletableFuture<Void> postConditionCheck(DataRepresentation input, Boolean output) throws Exception {
        return end;
    }
}