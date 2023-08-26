package com.daaw.avee.comp.Visualizer;

import com.daaw.avee.Common.Utils;
import com.daaw.avee.Common.tlog;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class CustomScene implements ICustomization<CustomComposition> {
    static final String KEY_COMPOSITIONS = "compositions";
    private JSONArray jsonArray;
    private JSONObject jsonRoot;

    public static CustomScene Create() {
        return new CustomScene(null);
    }

    public static CustomScene CreateFromString(String str) {
        JSONObject jSONObject;
        if (str == null) {
            return null;
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
        }
        return new CustomScene(jSONObject);
    }

    public static CustomScene CreateFromJson(JSONObject jSONObject) {
        return new CustomScene(jSONObject);
    }

    private CustomScene(JSONObject jSONObject) {
        if (jSONObject == null) {
            this.jsonRoot = new JSONObject();
            resetEntries();
            return;
        }
        try {
            this.jsonRoot = jSONObject;
            this.jsonArray = jSONObject.getJSONArray(KEY_COMPOSITIONS);
        } catch (JSONException e) {
            tlog.w("Failed to create from saved string: " + e.getMessage());
            this.jsonRoot = new JSONObject();
            resetEntries();
        }
    }

    private void resetEntries() {
        try {
            JSONArray jSONArray = new JSONArray();
            this.jsonArray = jSONArray;
            this.jsonRoot.put(KEY_COMPOSITIONS, jSONArray);
        } catch (JSONException e) {
            tlog.w(e.getMessage());
            this.jsonArray = null;
        }
    }

    public CustomScene createClone() {
        JSONObject jSONObject = this.jsonRoot;
        return CreateFromString(jSONObject != null ? jSONObject.toString() : "");
    }

    public String serialize() {
        JSONObject jSONObject = this.jsonRoot;
        return jSONObject == null ? "" : jSONObject.toString();
    }

    public String serializePretty() {
        JSONObject jSONObject = this.jsonRoot;
        if (jSONObject == null) {
            return "";
        }
        try {
            return jSONObject.toString(2);
        } catch (JSONException unused) {
            return "";
        }
    }

    public static CustomScene deserialize(String str) {
        return CreateFromString(str);
    }

    public void setVersionId(String str) {
        JSONObject jSONObject = this.jsonRoot;
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("ver", str);
        } catch (JSONException unused) {
        }
    }

    public String getVersionId() {
        JSONObject jSONObject = this.jsonRoot;
        if (jSONObject == null) {
            return "";
        }
        try {
            return jSONObject.getString("ver");
        } catch (JSONException unused) {
            return "";
        }
    }

    public String getTypeId() {
        try {
            return this.jsonRoot.getString("objType");
        } catch (JSONException unused) {
            return "";
        }
    }

    public void setTypeId(String str) {
        try {
            this.jsonRoot.put("objType", str);
        } catch (JSONException unused) {
        }
    }

    public void setBasedOnTemplate(int i) {
        JSONObject jSONObject = this.jsonRoot;
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("template", i);
        } catch (JSONException unused) {
        }
    }

    public int getBasedOnTemplate() {
        JSONObject jSONObject = this.jsonRoot;
        if (jSONObject == null) {
            return -1;
        }
        try {
            return jSONObject.getInt("template");
        } catch (JSONException unused) {
            return -1;
        }
    }

    @Override // com.daaw.avee.comp.Visualizer.ICustomization
    public int getEntryCount() {
        return this.jsonArray.length();
    }

    private JSONObject getNewDataJSONObject() {
        JSONObject jSONObject = new JSONObject();
        this.jsonArray.put(jSONObject);
        return jSONObject;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.daaw.avee.comp.Visualizer.ICustomization
    public CustomComposition createDataEntry() {
        return CustomComposition.CreateNew(this.jsonArray.length(), getNewDataJSONObject());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.daaw.avee.comp.Visualizer.ICustomization
    public CustomComposition getEntry(int i) {
        if (i >= 0 && i < this.jsonArray.length()) {
            try {
                return CustomComposition.LoadFromJson(i, this.jsonArray.getJSONObject(i));
            } catch (JSONException e) {
                tlog.w(e.getMessage());
            }
        }
        return null;
    }

    public void removeAllEntries() {
        resetEntries();
    }

    public void setEntry(int i, CustomComposition customComposition) {
        try {
            this.jsonArray.put(i, customComposition.jsonObj);
        } catch (JSONException unused) {
        }
    }

    public CustomPropertiesList getData(List<String> list) {
        if (list == null) {
            return null;
        }
        int strToIntSafe = list.size() > 0 ? Utils.strToIntSafe(list.get(0), -1) : -1;
        if (strToIntSafe < 0) {
            return null;
        }
        CustomComposition entry = getEntry(strToIntSafe);
        if (entry == null) {
            tlog.w("entry is null");
            return null;
        } else if (list.size() > 1) {
            if (Utils.strToIntSafe(list.get(1), -1) < 0) {
                return null;
            }
            return entry.getData(list, 1);
        } else {
            return entry;
        }
    }
}
