/*
 * Zed Attack Proxy (ZAP) and its related class files.
 *
 * ZAP is an HTTP/HTTPS proxy for assessing web application security.
 *
 * Copyright 2019 The ZAP Development Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.zaproxy.zap.scan.filters;

/** @author KSASAN preetkaran20@gmail.com */
public final class FilterResult {

    public static final FilterResult FILTERED_RESULT = new FilterResult();

    private final boolean filtered;

    private final String reason;

    private FilterResult() {
        this.filtered = false;
        reason = null;
    }

    public FilterResult(boolean filtered, String reason) {
        this.filtered = filtered;
        this.reason = reason;
    }

    public boolean isFiltered() {
        return filtered;
    }

    public String getReason() {
        return reason;
    }

    @Override
    public String toString() {
        return "FilterResult [filtered=" + filtered + ", reason=" + reason + "]";
    }
}
