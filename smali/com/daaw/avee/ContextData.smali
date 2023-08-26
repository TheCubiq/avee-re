.class public Lcom/daaw/avee/ContextData;
.super Ljava/lang/Object;
.source "ContextData.java"


# instance fields
.field private activity:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/daaw/avee/ContextData;->activity:Landroid/app/Activity;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    .line 27
    :goto_0
    instance-of v0, p1, Landroid/content/ContextWrapper;

    if-eqz v0, :cond_1

    .line 28
    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 29
    check-cast p1, Landroid/app/Activity;

    iput-object p1, p0, Lcom/daaw/avee/ContextData;->activity:Landroid/app/Activity;

    goto :goto_1

    .line 32
    :cond_0
    check-cast p1, Landroid/content/ContextWrapper;

    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p1

    goto :goto_0

    .line 35
    :cond_1
    :goto_1
    iget-object p1, p0, Lcom/daaw/avee/ContextData;->activity:Landroid/app/Activity;

    invoke-static {p1}, Ljunit/framework/Assert;->assertNotNull(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public getActivity()Landroid/app/Activity;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/daaw/avee/ContextData;->activity:Landroid/app/Activity;

    return-object v0
.end method

.method public getContext()Landroid/content/Context;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/daaw/avee/ContextData;->activity:Landroid/app/Activity;

    return-object v0
.end method

.method public getFragmentManager()Landroid/app/FragmentManager;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/daaw/avee/ContextData;->activity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    return-object v0
.end method

.method public getLayoutInflater()Landroid/view/LayoutInflater;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/daaw/avee/ContextData;->activity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    return-object v0
.end method
