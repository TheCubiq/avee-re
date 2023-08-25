.class public final Lcom/daaw/i1$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/yw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/i1;-><init>(Landroid/content/Context;Lcom/daaw/az0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/yw1$a<",
        "Lcom/daaw/d1;",
        "Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/i1;


# direct methods
.method public constructor <init>(Lcom/daaw/i1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/i1$a;->a:Lcom/daaw/i1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/daaw/d1;

    check-cast p2, Ljava/lang/Integer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/i1$a;->b(Lcom/daaw/d1;Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public b(Lcom/daaw/d1;Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/Boolean;
    .locals 4

    if-nez p1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p1, Lcom/daaw/d1;->a:Lcom/google/android/gms/ads/AdView;

    :goto_0
    if-eqz v0, :cond_7

    if-eqz p2, :cond_7

    if-nez p3, :cond_1

    goto :goto_3

    :cond_1
    sget-object v0, Lcom/daaw/nc0;->g:Lcom/daaw/vw1;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v2, "isPremium.invoke(true)"

    invoke-static {v0, v2}, Lcom/daaw/ug0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/16 v2, 0x8

    if-nez v0, :cond_2

    sget-boolean v0, Lcom/daaw/nc0;->m:Z

    if-nez v0, :cond_3

    :cond_2
    iget-object v0, p0, Lcom/daaw/i1$a;->a:Lcom/daaw/i1;

    invoke-static {v0}, Lcom/daaw/i1;->d(Lcom/daaw/i1;)Lcom/daaw/az0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/az0;->d()Z

    move-result v0

    if-eqz v0, :cond_3

    :goto_1
    iget-object p1, p1, Lcom/daaw/d1;->a:Lcom/google/android/gms/ads/AdView;

    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :cond_3
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_4

    goto :goto_2

    :cond_4
    const/4 v0, 0x1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-eq v3, v0, :cond_5

    const/4 v0, 0x2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    if-ne p2, v0, :cond_6

    :cond_5
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object p3, p0, Lcom/daaw/i1$a;->a:Lcom/daaw/i1;

    invoke-static {p3}, Lcom/daaw/i1;->c(Lcom/daaw/i1;)I

    move-result p3

    if-ge p2, p3, :cond_6

    goto :goto_1

    :cond_6
    :goto_2
    iget-object p1, p1, Lcom/daaw/d1;->a:Lcom/google/android/gms/ads/AdView;

    sget-object p2, Lcom/daaw/a1;->a:Lcom/daaw/a1$a;

    invoke-virtual {p2}, Lcom/daaw/a1$a;->b()Lcom/google/android/gms/ads/AdRequest;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/android/gms/ads/BaseAdView;->loadAd(Lcom/google/android/gms/ads/AdRequest;)V

    return-object v1

    :cond_7
    :goto_3
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1
.end method
