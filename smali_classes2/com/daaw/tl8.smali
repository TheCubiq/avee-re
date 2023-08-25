.class public final Lcom/daaw/tl8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/rl8;


# static fields
.field public static final a:Lcom/daaw/j38;

.field public static final b:Lcom/daaw/j38;

.field public static final c:Lcom/daaw/j38;

.field public static final d:Lcom/daaw/j38;

.field public static final e:Lcom/daaw/j38;


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

    const-string v1, "measurement.test.boolean_flag"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/daaw/r28;->f(Ljava/lang/String;Z)Lcom/daaw/j38;

    move-result-object v1

    sput-object v1, Lcom/daaw/tl8;->a:Lcom/daaw/j38;

    const-string v1, "measurement.test.double_flag"

    const-wide/high16 v2, -0x3ff8000000000000L    # -3.0

    invoke-virtual {v0, v1, v2, v3}, Lcom/daaw/r28;->c(Ljava/lang/String;D)Lcom/daaw/j38;

    move-result-object v1

    sput-object v1, Lcom/daaw/tl8;->b:Lcom/daaw/j38;

    const-string v1, "measurement.test.int_flag"

    const-wide/16 v2, -0x2

    invoke-virtual {v0, v1, v2, v3}, Lcom/daaw/r28;->d(Ljava/lang/String;J)Lcom/daaw/j38;

    move-result-object v1

    sput-object v1, Lcom/daaw/tl8;->c:Lcom/daaw/j38;

    const-string v1, "measurement.test.long_flag"

    const-wide/16 v2, -0x1

    invoke-virtual {v0, v1, v2, v3}, Lcom/daaw/r28;->d(Ljava/lang/String;J)Lcom/daaw/j38;

    move-result-object v1

    sput-object v1, Lcom/daaw/tl8;->d:Lcom/daaw/j38;

    const-string v1, "measurement.test.string_flag"

    const-string v2, "---"

    invoke-virtual {v0, v1, v2}, Lcom/daaw/r28;->e(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/j38;

    move-result-object v0

    sput-object v0, Lcom/daaw/tl8;->e:Lcom/daaw/j38;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()D
    .locals 2

    sget-object v0, Lcom/daaw/tl8;->b:Lcom/daaw/j38;

    invoke-virtual {v0}, Lcom/daaw/j38;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0
.end method

.method public final zzb()J
    .locals 2

    sget-object v0, Lcom/daaw/tl8;->c:Lcom/daaw/j38;

    invoke-virtual {v0}, Lcom/daaw/j38;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzc()J
    .locals 2

    sget-object v0, Lcom/daaw/tl8;->d:Lcom/daaw/j38;

    invoke-virtual {v0}, Lcom/daaw/j38;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzd()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/daaw/tl8;->e:Lcom/daaw/j38;

    invoke-virtual {v0}, Lcom/daaw/j38;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final zze()Z
    .locals 1

    sget-object v0, Lcom/daaw/tl8;->a:Lcom/daaw/j38;

    invoke-virtual {v0}, Lcom/daaw/j38;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
