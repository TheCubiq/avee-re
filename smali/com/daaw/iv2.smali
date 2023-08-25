.class public final Lcom/daaw/iv2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/sv2;


# direct methods
.method public constructor <init>(Lcom/daaw/sv2;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/iv2;->p:Lcom/daaw/sv2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/iv2;->p:Lcom/daaw/sv2;

    invoke-static {v0}, Lcom/daaw/sv2;->C(Lcom/daaw/sv2;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/daaw/sv2;->w(Lcom/daaw/sv2;)Lcom/daaw/vv2;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/daaw/jw2;->b(Lcom/daaw/kw2;)V

    :cond_0
    return-void
.end method
