/*
 * Copyright 2009 Mustard Grain, Inc.
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

package voldemort.cluster.failuredetector;

import voldemort.cluster.Node;

/**
 * NoopFailureDetector is used for testing classes which don't actually need a
 * working FailureDetector ;)
 * 
 * @author Kirk True
 */

public class NoopFailureDetector implements FailureDetector {

    public long getLastChecked(Node node) {
        return -1;
    }

    public boolean isAvailable(Node node) {
        return false;
    }

    public FailureDetectorConfig getConfig() {
        return null;
    }

    public void recordException(Node node, Exception e) {}

    public void recordSuccess(Node node) {}

    public void waitFor(Node node) {}

    public void addFailureDetectorListener(FailureDetectorListener failureDetectorListener) {}

    public void removeFailureDetectorListener(FailureDetectorListener failureDetectorListener) {}

    public void destroy() {}

}