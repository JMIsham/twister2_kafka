//  Licensed under the Apache License, Version 2.0 (the "License");
//  you may not use this file except in compliance with the License.
//  You may obtain a copy of the License at
//
//  http://www.apache.org/licenses/LICENSE-2.0
//
//  Unless required by applicable law or agreed to in writing, software
//  distributed under the License is distributed on an "AS IS" BASIS,
//  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//  See the License for the specific language governing permissions and
//  limitations under the License.
package edu.iu.dsc.tws.task.taskgraphbuilder;

import java.util.Set;

import edu.iu.dsc.tws.task.api.Task;

/**
 * This is the main interface for the dataflow task graph parser.
 */
public interface IDataflowTaskGraphParser {

  Set<Task> dataflowTaskGraphParseAndSchedule();

  Set<Task> taskGraphParseAndSchedule();

  Set<Task> dataflowTaskGraphParseAndSchedule(int containerId);

  Set<TaskGraphMapper> dataflowTGraphParseAndSchedule();
}
