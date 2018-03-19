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
package edu.iu.dsc.tws.executor.api.blockqueue;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Created by vibhatha on 9/5/17.
 */
public class BlockingQueueImpl implements BlockingQueue {
  @Override
  public boolean add(Object o) {
    return false;
  }

  @Override
  public boolean offer(Object o) {
    return false;
  }

  @Override
  public Object remove() {
    return null;
  }

  @Override
  public Object poll() {
    return null;
  }

  @Override
  public Object element() {
    return null;
  }

  @Override
  public Object peek() {
    return null;
  }

  @Override
  public void put(Object o) throws InterruptedException {

  }

  @Override
  public boolean offer(Object o, long timeout, TimeUnit unit) throws InterruptedException {
    return false;
  }

  @Override
  public Object take() throws InterruptedException {
    return null;
  }

  @Override
  public Object poll(long timeout, TimeUnit unit) throws InterruptedException {
    return null;
  }

  @Override
  public int remainingCapacity() {
    return 0;
  }

  @Override
  public boolean remove(Object o) {
    return false;
  }

  @Override
  public boolean addAll(Collection c) {
    return false;
  }

  @Override
  public void clear() {

  }

  @Override
  public boolean retainAll(Collection c) {
    return false;
  }

  @Override
  public boolean removeAll(Collection c) {
    return false;
  }

  @Override
  public boolean containsAll(Collection c) {
    return false;
  }

  @Override
  public int size() {
    return 0;
  }

  @Override
  public boolean isEmpty() {
    return false;
  }

  @Override
  public boolean contains(Object o) {
    return false;
  }

  @Override
  public Iterator iterator() {
    return null;
  }

  @Override
  public Object[] toArray() {
    return new Object[0];
  }

  @Override
  public Object[] toArray(Object[] a) {
    return new Object[0];
  }

  @Override
  public int drainTo(Collection c) {
    return 0;
  }

  @Override
  public int drainTo(Collection c, int maxElements) {
    return 0;
  }
}
