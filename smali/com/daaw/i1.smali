.class public final Lcom/daaw/i1;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/az0;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/az0;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "preferences"

    invoke-static {p2, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/i1;->a:Lcom/daaw/az0;

    new-instance p2, Ljava/util/LinkedList;

    invoke-direct {p2}, Ljava/util/LinkedList;-><init>()V

    iput-object p2, p0, Lcom/daaw/i1;->b:Ljava/util/List;

    invoke-static {p1}, Lcom/google/android/gms/ads/MobileAds;->initialize(Landroid/content/Context;)V

    sget-object p1, Lcom/daaw/a1;->a:Lcom/daaw/a1$a;

    invoke-virtual {p1}, Lcom/daaw/a1$a;->a()Lcom/google/android/gms/ads/RequestConfiguration;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/ads/MobileAds;->setRequestConfiguration(Lcom/google/android/gms/ads/RequestConfiguration;)V

    sget-object p1, Lcom/daaw/dj0;->X:Lcom/daaw/yw1;

    new-instance v0, Lcom/daaw/i1$a;

    invoke-direct {v0, p0}, Lcom/daaw/i1$a;-><init>(Lcom/daaw/i1;)V

    invoke-virtual {p1, v0, p2}, Lcom/daaw/yw1;->b(Lcom/daaw/yw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/nc0;->i:Lcom/daaw/ww1;

    new-instance v0, Lcom/daaw/h1;

    invoke-direct {v0, p0}, Lcom/daaw/h1;-><init>(Lcom/daaw/i1;)V

    invoke-virtual {p1, v0, p2}, Lcom/daaw/ww1;->b(Lcom/daaw/ww1$a;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic a(Lcom/daaw/i1;Ljava/lang/Boolean;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/i1;->b(Lcom/daaw/i1;Ljava/lang/Boolean;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lcom/daaw/i1;Ljava/lang/Boolean;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_0

    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/daaw/i1;->f(Z)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static final synthetic c(Lcom/daaw/i1;)I
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/i1;->e()I

    move-result p0

    return p0
.end method

.method public static final synthetic d(Lcom/daaw/i1;)Lcom/daaw/az0;
    .locals 0

    iget-object p0, p0, Lcom/daaw/i1;->a:Lcom/daaw/az0;

    return-object p0
.end method


# virtual methods
.method public final e()I
    .locals 3

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object v0

    sget v1, Lcom/daaw/j5;->V:I

    invoke-virtual {v0, v1}, Lcom/daaw/j5;->k(I)I

    move-result v0

    const/16 v1, 0x14

    if-eqz v0, :cond_1

    const/4 v2, 0x1

    if-eq v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/16 v1, 0xa

    goto :goto_0

    :cond_1
    const/4 v1, 0x5

    :goto_0
    return v1
.end method

.method public final f(Z)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
