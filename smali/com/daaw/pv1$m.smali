.class public Lcom/daaw/pv1$m;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/vw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/pv1;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/vw1$a<",
        "Lcom/daaw/vn;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/pv1;


# direct methods
.method public constructor <init>(Lcom/daaw/pv1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/pv1$m;->a:Lcom/daaw/pv1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/pv1$m;->b()Lcom/daaw/vn;

    move-result-object v0

    return-object v0
.end method

.method public b()Lcom/daaw/vn;
    .locals 2

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object v0

    sget v1, Lcom/daaw/j5;->I:I

    invoke-virtual {v0, v1}, Lcom/daaw/j5;->k(I)I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/daaw/pv1;->O(I[I)Lcom/daaw/vn;

    move-result-object v0

    return-object v0
.end method
