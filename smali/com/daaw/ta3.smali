.class public final Lcom/daaw/ta3;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/daaw/ma3;

.field public static final b:Lcom/daaw/ma3;

.field public static final c:Lcom/daaw/ma3;

.field public static final d:Lcom/daaw/ma3;

.field public static final e:Lcom/daaw/ma3;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-string v0, "gads:cui_monitoring_session_sample_rate"

    const-wide v1, 0x3f33a92a30553261L    # 3.0E-4

    invoke-static {v0, v1, v2}, Lcom/daaw/ma3;->a(Ljava/lang/String;D)Lcom/daaw/ma3;

    move-result-object v0

    sput-object v0, Lcom/daaw/ta3;->a:Lcom/daaw/ma3;

    const-string v0, "gads:cui_monitoring_enabled"

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/daaw/ma3;->d(Ljava/lang/String;Z)Lcom/daaw/ma3;

    move-result-object v0

    sput-object v0, Lcom/daaw/ta3;->b:Lcom/daaw/ma3;

    const-string v0, "gads:cui_monitoring_v2_enabled"

    invoke-static {v0, v1}, Lcom/daaw/ma3;->d(Ljava/lang/String;Z)Lcom/daaw/ma3;

    move-result-object v0

    sput-object v0, Lcom/daaw/ta3;->c:Lcom/daaw/ma3;

    const-string v0, "gads:cui_monitoring_v3_enabled"

    invoke-static {v0, v1}, Lcom/daaw/ma3;->d(Ljava/lang/String;Z)Lcom/daaw/ma3;

    move-result-object v0

    sput-object v0, Lcom/daaw/ta3;->d:Lcom/daaw/ma3;

    const-string v0, "gads:cui_monitoring_v4_enabled"

    invoke-static {v0, v1}, Lcom/daaw/ma3;->d(Ljava/lang/String;Z)Lcom/daaw/ma3;

    move-result-object v0

    sput-object v0, Lcom/daaw/ta3;->e:Lcom/daaw/ma3;

    return-void
.end method
