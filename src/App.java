import java.util.List;

import org.json.simple.JSONObject;

public class App {
    public static void main(String[] args) {
        
        List placeInfo= null;
        String place = "아주캠프";
        placeInfo= KakaoMapProviderDAO.getInstance().findPlace(place);
        System.out.println(placeInfo.get(0));
        System.out.println(placeInfo.get(1));
        System.out.println(placeInfo.get(2));
        System.out.println(placeInfo.get(3));
        
        JSONObject jsonObject = new JSONObject();
            jsonObject.put("category", KakaoMapProviderDAO.getInstance().findPlace(place).get(1));

            System.out.println(jsonObject);
    }
}
