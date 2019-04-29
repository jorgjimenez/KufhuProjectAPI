package helpers;
import net.minidev.json.JSONObject;
import utils.RandomVaraibles;
public class CreateJson {



    public JSONObject createTicket(String position){
        Boolean Bench;
        if (position == "Bench"){
            Bench=true;
        }
        else {
            Bench=false;
        }
            JSONObject jsonticket = new JSONObject();
            jsonticket.put("id", "");
            jsonticket.put("title","test001 "+ RandomVaraibles.getRandomString(3) + " " + RandomVaraibles.getRandomString(3));
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
            return jsonticket;
    }
}

