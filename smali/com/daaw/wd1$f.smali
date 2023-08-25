.class public Lcom/daaw/wd1$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/vw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/wd1;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/vw1$a<",
        "Lcom/daaw/ud1;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/wd1;


# direct methods
.method public constructor <init>(Lcom/daaw/wd1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/wd1$f;->a:Lcom/daaw/wd1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/wd1$f;->b()Lcom/daaw/ud1;

    move-result-object v0

    return-object v0
.end method

.method public b()Lcom/daaw/ud1;
    .locals 1

    invoke-static {}, Lcom/daaw/td1;->c()Lcom/daaw/td1;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/ud1;

    invoke-direct {v0}, Lcom/daaw/ud1;-><init>()V

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/daaw/td1;->e()Lcom/daaw/ud1;

    move-result-object v0

    return-object v0
.end method
