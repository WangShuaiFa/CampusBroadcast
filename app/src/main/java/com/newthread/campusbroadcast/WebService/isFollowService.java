package com.newthread.campusbroadcast.WebService;

import com.newthread.campusbroadcast.bean.isFollowBean;
import com.newthread.campusbroadcast.bean.isTrueBean;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by 倪启航 on 2017/7/31.
 */

public interface isFollowService {
    @POST("getMyFollow")
    Call<isFollowBean> getState(
            @Body RequestBody requestBody
    );
}
