package org.nesty.core.httpserver.rest.response;

import org.nesty.core.httpserver.impl.async.HttpResultStatus;

public class HttpResponse {

    private HttpResultStatus httpStatus;
    private Object httpContent;

    public HttpResponse(HttpResultStatus status) {
        this(status, null);
    }

    public HttpResponse(HttpResultStatus status, Object content) {
        this.httpStatus = status;
        this.httpContent = content;
    }

    public HttpResultStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpResultStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public Object getHttpContent() {
        return httpContent;
    }

    public void setHttpContent(Object httpContent) {
        this.httpContent = httpContent;
    }
}