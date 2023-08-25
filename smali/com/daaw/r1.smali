.class public final Lcom/daaw/r1;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/r1$a;
    }
.end annotation


# static fields
.field public static final f:Lcom/daaw/r1$a;

.field public static g:I

.field public static h:Z

.field public static i:I


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/daaw/az0;

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Lcom/google/android/gms/ads/rewarded/RewardedAd;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/r1$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/daaw/r1$a;-><init>(Lcom/daaw/pq;)V

    sput-object v0, Lcom/daaw/r1;->f:Lcom/daaw/r1$a;

    const/4 v0, -0x1

    sput v0, Lcom/daaw/r1;->i:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/daaw/az0;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "preferences"

    invoke-static {p2, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/r1;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/r1;->b:Lcom/daaw/az0;

    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lcom/daaw/r1;->c:Ljava/util/List;

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lcom/daaw/r1;->d:Ljava/util/HashMap;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lcom/daaw/r1;->e:Ljava/util/List;

    invoke-virtual {p0}, Lcom/daaw/r1;->q()V

    sget-object p2, Lcom/daaw/avee/MainActivity;->h0:Lcom/daaw/qw1;

    new-instance v0, Lcom/daaw/j1;

    invoke-direct {v0, p0}, Lcom/daaw/j1;-><init>(Lcom/daaw/r1;)V

    invoke-virtual {p2, v0, p1}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object p2, Lcom/daaw/avee/MainActivity;->n0:Lcom/daaw/qw1;

    new-instance v0, Lcom/daaw/k1;

    invoke-direct {v0, p0}, Lcom/daaw/k1;-><init>(Lcom/daaw/r1;)V

    invoke-virtual {p2, v0, p1}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object p2, Lcom/daaw/oy0;->e:Lcom/daaw/vw1;

    new-instance v0, Lcom/daaw/m1;

    invoke-direct {v0, p0}, Lcom/daaw/m1;-><init>(Lcom/daaw/r1;)V

    invoke-virtual {p2, v0, p1}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object p2, Lcom/daaw/oy0;->b:Lcom/daaw/ww1;

    new-instance v0, Lcom/daaw/o1;

    invoke-direct {v0, p0}, Lcom/daaw/o1;-><init>(Lcom/daaw/r1;)V

    invoke-virtual {p2, v0, p1}, Lcom/daaw/ww1;->b(Lcom/daaw/ww1$a;Ljava/util/List;)V

    sget-object p2, Lcom/daaw/oy0;->c:Lcom/daaw/ww1;

    new-instance v0, Lcom/daaw/n1;

    invoke-direct {v0, p0}, Lcom/daaw/n1;-><init>(Lcom/daaw/r1;)V

    invoke-virtual {p2, v0, p1}, Lcom/daaw/ww1;->b(Lcom/daaw/ww1$a;Ljava/util/List;)V

    sget-object p2, Lcom/daaw/qv1;->S:Lcom/daaw/qw1;

    new-instance v0, Lcom/daaw/l1;

    invoke-direct {v0, p0}, Lcom/daaw/l1;-><init>(Lcom/daaw/r1;)V

    invoke-virtual {p2, v0, p1}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic a(Lcom/daaw/r1;Lcom/google/android/gms/ads/rewarded/RewardItem;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/r1;->u(Lcom/google/android/gms/ads/rewarded/RewardItem;)V

    return-void
.end method

.method public static synthetic b(Lcom/daaw/r1;Ljava/lang/Integer;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/r1;->s(Lcom/daaw/r1;Ljava/lang/Integer;)V

    return-void
.end method

.method public static synthetic c(Lcom/daaw/r1;Landroid/app/Activity;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/r1;->i(Lcom/daaw/r1;Landroid/app/Activity;)V

    return-void
.end method

.method public static synthetic d(Lcom/daaw/r1;Ljava/lang/Integer;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/r1;->m(Lcom/daaw/r1;Ljava/lang/Integer;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/daaw/r1;Ljava/lang/Boolean;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/r1;->n(Lcom/daaw/r1;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static synthetic f(Lcom/daaw/r1;Ljava/lang/Integer;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/r1;->l(Lcom/daaw/r1;Ljava/lang/Integer;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lcom/daaw/r1;Lcom/daaw/al;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/r1;->j(Lcom/daaw/r1;Lcom/daaw/al;)V

    return-void
.end method

.method public static synthetic h(Lcom/daaw/r1;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0}, Lcom/daaw/r1;->k(Lcom/daaw/r1;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static final i(Lcom/daaw/r1;Landroid/app/Activity;)V
    .locals 1

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/daaw/r1;->q()V

    iget-object p1, p0, Lcom/daaw/r1;->d:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object p1

    const-string v0, "map.keys"

    invoke-static {p1, v0}, Lcom/daaw/ug0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/r1;->t(I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static final j(Lcom/daaw/r1;Lcom/daaw/al;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$noName_0"

    invoke-static {p1, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/daaw/r1;->d:Ljava/util/HashMap;

    invoke-virtual {p0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method public static final k(Lcom/daaw/r1;)Ljava/lang/Boolean;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/daaw/nc0;->g:Lcom/daaw/vw1;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "isPremium(false)"

    invoke-static {v0, v1}, Lcom/daaw/ug0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lcom/daaw/r1;->b:Lcom/daaw/az0;

    invoke-virtual {p0}, Lcom/daaw/az0;->d()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static final l(Lcom/daaw/r1;Ljava/lang/Integer;)Ljava/lang/Boolean;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/r1;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_2

    :cond_0
    sget v0, Lcom/daaw/r1;->g:I

    const-string v1, "it"

    if-lez v0, :cond_1

    add-int/lit8 v0, v0, -0x1

    sput v0, Lcom/daaw/r1;->g:I

    iget-object p0, p0, Lcom/daaw/r1;->e:Ljava/util/List;

    invoke-static {p1, v1}, Lcom/daaw/ug0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {p1, v1}, Lcom/daaw/ug0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sput v0, Lcom/daaw/r1;->i:I

    iget-object v0, p0, Lcom/daaw/r1;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/ads/rewarded/RewardedAd;

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/daaw/avee/MainActivity;->r0()Lcom/daaw/avee/MainActivity;

    move-result-object p1

    new-instance v1, Lcom/daaw/p1;

    invoke-direct {v1, p0}, Lcom/daaw/p1;-><init>(Lcom/daaw/r1;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/ads/rewarded/RewardedAd;->show(Landroid/app/Activity;Lcom/google/android/gms/ads/OnUserEarnedRewardListener;)V

    goto :goto_1

    :cond_2
    sget-boolean v0, Lcom/daaw/r1;->h:Z

    if-nez v0, :cond_3

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/daaw/r1;->t(I)V

    const p1, 0x7f100227

    invoke-virtual {p0, p1}, Lcom/daaw/r1;->r(I)V

    goto :goto_1

    :cond_3
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/daaw/q1;

    invoke-direct {v1, p0, p1}, Lcom/daaw/q1;-><init>(Lcom/daaw/r1;Ljava/lang/Integer;)V

    const-wide/16 p0, 0x3e8

    invoke-virtual {v0, v1, p0, p1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :goto_1
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_2
    return-object p0
.end method

.method public static final m(Lcom/daaw/r1;Ljava/lang/Integer;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/daaw/r1;->e:Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static final n(Lcom/daaw/r1;Ljava/lang/Boolean;)V
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/daaw/r1;->e:Ljava/util/List;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget-object v1, p0, Lcom/daaw/r1;->d:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lcom/daaw/r1;->t(I)V

    goto :goto_0

    :cond_0
    iget-object p0, p0, Lcom/daaw/r1;->e:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->clear()V

    :cond_1
    return-void
.end method

.method public static final synthetic o(Lcom/daaw/r1;)Ljava/util/HashMap;
    .locals 0

    iget-object p0, p0, Lcom/daaw/r1;->d:Ljava/util/HashMap;

    return-object p0
.end method

.method public static final synthetic p(Z)V
    .locals 0

    sput-boolean p0, Lcom/daaw/r1;->h:Z

    return-void
.end method

.method public static final s(Lcom/daaw/r1;Ljava/lang/Integer;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/r1;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/ads/rewarded/RewardedAd;

    if-eqz p1, :cond_0

    invoke-static {}, Lcom/daaw/avee/MainActivity;->r0()Lcom/daaw/avee/MainActivity;

    move-result-object v0

    new-instance v1, Lcom/daaw/p1;

    invoke-direct {v1, p0}, Lcom/daaw/p1;-><init>(Lcom/daaw/r1;)V

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/ads/rewarded/RewardedAd;->show(Landroid/app/Activity;Lcom/google/android/gms/ads/OnUserEarnedRewardListener;)V

    goto :goto_0

    :cond_0
    const p1, 0x7f100228

    invoke-virtual {p0, p1}, Lcom/daaw/r1;->r(I)V

    :goto_0
    return-void
.end method


# virtual methods
.method public final q()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/r1;->d:Ljava/util/HashMap;

    const v1, 0x7f0900c3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final r(I)V
    .locals 1

    invoke-static {}, Lcom/daaw/dx0;->b()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {v0, p1}, Lcom/daaw/lc;->b(Landroid/content/Context;I)Lcom/daaw/lc;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/daaw/lc;->f(Z)V

    return-void
.end method

.method public final t(I)V
    .locals 4

    sget-object v0, Lcom/daaw/r1;->f:Lcom/daaw/r1$a;

    const/4 v1, 0x1

    sput-boolean v1, Lcom/daaw/r1;->h:Z

    iget-object v1, p0, Lcom/daaw/r1;->a:Landroid/content/Context;

    invoke-static {v0, p1, v1}, Lcom/daaw/r1$a;->a(Lcom/daaw/r1$a;ILandroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lcom/daaw/a1;->a:Lcom/daaw/a1$a;

    invoke-virtual {v2}, Lcom/daaw/a1$a;->b()Lcom/google/android/gms/ads/AdRequest;

    move-result-object v2

    new-instance v3, Lcom/daaw/r1$b;

    invoke-direct {v3, p0, p1}, Lcom/daaw/r1$b;-><init>(Lcom/daaw/r1;I)V

    invoke-static {v1, v0, v2, v3}, Lcom/google/android/gms/ads/rewarded/RewardedAd;->load(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/ads/AdRequest;Lcom/google/android/gms/ads/rewarded/RewardedAdLoadCallback;)V

    return-void
.end method

.method public final u(Lcom/google/android/gms/ads/rewarded/RewardItem;)V
    .locals 2

    sget p1, Lcom/daaw/r1;->i:I

    if-lez p1, :cond_0

    iget-object v0, p0, Lcom/daaw/r1;->e:Ljava/util/List;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object p1, Lcom/daaw/oy0;->d:Lcom/daaw/ww1;

    sget v0, Lcom/daaw/r1;->i:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/ww1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    sget p1, Lcom/daaw/r1;->g:I

    add-int/lit8 p1, p1, 0x1

    sput p1, Lcom/daaw/r1;->g:I

    :goto_0
    return-void
.end method

.method public final v(Lcom/google/android/gms/ads/LoadAdError;)V
    .locals 3

    const-string v0, "loadAdError"

    invoke-static {p1, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    sput-boolean v0, Lcom/daaw/r1;->h:Z

    invoke-virtual {p1}, Lcom/google/android/gms/ads/AdError;->getCode()I

    move-result v0

    if-eqz v0, :cond_3

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    const-string v0, "Unknown error"

    goto :goto_0

    :cond_0
    const-string v0, "No Fill"

    goto :goto_0

    :cond_1
    const-string v0, "Network Error"

    goto :goto_0

    :cond_2
    const-string v0, "Invalid Request"

    goto :goto_0

    :cond_3
    const-string v0, "Internal Error"

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onRewardedVideoAdFailedToLoad "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x20

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    return-void
.end method
