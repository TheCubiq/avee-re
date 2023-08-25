package com.daaw;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes2.dex */
public final class m75 {

    /* renamed from: L */
    public static final j65 f18504L;

    /* renamed from: M */
    public static final j65 f18505M;

    /* renamed from: N */
    public static final j65 f18506N;

    /* renamed from: O */
    public static final j65 f18507O;

    /* renamed from: P */
    public static final j65 f18508P;

    /* renamed from: Q */
    public static final j65 f18509Q;

    /* renamed from: R */
    public static final j65 f18510R;

    /* renamed from: S */
    public static final j65 f18511S;

    /* renamed from: T */
    public static final j65 f18512T;

    /* renamed from: U */
    public static final j65 f18513U;

    /* renamed from: V */
    public static final j65 f18514V;

    /* renamed from: W */
    public static final j65 f18515W;

    /* renamed from: X */
    public static final j65 f18516X;

    /* renamed from: Y */
    public static final j65 f18517Y;

    /* renamed from: Z */
    public static final j65 f18518Z;

    /* renamed from: a0 */
    public static final j65 f18520a0;

    /* renamed from: b0 */
    public static final j65 f18522b0;

    /* renamed from: c0 */
    public static final j65 f18524c0;

    /* renamed from: d0 */
    public static final j65 f18526d0;

    /* renamed from: e0 */
    public static final j65 f18528e0;

    /* renamed from: f0 */
    public static final j65 f18530f0;

    /* renamed from: g0 */
    public static final j65 f18532g0;

    /* renamed from: h0 */
    public static final j65 f18534h0;

    /* renamed from: i0 */
    public static final j65 f18536i0;

    /* renamed from: j0 */
    public static final j65 f18538j0;

    /* renamed from: k0 */
    public static final j65 f18540k0;

    /* renamed from: l0 */
    public static final j65 f18542l0;

    /* renamed from: m0 */
    public static final j65 f18544m0;

    /* renamed from: n0 */
    public static final j65 f18546n0;

    /* renamed from: o0 */
    public static final j65 f18548o0;

    /* renamed from: p0 */
    public static final j65 f18550p0;

    /* renamed from: q0 */
    public static final j65 f18552q0;

    /* renamed from: r0 */
    public static final j65 f18554r0;

    /* renamed from: s0 */
    public static final j65 f18556s0;

    /* renamed from: t0 */
    public static final j65 f18558t0;

    /* renamed from: u0 */
    public static final j65 f18560u0;

    /* renamed from: v0 */
    public static final j65 f18562v0;

    /* renamed from: w0 */
    public static final j65 f18564w0;

    /* renamed from: a */
    public static final List f18519a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    public static final Set f18521b = Collections.synchronizedSet(new HashSet());

    /* renamed from: c */
    public static final j65 f18523c = m16192a("measurement.ad_id_cache_time", 10000L, 10000L, new b35() { // from class: com.daaw.v83
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.f18523c;
            return Long.valueOf(yi8.m3698m());
        }
    });

    /* renamed from: d */
    public static final j65 f18525d = m16192a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, new b35() { // from class: com.daaw.tz2
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.f18523c;
            return Long.valueOf(yi8.m3688w());
        }
    });

    /* renamed from: e */
    public static final j65 f18527e = m16192a("measurement.config.cache_time", 86400000L, 3600000L, new b35() { // from class: com.daaw.ld3
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.f18523c;
            return Long.valueOf(yi8.m3696o());
        }
    });

    /* renamed from: f */
    public static final j65 f18529f = m16192a("measurement.config.url_scheme", "https", "https", new b35() { // from class: com.daaw.pq3
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.f18523c;
            return yi8.m3700k();
        }
    });

    /* renamed from: g */
    public static final j65 f18531g = m16192a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", new b35() { // from class: com.daaw.e44
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.f18523c;
            return yi8.m3701j();
        }
    });

    /* renamed from: h */
    public static final j65 f18533h = m16192a("measurement.upload.max_bundles", 100, 100, new b35() { // from class: com.daaw.jh4
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.f18523c;
            return Integer.valueOf((int) yi8.m3714H());
        }
    });

    /* renamed from: i */
    public static final j65 f18535i = m16192a("measurement.upload.max_batch_size", 65536, 65536, new b35() { // from class: com.daaw.iu4
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.f18523c;
            return Integer.valueOf((int) yi8.m3706e());
        }
    });

    /* renamed from: j */
    public static final j65 f18537j = m16192a("measurement.upload.max_bundle_size", 65536, 65536, new b35() { // from class: com.daaw.lv4
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.f18523c;
            return Integer.valueOf((int) yi8.m3715G());
        }
    });

    /* renamed from: k */
    public static final j65 f18539k = m16192a("measurement.upload.max_events_per_bundle", 1000, 1000, new b35() { // from class: com.daaw.nw4
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.f18523c;
            return Integer.valueOf((int) yi8.m3711K());
        }
    });

    /* renamed from: l */
    public static final j65 f18541l = m16192a("measurement.upload.max_events_per_day", 100000, 100000, new b35() { // from class: com.daaw.px4
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.f18523c;
            return Integer.valueOf((int) yi8.m3710a());
        }
    });

    /* renamed from: m */
    public static final j65 f18543m = m16192a("measurement.upload.max_error_events_per_day", 1000, 1000, new b35() { // from class: com.daaw.cl3
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.f18523c;
            return Integer.valueOf((int) yi8.m3712J());
        }
    });

    /* renamed from: n */
    public static final j65 f18545n = m16192a("measurement.upload.max_public_events_per_day", 50000, 50000, new b35() { // from class: com.daaw.px3
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.f18523c;
            return Integer.valueOf((int) yi8.m3709b());
        }
    });

    /* renamed from: o */
    public static final j65 f18547o = m16192a("measurement.upload.max_conversions_per_day", 10000, 10000, new b35() { // from class: com.daaw.s94
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.f18523c;
            return Integer.valueOf((int) yi8.m3713I());
        }
    });

    /* renamed from: p */
    public static final j65 f18549p = m16192a("measurement.upload.max_realtime_events_per_day", 10, 10, new b35() { // from class: com.daaw.nm4
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.f18523c;
            return Integer.valueOf((int) yi8.m3707d());
        }
    });

    /* renamed from: q */
    public static final j65 f18551q = m16192a("measurement.store.max_stored_events_per_app", 100000, 100000, new b35() { // from class: com.daaw.ry4
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.f18523c;
            return Integer.valueOf((int) yi8.m3693r());
        }
    });

    /* renamed from: r */
    public static final j65 f18553r = m16192a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", new b35() { // from class: com.daaw.uz4
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.f18523c;
            return yi8.m3699l();
        }
    });

    /* renamed from: s */
    public static final j65 f18555s = m16192a("measurement.upload.backoff_period", 43200000L, 43200000L, new b35() { // from class: com.daaw.w05
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.f18523c;
            return Long.valueOf(yi8.m3718D());
        }
    });

    /* renamed from: t */
    public static final j65 f18557t = m16192a("measurement.upload.window_interval", 3600000L, 3600000L, new b35() { // from class: com.daaw.y15
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.f18523c;
            return Long.valueOf(yi8.m3703h());
        }
    });

    /* renamed from: u */
    public static final j65 f18559u = m16192a("measurement.upload.interval", 3600000L, 3600000L, new b35() { // from class: com.daaw.pw2
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.f18523c;
            return Long.valueOf(yi8.m3716F());
        }
    });

    /* renamed from: v */
    public static final j65 f18561v = m16192a("measurement.upload.realtime_upload_interval", 10000L, 10000L, new b35() { // from class: com.daaw.py2
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.f18523c;
            return Long.valueOf(yi8.m3687x());
        }
    });

    /* renamed from: w */
    public static final j65 f18563w = m16192a("measurement.upload.debug_upload_interval", 1000L, 1000L, new b35() { // from class: com.daaw.u03
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.f18523c;
            return Long.valueOf(yi8.m3695p());
        }
    });

    /* renamed from: x */
    public static final j65 f18565x = m16192a("measurement.upload.minimum_delay", 500L, 500L, new b35() { // from class: com.daaw.x13
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.f18523c;
            return Long.valueOf(yi8.m3689v());
        }
    });

    /* renamed from: y */
    public static final j65 f18566y = m16192a("measurement.alarm_manager.minimum_interval", 60000L, 60000L, new b35() { // from class: com.daaw.b33
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.f18523c;
            return Long.valueOf(yi8.m3690u());
        }
    });

    /* renamed from: z */
    public static final j65 f18567z = m16192a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, new b35() { // from class: com.daaw.c43
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.f18523c;
            return Long.valueOf(yi8.m3721A());
        }
    });

    /* renamed from: A */
    public static final j65 f18493A = m16192a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, new b35() { // from class: com.daaw.h53
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.f18523c;
            return Long.valueOf(yi8.m3686y());
        }
    });

    /* renamed from: B */
    public static final j65 f18494B = m16192a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, new b35() { // from class: com.daaw.m63
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.f18523c;
            return Long.valueOf(yi8.m3717E());
        }
    });

    /* renamed from: C */
    public static final j65 f18495C = m16192a("measurement.upload.retry_time", 1800000L, 1800000L, new b35() { // from class: com.daaw.r73
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.f18523c;
            return Long.valueOf(yi8.m3704g());
        }
    });

    /* renamed from: D */
    public static final j65 f18496D = m16192a("measurement.upload.retry_count", 6, 6, new b35() { // from class: com.daaw.z93
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.f18523c;
            return Integer.valueOf((int) yi8.m3705f());
        }
    });

    /* renamed from: E */
    public static final j65 f18497E = m16192a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, new b35() { // from class: com.daaw.eb3
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.f18523c;
            return Long.valueOf(yi8.m3708c());
        }
    });

    /* renamed from: F */
    public static final j65 f18498F = m16192a("measurement.lifetimevalue.max_currency_tracked", 4, 4, new b35() { // from class: com.daaw.ic3
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.f18523c;
            return Integer.valueOf((int) yi8.m3694q());
        }
    });

    /* renamed from: G */
    public static final j65 f18499G = m16192a("measurement.audience.filter_result_max_count", 200, 200, new b35() { // from class: com.daaw.oe3
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.f18523c;
            return Integer.valueOf((int) yi8.m3691t());
        }
    });

    /* renamed from: H */
    public static final j65 f18500H = m16192a("measurement.upload.max_public_user_properties", 25, 25, null);

    /* renamed from: I */
    public static final j65 f18501I = m16192a("measurement.upload.max_event_name_cardinality", 500, 500, null);

    /* renamed from: J */
    public static final j65 f18502J = m16192a("measurement.upload.max_public_event_params", 25, 25, null);

    /* renamed from: K */
    public static final j65 f18503K = m16192a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, new b35() { // from class: com.daaw.rf3
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.f18523c;
            return Long.valueOf(yi8.m3685z());
        }
    });

    static {
        Boolean bool = Boolean.FALSE;
        f18504L = m16192a("measurement.test.boolean_flag", bool, bool, new b35() { // from class: com.daaw.ug3
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.f18523c;
                return Boolean.valueOf(pl8.m13290f());
            }
        });
        f18505M = m16192a("measurement.test.string_flag", "---", "---", new b35() { // from class: com.daaw.xh3
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.f18523c;
                return pl8.m13291e();
            }
        });
        f18506N = m16192a("measurement.test.long_flag", -1L, -1L, new b35() { // from class: com.daaw.yi3
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.f18523c;
                return Long.valueOf(pl8.m13293c());
            }
        });
        f18507O = m16192a("measurement.test.int_flag", -2, -2, new b35() { // from class: com.daaw.zj3
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.f18523c;
                return Integer.valueOf((int) pl8.m13294b());
            }
        });
        Double valueOf = Double.valueOf(-3.0d);
        f18508P = m16192a("measurement.test.double_flag", valueOf, valueOf, new b35() { // from class: com.daaw.fm3
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.f18523c;
                return Double.valueOf(pl8.m13295a());
            }
        });
        f18509Q = m16192a("measurement.experiment.max_ids", 50, 50, new b35() { // from class: com.daaw.in3
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.f18523c;
                return Integer.valueOf((int) yi8.m3692s());
            }
        });
        f18510R = m16192a("measurement.max_bundles_per_iteration", 100, 100, new b35() { // from class: com.daaw.lo3
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.f18523c;
                return Integer.valueOf((int) yi8.m3697n());
            }
        });
        f18511S = m16192a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, new b35() { // from class: com.daaw.op3
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.f18523c;
                return Long.valueOf(yi8.m3720B());
            }
        });
        f18512T = m16192a("measurement.redaction.app_instance_id.ttl", 7200000L, 7200000L, new b35() { // from class: com.daaw.ks3
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.f18523c;
                return Long.valueOf(yi8.m3719C());
            }
        });
        Boolean bool2 = Boolean.TRUE;
        f18513U = m16192a("measurement.collection.log_event_and_bundle_v2", bool2, bool2, new b35() { // from class: com.daaw.mt3
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.f18523c;
                return Boolean.valueOf(vl8.m7055b());
            }
        });
        f18514V = m16192a("measurement.quality.checksum", bool, bool, null);
        f18515W = m16192a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, new b35() { // from class: com.daaw.ku3
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.f18523c;
                return Boolean.valueOf(wj8.m6040d());
            }
        });
        f18516X = m16192a("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, new b35() { // from class: com.daaw.lv3
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.f18523c;
                return Boolean.valueOf(wj8.m6041c());
            }
        });
        f18517Y = m16192a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, new b35() { // from class: com.daaw.mw3
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.f18523c;
                return Boolean.valueOf(wj8.m6039e());
            }
        });
        f18518Z = m16192a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, new b35() { // from class: com.daaw.sy3
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.f18523c;
                return Boolean.valueOf(qn8.m12317b());
            }
        });
        f18520a0 = m16192a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, new b35() { // from class: com.daaw.uz3
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.f18523c;
                return Boolean.valueOf(dl8.m24251b());
            }
        });
        f18522b0 = m16192a("measurement.lifecycle.app_in_background_parameter", bool, bool, new b35() { // from class: com.daaw.w04
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.f18523c;
                return Boolean.valueOf(jl8.m18418b());
            }
        });
        f18524c0 = m16192a("measurement.integration.disable_firebase_instance_id", bool, bool, new b35() { // from class: com.daaw.z14
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.f18523c;
                return Boolean.valueOf(kn8.m17637c());
            }
        });
        f18526d0 = m16192a("measurement.collection.service.update_with_analytics_fix", bool, bool, new b35() { // from class: com.daaw.c34
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.f18523c;
                return Boolean.valueOf(wn8.m5927b());
            }
        });
        f18528e0 = m16192a("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, new b35() { // from class: com.daaw.h54
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.f18523c;
                return Boolean.valueOf(qj8.m12385c());
            }
        });
        f18530f0 = m16192a("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, new b35() { // from class: com.daaw.k64
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.f18523c;
                return Boolean.valueOf(rk8.m11207c());
            }
        });
        f18532g0 = m16192a("measurement.collection.synthetic_data_mitigation", bool, bool, new b35() { // from class: com.daaw.n74
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.f18523c;
                return Boolean.valueOf(en8.m23344b());
            }
        });
        f18534h0 = m16192a("measurement.service.storage_consent_support_version", 203600, 203600, new b35() { // from class: com.daaw.q84
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.f18523c;
                return Integer.valueOf((int) ej8.m23435a());
            }
        });
        f18536i0 = m16192a("measurement.client.click_identifier_control.dev", bool, bool, new b35() { // from class: com.daaw.va4
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.f18523c;
                return Boolean.valueOf(mi8.m16020b());
            }
        });
        f18538j0 = m16192a("measurement.service.click_identifier_control", bool, bool, new b35() { // from class: com.daaw.xb4
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.f18523c;
                return Boolean.valueOf(si8.m10324b());
            }
        });
        f18540k0 = m16192a("measurement.service.store_null_safelist", bool2, bool2, new b35() { // from class: com.daaw.ad4
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.f18523c;
                return Boolean.valueOf(kj8.m17685c());
            }
        });
        f18542l0 = m16192a("measurement.service.store_safelist", bool2, bool2, new b35() { // from class: com.daaw.ce4
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.f18523c;
                return Boolean.valueOf(kj8.m17684d());
            }
        });
        f18544m0 = m16192a("measurement.collection.enable_session_stitching_token.service", bool, bool, new b35() { // from class: com.daaw.ef4
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.f18523c;
                return Boolean.valueOf(zm8.m2108e());
            }
        });
        f18546n0 = m16192a("measurement.collection.enable_session_stitching_token.service_new", bool2, bool2, new b35() { // from class: com.daaw.gg4
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.f18523c;
                return Boolean.valueOf(zm8.m2107f());
            }
        });
        f18548o0 = m16192a("measurement.collection.enable_session_stitching_token.client.dev", bool2, bool2, new b35() { // from class: com.daaw.mi4
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.f18523c;
                return Boolean.valueOf(zm8.m2110c());
            }
        });
        f18550p0 = m16192a("measurement.session_stitching_token_enabled", bool, bool, new b35() { // from class: com.daaw.pj4
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.f18523c;
                return Boolean.valueOf(zm8.m2109d());
            }
        });
        f18552q0 = m16192a("measurement.redaction.e_tag", bool2, bool2, new b35() { // from class: com.daaw.kl4
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.f18523c;
                return Boolean.valueOf(bm8.m25987d());
            }
        });
        f18554r0 = m16192a("measurement.redaction.client_ephemeral_aiid_generation", bool2, bool2, new b35() { // from class: com.daaw.qn4
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.f18523c;
                return Boolean.valueOf(bm8.m25988c());
            }
        });
        f18556s0 = m16192a("measurement.redaction.retain_major_os_version", bool2, bool2, new b35() { // from class: com.daaw.to4
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.f18523c;
                return Boolean.valueOf(bm8.m25986e());
            }
        });
        f18558t0 = m16192a("measurement.redaction.scion_payload_generator", bool2, bool2, new b35() { // from class: com.daaw.wp4
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.f18523c;
                return Boolean.valueOf(bm8.m25985f());
            }
        });
        f18560u0 = m16192a("measurement.audience.dynamic_filters.oob_fix", bool2, bool2, new b35() { // from class: com.daaw.zq4
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.f18523c;
                return Boolean.valueOf(lk8.m16886c());
            }
        });
        f18562v0 = m16192a("measurement.service.clear_global_params_on_uninstall", bool2, bool2, new b35() { // from class: com.daaw.cs4
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.f18523c;
                return Boolean.valueOf(xk8.m5018c());
            }
        });
        f18564w0 = m16192a("measurement.sessionid.enable_client_session_id", bool2, bool2, new b35() { // from class: com.daaw.ft4
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.f18523c;
                return Boolean.valueOf(tm8.m8958c());
            }
        });
    }

    /* renamed from: a */
    public static j65 m16192a(String str, Object obj, Object obj2, b35 b35Var) {
        j65 j65Var = new j65(str, obj, obj2, b35Var, null);
        f18519a.add(j65Var);
        return j65Var;
    }

    /* renamed from: c */
    public static Map m16190c(Context context) {
        h08 m21116a = h08.m21116a(context.getContentResolver(), t18.m9649a("com.google.android.gms.measurement"), new Runnable() { // from class: com.daaw.lv2
            @Override // java.lang.Runnable
            public final void run() {
                j38.m19093d();
            }
        });
        return m21116a == null ? Collections.emptyMap() : m21116a.m21115b();
    }
}
