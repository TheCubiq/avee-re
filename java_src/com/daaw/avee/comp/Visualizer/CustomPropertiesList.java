package com.daaw.avee.comp.Visualizer;

import com.daaw.avee.Common.Array4f;
import com.daaw.avee.Common.MultiList;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.Common.Utils;
import com.daaw.avee.Common.Vec2f;
import com.daaw.avee.comp.Visualizer.Elements.Base.MVariableFloat;
import com.daaw.avee.comp.Visualizer.Elements.Base.MeasuredVar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class CustomPropertiesList {
    protected JSONObject jsonObj;
    private String name;
    private CustomPropertiesList parent;
    private int putOrderCounter;

    public static String[] getPropertyTypeParts(String str) {
        String[] split = str.split("\\s+");
        return split.length < 1 ? new String[]{str} : split;
    }

    public CustomPropertiesList(int i, JSONObject jSONObject, CustomPropertiesList customPropertiesList) {
        this.name = "" + i;
        this.parent = customPropertiesList;
        this.jsonObj = jSONObject;
        resetPutOrderIndex();
    }

    private CustomPropertiesList(String str, JSONObject jSONObject, CustomPropertiesList customPropertiesList) {
        this.name = str;
        this.parent = customPropertiesList;
        this.jsonObj = jSONObject;
        resetPutOrderIndex();
    }

    private void resetPutOrderIndex() {
        this.putOrderCounter = 0;
    }

    public void setCustomizationName(String str) {
        try {
            this.jsonObj.put("_name", str);
        } catch (JSONException unused) {
        }
    }

    public String getCustomizationName() {
        try {
            return this.jsonObj.getString("_name");
        } catch (JSONException unused) {
            return "";
        }
    }

    public void setVersionId(String str) {
        JSONObject jSONObject = this.jsonObj;
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("ver", str);
        } catch (JSONException unused) {
        }
    }

    public String getVersionId() {
        JSONObject jSONObject = this.jsonObj;
        if (jSONObject == null) {
            return "";
        }
        try {
            return jSONObject.getString("ver");
        } catch (JSONException unused) {
            return "";
        }
    }

    public String getTypeName() {
        return getTypeName("");
    }

    public String getTypeName(String str) {
        try {
            return this.jsonObj.getString("v");
        } catch (JSONException unused) {
            return str;
        }
    }

    public void setTagName(String str) {
        putPropertyStringAsTxtPr("tag", str, "0_general");
    }

    public String getTagName() {
        return getPropertyString("tag", "");
    }

    public void putChildTypeValue(String str) {
        try {
            this.jsonObj.put("v", str);
            this.jsonObj.put("objType", str);
        } catch (JSONException unused) {
        }
    }

    public void clearAll(String str, String str2) {
        if (this.jsonObj == null) {
            return;
        }
        while (this.jsonObj.length() > 0) {
            JSONObject jSONObject = this.jsonObj;
            jSONObject.remove(jSONObject.keys().next());
        }
        putChildTypeValue(str);
        setVersionId(str2);
    }

    public ArrayList<String> getHierarchyPath() {
        ArrayList<String> arrayList = new ArrayList<>();
        getHierarchyPath(arrayList);
        return arrayList;
    }

    private void getHierarchyPath(List<String> list) {
        CustomPropertiesList customPropertiesList = this.parent;
        if (customPropertiesList != null) {
            customPropertiesList.getHierarchyPath(list);
        }
        list.add(this.name);
    }

    public CustomPropertiesList getParent() {
        return this.parent;
    }

    public static String MakeHierarchyPathKeyString(List<String> list, String str) {
        StringBuilder sb = new StringBuilder();
        for (String str2 : list) {
            sb.append(str2);
            sb.append(";");
        }
        sb.append(";");
        sb.append(str);
        return sb.toString();
    }

    public CustomPropertiesList putEmptyChild(String str, String str2, String str3, String[] strArr) {
        return putEmptyChild(str, str2, str3, strArr, false);
    }

    public CustomPropertiesList putEmptyChild(String str, String str2, String str3, String[] strArr, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("_child");
            for (String str4 : strArr) {
                sb.append(" ");
                sb.append(str4);
            }
            jSONObject.put("v", str2);
            jSONObject.put("t", sb.toString());
            int i = this.putOrderCounter;
            this.putOrderCounter = i + 1;
            jSONObject.put("o", i);
            jSONObject.put("tag", str3);
            this.jsonObj.put(str, jSONObject);
        } catch (JSONException unused) {
        }
        return new CustomPropertiesList(str, jSONObject, this);
    }

    public CustomPropertiesList getChild(String str) {
        try {
            return new CustomPropertiesList(str, this.jsonObj.getJSONObject(str), this);
        } catch (JSONException unused) {
            return new CustomPropertiesList(str, new JSONObject(), this);
        }
    }

    public void putSelectString(String str, String str2, String str3, String[] strArr) {
        try {
            JSONObject jSONObject = new JSONObject();
            StringBuilder sb = new StringBuilder();
            sb.append("sel");
            for (String str4 : strArr) {
                sb.append(" ");
                sb.append(str4);
            }
            jSONObject.put("v", str2);
            jSONObject.put("t", sb.toString());
            int i = this.putOrderCounter;
            this.putOrderCounter = i + 1;
            jSONObject.put("o", i);
            jSONObject.put("tag", str3);
            this.jsonObj.put(str, jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void putPropertySelectStringValue(String str, String str2) {
        try {
            JSONObject optJSONObject = this.jsonObj.optJSONObject(str);
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            if (str2 == null) {
                str2 = "";
            }
            optJSONObject.put("v", str2);
            this.jsonObj.put(str, optJSONObject);
        } catch (JSONException unused) {
        }
    }

    public int getPropertySelectStringIndex(String str, String[] strArr, int i) {
        return Utils.StringToIndex(strArr, getPropertySelectString(str, Utils.IndexToString(strArr, i, strArr[0])), i);
    }

    public String getPropertySelectString(String str, String str2) {
        try {
            return this.jsonObj.getJSONObject(str).getString("v");
        } catch (JSONException unused) {
            return str2;
        }
    }

    public void putPropertyBoolValue(String str, boolean z) {
        try {
            JSONObject optJSONObject = this.jsonObj.optJSONObject(str);
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            optJSONObject.put("v", z ? 1 : 0);
            this.jsonObj.put(str, optJSONObject);
        } catch (JSONException unused) {
        }
    }

    public void putPropertyBool(String str, boolean z, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("v", z ? 1 : 0);
            jSONObject.put("t", "b");
            int i = this.putOrderCounter;
            this.putOrderCounter = i + 1;
            jSONObject.put("o", i);
            jSONObject.put("tag", str2);
            jSONObject.put("hint", (Object) null);
            this.jsonObj.put(str, jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void updatePropertyBool(String str, String str2, String str3) {
        try {
            JSONObject jSONObject = this.jsonObj.getJSONObject(str);
            jSONObject.put("t", str2);
            jSONObject.put("hint", str3);
            this.jsonObj.put(str, jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void removeProperty(String str) {
        this.jsonObj.remove(str);
    }

    public void putPropertyIntValue(String str, int i) {
        try {
            JSONObject optJSONObject = this.jsonObj.optJSONObject(str);
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            optJSONObject.put("v", i);
            this.jsonObj.put(str, optJSONObject);
        } catch (JSONException unused) {
        }
    }

    private void putPropertyInt(String str, int i, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("v", i);
            jSONObject.put("t", str3);
            int i2 = this.putOrderCounter;
            this.putOrderCounter = i2 + 1;
            jSONObject.put("o", i2);
            jSONObject.put("tag", str2);
            jSONObject.put("hint", str4);
            this.jsonObj.put(str, jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void putPropertyFloatValue(String str, float f) {
        try {
            JSONObject optJSONObject = this.jsonObj.optJSONObject(str);
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            optJSONObject.put("v", f);
            this.jsonObj.put(str, optJSONObject);
        } catch (JSONException unused) {
        }
    }

    private void putPropertyFloat(String str, float f, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("v", f);
            jSONObject.put("t", str3);
            int i = this.putOrderCounter;
            this.putOrderCounter = i + 1;
            jSONObject.put("o", i);
            jSONObject.put("tag", str2);
            jSONObject.put("hint", str4);
            this.jsonObj.put(str, jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void putPropertyVec2fValue(String str, Vec2f vec2f) {
        try {
            JSONObject optJSONObject = this.jsonObj.optJSONObject(str);
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            optJSONObject.put("v", vec2f.toString());
            this.jsonObj.put(str, optJSONObject);
        } catch (JSONException unused) {
        }
    }

    private void putPropertyVec2f(String str, Vec2f vec2f, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("v", vec2f.toString());
            jSONObject.put("t", str3);
            int i = this.putOrderCounter;
            this.putOrderCounter = i + 1;
            jSONObject.put("o", i);
            jSONObject.put("tag", str2);
            jSONObject.put("hint", str4);
            this.jsonObj.put(str, jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void putPropertyArray4fValue(String str, float[] fArr) {
        try {
            JSONObject optJSONObject = this.jsonObj.optJSONObject(str);
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            optJSONObject.put("v", Array4f.toString(fArr));
            this.jsonObj.put(str, optJSONObject);
        } catch (JSONException unused) {
        }
    }

    private void putPropertyArray4f(String str, float[] fArr, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("v", Array4f.toString(fArr));
            jSONObject.put("t", str3);
            int i = this.putOrderCounter;
            this.putOrderCounter = i + 1;
            jSONObject.put("o", i);
            jSONObject.put("tag", str2);
            jSONObject.put("hint", str4);
            this.jsonObj.put(str, jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void putPropertyStringValue(String str, String str2) {
        try {
            JSONObject optJSONObject = this.jsonObj.optJSONObject(str);
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            if (str2 == null) {
                str2 = "";
            }
            optJSONObject.put("v", str2);
            this.jsonObj.put(str, optJSONObject);
        } catch (JSONException unused) {
        }
    }

    private void putPropertyString(String str, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("v", str2);
            jSONObject.put("t", str4);
            int i = this.putOrderCounter;
            this.putOrderCounter = i + 1;
            jSONObject.put("o", i);
            jSONObject.put("tag", str3);
            this.jsonObj.put(str, jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void putPropertyMeasuredVar(String str, MeasuredVar measuredVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("v", measuredVar.toString());
            jSONObject.put("t", "mea");
            int i = this.putOrderCounter;
            this.putOrderCounter = i + 1;
            jSONObject.put("o", i);
            this.jsonObj.put(str, jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void putPropertyMVariableFloatValue(String str, MVariableFloat mVariableFloat) {
        try {
            JSONObject optJSONObject = this.jsonObj.optJSONObject(str);
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            optJSONObject.put("v", mVariableFloat.toString());
            this.jsonObj.put(str, optJSONObject);
        } catch (JSONException unused) {
        }
    }

    public void putPropertyMVariableFloat(String str, MVariableFloat mVariableFloat, String str2, float f, float f2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("v", mVariableFloat.toString());
            jSONObject.put("t", "mvarf " + f + " " + f2);
            int i = this.putOrderCounter;
            this.putOrderCounter = i + 1;
            jSONObject.put("o", i);
            jSONObject.put("tag", str2);
            this.jsonObj.put(str, jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void putPropertyMVariableVec2f(String str, MVariableFloat mVariableFloat, String str2, float f, float f2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("v", mVariableFloat.toString());
            jSONObject.put("t", "mvarf2 " + f + " " + f2);
            int i = this.putOrderCounter;
            this.putOrderCounter = i + 1;
            jSONObject.put("o", i);
            jSONObject.put("tag", str2);
            this.jsonObj.put(str, jSONObject);
        } catch (JSONException unused) {
        }
    }

    public boolean getPropertyBool(String str, boolean z) {
        try {
            return this.jsonObj.getJSONObject(str).getInt("v") != 0;
        } catch (JSONException unused) {
            return z;
        }
    }

    public int getPropertyInt(String str, int i) {
        try {
            return this.jsonObj.getJSONObject(str).getInt("v");
        } catch (JSONException unused) {
            return i;
        }
    }

    public float getPropertyFloat(String str, float f) {
        try {
            return (float) this.jsonObj.getJSONObject(str).getDouble("v");
        } catch (JSONException unused) {
            return f;
        }
    }

    public String getPropertyString(String str, String str2) {
        try {
            return this.jsonObj.getJSONObject(str).getString("v");
        } catch (JSONException unused) {
            return str2;
        }
    }

    public Vec2f getPropertyVec2f(String str, Vec2f vec2f) {
        try {
            return Vec2f.FromString(this.jsonObj.getJSONObject(str).getString("v"), vec2f);
        } catch (JSONException unused) {
            return vec2f;
        }
    }

    public float[] getPropertyArray4f(String str, float[] fArr) {
        try {
            float[] fArr2 = new float[4];
            Array4f.fromString(this.jsonObj.getJSONObject(str).getString("v"), fArr2, fArr);
            return fArr2;
        } catch (JSONException unused) {
            return fArr;
        }
    }

    public MeasuredVar getPropertyMeasuredVar(String str, MeasuredVar measuredVar) {
        try {
            return MeasuredVar.FromString(this.jsonObj.getJSONObject(str).getString("v"), measuredVar);
        } catch (JSONException unused) {
            return measuredVar;
        }
    }

    public MVariableFloat getPropertyMVariableFloat(String str, MVariableFloat mVariableFloat) {
        try {
            return MVariableFloat.FromString(this.jsonObj.getJSONObject(str).getString("v"), mVariableFloat);
        } catch (JSONException unused) {
            return mVariableFloat;
        }
    }

    public String getPropertyType(String str) {
        try {
            return this.jsonObj.getJSONObject(str).getString("t");
        } catch (JSONException unused) {
            return "";
        }
    }

    public String getPropertyHint(String str) {
        try {
            return this.jsonObj.getJSONObject(str).getString("hint");
        } catch (JSONException unused) {
            return "";
        }
    }

    public int getPropertyOrderIndex(String str) {
        try {
            return this.jsonObj.getJSONObject(str).getInt("o");
        } catch (JSONException unused) {
            return -1;
        }
    }

    public String getPropertyGroupTag(String str, String str2) {
        try {
            return this.jsonObj.getJSONObject(str).getString("tag");
        } catch (JSONException unused) {
            return str2;
        }
    }

    public Iterator<String> GetAllPropertiesSortedByKey() {
        Iterator<String> keys = this.jsonObj.keys();
        ArrayList arrayList = new ArrayList();
        while (keys.hasNext()) {
            arrayList.add(keys.next());
        }
        Collections.sort(arrayList);
        return arrayList.iterator();
    }

    public Iterator<String> GetAllPropertiesSortedByOrder() {
        Iterator<String> keys = this.jsonObj.keys();
        MultiList multiList = new MultiList();
        while (keys.hasNext()) {
            String next = keys.next();
            multiList.add(new Tuple2(next, Integer.valueOf(getPropertyOrderIndex(next))));
        }
        Collections.sort(multiList, new Comparator<Tuple2<String, Integer>>() { // from class: com.daaw.avee.comp.Visualizer.CustomPropertiesList.1
            @Override // java.util.Comparator
            public int compare(Tuple2<String, Integer> tuple2, Tuple2<String, Integer> tuple22) {
                return tuple2.obj2.intValue() - tuple22.obj2.intValue();
            }
        });
        return multiList.iterator1();
    }

    public Map<String, MultiList<String, Integer>> GetAllPropertiesGroupedSortedByOrder() {
        Iterator<String> keys = this.jsonObj.keys();
        TreeMap treeMap = new TreeMap(new Comparator<String>() { // from class: com.daaw.avee.comp.Visualizer.CustomPropertiesList.2
            @Override // java.util.Comparator
            public int compare(String str, String str2) {
                return str.compareToIgnoreCase(str2);
            }
        });
        while (keys.hasNext()) {
            String next = keys.next();
            String propertyGroupTag = getPropertyGroupTag(next, "0_general");
            if (propertyGroupTag.length() > 0) {
                MultiList multiList = (MultiList) treeMap.get(propertyGroupTag);
                if (multiList == null) {
                    multiList = new MultiList();
                    treeMap.put(propertyGroupTag, multiList);
                }
                multiList.add(new Tuple2(next, Integer.valueOf(getPropertyOrderIndex(next))));
            }
        }
        for (MultiList multiList2 : treeMap.values()) {
            Collections.sort(multiList2, new Comparator<Tuple2<String, Integer>>() { // from class: com.daaw.avee.comp.Visualizer.CustomPropertiesList.3
                @Override // java.util.Comparator
                public int compare(Tuple2<String, Integer> tuple2, Tuple2<String, Integer> tuple22) {
                    return tuple2.obj2.intValue() - tuple22.obj2.intValue();
                }
            });
        }
        return treeMap;
    }

    public Iterator<String> GetAllProperties() {
        return this.jsonObj.keys();
    }

    public void putPropertyIntAsCRGBA(String str, int i, String str2) {
        putPropertyInt(str, i, str2, "crgba", null);
    }

    public void putPropertyIntAsCRGBA(String str, int i, String str2, String str3) {
        putPropertyInt(str, i, str2, "crgba", str3);
    }

    public void putPropertyIntAsCRGB(String str, int i, String str2) {
        putPropertyInt(str, i, str2, "crgb", null);
    }

    public void putPropertyIntAsCRGB_HL(String str, int i, String str2) {
        putPropertyInt(str, i, str2, "crgb_hl", null);
    }

    public void putPropertyArray4fAsCRGBA(String str, float[] fArr, String str2) {
        putPropertyArray4fAsCRGBA(str, fArr, str2, null);
    }

    public void putPropertyArray4fAsCRGB(String str, float[] fArr, String str2) {
        putPropertyArray4fAsCRGB(str, fArr, str2, null);
    }

    public void putPropertyArray4fAsCHSLA(String str, float[] fArr, String str2) {
        putPropertyArray4fAsCHSLA(str, fArr, str2, null);
    }

    public void putPropertyArray4fAsCHSL(String str, float[] fArr, String str2) {
        putPropertyArray4fAsCHSL(str, fArr, str2, null);
    }

    public void putPropertyArray4fAsCRGBA(String str, float[] fArr, String str2, String str3) {
        putPropertyArray4f(str, fArr, str2, "crgba4f", str3);
    }

    public void putPropertyArray4fAsCRGB(String str, float[] fArr, String str2, String str3) {
        putPropertyArray4f(str, fArr, str2, "crgb4f", str3);
    }

    public void putPropertyArray4fAsCHSLA(String str, float[] fArr, String str2, String str3) {
        putPropertyArray4f(str, fArr, str2, "chsla4f", str3);
    }

    public void putPropertyArray4fAsCHSL(String str, float[] fArr, String str2, String str3) {
        putPropertyArray4f(str, fArr, str2, "chsl4f", str3);
    }

    public void putPropertyIntAsHidden(String str, int i, String str2) {
        putPropertyInt(str, i, str2, "ih", null);
    }

    public void putPropertyIntAsRangeHidden(String str, int i, String str2, int i2, int i3) {
        putPropertyInt(str, i, str2, "ih " + i2 + " " + i3, null);
    }

    public void putPropertyIntAsRange(String str, int i, String str2, int i2, int i3) {
        putPropertyInt(str, i, str2, "i " + i2 + " " + i3, null);
    }

    public void putPropertyFloatAsRange(String str, float f, String str2, float f2, float f3) {
        putPropertyFloat(str, f, str2, "f " + f2 + " " + f3, null);
    }

    public void putPropertyFloatAsRange(String str, float f, String str2, float f2, float f3, String str3) {
        putPropertyFloat(str, f, str2, "f " + f2 + " " + f3, str3);
    }

    public void putPropertyVec2fAsRange(String str, Vec2f vec2f, String str2, float f, float f2) {
        putPropertyVec2f(str, vec2f, str2, "f2 " + f + " " + f2, null);
    }

    public void putPropertyVec2fAsRange(String str, Vec2f vec2f, String str2, float f, float f2, String str3) {
        putPropertyVec2f(str, vec2f, str2, "f2 " + f + " " + f2, str3);
    }

    public void putPropertyStringAsImagePr(String str, String str2, String str3, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("pimg");
        for (String str4 : strArr) {
            sb.append(" ");
            sb.append(str4);
        }
        putPropertyString(str, str2, str3, sb.toString());
    }

    public void putPropertyStringAsImage(String str, String str2, String str3, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("img");
        for (String str4 : strArr) {
            sb.append(" ");
            sb.append(str4);
        }
        putPropertyString(str, str2, str3, sb.toString());
    }

    public void putPropertyStringAsAssetPr(String str, String str2, String str3, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("passet");
        for (String str4 : strArr) {
            sb.append(" ");
            sb.append(str4);
        }
        putPropertyString(str, str2, str3, sb.toString());
    }

    public void putPropertyStringAsAsset(String str, String str2, String str3, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("asset");
        for (String str4 : strArr) {
            sb.append(" ");
            sb.append(str4);
        }
        putPropertyString(str, str2, str3, sb.toString());
    }

    public void putPropertyStringAsImage(String str, String str2, String str3) {
        putPropertyStringAsImage(str, str2, str3, new String[0]);
    }

    public void putPropertyStringAsTxt(String str, String str2, String str3) {
        putPropertyString(str, str2, str3, "txt");
    }

    public void putPropertyStringAsTxtPr(String str, String str2, String str3) {
        putPropertyString(str, str2, str3, "ptxt");
    }
}
