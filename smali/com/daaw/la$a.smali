.class public Lcom/daaw/la$a;
.super Lcom/google/android/gms/ads/AdListener;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/la;->c(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/la;


# direct methods
.method public constructor <init>(Lcom/daaw/la;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/la$a;->a:Lcom/daaw/la;

    invoke-direct {p0}, Lcom/google/android/gms/ads/AdListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdClosed()V
    .locals 0

    return-void
.end method

.method public onAdFailedToLoad(Lcom/google/android/gms/ads/LoadAdError;)V
    .locals 2

    iget-object p1, p0, Lcom/daaw/la$a;->a:Lcom/daaw/la;

    invoke-static {p1}, Lcom/daaw/la;->a(Lcom/daaw/la;)Lcom/daaw/d1;

    move-result-object p1

    iget-object p1, p1, Lcom/daaw/d1;->a:Lcom/google/android/gms/ads/AdView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    invoke-static {}, Lcom/daaw/la;->b()[Z

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/la$a;->a:Lcom/daaw/la;

    iget v0, v0, Lcom/daaw/la;->c:I

    const/4 v1, 0x0

    aput-boolean v1, p1, v0

    return-void
.end method

.method public onAdLoaded()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/la$a;->a:Lcom/daaw/la;

    invoke-static {v0}, Lcom/daaw/la;->a(Lcom/daaw/la;)Lcom/daaw/d1;

    move-result-object v0

    iget-object v0, v0, Lcom/daaw/d1;->a:Lcom/google/android/gms/ads/AdView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    invoke-static {}, Lcom/daaw/la;->b()[Z

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/la$a;->a:Lcom/daaw/la;

    iget v1, v1, Lcom/daaw/la;->c:I

    const/4 v2, 0x1

    aput-boolean v2, v0, v1

    return-void
.end method

.method public onAdOpened()V
    .locals 0

    return-void
.end method
