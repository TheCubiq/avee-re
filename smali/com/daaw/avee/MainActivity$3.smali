.class Lcom/daaw/avee/MainActivity$3;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Lcom/daaw/avee/CustomViewPager$OnSwipeOutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/MainActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/MainActivity;


# direct methods
.method constructor <init>(Lcom/daaw/avee/MainActivity;)V
    .locals 0

    .line 376
    iput-object p1, p0, Lcom/daaw/avee/MainActivity$3;->this$0:Lcom/daaw/avee/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSwipeOutAtEnd()V
    .locals 0

    return-void
.end method

.method public onSwipeOutAtStart()V
    .locals 2

    .line 379
    sget-object v0, Lcom/daaw/avee/MainActivity;->onViewPagerSwipeOutAtStart:Lcom/daaw/avee/Common/Events/WeakEvent1;

    iget-object v1, p0, Lcom/daaw/avee/MainActivity$3;->this$0:Lcom/daaw/avee/MainActivity;

    invoke-virtual {v1}, Lcom/daaw/avee/MainActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    return-void
.end method

.method public onSwipeProgressUpdate(F)V
    .locals 2

    .line 389
    sget-object v0, Lcom/daaw/avee/MainActivity;->onViewPagerSwipeProgressUpdate:Lcom/daaw/avee/Common/Events/WeakEvent2;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iget-object v1, p0, Lcom/daaw/avee/MainActivity$3;->this$0:Lcom/daaw/avee/MainActivity;

    invoke-virtual {v1}, Lcom/daaw/avee/MainActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/daaw/avee/Common/Events/WeakEvent2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
