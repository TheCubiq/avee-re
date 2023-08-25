.class public Lcom/daaw/c60$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/vw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/c60;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/vw1$a<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/c60;


# direct methods
.method public constructor <init>(Lcom/daaw/c60;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/c60$a;->a:Lcom/daaw/c60;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/c60$a;->b()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public b()Ljava/lang/Boolean;
    .locals 2

    iget-object v0, p0, Lcom/daaw/c60$a;->a:Lcom/daaw/c60;

    invoke-static {v0}, Lcom/daaw/c60;->g(Lcom/daaw/c60;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/c60$a;->a:Lcom/daaw/c60;

    invoke-static {}, Lcom/daaw/dx0;->e()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/daaw/c60;->e(Lcom/daaw/c60;Landroid/content/Context;)V

    :cond_0
    sget-boolean v0, Lcom/daaw/c60;->k:Z

    const/4 v1, 0x0

    sput-boolean v1, Lcom/daaw/c60;->k:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
