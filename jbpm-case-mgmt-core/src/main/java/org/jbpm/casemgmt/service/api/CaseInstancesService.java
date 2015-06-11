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
package org.jbpm.casemgmt.service.api;

import java.util.List;
import org.jbpm.casemgmt.api.CaseInstance;
import org.jbpm.casemgmt.api.CaseTask;
import org.jbpm.casemgmt.api.HumanTask;
import org.jbpm.casemgmt.api.ProcessTask;
import org.jbpm.services.api.model.ProcessInstanceDesc;
import org.kie.api.task.model.TaskSummary;
import org.kie.internal.query.QueryFilter;

/**
 *
 * @author salaboy
 */
public interface CaseInstancesService {
    
    List<CaseInstance> getCaseInstances(QueryFilter qf);
    
    Long createCaseInstance(String caseIdentifier, String recipient, String deploymentId, String template);
    
    void registerLifeCycleListener(CaseInstanceLifeCycleListener listener);
    
    void activateCaseInstance(Long caseId);
    
    void closeCaseInstance(Long caseId);
    
    void terminateCaseInstance(Long caseId);
    
    void suspendCaseInstance(Long caseId);
    
    void addHumanTask(Long caseId, HumanTask humanTask);
    
    void addProcessTask(Long caseId, ProcessTask processTask);
    
    void addCaseTask(Long caseId, CaseTask caseTask);
    
    CaseInstance getCaseInstanceById(Long caseId);
    
    List<TaskSummary> getAllCaseHumanTasks(Long caseId);
    
    List<ProcessInstanceDesc> getAllCaseProcessTasks(Long caseId);
    
    List<CaseInstance> getAllCaseCaseTasks(Long caseId);
    
}
