.class public abstract Lcom/daaw/nj1;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/nj1$a;
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/sm1;


# direct methods
.method public constructor <init>(Lcom/daaw/sm1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/nj1;->a:Lcom/daaw/sm1;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/rv0;J)V
    .locals 1

    invoke-virtual {p0, p1}, Lcom/daaw/nj1;->b(Lcom/daaw/rv0;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/nj1;->c(Lcom/daaw/rv0;J)V

    :cond_0
    return-void
.end method

.method public abstract b(Lcom/daaw/rv0;)Z
.end method

.method public abstract c(Lcom/daaw/rv0;J)V
.end method
