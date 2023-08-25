.class public final Lcom/daaw/tu3;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:J

.field public final b:Lcom/daaw/ru3;


# direct methods
.method public constructor <init>(Lcom/daaw/uu3;Lcom/daaw/ru3;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzB()Lcom/daaw/ag;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/ag;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/daaw/tu3;->a:J

    iput-object p2, p0, Lcom/daaw/tu3;->b:Lcom/daaw/ru3;

    return-void
.end method
