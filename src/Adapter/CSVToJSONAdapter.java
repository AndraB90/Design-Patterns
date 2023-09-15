/*package Adapter;

import org.json.JSONArray;

public class CSVToJSONAdapter implements IDataAdapter{
    // It contains an instance of an Adaptee
    private final CSV csv;

    public CSVToJSONAdapter(CSV csv) {
        this.csv = csv;
    }

    public JSON convert(String csvData){
        JSONArray jsonArray = csv.convertToJSON(csvData);
        // Convert JSONArray to JSON object if needed
        return new JSON();
    }
}

 */
