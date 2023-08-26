.class public Lcom/daaw/avee/comp/Common/View/SimplePagerAdapter;
.super Landroidx/viewpager/widget/PagerAdapter;
.source "SimplePagerAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/Common/View/SimplePagerAdapter$OnPageCreateViewListener;
    }
.end annotation


# instance fields
.field layoutPageResourceIds:[I

.field private mContext:Landroid/content/Context;

.field private onPageCreateViewListener:Lcom/daaw/avee/comp/Common/View/SimplePagerAdapter$OnPageCreateViewListener;

.field pageTitles:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;[I[ILcom/daaw/avee/comp/Common/View/SimplePagerAdapter$OnPageCreateViewListener;)V
    .locals 1

    .line 32
    invoke-direct {p0}, Landroidx/viewpager/widget/PagerAdapter;-><init>()V

    .line 33
    iput-object p4, p0, Lcom/daaw/avee/comp/Common/View/SimplePagerAdapter;->onPageCreateViewListener:Lcom/daaw/avee/comp/Common/View/SimplePagerAdapter$OnPageCreateViewListener;

    .line 34
    iput-object p1, p0, Lcom/daaw/avee/comp/Common/View/SimplePagerAdapter;->mContext:Landroid/content/Context;

    .line 35
    iput-object p2, p0, Lcom/daaw/avee/comp/Common/View/SimplePagerAdapter;->layoutPageResourceIds:[I

    .line 36
    array-length p1, p2

    new-array p1, p1, [Ljava/lang/String;

    iput-object p1, p0, Lcom/daaw/avee/comp/Common/View/SimplePagerAdapter;->pageTitles:[Ljava/lang/String;

    const/4 p1, 0x0

    .line 37
    :goto_0
    array-length p2, p3

    if-ge p1, p2, :cond_0

    .line 38
    iget-object p2, p0, Lcom/daaw/avee/comp/Common/View/SimplePagerAdapter;->pageTitles:[Ljava/lang/String;

    iget-object p4, p0, Lcom/daaw/avee/comp/Common/View/SimplePagerAdapter;->mContext:Landroid/content/Context;

    aget v0, p3, p1

    invoke-virtual {p4, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p4

    aput-object p4, p2, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 0

    .line 56
    check-cast p3, Landroid/view/View;

    invoke-virtual {p1, p3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    return-void
.end method

.method public getCount()I
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/daaw/avee/comp/Common/View/SimplePagerAdapter;->layoutPageResourceIds:[I

    array-length v0, v0

    return v0
.end method

.method public getPageTitle(I)Ljava/lang/CharSequence;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/daaw/avee/comp/Common/View/SimplePagerAdapter;->pageTitles:[Ljava/lang/String;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 3

    .line 45
    iget-object v0, p0, Lcom/daaw/avee/comp/Common/View/SimplePagerAdapter;->mContext:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 46
    iget-object v1, p0, Lcom/daaw/avee/comp/Common/View/SimplePagerAdapter;->layoutPageResourceIds:[I

    aget v1, v1, p2

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    .line 47
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 49
    iget-object p1, p0, Lcom/daaw/avee/comp/Common/View/SimplePagerAdapter;->onPageCreateViewListener:Lcom/daaw/avee/comp/Common/View/SimplePagerAdapter$OnPageCreateViewListener;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v0, v1, v2}, Lcom/daaw/avee/comp/Common/View/SimplePagerAdapter$OnPageCreateViewListener;->onPageCreateView(ILandroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V

    return-object v1
.end method

.method public isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 0

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
