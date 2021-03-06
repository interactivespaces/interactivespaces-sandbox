/*
 * Copyright (C) 2015 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package interactivespaces.sandbox.service.sequencer;

import interactivespaces.util.resource.ManagedResource;

import java.util.List;

/**
 * A sequence of actions to take place.
 *
 * @author Keith M. Hughes
 */
public interface Sequence extends ManagedResource {

  /**
   * Add a.collection of new element.
   *
   * @param elements
   *          the elements to add
   *
   * @return this sequence
   */
  Sequence add(SequenceElement... elements);

  /**
   * Add a.collection of new element.
   *
   * @param elements
   *          the elements to add
   *
   * @return this sequence
   */
  Sequence add(List<SequenceElement> elements);
}
