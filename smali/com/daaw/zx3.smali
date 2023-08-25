.class public final synthetic Lcom/daaw/zx3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/iy3;


# static fields
.field public static final synthetic a:Lcom/daaw/zx3;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/zx3;

    invoke-direct {v0}, Lcom/daaw/zx3;-><init>()V

    sput-object v0, Lcom/daaw/zx3;->a:Lcom/daaw/zx3;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/x84;)Ljava/lang/Object;
    .locals 1

    invoke-interface {p1}, Lcom/daaw/x84;->zzh()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Lcom/daaw/x84;->zzg()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string p1, ""

    return-object p1

    :cond_0
    return-object v0
.end method
