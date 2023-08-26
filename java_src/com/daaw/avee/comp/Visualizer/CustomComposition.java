package com.daaw.avee.comp.Visualizer;

import com.daaw.avee.Common.Utils;
import com.daaw.avee.Common.tlog;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class CustomComposition extends CustomPropertiesList implements ICustomization<CustomPropertiesList> {
    static final String KEY_ELEMENTS = "elements";
    private int indexInRoot;
    private JSONArray jsonArray;

    public static CustomComposition CreateNew(int i, JSONObject jSONObject) {
        return new CustomComposition(i, jSONObject, true);
    }

    public static CustomComposition LoadFromJson(int i, JSONObject jSONObject) {
        return new CustomComposition(i, jSONObject, false);
    }

    private CustomComposition(int i, JSONObject jSONObject, boolean z) {
        super(i, jSONObject, (CustomPropertiesList) null);
        this.indexInRoot = i;
        if (z) {
            resetEntries();
            return;
        }
        try {
            this.jsonArray = this.jsonObj.getJSONArray(KEY_ELEMENTS);
        } catch (JSONException e) {
            tlog.w("Failed to create from saved string: " + e.getMessage());
            resetEntries();
        }
    }

    private void resetEntries() {
        try {
            this.jsonArray = new JSONArray();
            this.jsonObj.put(KEY_ELEMENTS, this.jsonArray);
        } catch (JSONException e) {
            tlog.w(e.getMessage());
            this.jsonArray = null;
        }
    }

    public int GetCompositionIndex() {
        return this.indexInRoot;
    }

    @Override // com.daaw.avee.comp.Visualizer.ICustomization
    public int getEntryCount() {
        return this.jsonArray.length();
    }

    public int dataCount() {
        return this.jsonArray.length();
    }

    private JSONObject getNewDataJSONObject() {
        return getNewDataJSONObject(null);
    }

    private JSONObject getNewDataJSONObject(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject != null) {
            try {
                jSONObject2 = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
                tlog.w("json obj cloning failed");
                jSONObject2 = new JSONObject();
            }
        } else {
            jSONObject2 = new JSONObject();
        }
        this.jsonArray.put(jSONObject2);
        return jSONObject2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.daaw.avee.comp.Visualizer.ICustomization
    public CustomPropertiesList createDataEntry() {
        return new CustomPropertiesList(-1, getNewDataJSONObject(), this);
    }

    public CustomPropertiesList createDataEntryClonedFrom(CustomPropertiesList customPropertiesList) {
        return new CustomPropertiesList(-1, getNewDataJSONObject(customPropertiesList.jsonObj), this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.daaw.avee.comp.Visualizer.ICustomization
    public CustomPropertiesList getEntry(int i) {
        return getData(i);
    }

    public void removeAllEntries() {
        resetEntries();
    }

    public void setEntry(int i, CustomPropertiesList customPropertiesList) {
        try {
            this.jsonArray.put(i, customPropertiesList.jsonObj);
        } catch (JSONException unused) {
        }
    }

    public CustomPropertiesList getData(int i) {
        if (i >= 0 && i < this.jsonArray.length()) {
            try {
                return new CustomPropertiesList(i, this.jsonArray.getJSONObject(i), this);
            } catch (JSONException e) {
                tlog.w(e.getMessage());
            }
        }
        return null;
    }

    public CustomPropertiesList getData(List<String> list, int i) {
        int strToIntSafe = list.size() > i ? Utils.strToIntSafe(list.get(i), -1) : -1;
        if (strToIntSafe < 0) {
            return null;
        }
        CustomPropertiesList data = getData(strToIntSafe);
        if (data == null) {
            tlog.w("entry is null");
            return null;
        }
        while (true) {
            i++;
            if (i >= list.size()) {
                return data;
            }
            data = data.getChild(list.get(i));
        }
    }
}
