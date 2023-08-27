package com.google.ads.mediation;

import android.location.Location;
import com.google.ads.AdRequest;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;
@Deprecated
/* loaded from: classes.dex */
public class MediationAdRequest {
    private final Date zzhl;
    private final AdRequest.Gender zzhm;
    private final Set<String> zzhn;
    private final boolean zzho;
    private final Location zzhp;

    public MediationAdRequest(Date date, AdRequest.Gender gender, Set<String> set, boolean z, Location location) {
        this.zzhl = date;
        this.zzhm = gender;
        this.zzhn = set;
        this.zzho = z;
        this.zzhp = location;
    }

    public Integer getAgeInYears() {
        if (this.zzhl != null) {
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar.setTime(this.zzhl);
            Integer valueOf = Integer.valueOf(calendar2.get(1) - calendar.get(1));
            return (calendar2.get(2) < calendar.get(2) || (calendar2.get(2) == calendar.get(2) && calendar2.get(5) < calendar.get(5))) ? Integer.valueOf(valueOf.intValue() - 1) : valueOf;
        }
        return null;
    }

    public Date getBirthday() {
        return this.zzhl;
    }

    public AdRequest.Gender getGender() {
        return this.zzhm;
    }

    public Set<String> getKeywords() {
        return this.zzhn;
    }

    public Location getLocation() {
        return this.zzhp;
    }

    public boolean isTesting() {
        return this.zzho;
    }
}
