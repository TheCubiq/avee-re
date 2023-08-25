.class public final Lcom/daaw/k45;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ec3;


# instance fields
.field public final synthetic a:Lcom/daaw/k55;

.field public final synthetic b:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>(Lcom/daaw/k55;Landroid/view/ViewGroup;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/k45;->a:Lcom/daaw/k55;

    iput-object p2, p0, Lcom/daaw/k45;->b:Landroid/view/ViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/MotionEvent;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/k45;->a:Lcom/daaw/k55;

    const/4 v1, 0x0

    invoke-interface {v0, v1, p1}, Landroid/view/View$OnTouchListener;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    return-void
.end method

.method public final zza()Lorg/json/JSONObject;
    .locals 1

    iget-object v0, p0, Lcom/daaw/k45;->a:Lcom/daaw/k55;

    invoke-interface {v0}, Lcom/daaw/k55;->zzo()Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final zzb()Lorg/json/JSONObject;
    .locals 1

    iget-object v0, p0, Lcom/daaw/k45;->a:Lcom/daaw/k55;

    invoke-interface {v0}, Lcom/daaw/k55;->zzp()Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final zzc()V
    .locals 5

    iget-object v0, p0, Lcom/daaw/k45;->a:Lcom/daaw/k55;

    sget-object v1, Lcom/daaw/h45;->D:Lcom/daaw/y17;

    invoke-interface {v0}, Lcom/daaw/k55;->zzm()Ljava/util/Map;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    add-int/lit8 v4, v3, 0x1

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_1

    move v3, v4

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/daaw/k45;->a:Lcom/daaw/k55;

    iget-object v1, p0, Lcom/daaw/k45;->b:Landroid/view/ViewGroup;

    invoke-interface {v0, v1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    :cond_2
    :goto_1
    return-void
.end method
