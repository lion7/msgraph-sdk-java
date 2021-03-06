// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookChartSeriesFormatRequest;
import com.microsoft.graph.requests.extensions.WorkbookChartSeriesFormatRequest;
import com.microsoft.graph.requests.extensions.IWorkbookChartFillRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartFillRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookChartLineFormatRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartLineFormatRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Series Format Request Builder.
 */
public class WorkbookChartSeriesFormatRequestBuilder extends BaseRequestBuilder implements IWorkbookChartSeriesFormatRequestBuilder {

    /**
     * The request builder for the WorkbookChartSeriesFormat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartSeriesFormatRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IWorkbookChartSeriesFormatRequest instance
     */
    public IWorkbookChartSeriesFormatRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookChartSeriesFormatRequest instance
     */
    public IWorkbookChartSeriesFormatRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new WorkbookChartSeriesFormatRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for WorkbookChartFill
     *
     * @return the IWorkbookChartFillRequestBuilder instance
     */
    public IWorkbookChartFillRequestBuilder fill() {
        return new WorkbookChartFillRequestBuilder(getRequestUrlWithAdditionalSegment("fill"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookChartLineFormat
     *
     * @return the IWorkbookChartLineFormatRequestBuilder instance
     */
    public IWorkbookChartLineFormatRequestBuilder line() {
        return new WorkbookChartLineFormatRequestBuilder(getRequestUrlWithAdditionalSegment("line"), getClient(), null);
    }
}

