package tier;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class TierUtils {
    public static <T> List<T> CreateFilledList(int i, T t) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(t);
        }
        return arrayList;
    }

    public static <T> List<T> ArrayToList(T[] tArr) {
        ArrayList arrayList = new ArrayList(tArr.length);
        for (T t : tArr) {
            arrayList.add(t);
        }
        return arrayList;
    }

    public static List<Double> ArrayToList(double[] dArr) {
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d : dArr) {
            arrayList.add(Double.valueOf(d));
        }
        return arrayList;
    }
}
