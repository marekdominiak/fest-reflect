/*
 * Created on Feb 25, 2011
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright @2011 the original author or authors.
 */
package org.fest.reflect.constructor;

/**
 * Implements a fluent interface for invoking constructors.
 *
 * @author Alex Ruiz
 * @author Yvonne Wang
 */
public class Constructors {

  /**
   * Sets the class declaring the constructor.
   * @param <T> the generic type of the given class.
   * @param target the class declaring the constructor.
   * @return the next object in the fluent interface.
   */
  public static <T> ParameterTypes<T> constructorIn(Class<T> target) {
    // TODO check for null
    return new FluentConstructor<T>(target);
  }

  private Constructors() {}
}