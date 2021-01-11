package io.github.jfermat.strava.api;

import io.github.jfermat.strava.invoker.ApiClient;

import io.github.jfermat.strava.model.ActivityStats;
import io.github.jfermat.strava.model.DetailedAthlete;
import io.github.jfermat.strava.model.Fault;
import io.github.jfermat.strava.model.Zones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-01-10T09:15:14.081+01:00[Europe/Paris]")@Component("io.github.jfermat.strava.api.AthletesApi")
public class AthletesApi {
    private ApiClient apiClient;

    public AthletesApi() {
        this(new ApiClient());
    }

    @Autowired
    public AthletesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get Authenticated Athlete
     * Returns the currently authenticated athlete. Tokens with profile:read_all scope will receive a detailed athlete representation; all others will receive a summary representation.
     * <p><b>200</b> - Profile information for the authenticated athlete.
     * <p><b>0</b> - Unexpected error.
     * @return DetailedAthlete
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DetailedAthlete getLoggedInAthlete() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/athlete").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "strava_oauth" };

        ParameterizedTypeReference<DetailedAthlete> returnType = new ParameterizedTypeReference<DetailedAthlete>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get Zones
     * Returns the the authenticated athlete&#x27;s heart rate and power zones. Requires profile:read_all.
     * <p><b>200</b> - Heart rate and power zones.
     * <p><b>0</b> - Unexpected error.
     * @return Zones
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Zones getLoggedInAthleteZones() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/athlete/zones").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "strava_oauth" };

        ParameterizedTypeReference<Zones> returnType = new ParameterizedTypeReference<Zones>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get Athlete Stats
     * Returns the activity stats of an athlete. Only includes data from activities set to Everyone visibilty.
     * <p><b>200</b> - Activity stats of the athlete.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the athlete. Must match the authenticated athlete.
     * @return ActivityStats
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ActivityStats getStats(Long id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getStats");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/athletes/{id}/stats").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "strava_oauth" };

        ParameterizedTypeReference<ActivityStats> returnType = new ParameterizedTypeReference<ActivityStats>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Update Athlete
     * Update the currently authenticated athlete. Requires profile:write scope.
     * <p><b>200</b> - Profile information for the authenticated athlete.
     * <p><b>0</b> - Unexpected error.
     * @param weight The weight of the athlete in kilograms.
     * @return DetailedAthlete
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DetailedAthlete updateLoggedInAthlete(Float weight) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'weight' is set
        if (weight == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'weight' when calling updateLoggedInAthlete");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("weight", weight);
        String path = UriComponentsBuilder.fromPath("/athlete").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "strava_oauth" };

        ParameterizedTypeReference<DetailedAthlete> returnType = new ParameterizedTypeReference<DetailedAthlete>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
