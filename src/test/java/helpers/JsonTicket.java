package helpers;

import net.minidev.json.JSONObject;
import utils.DataSession;
import utils.RandomVaraibles;

public class JsonTicket {
    private JSONObject jsonticket = new JSONObject();

    public JSONObject createTicket(String position) {
        Boolean Bench;
        if (position == "Bench") {
            Bench = true;
        } else {
            Bench = false;
        }

        jsonticket.put("id", "");
        jsonticket.put("title", "test001 " + RandomVaraibles.getRandomString(3) + " " + RandomVaraibles.getRandomString(3));
        jsonticket.put("projectName", RandomVaraibles.getRandomString(4));
        jsonticket.put("projectStartDate", "11-11-2019");
        jsonticket.put("clientName", RandomVaraibles.getRandomString(5));
        jsonticket.put("agu", RandomVaraibles.getRandomString(4));
        jsonticket.put("du", RandomVaraibles.getRandomString(4));
        jsonticket.put("grade", RandomVaraibles.getRandomGrade());
        jsonticket.put("priority", RandomVaraibles.getRandomPririty());
        jsonticket.put("positionBrief", RandomVaraibles.getRandomString(10));
        jsonticket.put("isBench", Bench);
        jsonticket.put("projectCode", RandomVaraibles.getRandomString(2));
        jsonticket.put("status", RandomVaraibles.getRandomString(2));

        saveTicket();
        return jsonticket;
    }

    public void saveTicket(){
        DataSession.setInSession(DataSession.Data.title, jsonticket.get("title"));
        DataSession.setInSession(DataSession.Data.projectName, jsonticket.get("projectName"));
        DataSession.setInSession(DataSession.Data.projectStartDate, jsonticket.get("projectStartDate"));
        DataSession.setInSession(DataSession.Data.clientName, jsonticket.get("clientName"));
        DataSession.setInSession(DataSession.Data.agu, jsonticket.get("agu"));
        DataSession.setInSession(DataSession.Data.du, jsonticket.get("du"));
        DataSession.setInSession(DataSession.Data.grade, jsonticket.get("grade"));
        DataSession.setInSession(DataSession.Data.priority, jsonticket.get("priority"));
        DataSession.setInSession(DataSession.Data.positionBrief, jsonticket.get("positionBrief"));
        DataSession.setInSession(DataSession.Data.isBench, jsonticket.get("isBench"));
        DataSession.setInSession(DataSession.Data.projectCode, jsonticket.get("projectCode"));
        DataSession.setInSession(DataSession.Data.status, jsonticket.get("status"));


    }
}

