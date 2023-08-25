.class public Lcom/daaw/avee/MainActivity$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/avee/CustomViewPager$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/MainActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/avee/MainActivity;


# direct methods
.method public constructor <init>(Lcom/daaw/avee/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/avee/MainActivity$b;->a:Lcom/daaw/avee/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(F)V
    .locals 2

    sget-object v0, Lcom/daaw/avee/MainActivity;->C0:Lcom/daaw/rw1;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iget-object v1, p0, Lcom/daaw/avee/MainActivity$b;->a:Lcom/daaw/avee/MainActivity;

    invoke-virtual {v1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/daaw/rw1;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public b()V
    .locals 2

    sget-object v0, Lcom/daaw/avee/MainActivity;->B0:Lcom/daaw/qw1;

    iget-object v1, p0, Lcom/daaw/avee/MainActivity$b;->a:Lcom/daaw/avee/MainActivity;

    invoke-virtual {v1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public c()V
    .locals 0

    return-void
.end method
