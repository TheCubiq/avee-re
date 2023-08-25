.class public final Lcom/daaw/qg3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zg3;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 0

    check-cast p1, Lcom/daaw/a74;

    invoke-interface {p1}, Lcom/daaw/a74;->zzM()Lcom/daaw/ec3;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/daaw/ec3;->zzc()V

    :cond_0
    return-void
.end method
