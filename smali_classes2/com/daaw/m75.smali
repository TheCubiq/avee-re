.class public final Lcom/daaw/m75;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final A:Lcom/daaw/j65;

.field public static final B:Lcom/daaw/j65;

.field public static final C:Lcom/daaw/j65;

.field public static final D:Lcom/daaw/j65;

.field public static final E:Lcom/daaw/j65;

.field public static final F:Lcom/daaw/j65;

.field public static final G:Lcom/daaw/j65;

.field public static final H:Lcom/daaw/j65;

.field public static final I:Lcom/daaw/j65;

.field public static final J:Lcom/daaw/j65;

.field public static final K:Lcom/daaw/j65;

.field public static final L:Lcom/daaw/j65;

.field public static final M:Lcom/daaw/j65;

.field public static final N:Lcom/daaw/j65;

.field public static final O:Lcom/daaw/j65;

.field public static final P:Lcom/daaw/j65;

.field public static final Q:Lcom/daaw/j65;

.field public static final R:Lcom/daaw/j65;

.field public static final S:Lcom/daaw/j65;

.field public static final T:Lcom/daaw/j65;

.field public static final U:Lcom/daaw/j65;

.field public static final V:Lcom/daaw/j65;

.field public static final W:Lcom/daaw/j65;

.field public static final X:Lcom/daaw/j65;

.field public static final Y:Lcom/daaw/j65;

.field public static final Z:Lcom/daaw/j65;

.field public static final a:Ljava/util/List;

.field public static final a0:Lcom/daaw/j65;

.field public static final b:Ljava/util/Set;

.field public static final b0:Lcom/daaw/j65;

.field public static final c:Lcom/daaw/j65;

.field public static final c0:Lcom/daaw/j65;

.field public static final d:Lcom/daaw/j65;

.field public static final d0:Lcom/daaw/j65;

.field public static final e:Lcom/daaw/j65;

.field public static final e0:Lcom/daaw/j65;

.field public static final f:Lcom/daaw/j65;

.field public static final f0:Lcom/daaw/j65;

.field public static final g:Lcom/daaw/j65;

.field public static final g0:Lcom/daaw/j65;

.field public static final h:Lcom/daaw/j65;

.field public static final h0:Lcom/daaw/j65;

.field public static final i:Lcom/daaw/j65;

.field public static final i0:Lcom/daaw/j65;

.field public static final j:Lcom/daaw/j65;

.field public static final j0:Lcom/daaw/j65;

.field public static final k:Lcom/daaw/j65;

.field public static final k0:Lcom/daaw/j65;

.field public static final l:Lcom/daaw/j65;

.field public static final l0:Lcom/daaw/j65;

.field public static final m:Lcom/daaw/j65;

.field public static final m0:Lcom/daaw/j65;

.field public static final n:Lcom/daaw/j65;

.field public static final n0:Lcom/daaw/j65;

.field public static final o:Lcom/daaw/j65;

.field public static final o0:Lcom/daaw/j65;

.field public static final p:Lcom/daaw/j65;

.field public static final p0:Lcom/daaw/j65;

.field public static final q:Lcom/daaw/j65;

.field public static final q0:Lcom/daaw/j65;

.field public static final r:Lcom/daaw/j65;

.field public static final r0:Lcom/daaw/j65;

.field public static final s:Lcom/daaw/j65;

.field public static final s0:Lcom/daaw/j65;

.field public static final t:Lcom/daaw/j65;

.field public static final t0:Lcom/daaw/j65;

.field public static final u:Lcom/daaw/j65;

.field public static final u0:Lcom/daaw/j65;

.field public static final v:Lcom/daaw/j65;

.field public static final v0:Lcom/daaw/j65;

.field public static final w:Lcom/daaw/j65;

.field public static final w0:Lcom/daaw/j65;

.field public static final x:Lcom/daaw/j65;

.field public static final y:Lcom/daaw/j65;

.field public static final z:Lcom/daaw/j65;


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/daaw/m75;->a:Ljava/util/List;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lcom/daaw/m75;->b:Ljava/util/Set;

    const-wide/16 v0, 0x2710

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Lcom/daaw/v83;->a:Lcom/daaw/v83;

    const-string v2, "measurement.ad_id_cache_time"

    invoke-static {v2, v0, v0, v1}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v1

    sput-object v1, Lcom/daaw/m75;->c:Lcom/daaw/j65;

    const-wide/32 v1, 0x5265c00

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    sget-object v2, Lcom/daaw/tz2;->a:Lcom/daaw/tz2;

    const-string v3, "measurement.monitoring.sample_period_millis"

    invoke-static {v3, v1, v1, v2}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v2

    sput-object v2, Lcom/daaw/m75;->d:Lcom/daaw/j65;

    const-wide/32 v2, 0x36ee80

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    sget-object v3, Lcom/daaw/ld3;->a:Lcom/daaw/ld3;

    const-string v4, "measurement.config.cache_time"

    invoke-static {v4, v1, v2, v3}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v3

    sput-object v3, Lcom/daaw/m75;->e:Lcom/daaw/j65;

    sget-object v3, Lcom/daaw/pq3;->a:Lcom/daaw/pq3;

    const-string v4, "measurement.config.url_scheme"

    const-string v5, "https"

    invoke-static {v4, v5, v5, v3}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v3

    sput-object v3, Lcom/daaw/m75;->f:Lcom/daaw/j65;

    sget-object v3, Lcom/daaw/e44;->a:Lcom/daaw/e44;

    const-string v4, "measurement.config.url_authority"

    const-string v5, "app-measurement.com"

    invoke-static {v4, v5, v5, v3}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v3

    sput-object v3, Lcom/daaw/m75;->g:Lcom/daaw/j65;

    const/16 v3, 0x64

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    sget-object v4, Lcom/daaw/jh4;->a:Lcom/daaw/jh4;

    const-string v5, "measurement.upload.max_bundles"

    invoke-static {v5, v3, v3, v4}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v4

    sput-object v4, Lcom/daaw/m75;->h:Lcom/daaw/j65;

    const/high16 v4, 0x10000

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget-object v5, Lcom/daaw/iu4;->a:Lcom/daaw/iu4;

    const-string v6, "measurement.upload.max_batch_size"

    invoke-static {v6, v4, v4, v5}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v5

    sput-object v5, Lcom/daaw/m75;->i:Lcom/daaw/j65;

    sget-object v5, Lcom/daaw/lv4;->a:Lcom/daaw/lv4;

    const-string v6, "measurement.upload.max_bundle_size"

    invoke-static {v6, v4, v4, v5}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v4

    sput-object v4, Lcom/daaw/m75;->j:Lcom/daaw/j65;

    const/16 v4, 0x3e8

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget-object v5, Lcom/daaw/nw4;->a:Lcom/daaw/nw4;

    const-string v6, "measurement.upload.max_events_per_bundle"

    invoke-static {v6, v4, v4, v5}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v5

    sput-object v5, Lcom/daaw/m75;->k:Lcom/daaw/j65;

    const v5, 0x186a0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    sget-object v6, Lcom/daaw/px4;->a:Lcom/daaw/px4;

    const-string v7, "measurement.upload.max_events_per_day"

    invoke-static {v7, v5, v5, v6}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v6

    sput-object v6, Lcom/daaw/m75;->l:Lcom/daaw/j65;

    sget-object v6, Lcom/daaw/cl3;->a:Lcom/daaw/cl3;

    const-string v7, "measurement.upload.max_error_events_per_day"

    invoke-static {v7, v4, v4, v6}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v4

    sput-object v4, Lcom/daaw/m75;->m:Lcom/daaw/j65;

    const v4, 0xc350

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget-object v6, Lcom/daaw/px3;->a:Lcom/daaw/px3;

    const-string v7, "measurement.upload.max_public_events_per_day"

    invoke-static {v7, v4, v4, v6}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v4

    sput-object v4, Lcom/daaw/m75;->n:Lcom/daaw/j65;

    const/16 v4, 0x2710

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget-object v6, Lcom/daaw/s94;->a:Lcom/daaw/s94;

    const-string v7, "measurement.upload.max_conversions_per_day"

    invoke-static {v7, v4, v4, v6}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v4

    sput-object v4, Lcom/daaw/m75;->o:Lcom/daaw/j65;

    const/16 v4, 0xa

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget-object v6, Lcom/daaw/nm4;->a:Lcom/daaw/nm4;

    const-string v7, "measurement.upload.max_realtime_events_per_day"

    invoke-static {v7, v4, v4, v6}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v4

    sput-object v4, Lcom/daaw/m75;->p:Lcom/daaw/j65;

    sget-object v4, Lcom/daaw/ry4;->a:Lcom/daaw/ry4;

    const-string v6, "measurement.store.max_stored_events_per_app"

    invoke-static {v6, v5, v5, v4}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v4

    sput-object v4, Lcom/daaw/m75;->q:Lcom/daaw/j65;

    sget-object v4, Lcom/daaw/uz4;->a:Lcom/daaw/uz4;

    const-string v5, "measurement.upload.url"

    const-string v6, "https://app-measurement.com/a"

    invoke-static {v5, v6, v6, v4}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v4

    sput-object v4, Lcom/daaw/m75;->r:Lcom/daaw/j65;

    const-wide/32 v4, 0x2932e00

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    sget-object v5, Lcom/daaw/w05;->a:Lcom/daaw/w05;

    const-string v6, "measurement.upload.backoff_period"

    invoke-static {v6, v4, v4, v5}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v4

    sput-object v4, Lcom/daaw/m75;->s:Lcom/daaw/j65;

    sget-object v4, Lcom/daaw/y15;->a:Lcom/daaw/y15;

    const-string v5, "measurement.upload.window_interval"

    invoke-static {v5, v2, v2, v4}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v4

    sput-object v4, Lcom/daaw/m75;->t:Lcom/daaw/j65;

    sget-object v4, Lcom/daaw/pw2;->a:Lcom/daaw/pw2;

    const-string v5, "measurement.upload.interval"

    invoke-static {v5, v2, v2, v4}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v2

    sput-object v2, Lcom/daaw/m75;->u:Lcom/daaw/j65;

    sget-object v2, Lcom/daaw/py2;->a:Lcom/daaw/py2;

    const-string v4, "measurement.upload.realtime_upload_interval"

    invoke-static {v4, v0, v0, v2}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v0

    sput-object v0, Lcom/daaw/m75;->v:Lcom/daaw/j65;

    const-wide/16 v4, 0x3e8

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    sget-object v2, Lcom/daaw/u03;->a:Lcom/daaw/u03;

    const-string v4, "measurement.upload.debug_upload_interval"

    invoke-static {v4, v0, v0, v2}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v0

    sput-object v0, Lcom/daaw/m75;->w:Lcom/daaw/j65;

    const-wide/16 v4, 0x1f4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    sget-object v2, Lcom/daaw/x13;->a:Lcom/daaw/x13;

    const-string v4, "measurement.upload.minimum_delay"

    invoke-static {v4, v0, v0, v2}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v0

    sput-object v0, Lcom/daaw/m75;->x:Lcom/daaw/j65;

    const-wide/32 v4, 0xea60

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    sget-object v2, Lcom/daaw/b33;->a:Lcom/daaw/b33;

    const-string v4, "measurement.alarm_manager.minimum_interval"

    invoke-static {v4, v0, v0, v2}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v0

    sput-object v0, Lcom/daaw/m75;->y:Lcom/daaw/j65;

    sget-object v0, Lcom/daaw/c43;->a:Lcom/daaw/c43;

    const-string v2, "measurement.upload.stale_data_deletion_interval"

    invoke-static {v2, v1, v1, v0}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v0

    sput-object v0, Lcom/daaw/m75;->z:Lcom/daaw/j65;

    const-wide/32 v0, 0x240c8400

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Lcom/daaw/h53;->a:Lcom/daaw/h53;

    const-string v2, "measurement.upload.refresh_blacklisted_config_interval"

    invoke-static {v2, v0, v0, v1}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v1

    sput-object v1, Lcom/daaw/m75;->A:Lcom/daaw/j65;

    const-wide/16 v1, 0x3a98

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    sget-object v2, Lcom/daaw/m63;->a:Lcom/daaw/m63;

    const-string v4, "measurement.upload.initial_upload_delay_time"

    invoke-static {v4, v1, v1, v2}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v1

    sput-object v1, Lcom/daaw/m75;->B:Lcom/daaw/j65;

    const-wide/32 v1, 0x1b7740

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    sget-object v2, Lcom/daaw/r73;->a:Lcom/daaw/r73;

    const-string v4, "measurement.upload.retry_time"

    invoke-static {v4, v1, v1, v2}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v1

    sput-object v1, Lcom/daaw/m75;->C:Lcom/daaw/j65;

    const/4 v1, 0x6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lcom/daaw/z93;->a:Lcom/daaw/z93;

    const-string v4, "measurement.upload.retry_count"

    invoke-static {v4, v1, v1, v2}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v1

    sput-object v1, Lcom/daaw/m75;->D:Lcom/daaw/j65;

    const-wide v1, 0x90321000L

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    sget-object v2, Lcom/daaw/eb3;->a:Lcom/daaw/eb3;

    const-string v4, "measurement.upload.max_queue_time"

    invoke-static {v4, v1, v1, v2}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v1

    sput-object v1, Lcom/daaw/m75;->E:Lcom/daaw/j65;

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lcom/daaw/ic3;->a:Lcom/daaw/ic3;

    const-string v4, "measurement.lifetimevalue.max_currency_tracked"

    invoke-static {v4, v1, v1, v2}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v1

    sput-object v1, Lcom/daaw/m75;->F:Lcom/daaw/j65;

    const/16 v1, 0xc8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lcom/daaw/oe3;->a:Lcom/daaw/oe3;

    const-string v4, "measurement.audience.filter_result_max_count"

    invoke-static {v4, v1, v1, v2}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v1

    sput-object v1, Lcom/daaw/m75;->G:Lcom/daaw/j65;

    const/16 v1, 0x19

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "measurement.upload.max_public_user_properties"

    const/4 v4, 0x0

    invoke-static {v2, v1, v1, v4}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v2

    sput-object v2, Lcom/daaw/m75;->H:Lcom/daaw/j65;

    const/16 v2, 0x1f4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v5, "measurement.upload.max_event_name_cardinality"

    invoke-static {v5, v2, v2, v4}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v2

    sput-object v2, Lcom/daaw/m75;->I:Lcom/daaw/j65;

    const-string v2, "measurement.upload.max_public_event_params"

    invoke-static {v2, v1, v1, v4}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v1

    sput-object v1, Lcom/daaw/m75;->J:Lcom/daaw/j65;

    const-wide/16 v1, 0x1388

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    sget-object v2, Lcom/daaw/rf3;->a:Lcom/daaw/rf3;

    const-string v5, "measurement.service_client.idle_disconnect_millis"

    invoke-static {v5, v1, v1, v2}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v1

    sput-object v1, Lcom/daaw/m75;->K:Lcom/daaw/j65;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget-object v2, Lcom/daaw/ug3;->a:Lcom/daaw/ug3;

    const-string v5, "measurement.test.boolean_flag"

    invoke-static {v5, v1, v1, v2}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v2

    sput-object v2, Lcom/daaw/m75;->L:Lcom/daaw/j65;

    sget-object v2, Lcom/daaw/xh3;->a:Lcom/daaw/xh3;

    const-string v5, "measurement.test.string_flag"

    const-string v6, "---"

    invoke-static {v5, v6, v6, v2}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v2

    sput-object v2, Lcom/daaw/m75;->M:Lcom/daaw/j65;

    const-wide/16 v5, -0x1

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    sget-object v5, Lcom/daaw/yi3;->a:Lcom/daaw/yi3;

    const-string v6, "measurement.test.long_flag"

    invoke-static {v6, v2, v2, v5}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v2

    sput-object v2, Lcom/daaw/m75;->N:Lcom/daaw/j65;

    const/4 v2, -0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    sget-object v5, Lcom/daaw/zj3;->a:Lcom/daaw/zj3;

    const-string v6, "measurement.test.int_flag"

    invoke-static {v6, v2, v2, v5}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v2

    sput-object v2, Lcom/daaw/m75;->O:Lcom/daaw/j65;

    const-wide/high16 v5, -0x3ff8000000000000L    # -3.0

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    sget-object v5, Lcom/daaw/fm3;->a:Lcom/daaw/fm3;

    const-string v6, "measurement.test.double_flag"

    invoke-static {v6, v2, v2, v5}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v2

    sput-object v2, Lcom/daaw/m75;->P:Lcom/daaw/j65;

    const/16 v2, 0x32

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    sget-object v5, Lcom/daaw/in3;->a:Lcom/daaw/in3;

    const-string v6, "measurement.experiment.max_ids"

    invoke-static {v6, v2, v2, v5}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v2

    sput-object v2, Lcom/daaw/m75;->Q:Lcom/daaw/j65;

    sget-object v2, Lcom/daaw/lo3;->a:Lcom/daaw/lo3;

    const-string v5, "measurement.max_bundles_per_iteration"

    invoke-static {v5, v3, v3, v2}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v2

    sput-object v2, Lcom/daaw/m75;->R:Lcom/daaw/j65;

    sget-object v2, Lcom/daaw/op3;->a:Lcom/daaw/op3;

    const-string v3, "measurement.sdk.attribution.cache.ttl"

    invoke-static {v3, v0, v0, v2}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v0

    sput-object v0, Lcom/daaw/m75;->S:Lcom/daaw/j65;

    const-wide/32 v2, 0x6ddd00

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    sget-object v2, Lcom/daaw/ks3;->a:Lcom/daaw/ks3;

    const-string v3, "measurement.redaction.app_instance_id.ttl"

    invoke-static {v3, v0, v0, v2}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v0

    sput-object v0, Lcom/daaw/m75;->T:Lcom/daaw/j65;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v2, Lcom/daaw/mt3;->a:Lcom/daaw/mt3;

    const-string v3, "measurement.collection.log_event_and_bundle_v2"

    invoke-static {v3, v0, v0, v2}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v2

    sput-object v2, Lcom/daaw/m75;->U:Lcom/daaw/j65;

    const-string v2, "measurement.quality.checksum"

    invoke-static {v2, v1, v1, v4}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v2

    sput-object v2, Lcom/daaw/m75;->V:Lcom/daaw/j65;

    sget-object v2, Lcom/daaw/ku3;->a:Lcom/daaw/ku3;

    const-string v3, "measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters"

    invoke-static {v3, v1, v1, v2}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v2

    sput-object v2, Lcom/daaw/m75;->W:Lcom/daaw/j65;

    sget-object v2, Lcom/daaw/lv3;->a:Lcom/daaw/lv3;

    const-string v3, "measurement.audience.refresh_event_count_filters_timestamp"

    invoke-static {v3, v1, v1, v2}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v2

    sput-object v2, Lcom/daaw/m75;->X:Lcom/daaw/j65;

    sget-object v2, Lcom/daaw/mw3;->a:Lcom/daaw/mw3;

    const-string v3, "measurement.audience.use_bundle_timestamp_for_event_count_filters"

    invoke-static {v3, v1, v1, v2}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v2

    sput-object v2, Lcom/daaw/m75;->Y:Lcom/daaw/j65;

    sget-object v2, Lcom/daaw/sy3;->a:Lcom/daaw/sy3;

    const-string v3, "measurement.sdk.collection.retrieve_deeplink_from_bow_2"

    invoke-static {v3, v0, v0, v2}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v2

    sput-object v2, Lcom/daaw/m75;->Z:Lcom/daaw/j65;

    sget-object v2, Lcom/daaw/uz3;->a:Lcom/daaw/uz3;

    const-string v3, "measurement.sdk.collection.last_deep_link_referrer_campaign2"

    invoke-static {v3, v1, v1, v2}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v2

    sput-object v2, Lcom/daaw/m75;->a0:Lcom/daaw/j65;

    sget-object v2, Lcom/daaw/w04;->a:Lcom/daaw/w04;

    const-string v3, "measurement.lifecycle.app_in_background_parameter"

    invoke-static {v3, v1, v1, v2}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v2

    sput-object v2, Lcom/daaw/m75;->b0:Lcom/daaw/j65;

    sget-object v2, Lcom/daaw/z14;->a:Lcom/daaw/z14;

    const-string v3, "measurement.integration.disable_firebase_instance_id"

    invoke-static {v3, v1, v1, v2}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v2

    sput-object v2, Lcom/daaw/m75;->c0:Lcom/daaw/j65;

    sget-object v2, Lcom/daaw/c34;->a:Lcom/daaw/c34;

    const-string v3, "measurement.collection.service.update_with_analytics_fix"

    invoke-static {v3, v1, v1, v2}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v2

    sput-object v2, Lcom/daaw/m75;->d0:Lcom/daaw/j65;

    sget-object v2, Lcom/daaw/h54;->a:Lcom/daaw/h54;

    const-string v3, "measurement.client.firebase_feature_rollout.v1.enable"

    invoke-static {v3, v0, v0, v2}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v2

    sput-object v2, Lcom/daaw/m75;->e0:Lcom/daaw/j65;

    sget-object v2, Lcom/daaw/k64;->a:Lcom/daaw/k64;

    const-string v3, "measurement.client.sessions.check_on_reset_and_enable2"

    invoke-static {v3, v0, v0, v2}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v2

    sput-object v2, Lcom/daaw/m75;->f0:Lcom/daaw/j65;

    sget-object v2, Lcom/daaw/n74;->a:Lcom/daaw/n74;

    const-string v3, "measurement.collection.synthetic_data_mitigation"

    invoke-static {v3, v1, v1, v2}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v2

    sput-object v2, Lcom/daaw/m75;->g0:Lcom/daaw/j65;

    const v2, 0x31b50

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    sget-object v3, Lcom/daaw/q84;->a:Lcom/daaw/q84;

    const-string v4, "measurement.service.storage_consent_support_version"

    invoke-static {v4, v2, v2, v3}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v2

    sput-object v2, Lcom/daaw/m75;->h0:Lcom/daaw/j65;

    sget-object v2, Lcom/daaw/va4;->a:Lcom/daaw/va4;

    const-string v3, "measurement.client.click_identifier_control.dev"

    invoke-static {v3, v1, v1, v2}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v2

    sput-object v2, Lcom/daaw/m75;->i0:Lcom/daaw/j65;

    sget-object v2, Lcom/daaw/xb4;->a:Lcom/daaw/xb4;

    const-string v3, "measurement.service.click_identifier_control"

    invoke-static {v3, v1, v1, v2}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v2

    sput-object v2, Lcom/daaw/m75;->j0:Lcom/daaw/j65;

    sget-object v2, Lcom/daaw/ad4;->a:Lcom/daaw/ad4;

    const-string v3, "measurement.service.store_null_safelist"

    invoke-static {v3, v0, v0, v2}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v2

    sput-object v2, Lcom/daaw/m75;->k0:Lcom/daaw/j65;

    sget-object v2, Lcom/daaw/ce4;->a:Lcom/daaw/ce4;

    const-string v3, "measurement.service.store_safelist"

    invoke-static {v3, v0, v0, v2}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v2

    sput-object v2, Lcom/daaw/m75;->l0:Lcom/daaw/j65;

    sget-object v2, Lcom/daaw/ef4;->a:Lcom/daaw/ef4;

    const-string v3, "measurement.collection.enable_session_stitching_token.service"

    invoke-static {v3, v1, v1, v2}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v2

    sput-object v2, Lcom/daaw/m75;->m0:Lcom/daaw/j65;

    sget-object v2, Lcom/daaw/gg4;->a:Lcom/daaw/gg4;

    const-string v3, "measurement.collection.enable_session_stitching_token.service_new"

    invoke-static {v3, v0, v0, v2}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v2

    sput-object v2, Lcom/daaw/m75;->n0:Lcom/daaw/j65;

    sget-object v2, Lcom/daaw/mi4;->a:Lcom/daaw/mi4;

    const-string v3, "measurement.collection.enable_session_stitching_token.client.dev"

    invoke-static {v3, v0, v0, v2}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v2

    sput-object v2, Lcom/daaw/m75;->o0:Lcom/daaw/j65;

    sget-object v2, Lcom/daaw/pj4;->a:Lcom/daaw/pj4;

    const-string v3, "measurement.session_stitching_token_enabled"

    invoke-static {v3, v1, v1, v2}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v1

    sput-object v1, Lcom/daaw/m75;->p0:Lcom/daaw/j65;

    sget-object v1, Lcom/daaw/kl4;->a:Lcom/daaw/kl4;

    const-string v2, "measurement.redaction.e_tag"

    invoke-static {v2, v0, v0, v1}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v1

    sput-object v1, Lcom/daaw/m75;->q0:Lcom/daaw/j65;

    sget-object v1, Lcom/daaw/qn4;->a:Lcom/daaw/qn4;

    const-string v2, "measurement.redaction.client_ephemeral_aiid_generation"

    invoke-static {v2, v0, v0, v1}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v1

    sput-object v1, Lcom/daaw/m75;->r0:Lcom/daaw/j65;

    sget-object v1, Lcom/daaw/to4;->a:Lcom/daaw/to4;

    const-string v2, "measurement.redaction.retain_major_os_version"

    invoke-static {v2, v0, v0, v1}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v1

    sput-object v1, Lcom/daaw/m75;->s0:Lcom/daaw/j65;

    sget-object v1, Lcom/daaw/wp4;->a:Lcom/daaw/wp4;

    const-string v2, "measurement.redaction.scion_payload_generator"

    invoke-static {v2, v0, v0, v1}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v1

    sput-object v1, Lcom/daaw/m75;->t0:Lcom/daaw/j65;

    sget-object v1, Lcom/daaw/zq4;->a:Lcom/daaw/zq4;

    const-string v2, "measurement.audience.dynamic_filters.oob_fix"

    invoke-static {v2, v0, v0, v1}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v1

    sput-object v1, Lcom/daaw/m75;->u0:Lcom/daaw/j65;

    sget-object v1, Lcom/daaw/cs4;->a:Lcom/daaw/cs4;

    const-string v2, "measurement.service.clear_global_params_on_uninstall"

    invoke-static {v2, v0, v0, v1}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v1

    sput-object v1, Lcom/daaw/m75;->v0:Lcom/daaw/j65;

    sget-object v1, Lcom/daaw/ft4;->a:Lcom/daaw/ft4;

    const-string v2, "measurement.sessionid.enable_client_session_id"

    invoke-static {v2, v0, v0, v1}, Lcom/daaw/m75;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;

    move-result-object v0

    sput-object v0, Lcom/daaw/m75;->w0:Lcom/daaw/j65;

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;)Lcom/daaw/j65;
    .locals 7

    new-instance v6, Lcom/daaw/j65;

    const/4 v5, 0x0

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/daaw/j65;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/b35;Lcom/daaw/g55;)V

    sget-object p0, Lcom/daaw/m75;->a:Ljava/util/List;

    invoke-interface {p0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v6
.end method

.method public static bridge synthetic b()Ljava/util/List;
    .locals 1

    sget-object v0, Lcom/daaw/m75;->a:Ljava/util/List;

    return-object v0
.end method

.method public static c(Landroid/content/Context;)Ljava/util/Map;
    .locals 2

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    const-string v0, "com.google.android.gms.measurement"

    invoke-static {v0}, Lcom/daaw/t18;->a(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sget-object v1, Lcom/daaw/lv2;->p:Lcom/daaw/lv2;

    invoke-static {p0, v0, v1}, Lcom/daaw/h08;->a(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/Runnable;)Lcom/daaw/h08;

    move-result-object p0

    if-nez p0, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/h08;->b()Ljava/util/Map;

    move-result-object p0

    :goto_0
    return-object p0
.end method
