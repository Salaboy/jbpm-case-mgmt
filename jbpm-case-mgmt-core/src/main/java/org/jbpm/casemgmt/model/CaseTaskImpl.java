/*
 * Copyright 2015 JBoss by Red Hat.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jbpm.casemgmt.model;

import java.util.Map;
import org.jbpm.casemgmt.api.CaseTask;

/**
 *
 * @author salaboy
 */
public class CaseTaskImpl implements CaseTask {

    private static Long idGenerator = 0L;

    private Long id;
    private String name;
    private Map<String, Object> params;

    public CaseTaskImpl() {
        this.id = ++idGenerator;
    }

    public CaseTaskImpl(String name) {
        this();
        this.name = name;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }

    @Override
    public String toString() {
        return "CaseTaskImpl{" + "id=" + id + ", name=" + name + ", params=" + params + '}';
    }

}
