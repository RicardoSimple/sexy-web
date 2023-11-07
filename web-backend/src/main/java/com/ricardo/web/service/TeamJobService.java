package com.ricardo.web.service;

import com.ricardo.web.model.Result;
import com.ricardo.web.model.param.TeamJobParam;

public interface TeamJobService {
    Result addOrUpdateTeamJob(TeamJobParam param);

    Result getTeamJobByTeamId(String teamId);

    Result getTeamJobByTeamName(String teamname);
}
