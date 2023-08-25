package com.daaw;
/* loaded from: classes2.dex */
public final class cj8 implements aj8 {
    public static final j38 A;
    public static final j38 B;
    public static final j38 C;
    public static final j38 D;
    public static final j38 E;
    public static final j38 F;
    public static final j38 G;
    public static final j38 H;
    public static final j38 I;
    public static final j38 J;
    public static final j38 K;
    public static final j38 L;
    public static final j38 M;
    public static final j38 a;
    public static final j38 b;
    public static final j38 c;
    public static final j38 d;
    public static final j38 e;
    public static final j38 f;
    public static final j38 g;
    public static final j38 h;
    public static final j38 i;
    public static final j38 j;
    public static final j38 k;
    public static final j38 l;
    public static final j38 m;
    public static final j38 n;
    public static final j38 o;
    public static final j38 p;
    public static final j38 q;
    public static final j38 r;
    public static final j38 s;
    public static final j38 t;
    public static final j38 u;
    public static final j38 v;
    public static final j38 w;
    public static final j38 x;
    public static final j38 y;
    public static final j38 z;

    static {
        r28 a2 = new r28(t18.a("com.google.android.gms.measurement")).a();
        a = a2.d("measurement.ad_id_cache_time", 10000L);
        b = a2.d("measurement.max_bundles_per_iteration", 100L);
        c = a2.d("measurement.config.cache_time", 86400000L);
        d = a2.e("measurement.log_tag", "FA");
        e = a2.e("measurement.config.url_authority", "app-measurement.com");
        f = a2.e("measurement.config.url_scheme", "https");
        g = a2.d("measurement.upload.debug_upload_interval", 1000L);
        h = a2.d("measurement.lifetimevalue.max_currency_tracked", 4L);
        i = a2.d("measurement.store.max_stored_events_per_app", 100000L);
        j = a2.d("measurement.experiment.max_ids", 50L);
        k = a2.d("measurement.audience.filter_result_max_count", 200L);
        l = a2.d("measurement.alarm_manager.minimum_interval", 60000L);
        m = a2.d("measurement.upload.minimum_delay", 500L);
        n = a2.d("measurement.monitoring.sample_period_millis", 86400000L);
        o = a2.d("measurement.upload.realtime_upload_interval", 10000L);
        p = a2.d("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        q = a2.d("measurement.config.cache_time.service", 3600000L);
        r = a2.d("measurement.service_client.idle_disconnect_millis", 5000L);
        s = a2.e("measurement.log_tag.service", "FA-SVC");
        t = a2.d("measurement.upload.stale_data_deletion_interval", 86400000L);
        u = a2.d("measurement.sdk.attribution.cache.ttl", 604800000L);
        v = a2.d("measurement.redaction.app_instance_id.ttl", 7200000L);
        w = a2.d("measurement.upload.backoff_period", 43200000L);
        x = a2.d("measurement.upload.initial_upload_delay_time", 15000L);
        y = a2.d("measurement.upload.interval", 3600000L);
        z = a2.d("measurement.upload.max_bundle_size", 65536L);
        A = a2.d("measurement.upload.max_bundles", 100L);
        B = a2.d("measurement.upload.max_conversions_per_day", 500L);
        C = a2.d("measurement.upload.max_error_events_per_day", 1000L);
        D = a2.d("measurement.upload.max_events_per_bundle", 1000L);
        E = a2.d("measurement.upload.max_events_per_day", 100000L);
        F = a2.d("measurement.upload.max_public_events_per_day", 50000L);
        G = a2.d("measurement.upload.max_queue_time", 2419200000L);
        H = a2.d("measurement.upload.max_realtime_events_per_day", 10L);
        I = a2.d("measurement.upload.max_batch_size", 65536L);
        J = a2.d("measurement.upload.retry_count", 6L);
        K = a2.d("measurement.upload.retry_time", 1800000L);
        L = a2.e("measurement.upload.url", "https://app-measurement.com/a");
        M = a2.d("measurement.upload.window_interval", 3600000L);
    }

    @Override // com.daaw.aj8
    public final long a() {
        return ((Long) I.b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long b() {
        return ((Long) z.b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long d() {
        return ((Long) K.b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long e() {
        return ((Long) D.b()).longValue();
    }

    @Override // com.daaw.aj8
    public final String g() {
        return (String) e.b();
    }

    @Override // com.daaw.aj8
    public final String h() {
        return (String) f.b();
    }

    @Override // com.daaw.aj8
    public final long j() {
        return ((Long) M.b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long k() {
        return ((Long) B.b()).longValue();
    }

    @Override // com.daaw.aj8
    public final String n() {
        return (String) L.b();
    }

    @Override // com.daaw.aj8
    public final long zzA() {
        return ((Long) F.b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zzB() {
        return ((Long) G.b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zzC() {
        return ((Long) H.b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zzE() {
        return ((Long) J.b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zza() {
        return ((Long) a.b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zzb() {
        return ((Long) b.b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zzc() {
        return ((Long) c.b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zzd() {
        return ((Long) g.b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zze() {
        return ((Long) h.b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zzf() {
        return ((Long) i.b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zzg() {
        return ((Long) j.b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zzh() {
        return ((Long) k.b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zzi() {
        return ((Long) l.b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zzj() {
        return ((Long) m.b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zzk() {
        return ((Long) n.b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zzl() {
        return ((Long) o.b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zzm() {
        return ((Long) p.b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zzn() {
        return ((Long) r.b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zzo() {
        return ((Long) t.b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zzp() {
        return ((Long) u.b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zzq() {
        return ((Long) v.b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zzr() {
        return ((Long) w.b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zzs() {
        return ((Long) x.b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zzt() {
        return ((Long) y.b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zzv() {
        return ((Long) A.b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zzx() {
        return ((Long) C.b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zzz() {
        return ((Long) E.b()).longValue();
    }
}
