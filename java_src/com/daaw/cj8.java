package com.daaw;
/* loaded from: classes2.dex */
public final class cj8 implements aj8 {

    /* renamed from: A */
    public static final j38 f5845A;

    /* renamed from: B */
    public static final j38 f5846B;

    /* renamed from: C */
    public static final j38 f5847C;

    /* renamed from: D */
    public static final j38 f5848D;

    /* renamed from: E */
    public static final j38 f5849E;

    /* renamed from: F */
    public static final j38 f5850F;

    /* renamed from: G */
    public static final j38 f5851G;

    /* renamed from: H */
    public static final j38 f5852H;

    /* renamed from: I */
    public static final j38 f5853I;

    /* renamed from: J */
    public static final j38 f5854J;

    /* renamed from: K */
    public static final j38 f5855K;

    /* renamed from: L */
    public static final j38 f5856L;

    /* renamed from: M */
    public static final j38 f5857M;

    /* renamed from: a */
    public static final j38 f5858a;

    /* renamed from: b */
    public static final j38 f5859b;

    /* renamed from: c */
    public static final j38 f5860c;

    /* renamed from: d */
    public static final j38 f5861d;

    /* renamed from: e */
    public static final j38 f5862e;

    /* renamed from: f */
    public static final j38 f5863f;

    /* renamed from: g */
    public static final j38 f5864g;

    /* renamed from: h */
    public static final j38 f5865h;

    /* renamed from: i */
    public static final j38 f5866i;

    /* renamed from: j */
    public static final j38 f5867j;

    /* renamed from: k */
    public static final j38 f5868k;

    /* renamed from: l */
    public static final j38 f5869l;

    /* renamed from: m */
    public static final j38 f5870m;

    /* renamed from: n */
    public static final j38 f5871n;

    /* renamed from: o */
    public static final j38 f5872o;

    /* renamed from: p */
    public static final j38 f5873p;

    /* renamed from: q */
    public static final j38 f5874q;

    /* renamed from: r */
    public static final j38 f5875r;

    /* renamed from: s */
    public static final j38 f5876s;

    /* renamed from: t */
    public static final j38 f5877t;

    /* renamed from: u */
    public static final j38 f5878u;

    /* renamed from: v */
    public static final j38 f5879v;

    /* renamed from: w */
    public static final j38 f5880w;

    /* renamed from: x */
    public static final j38 f5881x;

    /* renamed from: y */
    public static final j38 f5882y;

    /* renamed from: z */
    public static final j38 f5883z;

    static {
        r28 m11828a = new r28(t18.m9649a("com.google.android.gms.measurement")).m11828a();
        f5858a = m11828a.m11825d("measurement.ad_id_cache_time", 10000L);
        f5859b = m11828a.m11825d("measurement.max_bundles_per_iteration", 100L);
        f5860c = m11828a.m11825d("measurement.config.cache_time", 86400000L);
        f5861d = m11828a.m11824e("measurement.log_tag", "FA");
        f5862e = m11828a.m11824e("measurement.config.url_authority", "app-measurement.com");
        f5863f = m11828a.m11824e("measurement.config.url_scheme", "https");
        f5864g = m11828a.m11825d("measurement.upload.debug_upload_interval", 1000L);
        f5865h = m11828a.m11825d("measurement.lifetimevalue.max_currency_tracked", 4L);
        f5866i = m11828a.m11825d("measurement.store.max_stored_events_per_app", 100000L);
        f5867j = m11828a.m11825d("measurement.experiment.max_ids", 50L);
        f5868k = m11828a.m11825d("measurement.audience.filter_result_max_count", 200L);
        f5869l = m11828a.m11825d("measurement.alarm_manager.minimum_interval", 60000L);
        f5870m = m11828a.m11825d("measurement.upload.minimum_delay", 500L);
        f5871n = m11828a.m11825d("measurement.monitoring.sample_period_millis", 86400000L);
        f5872o = m11828a.m11825d("measurement.upload.realtime_upload_interval", 10000L);
        f5873p = m11828a.m11825d("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        f5874q = m11828a.m11825d("measurement.config.cache_time.service", 3600000L);
        f5875r = m11828a.m11825d("measurement.service_client.idle_disconnect_millis", 5000L);
        f5876s = m11828a.m11824e("measurement.log_tag.service", "FA-SVC");
        f5877t = m11828a.m11825d("measurement.upload.stale_data_deletion_interval", 86400000L);
        f5878u = m11828a.m11825d("measurement.sdk.attribution.cache.ttl", 604800000L);
        f5879v = m11828a.m11825d("measurement.redaction.app_instance_id.ttl", 7200000L);
        f5880w = m11828a.m11825d("measurement.upload.backoff_period", 43200000L);
        f5881x = m11828a.m11825d("measurement.upload.initial_upload_delay_time", 15000L);
        f5882y = m11828a.m11825d("measurement.upload.interval", 3600000L);
        f5883z = m11828a.m11825d("measurement.upload.max_bundle_size", 65536L);
        f5845A = m11828a.m11825d("measurement.upload.max_bundles", 100L);
        f5846B = m11828a.m11825d("measurement.upload.max_conversions_per_day", 500L);
        f5847C = m11828a.m11825d("measurement.upload.max_error_events_per_day", 1000L);
        f5848D = m11828a.m11825d("measurement.upload.max_events_per_bundle", 1000L);
        f5849E = m11828a.m11825d("measurement.upload.max_events_per_day", 100000L);
        f5850F = m11828a.m11825d("measurement.upload.max_public_events_per_day", 50000L);
        f5851G = m11828a.m11825d("measurement.upload.max_queue_time", 2419200000L);
        f5852H = m11828a.m11825d("measurement.upload.max_realtime_events_per_day", 10L);
        f5853I = m11828a.m11825d("measurement.upload.max_batch_size", 65536L);
        f5854J = m11828a.m11825d("measurement.upload.retry_count", 6L);
        f5855K = m11828a.m11825d("measurement.upload.retry_time", 1800000L);
        f5856L = m11828a.m11824e("measurement.upload.url", "https://app-measurement.com/a");
        f5857M = m11828a.m11825d("measurement.upload.window_interval", 3600000L);
    }

    @Override // com.daaw.aj8
    /* renamed from: a */
    public final long mo25309a() {
        return ((Long) f5853I.m19095b()).longValue();
    }

    @Override // com.daaw.aj8
    /* renamed from: b */
    public final long mo25308b() {
        return ((Long) f5883z.m19095b()).longValue();
    }

    @Override // com.daaw.aj8
    /* renamed from: d */
    public final long mo25307d() {
        return ((Long) f5855K.m19095b()).longValue();
    }

    @Override // com.daaw.aj8
    /* renamed from: e */
    public final long mo25306e() {
        return ((Long) f5848D.m19095b()).longValue();
    }

    @Override // com.daaw.aj8
    /* renamed from: g */
    public final String mo25305g() {
        return (String) f5862e.m19095b();
    }

    @Override // com.daaw.aj8
    /* renamed from: h */
    public final String mo25304h() {
        return (String) f5863f.m19095b();
    }

    @Override // com.daaw.aj8
    /* renamed from: j */
    public final long mo25303j() {
        return ((Long) f5857M.m19095b()).longValue();
    }

    @Override // com.daaw.aj8
    /* renamed from: k */
    public final long mo25302k() {
        return ((Long) f5846B.m19095b()).longValue();
    }

    @Override // com.daaw.aj8
    /* renamed from: n */
    public final String mo25301n() {
        return (String) f5856L.m19095b();
    }

    @Override // com.daaw.aj8
    public final long zzA() {
        return ((Long) f5850F.m19095b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zzB() {
        return ((Long) f5851G.m19095b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zzC() {
        return ((Long) f5852H.m19095b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zzE() {
        return ((Long) f5854J.m19095b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zza() {
        return ((Long) f5858a.m19095b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zzb() {
        return ((Long) f5859b.m19095b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zzc() {
        return ((Long) f5860c.m19095b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zzd() {
        return ((Long) f5864g.m19095b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zze() {
        return ((Long) f5865h.m19095b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zzf() {
        return ((Long) f5866i.m19095b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zzg() {
        return ((Long) f5867j.m19095b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zzh() {
        return ((Long) f5868k.m19095b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zzi() {
        return ((Long) f5869l.m19095b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zzj() {
        return ((Long) f5870m.m19095b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zzk() {
        return ((Long) f5871n.m19095b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zzl() {
        return ((Long) f5872o.m19095b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zzm() {
        return ((Long) f5873p.m19095b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zzn() {
        return ((Long) f5875r.m19095b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zzo() {
        return ((Long) f5877t.m19095b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zzp() {
        return ((Long) f5878u.m19095b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zzq() {
        return ((Long) f5879v.m19095b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zzr() {
        return ((Long) f5880w.m19095b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zzs() {
        return ((Long) f5881x.m19095b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zzt() {
        return ((Long) f5882y.m19095b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zzv() {
        return ((Long) f5845A.m19095b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zzx() {
        return ((Long) f5847C.m19095b()).longValue();
    }

    @Override // com.daaw.aj8
    public final long zzz() {
        return ((Long) f5849E.m19095b()).longValue();
    }
}
