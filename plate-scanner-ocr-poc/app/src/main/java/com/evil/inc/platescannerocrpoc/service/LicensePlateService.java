package com.evil.inc.platescannerocrpoc.service;

import com.google.gson.JsonObject;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface LicensePlateService {
    @GET("{licensePLate}/validate")
    Call<String> validateLicensePate(@Path("licensePLate") String licensePLate);
}
