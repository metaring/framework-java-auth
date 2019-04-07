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

import com.metaring.framework.functionality.FunctionalityStackElementSeries;
import com.metaring.framework.functionality.UnmanagedException;

public class InternalFunctionalityAccessException extends UnmanagedException {
    private static final long serialVersionUID = -6943518401272581053L;

    public InternalFunctionalityAccessException(FunctionalityStackElementSeries functionalityStackElementSeries, String functionalityName) {
        super(functionalityStackElementSeries, "Trying to directly access to the INTERNAL Functionality " + functionalityName);
    }
}
