package com.lgs.eden.api;

import com.lgs.eden.api.auth.AuthAPI;
import com.lgs.eden.api.games.GameAPI;
import com.lgs.eden.api.nexus.LocalHandler;
import com.lgs.eden.api.profile.ProfileAPI;

/**
 * API that will be documented here
 * https://lgsnexus.docs.apiary.io/.
 */
public interface API extends AuthAPI, GameAPI, ProfileAPI {

    // we are creating this variable to reduce the number of letters (NexusHandler.getInstance() vs API.imp)
    // and because we may want some sort of factory pattern.
    API imp = LocalHandler.getInstance();

    // ------------------------------ CONSTANTS ----------------------------- \\

    // urls
    String WEBSITE_URL = "https://lgs-games.com/";

    // lengths
    int LOGIN_MAX_LENGTH = 64;
    int LOGIN_MIN_LENGTH = 4;
    int PASSWORD_MAX_LENGTH = 64;
    int PASSWORD_MIN_LENGTH = 6;

}