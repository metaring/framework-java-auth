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

import java.lang.reflect.Field;

import com.metaring.framework.GeneratedCoreType;
import com.metaring.framework.functionality.FunctionalityInfo;

@SuppressWarnings("unchecked")
public class AuthModuleHelper {

    public static final String FUNCTIONALITY_NAME = "functionalityName";
    public static final String FUNCTIONALITY_PARAM = "functionalityParam";

    private static final String IDENTIFICATION_MODULE_INFO_CLASS_NAME = "com.metaring.framework.auth.IdentificationModuleInfo";
    static final FunctionalityInfo IDENTIFICATION_FUNCTIONALITY_INFO;
    public static final Class<? extends GeneratedCoreType> IDENTIFICATION_DATA_CLASS;

    private static final String LIMITED_ACCESS_MODULE_INFO_CLASS_NAME = "com.metaring.framework.auth.LimitedAccessModuleInfo";
    static final FunctionalityInfo LIMITED_ACCESS_FUNCTIONALITY_INFO;
    public static final Class<? extends GeneratedCoreType> ENABLE_DATA_CLASS;

    public static final String STATELESS_REQUEST_KEY = "verify.identification.stateless";

    static {
        FunctionalityInfo identificationFunctionalityInfo = null;
        Class<? extends GeneratedCoreType> identificationDataClass = null;
        try {
            Class<?> identificationModuleInfoClass = Class.forName(IDENTIFICATION_MODULE_INFO_CLASS_NAME);
            Field infoField = identificationModuleInfoClass.getDeclaredField("INFO");
            infoField.setAccessible(true);
            identificationFunctionalityInfo = (FunctionalityInfo) infoField.get(null);
            identificationDataClass = (Class<? extends GeneratedCoreType>) Class.forName(identificationFunctionalityInfo.getInputFullyQualifiedName());
        }
        catch (Exception e) {
        }
        IDENTIFICATION_FUNCTIONALITY_INFO = identificationFunctionalityInfo;
        IDENTIFICATION_DATA_CLASS = identificationDataClass;

        FunctionalityInfo restrictedAccessFunctionalityInfo = null;
        Class<? extends GeneratedCoreType> enableDataClass = null;
        try {
            Class<?> restrictedAccessModuleInfoClass = Class.forName(LIMITED_ACCESS_MODULE_INFO_CLASS_NAME);
            Field infoField = restrictedAccessModuleInfoClass.getDeclaredField("INFO");
            infoField.setAccessible(true);
            restrictedAccessFunctionalityInfo = (FunctionalityInfo) infoField.get(null);
            enableDataClass = (Class<? extends GeneratedCoreType>) Class.forName(restrictedAccessFunctionalityInfo.getInputFullyQualifiedName());
        }
        catch (Exception e) {
        }
        LIMITED_ACCESS_FUNCTIONALITY_INFO = restrictedAccessFunctionalityInfo;
        ENABLE_DATA_CLASS = enableDataClass;
    }
}