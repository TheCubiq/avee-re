.class public Lcom/daaw/hj0$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/vw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/hj0;-><init>()V
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
.field public final synthetic a:Lcom/daaw/hj0;


# direct methods
.method public constructor <init>(Lcom/daaw/hj0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/hj0$f;->a:Lcom/daaw/hj0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/hj0$f;->b()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public b()Ljava/lang/Boolean;
    .locals 2

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object v0

    sget v1, Lcom/daaw/j5;->s:I

    invoke-virtual {v0, v1}, Lcom/daaw/j5;->h(I)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
