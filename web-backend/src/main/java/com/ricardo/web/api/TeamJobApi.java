package com.ricardo.web.api;

import com.ricardo.web.model.Result;
import com.ricardo.web.model.param.TeamJobParam;
import com.ricardo.web.service.TeamJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/teamjob")
public class TeamJobApi {

    @Autowired
    private TeamJobService teamJobService;

    @PostMapping("/add")
    public Result addOrUpdateTeamJob(@RequestBody TeamJobParam param){
        return teamJobService.addOrUpdateTeamJob(param);
    }
}
