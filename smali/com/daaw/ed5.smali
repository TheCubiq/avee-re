.class public final Lcom/daaw/ed5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/daaw/ed5;
    .locals 1

    invoke-static {}, Lcom/daaw/dd5;->a()Lcom/daaw/ed5;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final synthetic zzb()Ljava/lang/Object;
    .locals 4

    new-instance v0, Lcom/daaw/md5;

    sget-object v1, Lcom/daaw/ym6;->P:Lcom/daaw/ym6;

    sget-object v2, Lcom/daaw/ym6;->t:Lcom/daaw/ym6;

    const-string v3, "t_load_as"

    invoke-direct {v0, v3, v1, v2}, Lcom/daaw/md5;-><init>(Ljava/lang/String;Lcom/daaw/ym6;Lcom/daaw/ym6;)V

    return-object v0
.end method
