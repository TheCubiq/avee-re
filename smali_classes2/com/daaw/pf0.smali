.class public final Lcom/daaw/pf0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qf0;


# instance fields
.field public final p:Lcom/daaw/ys0;


# direct methods
.method public constructor <init>(Lcom/daaw/ys0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/pf0;->p:Lcom/daaw/ys0;

    return-void
.end method


# virtual methods
.method public d()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public e()Lcom/daaw/ys0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/pf0;->p:Lcom/daaw/ys0;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
