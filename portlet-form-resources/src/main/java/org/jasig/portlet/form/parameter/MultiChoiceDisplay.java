/**
 * Licensed to Jasig under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Jasig licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a
 * copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.jasig.portlet.form.parameter;

/**
 * Enumeration of recognized multi-valued constrained parameter display types.
 * 
 * @author Jen Bourey, jennifer.bourey@gmail.com
 * @version $Revision$
 */
public enum MultiChoiceDisplay {

    HIDDEN("hidden"),          // multiple hidden fields with the same parameter name
    SELECT("select"),          // multi-select menu
    CHECKBOX("checkbox");      // checkboxes
    
    private final String value;

    MultiChoiceDisplay(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MultiChoiceDisplay fromValue(String v) {
        for (MultiChoiceDisplay c : MultiChoiceDisplay.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
