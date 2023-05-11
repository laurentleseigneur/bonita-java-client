/** 
 * Copyright (C) 2023 BonitaSoft S.A.
 * BonitaSoft, 32 rue Gustave Eiffel - 38000 Grenoble
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2.0 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.bonitasoft.web.client.api;

import org.bonitasoft.web.client.invoker.ApiClient;
import org.bonitasoft.web.client.model.ApiResponse;
import org.bonitasoft.web.client.model.ProcessInfo;

import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public interface ProcessInfoApi extends ApiClient.Api {

    /**
     * Finds the ProcessInfo by ID
     * Since 2022.2 ![edition](https://img.shields.io/badge/edition-entreprise-blue) Returns the single ProcessInfo for the given ID
     * 
     * @param id ID of the ProcessInfo to return (required)
     * @return ProcessInfo
     */
    @RequestLine("GET /API/bpm/processInfo/{id}")
    @Headers({
            "Accept: application/json",
    })
    ProcessInfo getProcessInfoById(@Param("id") String id);

    /**
     * Finds the ProcessInfo by ID
     * Similar to <code>getProcessInfoById</code> but it also returns the http response headers .
     * Since 2022.2 ![edition](https://img.shields.io/badge/edition-entreprise-blue) Returns the single ProcessInfo for the given ID
     * 
     * @param id ID of the ProcessInfo to return (required)
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("GET /API/bpm/processInfo/{id}")
    @Headers({
            "Accept: application/json",
    })
    ApiResponse<ProcessInfo> getProcessInfoByIdWithHttpInfo(@Param("id") String id);

}
