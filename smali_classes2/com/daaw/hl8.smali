.class public final Lcom/daaw/hl8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/fl8;


# static fields
.field public static final a:Lcom/daaw/j38;

.field public static final b:Lcom/daaw/j38;

.field public static final c:Lcom/daaw/j38;

.field public static final d:Lcom/daaw/j38;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/daaw/r28;

    const-string v1, "com.google.android.gms.measurement"

    invoke-static {v1}, Lcom/daaw/t18;->a(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/daaw/r28;-><init>(Landroid/net/Uri;)V

    invoke-virtual {v0}, Lcom/daaw/r28;->a()Lcom/daaw/r28;

    move-result-object v0

    const-string v1, "measurement.sdk.collection.enable_extend_user_property_size"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/daaw/r28;->f(Ljava/lang/String;Z)Lcom/daaw/j38;

    move-result-object v1

    sput-object v1, Lcom/daaw/hl8;->a:Lcom/daaw/j38;

    const-string v1, "measurement.sdk.collection.last_deep_link_referrer2"

    invoke-virtual {v0, v1, v2}, Lcom/daaw/r28;->f(Ljava/lang/String;Z)Lcom/daaw/j38;

    move-result-object v1

    sput-object v1, Lcom/daaw/hl8;->b:Lcom/daaw/j38;

    const-string v1, "measurement.sdk.collection.last_deep_link_referrer_campaign2"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/daaw/r28;->f(Ljava/lang/String;Z)Lcom/daaw/j38;

    move-result-object v1

    sput-object v1, Lcom/daaw/hl8;->c:Lcom/daaw/j38;

    const-string v1, "measurement.id.sdk.collection.last_deep_link_referrer2"

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/daaw/r28;->d(Ljava/lang/String;J)Lcom/daaw/j38;

    move-result-object v0

    sput-object v0, Lcom/daaw/hl8;->d:Lcom/daaw/j38;

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

    sget-object v0, Lcom/daaw/hl8;->c:Lcom/daaw/j38;

    invoke-virtual {v0}, Lcom/daaw/j38;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
