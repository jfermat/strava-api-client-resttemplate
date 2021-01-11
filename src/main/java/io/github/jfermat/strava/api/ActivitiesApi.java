package io.github.jfermat.strava.api;

import io.github.jfermat.strava.invoker.ApiClient;

import io.github.jfermat.strava.model.ActivityZone;
import io.github.jfermat.strava.model.Comment;
import io.github.jfermat.strava.model.DetailedActivity;
import io.github.jfermat.strava.model.Fault;
import io.github.jfermat.strava.model.Lap;
import org.threeten.bp.OffsetDateTime;
import io.github.jfermat.strava.model.SummaryActivity;
import io.github.jfermat.strava.model.SummaryAthlete;
import io.github.jfermat.strava.model.UpdatableActivity;

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

@Component("io.github.jfermat.strava.api.ActivitiesApi")
public class ActivitiesApi {
    private ApiClient apiClient;

    public ActivitiesApi() {
        this(new ApiClient());
    }

    @Autowired
    public ActivitiesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create an Activity
     * Creates a manual activity for an athlete, requires activity:write scope.
     * <p><b>201</b> - The activity&#x27;s detailed representation.
     * <p><b>0</b> - Unexpected error.
     * @param name The name parameter
     * @param type The type parameter
     * @param startDateLocal The startDateLocal parameter
     * @param elapsedTime The elapsedTime parameter
     * @param description The description parameter
     * @param distance The distance parameter
     * @param trainer The trainer parameter
     * @param commute The commute parameter
     * @return DetailedActivity
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DetailedActivity createActivity(String name, String type, OffsetDateTime startDateLocal, Integer elapsedTime, String description, Float distance, Integer trainer, Integer commute) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling createActivity");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'type' when calling createActivity");
        }
        // verify the required parameter 'startDateLocal' is set
        if (startDateLocal == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'startDateLocal' when calling createActivity");
        }
        // verify the required parameter 'elapsedTime' is set
        if (elapsedTime == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'elapsedTime' when calling createActivity");
        }
        // verify the required parameter 'description' is set
        if (description == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'description' when calling createActivity");
        }
        // verify the required parameter 'distance' is set
        if (distance == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'distance' when calling createActivity");
        }
        // verify the required parameter 'trainer' is set
        if (trainer == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'trainer' when calling createActivity");
        }
        // verify the required parameter 'commute' is set
        if (commute == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commute' when calling createActivity");
        }
        String path = UriComponentsBuilder.fromPath("/activities").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        if (name != null)
            formParams.add("name", name);
        if (type != null)
            formParams.add("type", type);
        if (startDateLocal != null)
            formParams.add("start_date_local", startDateLocal);
        if (elapsedTime != null)
            formParams.add("elapsed_time", elapsedTime);
        if (description != null)
            formParams.add("description", description);
        if (distance != null)
            formParams.add("distance", distance);
        if (trainer != null)
            formParams.add("trainer", trainer);
        if (commute != null)
            formParams.add("commute", commute);

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "strava_oauth" };

        ParameterizedTypeReference<DetailedActivity> returnType = new ParameterizedTypeReference<DetailedActivity>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get Activity
     * Returns the given activity that is owned by the authenticated athlete. Requires activity:read for Everyone and Followers activities. Requires activity:read_all for Only Me activities.
     * <p><b>200</b> - The activity&#x27;s detailed representation.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the activity.
     * @param includeAllEfforts To include all segments efforts.
     * @return DetailedActivity
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DetailedActivity getActivityById(Long id, Boolean includeAllEfforts) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getActivityById");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/activities/{id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "include_all_efforts", includeAllEfforts));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "strava_oauth" };

        ParameterizedTypeReference<DetailedActivity> returnType = new ParameterizedTypeReference<DetailedActivity>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Activity Comments
     * Returns the comments on the given activity. Requires activity:read for Everyone and Followers activities. Requires activity:read_all for Only Me activities.
     * <p><b>200</b> - Comments.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the activity.
     * @param page Page number. Defaults to 1.
     * @param perPage Number of items per page. Defaults to 30.
     * @return List&lt;Comment&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Comment> getCommentsByActivityId(Long id, Integer page, Integer perPage) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getCommentsByActivityId");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/activities/{id}/comments").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "strava_oauth" };

        ParameterizedTypeReference<List<Comment>> returnType = new ParameterizedTypeReference<List<Comment>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Activity Kudoers
     * Returns the athletes who kudoed an activity identified by an identifier. Requires activity:read for Everyone and Followers activities. Requires activity:read_all for Only Me activities.
     * <p><b>200</b> - Comments.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the activity.
     * @param page Page number. Defaults to 1.
     * @param perPage Number of items per page. Defaults to 30.
     * @return List&lt;SummaryAthlete&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<SummaryAthlete> getKudoersByActivityId(Long id, Integer page, Integer perPage) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getKudoersByActivityId");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/activities/{id}/kudos").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "strava_oauth" };

        ParameterizedTypeReference<List<SummaryAthlete>> returnType = new ParameterizedTypeReference<List<SummaryAthlete>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Activity Laps
     * Returns the laps of an activity identified by an identifier. Requires activity:read for Everyone and Followers activities. Requires activity:read_all for Only Me activities.
     * <p><b>200</b> - Activity Laps.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the activity.
     * @return List&lt;Lap&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Lap> getLapsByActivityId(Long id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getLapsByActivityId");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/activities/{id}/laps").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<List<Lap>> returnType = new ParameterizedTypeReference<List<Lap>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Athlete Activities
     * Returns the activities of an athlete for a specific identifier. Requires activity:read. Only Me activities will be filtered out unless requested by a token with activity:read_all.
     * <p><b>200</b> - The authenticated athlete&#x27;s activities
     * <p><b>0</b> - Unexpected error.
     * @param before An epoch timestamp to use for filtering activities that have taken place before a certain time.
     * @param after An epoch timestamp to use for filtering activities that have taken place after a certain time.
     * @param page Page number. Defaults to 1.
     * @param perPage Number of items per page. Defaults to 30.
     * @return List&lt;SummaryActivity&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<SummaryActivity> getLoggedInAthleteActivities(Integer before, Integer after, Integer page, Integer perPage) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/athlete/activities").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "before", before));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "after", after));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "strava_oauth" };

        ParameterizedTypeReference<List<SummaryActivity>> returnType = new ParameterizedTypeReference<List<SummaryActivity>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get Activity Zones
     * Summit Feature. Returns the zones of a given activity. Requires activity:read for Everyone and Followers activities. Requires activity:read_all for Only Me activities.
     * <p><b>200</b> - Activity Zones.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the activity.
     * @return List&lt;ActivityZone&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ActivityZone> getZonesByActivityId(Long id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getZonesByActivityId");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/activities/{id}/zones").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<List<ActivityZone>> returnType = new ParameterizedTypeReference<List<ActivityZone>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Update Activity
     * Updates the given activity that is owned by the authenticated athlete. Requires activity:write. Also requires activity:read_all in order to update Only Me activities
     * <p><b>200</b> - The activity&#x27;s detailed representation.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the activity.
     * @param body The body parameter
     * @return DetailedActivity
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DetailedActivity updateActivityById(Long id, UpdatableActivity body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateActivityById");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/activities/{id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "*/*"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "strava_oauth" };

        ParameterizedTypeReference<DetailedActivity> returnType = new ParameterizedTypeReference<DetailedActivity>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
