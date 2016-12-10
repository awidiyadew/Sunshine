package app.sunshine.android.example.com.sunshine;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


/**
 * Created by awidiyadew on 10/12/16.
 */

public class WeatherDataParser {
    public static double getMaxTemperatureForDay(String weatherJsonStr, int dayIndex)
        throws JSONException {
            JSONObject weather = new JSONObject(weatherJsonStr);
            JSONArray days = weather.getJSONArray("list");
            JSONObject dayInfo = days.getJSONObject(dayIndex);
            JSONObject tempInfo = dayInfo.getJSONObject("temp");
        return tempInfo.getDouble("max") ;
    }

}
