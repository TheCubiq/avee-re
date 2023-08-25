.class public final Lcom/daaw/uh5;
.super Lcom/google/android/gms/ads/AdListener;
.source ""


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lcom/daaw/xh5;


# direct methods
.method public constructor <init>(Lcom/daaw/xh5;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/uh5;->b:Lcom/daaw/xh5;

    iput-object p2, p0, Lcom/daaw/uh5;->a:Ljava/lang/String;

    invoke-direct {p0}, Lcom/google/android/gms/ads/AdListener;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAdFailedToLoad(Lcom/google/android/gms/ads/LoadAdError;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/uh5;->b:Lcom/daaw/xh5;

    invoke-static {p1}, Lcom/daaw/xh5;->h3(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/daaw/uh5;->a:Ljava/lang/String;

    invoke-static {v0, p1, v1}, Lcom/daaw/xh5;->i3(Lcom/daaw/xh5;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
