.class public Lcom/daaw/v70$a$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/v70$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Lcom/daaw/vf1;

.field public b:Landroid/os/Looper;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/v70$a;
    .locals 4

    iget-object v0, p0, Lcom/daaw/v70$a$a;->a:Lcom/daaw/vf1;

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/m3;

    invoke-direct {v0}, Lcom/daaw/m3;-><init>()V

    iput-object v0, p0, Lcom/daaw/v70$a$a;->a:Lcom/daaw/vf1;

    :cond_0
    iget-object v0, p0, Lcom/daaw/v70$a$a;->b:Landroid/os/Looper;

    if-nez v0, :cond_1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/v70$a$a;->b:Landroid/os/Looper;

    :cond_1
    new-instance v0, Lcom/daaw/v70$a;

    iget-object v1, p0, Lcom/daaw/v70$a$a;->a:Lcom/daaw/vf1;

    iget-object v2, p0, Lcom/daaw/v70$a$a;->b:Landroid/os/Looper;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2, v3}, Lcom/daaw/v70$a;-><init>(Lcom/daaw/vf1;Landroid/accounts/Account;Landroid/os/Looper;Lcom/daaw/q12;)V

    return-object v0
.end method
