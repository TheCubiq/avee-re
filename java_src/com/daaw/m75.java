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
    public static final j65 L;
    public static final j65 M;
    public static final j65 N;
    public static final j65 O;
    public static final j65 P;
    public static final j65 Q;
    public static final j65 R;
    public static final j65 S;
    public static final j65 T;
    public static final j65 U;
    public static final j65 V;
    public static final j65 W;
    public static final j65 X;
    public static final j65 Y;
    public static final j65 Z;
    public static final j65 a0;
    public static final j65 b0;
    public static final j65 c0;
    public static final j65 d0;
    public static final j65 e0;
    public static final j65 f0;
    public static final j65 g0;
    public static final j65 h0;
    public static final j65 i0;
    public static final j65 j0;
    public static final j65 k0;
    public static final j65 l0;
    public static final j65 m0;
    public static final j65 n0;
    public static final j65 o0;
    public static final j65 p0;
    public static final j65 q0;
    public static final j65 r0;
    public static final j65 s0;
    public static final j65 t0;
    public static final j65 u0;
    public static final j65 v0;
    public static final j65 w0;
    public static final List a = Collections.synchronizedList(new ArrayList());
    public static final Set b = Collections.synchronizedSet(new HashSet());
    public static final j65 c = a("measurement.ad_id_cache_time", 10000L, 10000L, new b35() { // from class: com.daaw.v83
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.c;
            return Long.valueOf(yi8.m());
        }
    });
    public static final j65 d = a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, new b35() { // from class: com.daaw.tz2
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.c;
            return Long.valueOf(yi8.w());
        }
    });
    public static final j65 e = a("measurement.config.cache_time", 86400000L, 3600000L, new b35() { // from class: com.daaw.ld3
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.c;
            return Long.valueOf(yi8.o());
        }
    });
    public static final j65 f = a("measurement.config.url_scheme", "https", "https", new b35() { // from class: com.daaw.pq3
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.c;
            return yi8.k();
        }
    });
    public static final j65 g = a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", new b35() { // from class: com.daaw.e44
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.c;
            return yi8.j();
        }
    });
    public static final j65 h = a("measurement.upload.max_bundles", 100, 100, new b35() { // from class: com.daaw.jh4
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.c;
            return Integer.valueOf((int) yi8.H());
        }
    });
    public static final j65 i = a("measurement.upload.max_batch_size", 65536, 65536, new b35() { // from class: com.daaw.iu4
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.c;
            return Integer.valueOf((int) yi8.e());
        }
    });
    public static final j65 j = a("measurement.upload.max_bundle_size", 65536, 65536, new b35() { // from class: com.daaw.lv4
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.c;
            return Integer.valueOf((int) yi8.G());
        }
    });
    public static final j65 k = a("measurement.upload.max_events_per_bundle", 1000, 1000, new b35() { // from class: com.daaw.nw4
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.c;
            return Integer.valueOf((int) yi8.K());
        }
    });
    public static final j65 l = a("measurement.upload.max_events_per_day", 100000, 100000, new b35() { // from class: com.daaw.px4
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.c;
            return Integer.valueOf((int) yi8.a());
        }
    });
    public static final j65 m = a("measurement.upload.max_error_events_per_day", 1000, 1000, new b35() { // from class: com.daaw.cl3
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.c;
            return Integer.valueOf((int) yi8.J());
        }
    });
    public static final j65 n = a("measurement.upload.max_public_events_per_day", 50000, 50000, new b35() { // from class: com.daaw.px3
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.c;
            return Integer.valueOf((int) yi8.b());
        }
    });
    public static final j65 o = a("measurement.upload.max_conversions_per_day", 10000, 10000, new b35() { // from class: com.daaw.s94
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.c;
            return Integer.valueOf((int) yi8.I());
        }
    });
    public static final j65 p = a("measurement.upload.max_realtime_events_per_day", 10, 10, new b35() { // from class: com.daaw.nm4
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.c;
            return Integer.valueOf((int) yi8.d());
        }
    });
    public static final j65 q = a("measurement.store.max_stored_events_per_app", 100000, 100000, new b35() { // from class: com.daaw.ry4
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.c;
            return Integer.valueOf((int) yi8.r());
        }
    });
    public static final j65 r = a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", new b35() { // from class: com.daaw.uz4
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.c;
            return yi8.l();
        }
    });
    public static final j65 s = a("measurement.upload.backoff_period", 43200000L, 43200000L, new b35() { // from class: com.daaw.w05
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.c;
            return Long.valueOf(yi8.D());
        }
    });
    public static final j65 t = a("measurement.upload.window_interval", 3600000L, 3600000L, new b35() { // from class: com.daaw.y15
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.c;
            return Long.valueOf(yi8.h());
        }
    });
    public static final j65 u = a("measurement.upload.interval", 3600000L, 3600000L, new b35() { // from class: com.daaw.pw2
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.c;
            return Long.valueOf(yi8.F());
        }
    });
    public static final j65 v = a("measurement.upload.realtime_upload_interval", 10000L, 10000L, new b35() { // from class: com.daaw.py2
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.c;
            return Long.valueOf(yi8.x());
        }
    });
    public static final j65 w = a("measurement.upload.debug_upload_interval", 1000L, 1000L, new b35() { // from class: com.daaw.u03
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.c;
            return Long.valueOf(yi8.p());
        }
    });
    public static final j65 x = a("measurement.upload.minimum_delay", 500L, 500L, new b35() { // from class: com.daaw.x13
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.c;
            return Long.valueOf(yi8.v());
        }
    });
    public static final j65 y = a("measurement.alarm_manager.minimum_interval", 60000L, 60000L, new b35() { // from class: com.daaw.b33
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.c;
            return Long.valueOf(yi8.u());
        }
    });
    public static final j65 z = a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, new b35() { // from class: com.daaw.c43
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.c;
            return Long.valueOf(yi8.A());
        }
    });
    public static final j65 A = a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, new b35() { // from class: com.daaw.h53
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.c;
            return Long.valueOf(yi8.y());
        }
    });
    public static final j65 B = a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, new b35() { // from class: com.daaw.m63
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.c;
            return Long.valueOf(yi8.E());
        }
    });
    public static final j65 C = a("measurement.upload.retry_time", 1800000L, 1800000L, new b35() { // from class: com.daaw.r73
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.c;
            return Long.valueOf(yi8.g());
        }
    });
    public static final j65 D = a("measurement.upload.retry_count", 6, 6, new b35() { // from class: com.daaw.z93
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.c;
            return Integer.valueOf((int) yi8.f());
        }
    });
    public static final j65 E = a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, new b35() { // from class: com.daaw.eb3
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.c;
            return Long.valueOf(yi8.c());
        }
    });
    public static final j65 F = a("measurement.lifetimevalue.max_currency_tracked", 4, 4, new b35() { // from class: com.daaw.ic3
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.c;
            return Integer.valueOf((int) yi8.q());
        }
    });
    public static final j65 G = a("measurement.audience.filter_result_max_count", 200, 200, new b35() { // from class: com.daaw.oe3
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.c;
            return Integer.valueOf((int) yi8.t());
        }
    });
    public static final j65 H = a("measurement.upload.max_public_user_properties", 25, 25, null);
    public static final j65 I = a("measurement.upload.max_event_name_cardinality", 500, 500, null);
    public static final j65 J = a("measurement.upload.max_public_event_params", 25, 25, null);
    public static final j65 K = a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, new b35() { // from class: com.daaw.rf3
        @Override // com.daaw.b35
        public final Object zza() {
            j65 j65Var = m75.c;
            return Long.valueOf(yi8.z());
        }
    });

    static {
        Boolean bool = Boolean.FALSE;
        L = a("measurement.test.boolean_flag", bool, bool, new b35() { // from class: com.daaw.ug3
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.c;
                return Boolean.valueOf(pl8.f());
            }
        });
        M = a("measurement.test.string_flag", "---", "---", new b35() { // from class: com.daaw.xh3
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.c;
                return pl8.e();
            }
        });
        N = a("measurement.test.long_flag", -1L, -1L, new b35() { // from class: com.daaw.yi3
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.c;
                return Long.valueOf(pl8.c());
            }
        });
        O = a("measurement.test.int_flag", -2, -2, new b35() { // from class: com.daaw.zj3
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.c;
                return Integer.valueOf((int) pl8.b());
            }
        });
        Double valueOf = Double.valueOf(-3.0d);
        P = a("measurement.test.double_flag", valueOf, valueOf, new b35() { // from class: com.daaw.fm3
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.c;
                return Double.valueOf(pl8.a());
            }
        });
        Q = a("measurement.experiment.max_ids", 50, 50, new b35() { // from class: com.daaw.in3
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.c;
                return Integer.valueOf((int) yi8.s());
            }
        });
        R = a("measurement.max_bundles_per_iteration", 100, 100, new b35() { // from class: com.daaw.lo3
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.c;
                return Integer.valueOf((int) yi8.n());
            }
        });
        S = a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, new b35() { // from class: com.daaw.op3
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.c;
                return Long.valueOf(yi8.B());
            }
        });
        T = a("measurement.redaction.app_instance_id.ttl", 7200000L, 7200000L, new b35() { // from class: com.daaw.ks3
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.c;
                return Long.valueOf(yi8.C());
            }
        });
        Boolean bool2 = Boolean.TRUE;
        U = a("measurement.collection.log_event_and_bundle_v2", bool2, bool2, new b35() { // from class: com.daaw.mt3
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.c;
                return Boolean.valueOf(vl8.b());
            }
        });
        V = a("measurement.quality.checksum", bool, bool, null);
        W = a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, new b35() { // from class: com.daaw.ku3
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.c;
                return Boolean.valueOf(wj8.d());
            }
        });
        X = a("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, new b35() { // from class: com.daaw.lv3
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.c;
                return Boolean.valueOf(wj8.c());
            }
        });
        Y = a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, new b35() { // from class: com.daaw.mw3
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.c;
                return Boolean.valueOf(wj8.e());
            }
        });
        Z = a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, new b35() { // from class: com.daaw.sy3
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.c;
                return Boolean.valueOf(qn8.b());
            }
        });
        a0 = a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, new b35() { // from class: com.daaw.uz3
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.c;
                return Boolean.valueOf(dl8.b());
            }
        });
        b0 = a("measurement.lifecycle.app_in_background_parameter", bool, bool, new b35() { // from class: com.daaw.w04
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.c;
                return Boolean.valueOf(jl8.b());
            }
        });
        c0 = a("measurement.integration.disable_firebase_instance_id", bool, bool, new b35() { // from class: com.daaw.z14
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.c;
                return Boolean.valueOf(kn8.c());
            }
        });
        d0 = a("measurement.collection.service.update_with_analytics_fix", bool, bool, new b35() { // from class: com.daaw.c34
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.c;
                return Boolean.valueOf(wn8.b());
            }
        });
        e0 = a("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, new b35() { // from class: com.daaw.h54
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.c;
                return Boolean.valueOf(qj8.c());
            }
        });
        f0 = a("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, new b35() { // from class: com.daaw.k64
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.c;
                return Boolean.valueOf(rk8.c());
            }
        });
        g0 = a("measurement.collection.synthetic_data_mitigation", bool, bool, new b35() { // from class: com.daaw.n74
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.c;
                return Boolean.valueOf(en8.b());
            }
        });
        h0 = a("measurement.service.storage_consent_support_version", 203600, 203600, new b35() { // from class: com.daaw.q84
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.c;
                return Integer.valueOf((int) ej8.a());
            }
        });
        i0 = a("measurement.client.click_identifier_control.dev", bool, bool, new b35() { // from class: com.daaw.va4
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.c;
                return Boolean.valueOf(mi8.b());
            }
        });
        j0 = a("measurement.service.click_identifier_control", bool, bool, new b35() { // from class: com.daaw.xb4
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.c;
                return Boolean.valueOf(si8.b());
            }
        });
        k0 = a("measurement.service.store_null_safelist", bool2, bool2, new b35() { // from class: com.daaw.ad4
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.c;
                return Boolean.valueOf(kj8.c());
            }
        });
        l0 = a("measurement.service.store_safelist", bool2, bool2, new b35() { // from class: com.daaw.ce4
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.c;
                return Boolean.valueOf(kj8.d());
            }
        });
        m0 = a("measurement.collection.enable_session_stitching_token.service", bool, bool, new b35() { // from class: com.daaw.ef4
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.c;
                return Boolean.valueOf(zm8.e());
            }
        });
        n0 = a("measurement.collection.enable_session_stitching_token.service_new", bool2, bool2, new b35() { // from class: com.daaw.gg4
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.c;
                return Boolean.valueOf(zm8.f());
            }
        });
        o0 = a("measurement.collection.enable_session_stitching_token.client.dev", bool2, bool2, new b35() { // from class: com.daaw.mi4
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.c;
                return Boolean.valueOf(zm8.c());
            }
        });
        p0 = a("measurement.session_stitching_token_enabled", bool, bool, new b35() { // from class: com.daaw.pj4
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.c;
                return Boolean.valueOf(zm8.d());
            }
        });
        q0 = a("measurement.redaction.e_tag", bool2, bool2, new b35() { // from class: com.daaw.kl4
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.c;
                return Boolean.valueOf(bm8.d());
            }
        });
        r0 = a("measurement.redaction.client_ephemeral_aiid_generation", bool2, bool2, new b35() { // from class: com.daaw.qn4
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.c;
                return Boolean.valueOf(bm8.c());
            }
        });
        s0 = a("measurement.redaction.retain_major_os_version", bool2, bool2, new b35() { // from class: com.daaw.to4
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.c;
                return Boolean.valueOf(bm8.e());
            }
        });
        t0 = a("measurement.redaction.scion_payload_generator", bool2, bool2, new b35() { // from class: com.daaw.wp4
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.c;
                return Boolean.valueOf(bm8.f());
            }
        });
        u0 = a("measurement.audience.dynamic_filters.oob_fix", bool2, bool2, new b35() { // from class: com.daaw.zq4
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.c;
                return Boolean.valueOf(lk8.c());
            }
        });
        v0 = a("measurement.service.clear_global_params_on_uninstall", bool2, bool2, new b35() { // from class: com.daaw.cs4
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.c;
                return Boolean.valueOf(xk8.c());
            }
        });
        w0 = a("measurement.sessionid.enable_client_session_id", bool2, bool2, new b35() { // from class: com.daaw.ft4
            @Override // com.daaw.b35
            public final Object zza() {
                j65 j65Var = m75.c;
                return Boolean.valueOf(tm8.c());
            }
        });
    }

    public static j65 a(String str, Object obj, Object obj2, b35 b35Var) {
        j65 j65Var = new j65(str, obj, obj2, b35Var, null);
        a.add(j65Var);
        return j65Var;
    }

    public static Map c(Context context) {
        h08 a2 = h08.a(context.getContentResolver(), t18.a("com.google.android.gms.measurement"), new Runnable() { // from class: com.daaw.lv2
            @Override // java.lang.Runnable
            public final void run() {
                j38.d();
            }
        });
        return a2 == null ? Collections.emptyMap() : a2.b();
    }
}
