package com.daaw;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
public final class tb2 implements gl2 {
    public final Double p;

    public tb2(Double d) {
        if (d == null) {
            this.p = Double.valueOf(Double.NaN);
        } else {
            this.p = d;
        }
    }

    @Override // com.daaw.gl2
    public final gl2 d(String str, w07 w07Var, List list) {
        if ("toString".equals(str)) {
            return new wp2(zzi());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", zzi(), str));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tb2) {
            return this.p.equals(((tb2) obj).p);
        }
        return false;
    }

    public final int hashCode() {
        return this.p.hashCode();
    }

    public final String toString() {
        return zzi();
    }

    @Override // com.daaw.gl2
    public final gl2 zzd() {
        return new tb2(this.p);
    }

    @Override // com.daaw.gl2
    public final Boolean zzg() {
        boolean z = false;
        if (!Double.isNaN(this.p.doubleValue()) && this.p.doubleValue() != 0.0d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // com.daaw.gl2
    public final Double zzh() {
        return this.p;
    }

    @Override // com.daaw.gl2
    public final String zzi() {
        if (Double.isNaN(this.p.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.p.doubleValue())) {
            return this.p.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal stripTrailingZeros = BigDecimal.valueOf(this.p.doubleValue()).stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((stripTrailingZeros.scale() > 0 ? stripTrailingZeros.precision() : stripTrailingZeros.scale()) - 1);
        String format = decimalFormat.format(stripTrailingZeros);
        int indexOf = format.indexOf("E");
        if (indexOf > 0) {
            int parseInt = Integer.parseInt(format.substring(indexOf + 1));
            return ((parseInt >= 0 || parseInt <= -7) && (parseInt < 0 || parseInt >= 21)) ? format.replace("E-", "e-").replace("E", "e+") : stripTrailingZeros.toPlainString();
        }
        return format;
    }

    @Override // com.daaw.gl2
    public final Iterator zzl() {
        return null;
    }
}
