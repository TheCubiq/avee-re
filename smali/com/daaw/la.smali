.class public Lcom/daaw/la;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static d:Lcom/daaw/yw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/yw1<",
            "Lcom/daaw/d1;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static final e:[Z


# instance fields
.field public a:Lcom/daaw/d1;

.field public final b:Lcom/daaw/az0;

.field public c:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/yw1;

    invoke-direct {v0}, Lcom/daaw/yw1;-><init>()V

    sput-object v0, Lcom/daaw/la;->d:Lcom/daaw/yw1;

    const/4 v0, 0x3

    new-array v0, v0, [Z

    fill-array-data v0, :array_0

    sput-object v0, Lcom/daaw/la;->e:[Z

    return-void

    :array_0
    .array-data 1
        0x0t
        0x0t
        0x0t
    .end array-data
.end method

.method public constructor <init>(ILandroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/daaw/la;->c:I

    if-eqz p2, :cond_0

    new-instance p1, Lcom/daaw/az0;

    invoke-direct {p1}, Lcom/daaw/az0;-><init>()V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lcom/daaw/la;->b:Lcom/daaw/az0;

    invoke-virtual {p0, p2}, Lcom/daaw/la;->c(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic a(Lcom/daaw/la;)Lcom/daaw/d1;
    .locals 0

    iget-object p0, p0, Lcom/daaw/la;->a:Lcom/daaw/d1;

    return-object p0
.end method

.method public static synthetic b()[Z
    .locals 1

    sget-object v0, Lcom/daaw/la;->e:[Z

    return-object v0
.end method


# virtual methods
.method public final c(Landroid/view/View;)V
    .locals 3

    instance-of v0, p1, Lcom/google/android/gms/ads/AdView;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/android/gms/ads/AdView;

    goto :goto_0

    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_4

    new-instance v0, Lcom/google/android/gms/ads/AdView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/ads/AdView;-><init>(Landroid/content/Context;)V

    check-cast p1, Landroid/view/ViewGroup;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object p1, v0

    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/ads/BaseAdView;->getAdSize()Lcom/google/android/gms/ads/AdSize;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v1, v1

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v1, v2

    float-to-int v1, v1

    invoke-static {v0, v1}, Lcom/google/android/gms/ads/AdSize;->getCurrentOrientationAnchoredAdaptiveBannerAdSize(Landroid/content/Context;I)Lcom/google/android/gms/ads/AdSize;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/ads/BaseAdView;->setAdSize(Lcom/google/android/gms/ads/AdSize;)V

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/ads/BaseAdView;->getAdUnitId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f10002f

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/ads/BaseAdView;->setAdUnitId(Ljava/lang/String;)V

    :cond_2
    new-instance v0, Lcom/daaw/d1;

    invoke-direct {v0, p1}, Lcom/daaw/d1;-><init>(Lcom/google/android/gms/ads/AdView;)V

    iput-object v0, p0, Lcom/daaw/la;->a:Lcom/daaw/d1;

    iget-object p1, v0, Lcom/daaw/d1;->a:Lcom/google/android/gms/ads/AdView;

    if-eqz p1, :cond_4

    sget-object v0, Lcom/daaw/la;->e:[Z

    iget v1, p0, Lcom/daaw/la;->c:I

    aget-boolean v0, v0, v1

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    goto :goto_1

    :cond_3
    const/16 v0, 0x8

    :goto_1
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    iget-object p1, p0, Lcom/daaw/la;->a:Lcom/daaw/d1;

    iget-object p1, p1, Lcom/daaw/d1;->a:Lcom/google/android/gms/ads/AdView;

    new-instance v0, Lcom/daaw/la$a;

    invoke-direct {v0, p0}, Lcom/daaw/la$a;-><init>(Lcom/daaw/la;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/ads/BaseAdView;->setAdListener(Lcom/google/android/gms/ads/AdListener;)V

    :cond_4
    return-void
.end method

.method public d(I)V
    .locals 5

    iget-object v0, p0, Lcom/daaw/la;->a:Lcom/daaw/d1;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    iget-object v0, v0, Lcom/daaw/d1;->a:Lcom/google/android/gms/ads/AdView;

    if-eqz v0, :cond_3

    sget-object v0, Lcom/daaw/nc0;->g:Lcom/daaw/vw1;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v2}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/la;->b:Lcom/daaw/az0;

    invoke-virtual {v0}, Lcom/daaw/az0;->d()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    sget-object v0, Lcom/daaw/la;->d:Lcom/daaw/yw1;

    iget-object v2, p0, Lcom/daaw/la;->a:Lcom/daaw/d1;

    iget v3, p0, Lcom/daaw/la;->c:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v2, v3, p1, v4}, Lcom/daaw/yw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_4

    sget-object p1, Lcom/daaw/la;->e:[Z

    iget v0, p0, Lcom/daaw/la;->c:I

    aput-boolean v1, p1, v0

    iget-object p1, p0, Lcom/daaw/la;->a:Lcom/daaw/d1;

    iget-object p1, p1, Lcom/daaw/d1;->a:Lcom/google/android/gms/ads/AdView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    goto :goto_1

    :cond_3
    sget-object p1, Lcom/daaw/la;->e:[Z

    iget v0, p0, Lcom/daaw/la;->c:I

    aput-boolean v1, p1, v0

    :cond_4
    :goto_1
    return-void
.end method
