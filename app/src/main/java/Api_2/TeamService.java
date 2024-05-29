package Api_2;

import api_1.TeamResponse;
import retrofit2.Call;
import retrofit2.http.GET;

public interface TeamService {
    @GET("search_all_teams.php?l=Spanish%20La%20Liga")
    Call<TeamResponse2> getTeams();
}
