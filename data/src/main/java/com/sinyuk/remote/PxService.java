package com.sinyuk.remote;

import com.sinyuk.entities.Feature;

import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by sinyuk on 2016/12/9.
 */

public interface PxService {
    @GET("photos")
    Observable<Response<BaseResponse<Feature>>> getPhotos(@Query("feature") String feature);
}