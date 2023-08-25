.class public final Lcom/daaw/l36;
.super Lcom/daaw/ud7;
.source ""


# static fields
.field public static final y:Landroid/util/Pair;


# instance fields
.field public c:Landroid/content/SharedPreferences;

.field public d:Lcom/daaw/e16;

.field public final e:Lcom/daaw/xy5;

.field public final f:Lcom/daaw/xy5;

.field public final g:Lcom/daaw/i26;

.field public h:Ljava/lang/String;

.field public i:Z

.field public j:J

.field public final k:Lcom/daaw/xy5;

.field public final l:Lcom/daaw/qw5;

.field public final m:Lcom/daaw/i26;

.field public final n:Lcom/daaw/qw5;

.field public final o:Lcom/daaw/xy5;

.field public final p:Lcom/daaw/xy5;

.field public q:Z

.field public final r:Lcom/daaw/qw5;

.field public final s:Lcom/daaw/qw5;

.field public final t:Lcom/daaw/xy5;

.field public final u:Lcom/daaw/i26;

.field public final v:Lcom/daaw/i26;

.field public final w:Lcom/daaw/xy5;

.field public final x:Lcom/daaw/ux5;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroid/util/Pair;

    const-wide/16 v1, 0x0

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, ""

    invoke-direct {v0, v2, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sput-object v0, Lcom/daaw/l36;->y:Landroid/util/Pair;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/dr6;)V
    .locals 5

    invoke-direct {p0, p1}, Lcom/daaw/ud7;-><init>(Lcom/daaw/dr6;)V

    new-instance p1, Lcom/daaw/xy5;

    const-string v0, "session_timeout"

    const-wide/32 v1, 0x1b7740

    invoke-direct {p1, p0, v0, v1, v2}, Lcom/daaw/xy5;-><init>(Lcom/daaw/l36;Ljava/lang/String;J)V

    iput-object p1, p0, Lcom/daaw/l36;->k:Lcom/daaw/xy5;

    new-instance p1, Lcom/daaw/qw5;

    const-string v0, "start_new_session"

    const/4 v1, 0x1

    invoke-direct {p1, p0, v0, v1}, Lcom/daaw/qw5;-><init>(Lcom/daaw/l36;Ljava/lang/String;Z)V

    iput-object p1, p0, Lcom/daaw/l36;->l:Lcom/daaw/qw5;

    new-instance p1, Lcom/daaw/xy5;

    const-string v0, "last_pause_time"

    const-wide/16 v1, 0x0

    invoke-direct {p1, p0, v0, v1, v2}, Lcom/daaw/xy5;-><init>(Lcom/daaw/l36;Ljava/lang/String;J)V

    iput-object p1, p0, Lcom/daaw/l36;->o:Lcom/daaw/xy5;

    new-instance p1, Lcom/daaw/xy5;

    const-string v0, "session_id"

    invoke-direct {p1, p0, v0, v1, v2}, Lcom/daaw/xy5;-><init>(Lcom/daaw/l36;Ljava/lang/String;J)V

    iput-object p1, p0, Lcom/daaw/l36;->p:Lcom/daaw/xy5;

    new-instance p1, Lcom/daaw/i26;

    const-string v0, "non_personalized_ads"

    const/4 v3, 0x0

    invoke-direct {p1, p0, v0, v3}, Lcom/daaw/i26;-><init>(Lcom/daaw/l36;Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/daaw/l36;->m:Lcom/daaw/i26;

    new-instance p1, Lcom/daaw/qw5;

    const-string v0, "allow_remote_dynamite"

    const/4 v4, 0x0

    invoke-direct {p1, p0, v0, v4}, Lcom/daaw/qw5;-><init>(Lcom/daaw/l36;Ljava/lang/String;Z)V

    iput-object p1, p0, Lcom/daaw/l36;->n:Lcom/daaw/qw5;

    new-instance p1, Lcom/daaw/xy5;

    const-string v0, "first_open_time"

    invoke-direct {p1, p0, v0, v1, v2}, Lcom/daaw/xy5;-><init>(Lcom/daaw/l36;Ljava/lang/String;J)V

    iput-object p1, p0, Lcom/daaw/l36;->e:Lcom/daaw/xy5;

    new-instance p1, Lcom/daaw/xy5;

    const-string v0, "app_install_time"

    invoke-direct {p1, p0, v0, v1, v2}, Lcom/daaw/xy5;-><init>(Lcom/daaw/l36;Ljava/lang/String;J)V

    iput-object p1, p0, Lcom/daaw/l36;->f:Lcom/daaw/xy5;

    new-instance p1, Lcom/daaw/i26;

    const-string v0, "app_instance_id"

    invoke-direct {p1, p0, v0, v3}, Lcom/daaw/i26;-><init>(Lcom/daaw/l36;Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/daaw/l36;->g:Lcom/daaw/i26;

    new-instance p1, Lcom/daaw/qw5;

    const-string v0, "app_backgrounded"

    invoke-direct {p1, p0, v0, v4}, Lcom/daaw/qw5;-><init>(Lcom/daaw/l36;Ljava/lang/String;Z)V

    iput-object p1, p0, Lcom/daaw/l36;->r:Lcom/daaw/qw5;

    new-instance p1, Lcom/daaw/qw5;

    const-string v0, "deep_link_retrieval_complete"

    invoke-direct {p1, p0, v0, v4}, Lcom/daaw/qw5;-><init>(Lcom/daaw/l36;Ljava/lang/String;Z)V

    iput-object p1, p0, Lcom/daaw/l36;->s:Lcom/daaw/qw5;

    new-instance p1, Lcom/daaw/xy5;

    const-string v0, "deep_link_retrieval_attempts"

    invoke-direct {p1, p0, v0, v1, v2}, Lcom/daaw/xy5;-><init>(Lcom/daaw/l36;Ljava/lang/String;J)V

    iput-object p1, p0, Lcom/daaw/l36;->t:Lcom/daaw/xy5;

    new-instance p1, Lcom/daaw/i26;

    const-string v0, "firebase_feature_rollouts"

    invoke-direct {p1, p0, v0, v3}, Lcom/daaw/i26;-><init>(Lcom/daaw/l36;Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/daaw/l36;->u:Lcom/daaw/i26;

    new-instance p1, Lcom/daaw/i26;

    const-string v0, "deferred_attribution_cache"

    invoke-direct {p1, p0, v0, v3}, Lcom/daaw/i26;-><init>(Lcom/daaw/l36;Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/daaw/l36;->v:Lcom/daaw/i26;

    new-instance p1, Lcom/daaw/xy5;

    const-string v0, "deferred_attribution_cache_timestamp"

    invoke-direct {p1, p0, v0, v1, v2}, Lcom/daaw/xy5;-><init>(Lcom/daaw/l36;Ljava/lang/String;J)V

    iput-object p1, p0, Lcom/daaw/l36;->w:Lcom/daaw/xy5;

    new-instance p1, Lcom/daaw/ux5;

    const-string v0, "default_event_parameters"

    invoke-direct {p1, p0, v0, v3}, Lcom/daaw/ux5;-><init>(Lcom/daaw/l36;Ljava/lang/String;Landroid/os/Bundle;)V

    iput-object p1, p0, Lcom/daaw/l36;->x:Lcom/daaw/ux5;

    return-void
.end method


# virtual methods
.method public final g()V
    .locals 9
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNull$List;
        value = {
            .subannotation Lorg/checkerframework/checker/nullness/qual/EnsuresNonNull;
                value = {
                    "this.preferences"
                }
            .end subannotation,
            .subannotation Lorg/checkerframework/checker/nullness/qual/EnsuresNonNull;
                value = {
                    "this.monitoringSample"
                }
            .end subannotation
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->d()Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.google.android.gms.measurement.prefs"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/l36;->c:Landroid/content/SharedPreferences;

    const-string v1, "has_been_opened"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/daaw/l36;->q:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/l36;->c:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_0
    new-instance v0, Lcom/daaw/e16;

    iget-object v1, p0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v1}, Lcom/daaw/dr6;->z()Lcom/daaw/qa2;

    const-wide/16 v1, 0x0

    sget-object v3, Lcom/daaw/m75;->d:Lcom/daaw/j65;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Lcom/daaw/j65;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    const/4 v8, 0x0

    const-string v5, "health_monitor"

    move-object v3, v0

    move-object v4, p0

    invoke-direct/range {v3 .. v8}, Lcom/daaw/e16;-><init>(Lcom/daaw/l36;Ljava/lang/String;JLcom/daaw/b06;)V

    iput-object v0, p0, Lcom/daaw/l36;->d:Lcom/daaw/e16;

    return-void
.end method

.method public final h()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final n()Landroid/content/SharedPreferences;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/rc7;->f()V

    invoke-virtual {p0}, Lcom/daaw/ud7;->j()V

    iget-object v0, p0, Lcom/daaw/l36;->c:Landroid/content/SharedPreferences;

    invoke-static {v0}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/l36;->c:Landroid/content/SharedPreferences;

    return-object v0
.end method

.method public final o(Ljava/lang/String;)Landroid/util/Pair;
    .locals 7

    const-string v0, ""

    invoke-virtual {p0}, Lcom/daaw/rc7;->f()V

    iget-object v1, p0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v1}, Lcom/daaw/dr6;->b()Lcom/daaw/ag;

    move-result-object v1

    invoke-interface {v1}, Lcom/daaw/ag;->b()J

    move-result-wide v1

    iget-object v3, p0, Lcom/daaw/l36;->h:Ljava/lang/String;

    if-eqz v3, :cond_1

    iget-wide v4, p0, Lcom/daaw/l36;->j:J

    cmp-long v6, v1, v4

    if-ltz v6, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Landroid/util/Pair;

    iget-boolean v0, p0, Lcom/daaw/l36;->i:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-direct {p1, v3, v0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :cond_1
    :goto_0
    iget-object v3, p0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v3}, Lcom/daaw/dr6;->z()Lcom/daaw/qa2;

    move-result-object v3

    sget-object v4, Lcom/daaw/m75;->c:Lcom/daaw/j65;

    invoke-virtual {v3, p1, v4}, Lcom/daaw/qa2;->q(Ljava/lang/String;Lcom/daaw/j65;)J

    move-result-wide v3

    add-long/2addr v1, v3

    iput-wide v1, p0, Lcom/daaw/l36;->j:J

    const/4 p1, 0x1

    invoke-static {p1}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->setShouldSkipGmsCoreVersionCheck(Z)V

    :try_start_0
    iget-object p1, p0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {p1}, Lcom/daaw/dr6;->d()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->getAdvertisingIdInfo(Landroid/content/Context;)Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    move-result-object p1

    iput-object v0, p0, Lcom/daaw/l36;->h:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->getId()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    iput-object v1, p0, Lcom/daaw/l36;->h:Ljava/lang/String;

    :cond_2
    invoke-virtual {p1}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->isLimitAdTrackingEnabled()Z

    move-result p1

    iput-boolean p1, p0, Lcom/daaw/l36;->i:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    iget-object v1, p0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v1}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/om5;->p()Lcom/daaw/hk5;

    move-result-object v1

    const-string v2, "Unable to get advertising id"

    invoke-virtual {v1, v2, p1}, Lcom/daaw/hk5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/l36;->h:Ljava/lang/String;

    :goto_1
    const/4 p1, 0x0

    invoke-static {p1}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->setShouldSkipGmsCoreVersionCheck(Z)V

    new-instance p1, Landroid/util/Pair;

    iget-object v0, p0, Lcom/daaw/l36;->h:Ljava/lang/String;

    iget-boolean v1, p0, Lcom/daaw/l36;->i:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method public final p()Lcom/daaw/cd2;
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/rc7;->f()V

    invoke-virtual {p0}, Lcom/daaw/l36;->n()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "consent_settings"

    const-string v2, "G1"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/cd2;->b(Ljava/lang/String;)Lcom/daaw/cd2;

    move-result-object v0

    return-object v0
.end method

.method public final q()Ljava/lang/Boolean;
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/rc7;->f()V

    invoke-virtual {p0}, Lcom/daaw/l36;->n()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "measurement_enabled"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/l36;->n()Landroid/content/SharedPreferences;

    move-result-object v0

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final s(Ljava/lang/Boolean;)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/rc7;->f()V

    invoke-virtual {p0}, Lcom/daaw/l36;->n()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "measurement_enabled"

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    :cond_0
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    :goto_0
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public final t(Z)V
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/rc7;->f()V

    iget-object v0, p0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/om5;->v()Lcom/daaw/hk5;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "App measurement setting deferred collection"

    invoke-virtual {v0, v2, v1}, Lcom/daaw/hk5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/daaw/l36;->n()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "deferred_analytics_collection"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public final u()Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/l36;->c:Landroid/content/SharedPreferences;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const-string v1, "deferred_analytics_collection"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public final v(J)Z
    .locals 3

    iget-object v0, p0, Lcom/daaw/l36;->k:Lcom/daaw/xy5;

    invoke-virtual {v0}, Lcom/daaw/xy5;->a()J

    move-result-wide v0

    sub-long/2addr p1, v0

    iget-object v0, p0, Lcom/daaw/l36;->o:Lcom/daaw/xy5;

    invoke-virtual {v0}, Lcom/daaw/xy5;->a()J

    move-result-wide v0

    cmp-long v2, p1, v0

    if-lez v2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final w(I)Z
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/l36;->n()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "consent_source"

    const/16 v2, 0x64

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {p1, v0}, Lcom/daaw/cd2;->j(II)Z

    move-result p1

    return p1
.end method
