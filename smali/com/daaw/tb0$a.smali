.class public abstract Lcom/daaw/tb0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/tb0$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/tb0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# instance fields
.field public final a:Lcom/daaw/tb0$f;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/tb0$f;

    invoke-direct {v0}, Lcom/daaw/tb0$f;-><init>()V

    iput-object v0, p0, Lcom/daaw/tb0$a;->a:Lcom/daaw/tb0$f;

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Lcom/daaw/mp;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/tb0$a;->b()Lcom/daaw/tb0;

    move-result-object v0

    return-object v0
.end method

.method public final b()Lcom/daaw/tb0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/tb0$a;->a:Lcom/daaw/tb0$f;

    invoke-virtual {p0, v0}, Lcom/daaw/tb0$a;->c(Lcom/daaw/tb0$f;)Lcom/daaw/tb0;

    move-result-object v0

    return-object v0
.end method

.method public abstract c(Lcom/daaw/tb0$f;)Lcom/daaw/tb0;
.end method
