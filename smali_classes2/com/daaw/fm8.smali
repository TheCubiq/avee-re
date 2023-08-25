.class public final Lcom/daaw/fm8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/dm8;


# static fields
.field public static final a:Lcom/daaw/j38;

.field public static final b:Lcom/daaw/j38;

.field public static final c:Lcom/daaw/j38;

.field public static final d:Lcom/daaw/j38;

.field public static final e:Lcom/daaw/j38;

.field public static final f:Lcom/daaw/j38;

.field public static final g:Lcom/daaw/j38;

.field public static final h:Lcom/daaw/j38;

.field public static final i:Lcom/daaw/j38;

.field public static final j:Lcom/daaw/j38;

.field public static final k:Lcom/daaw/j38;

.field public static final l:Lcom/daaw/j38;

.field public static final m:Lcom/daaw/j38;

.field public static final n:Lcom/daaw/j38;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/daaw/r28;

    const-string v1, "com.google.android.gms.measurement"

    invoke-static {v1}, Lcom/daaw/t18;->a(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/daaw/r28;-><init>(Landroid/net/Uri;)V

    invoke-virtual {v0}, Lcom/daaw/r28;->b()Lcom/daaw/r28;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/r28;->a()Lcom/daaw/r28;

    move-result-object v0

    const-string v1, "measurement.redaction.app_instance_id"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/daaw/r28;->f(Ljava/lang/String;Z)Lcom/daaw/j38;

    move-result-object v1

    sput-object v1, Lcom/daaw/fm8;->a:Lcom/daaw/j38;

    const-string v1, "measurement.redaction.client_ephemeral_aiid_generation"

    invoke-virtual {v0, v1, v2}, Lcom/daaw/r28;->f(Ljava/lang/String;Z)Lcom/daaw/j38;

    move-result-object v1

    sput-object v1, Lcom/daaw/fm8;->b:Lcom/daaw/j38;

    const-string v1, "measurement.redaction.config_redacted_fields"

    invoke-virtual {v0, v1, v2}, Lcom/daaw/r28;->f(Ljava/lang/String;Z)Lcom/daaw/j38;

    move-result-object v1

    sput-object v1, Lcom/daaw/fm8;->c:Lcom/daaw/j38;

    const-string v1, "measurement.redaction.device_info"

    invoke-virtual {v0, v1, v2}, Lcom/daaw/r28;->f(Ljava/lang/String;Z)Lcom/daaw/j38;

    move-result-object v1

    sput-object v1, Lcom/daaw/fm8;->d:Lcom/daaw/j38;

    const-string v1, "measurement.redaction.e_tag"

    invoke-virtual {v0, v1, v2}, Lcom/daaw/r28;->f(Ljava/lang/String;Z)Lcom/daaw/j38;

    move-result-object v1

    sput-object v1, Lcom/daaw/fm8;->e:Lcom/daaw/j38;

    const-string v1, "measurement.redaction.enhanced_uid"

    invoke-virtual {v0, v1, v2}, Lcom/daaw/r28;->f(Ljava/lang/String;Z)Lcom/daaw/j38;

    move-result-object v1

    sput-object v1, Lcom/daaw/fm8;->f:Lcom/daaw/j38;

    const-string v1, "measurement.redaction.populate_ephemeral_app_instance_id"

    invoke-virtual {v0, v1, v2}, Lcom/daaw/r28;->f(Ljava/lang/String;Z)Lcom/daaw/j38;

    move-result-object v1

    sput-object v1, Lcom/daaw/fm8;->g:Lcom/daaw/j38;

    const-string v1, "measurement.redaction.google_signals"

    invoke-virtual {v0, v1, v2}, Lcom/daaw/r28;->f(Ljava/lang/String;Z)Lcom/daaw/j38;

    move-result-object v1

    sput-object v1, Lcom/daaw/fm8;->h:Lcom/daaw/j38;

    const-string v1, "measurement.redaction.no_aiid_in_config_request"

    invoke-virtual {v0, v1, v2}, Lcom/daaw/r28;->f(Ljava/lang/String;Z)Lcom/daaw/j38;

    move-result-object v1

    sput-object v1, Lcom/daaw/fm8;->i:Lcom/daaw/j38;

    const-string v1, "measurement.redaction.retain_major_os_version"

    invoke-virtual {v0, v1, v2}, Lcom/daaw/r28;->f(Ljava/lang/String;Z)Lcom/daaw/j38;

    move-result-object v1

    sput-object v1, Lcom/daaw/fm8;->j:Lcom/daaw/j38;

    const-string v1, "measurement.redaction.scion_payload_generator"

    invoke-virtual {v0, v1, v2}, Lcom/daaw/r28;->f(Ljava/lang/String;Z)Lcom/daaw/j38;

    move-result-object v1

    sput-object v1, Lcom/daaw/fm8;->k:Lcom/daaw/j38;

    const-string v1, "measurement.redaction.upload_redacted_fields"

    invoke-virtual {v0, v1, v2}, Lcom/daaw/r28;->f(Ljava/lang/String;Z)Lcom/daaw/j38;

    move-result-object v1

    sput-object v1, Lcom/daaw/fm8;->l:Lcom/daaw/j38;

    const-string v1, "measurement.redaction.upload_subdomain_override"

    invoke-virtual {v0, v1, v2}, Lcom/daaw/r28;->f(Ljava/lang/String;Z)Lcom/daaw/j38;

    move-result-object v1

    sput-object v1, Lcom/daaw/fm8;->m:Lcom/daaw/j38;

    const-string v1, "measurement.redaction.user_id"

    invoke-virtual {v0, v1, v2}, Lcom/daaw/r28;->f(Ljava/lang/String;Z)Lcom/daaw/j38;

    move-result-object v0

    sput-object v0, Lcom/daaw/fm8;->n:Lcom/daaw/j38;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final zzb()Z
    .locals 1

    sget-object v0, Lcom/daaw/fm8;->b:Lcom/daaw/j38;

    invoke-virtual {v0}, Lcom/daaw/j38;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final zzc()Z
    .locals 1

    sget-object v0, Lcom/daaw/fm8;->e:Lcom/daaw/j38;

    invoke-virtual {v0}, Lcom/daaw/j38;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final zzd()Z
    .locals 1

    sget-object v0, Lcom/daaw/fm8;->j:Lcom/daaw/j38;

    invoke-virtual {v0}, Lcom/daaw/j38;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final zze()Z
    .locals 1

    sget-object v0, Lcom/daaw/fm8;->k:Lcom/daaw/j38;

    invoke-virtual {v0}, Lcom/daaw/j38;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
