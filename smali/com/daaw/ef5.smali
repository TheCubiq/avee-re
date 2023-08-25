.class public final Lcom/daaw/ef5;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/zh3;


# direct methods
.method public constructor <init>(Lcom/daaw/zh3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ef5;->a:Lcom/daaw/zh3;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    new-instance v0, Lcom/daaw/df5;

    const-string v1, "initialize"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/df5;-><init>(Ljava/lang/String;Lcom/daaw/cf5;)V

    invoke-virtual {p0, v0}, Lcom/daaw/ef5;->s(Lcom/daaw/df5;)V

    return-void
.end method

.method public final b(J)V
    .locals 3

    new-instance v0, Lcom/daaw/df5;

    const-string v1, "interstitial"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/df5;-><init>(Ljava/lang/String;Lcom/daaw/cf5;)V

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/daaw/df5;->d(Lcom/daaw/df5;Ljava/lang/Long;)V

    const-string p1, "onAdClicked"

    invoke-static {v0, p1}, Lcom/daaw/df5;->c(Lcom/daaw/df5;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/daaw/ef5;->a:Lcom/daaw/zh3;

    invoke-static {v0}, Lcom/daaw/df5;->a(Lcom/daaw/df5;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/daaw/zh3;->zzb(Ljava/lang/String;)V

    return-void
.end method

.method public final c(J)V
    .locals 3

    new-instance v0, Lcom/daaw/df5;

    const-string v1, "interstitial"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/df5;-><init>(Ljava/lang/String;Lcom/daaw/cf5;)V

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/daaw/df5;->d(Lcom/daaw/df5;Ljava/lang/Long;)V

    const-string p1, "onAdClosed"

    invoke-static {v0, p1}, Lcom/daaw/df5;->c(Lcom/daaw/df5;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/daaw/ef5;->s(Lcom/daaw/df5;)V

    return-void
.end method

.method public final d(JI)V
    .locals 3

    new-instance v0, Lcom/daaw/df5;

    const-string v1, "interstitial"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/df5;-><init>(Ljava/lang/String;Lcom/daaw/cf5;)V

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/daaw/df5;->d(Lcom/daaw/df5;Ljava/lang/Long;)V

    const-string p1, "onAdFailedToLoad"

    invoke-static {v0, p1}, Lcom/daaw/df5;->c(Lcom/daaw/df5;Ljava/lang/String;)V

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/daaw/df5;->b(Lcom/daaw/df5;Ljava/lang/Integer;)V

    invoke-virtual {p0, v0}, Lcom/daaw/ef5;->s(Lcom/daaw/df5;)V

    return-void
.end method

.method public final e(J)V
    .locals 3

    new-instance v0, Lcom/daaw/df5;

    const-string v1, "interstitial"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/df5;-><init>(Ljava/lang/String;Lcom/daaw/cf5;)V

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/daaw/df5;->d(Lcom/daaw/df5;Ljava/lang/Long;)V

    const-string p1, "onAdLoaded"

    invoke-static {v0, p1}, Lcom/daaw/df5;->c(Lcom/daaw/df5;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/daaw/ef5;->s(Lcom/daaw/df5;)V

    return-void
.end method

.method public final f(J)V
    .locals 3

    new-instance v0, Lcom/daaw/df5;

    const-string v1, "interstitial"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/df5;-><init>(Ljava/lang/String;Lcom/daaw/cf5;)V

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/daaw/df5;->d(Lcom/daaw/df5;Ljava/lang/Long;)V

    const-string p1, "onNativeAdObjectNotAvailable"

    invoke-static {v0, p1}, Lcom/daaw/df5;->c(Lcom/daaw/df5;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/daaw/ef5;->s(Lcom/daaw/df5;)V

    return-void
.end method

.method public final g(J)V
    .locals 3

    new-instance v0, Lcom/daaw/df5;

    const-string v1, "interstitial"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/df5;-><init>(Ljava/lang/String;Lcom/daaw/cf5;)V

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/daaw/df5;->d(Lcom/daaw/df5;Ljava/lang/Long;)V

    const-string p1, "onAdOpened"

    invoke-static {v0, p1}, Lcom/daaw/df5;->c(Lcom/daaw/df5;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/daaw/ef5;->s(Lcom/daaw/df5;)V

    return-void
.end method

.method public final h(J)V
    .locals 3

    new-instance v0, Lcom/daaw/df5;

    const-string v1, "creation"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/df5;-><init>(Ljava/lang/String;Lcom/daaw/cf5;)V

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/daaw/df5;->d(Lcom/daaw/df5;Ljava/lang/Long;)V

    const-string p1, "nativeObjectCreated"

    invoke-static {v0, p1}, Lcom/daaw/df5;->c(Lcom/daaw/df5;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/daaw/ef5;->s(Lcom/daaw/df5;)V

    return-void
.end method

.method public final i(J)V
    .locals 3

    new-instance v0, Lcom/daaw/df5;

    const-string v1, "creation"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/df5;-><init>(Ljava/lang/String;Lcom/daaw/cf5;)V

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/daaw/df5;->d(Lcom/daaw/df5;Ljava/lang/Long;)V

    const-string p1, "nativeObjectNotCreated"

    invoke-static {v0, p1}, Lcom/daaw/df5;->c(Lcom/daaw/df5;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/daaw/ef5;->s(Lcom/daaw/df5;)V

    return-void
.end method

.method public final j(J)V
    .locals 3

    new-instance v0, Lcom/daaw/df5;

    const-string v1, "rewarded"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/df5;-><init>(Ljava/lang/String;Lcom/daaw/cf5;)V

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/daaw/df5;->d(Lcom/daaw/df5;Ljava/lang/Long;)V

    const-string p1, "onAdClicked"

    invoke-static {v0, p1}, Lcom/daaw/df5;->c(Lcom/daaw/df5;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/daaw/ef5;->s(Lcom/daaw/df5;)V

    return-void
.end method

.method public final k(J)V
    .locals 3

    new-instance v0, Lcom/daaw/df5;

    const-string v1, "rewarded"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/df5;-><init>(Ljava/lang/String;Lcom/daaw/cf5;)V

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/daaw/df5;->d(Lcom/daaw/df5;Ljava/lang/Long;)V

    const-string p1, "onRewardedAdClosed"

    invoke-static {v0, p1}, Lcom/daaw/df5;->c(Lcom/daaw/df5;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/daaw/ef5;->s(Lcom/daaw/df5;)V

    return-void
.end method

.method public final l(JLcom/daaw/tv3;)V
    .locals 3

    new-instance v0, Lcom/daaw/df5;

    const-string v1, "rewarded"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/df5;-><init>(Ljava/lang/String;Lcom/daaw/cf5;)V

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/daaw/df5;->d(Lcom/daaw/df5;Ljava/lang/Long;)V

    const-string p1, "onUserEarnedReward"

    invoke-static {v0, p1}, Lcom/daaw/df5;->c(Lcom/daaw/df5;Ljava/lang/String;)V

    invoke-interface {p3}, Lcom/daaw/tv3;->zzf()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/daaw/df5;->f(Lcom/daaw/df5;Ljava/lang/String;)V

    invoke-interface {p3}, Lcom/daaw/tv3;->zze()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/daaw/df5;->e(Lcom/daaw/df5;Ljava/lang/Integer;)V

    invoke-virtual {p0, v0}, Lcom/daaw/ef5;->s(Lcom/daaw/df5;)V

    return-void
.end method

.method public final m(JI)V
    .locals 3

    new-instance v0, Lcom/daaw/df5;

    const-string v1, "rewarded"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/df5;-><init>(Ljava/lang/String;Lcom/daaw/cf5;)V

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/daaw/df5;->d(Lcom/daaw/df5;Ljava/lang/Long;)V

    const-string p1, "onRewardedAdFailedToLoad"

    invoke-static {v0, p1}, Lcom/daaw/df5;->c(Lcom/daaw/df5;Ljava/lang/String;)V

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/daaw/df5;->b(Lcom/daaw/df5;Ljava/lang/Integer;)V

    invoke-virtual {p0, v0}, Lcom/daaw/ef5;->s(Lcom/daaw/df5;)V

    return-void
.end method

.method public final n(JI)V
    .locals 3

    new-instance v0, Lcom/daaw/df5;

    const-string v1, "rewarded"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/df5;-><init>(Ljava/lang/String;Lcom/daaw/cf5;)V

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/daaw/df5;->d(Lcom/daaw/df5;Ljava/lang/Long;)V

    const-string p1, "onRewardedAdFailedToShow"

    invoke-static {v0, p1}, Lcom/daaw/df5;->c(Lcom/daaw/df5;Ljava/lang/String;)V

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/daaw/df5;->b(Lcom/daaw/df5;Ljava/lang/Integer;)V

    invoke-virtual {p0, v0}, Lcom/daaw/ef5;->s(Lcom/daaw/df5;)V

    return-void
.end method

.method public final o(J)V
    .locals 3

    new-instance v0, Lcom/daaw/df5;

    const-string v1, "rewarded"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/df5;-><init>(Ljava/lang/String;Lcom/daaw/cf5;)V

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/daaw/df5;->d(Lcom/daaw/df5;Ljava/lang/Long;)V

    const-string p1, "onAdImpression"

    invoke-static {v0, p1}, Lcom/daaw/df5;->c(Lcom/daaw/df5;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/daaw/ef5;->s(Lcom/daaw/df5;)V

    return-void
.end method

.method public final p(J)V
    .locals 3

    new-instance v0, Lcom/daaw/df5;

    const-string v1, "rewarded"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/df5;-><init>(Ljava/lang/String;Lcom/daaw/cf5;)V

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/daaw/df5;->d(Lcom/daaw/df5;Ljava/lang/Long;)V

    const-string p1, "onRewardedAdLoaded"

    invoke-static {v0, p1}, Lcom/daaw/df5;->c(Lcom/daaw/df5;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/daaw/ef5;->s(Lcom/daaw/df5;)V

    return-void
.end method

.method public final q(J)V
    .locals 3

    new-instance v0, Lcom/daaw/df5;

    const-string v1, "rewarded"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/df5;-><init>(Ljava/lang/String;Lcom/daaw/cf5;)V

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/daaw/df5;->d(Lcom/daaw/df5;Ljava/lang/Long;)V

    const-string p1, "onNativeAdObjectNotAvailable"

    invoke-static {v0, p1}, Lcom/daaw/df5;->c(Lcom/daaw/df5;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/daaw/ef5;->s(Lcom/daaw/df5;)V

    return-void
.end method

.method public final r(J)V
    .locals 3

    new-instance v0, Lcom/daaw/df5;

    const-string v1, "rewarded"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/df5;-><init>(Ljava/lang/String;Lcom/daaw/cf5;)V

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/daaw/df5;->d(Lcom/daaw/df5;Ljava/lang/Long;)V

    const-string p1, "onRewardedAdOpened"

    invoke-static {v0, p1}, Lcom/daaw/df5;->c(Lcom/daaw/df5;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/daaw/ef5;->s(Lcom/daaw/df5;)V

    return-void
.end method

.method public final s(Lcom/daaw/df5;)V
    .locals 1

    invoke-static {p1}, Lcom/daaw/df5;->a(Lcom/daaw/df5;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "Dispatching AFMA event on publisher webview: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/k04;->zzi(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/ef5;->a:Lcom/daaw/zh3;

    invoke-interface {v0, p1}, Lcom/daaw/zh3;->zzb(Ljava/lang/String;)V

    return-void
.end method
