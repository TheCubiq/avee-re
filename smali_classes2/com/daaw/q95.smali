.class public final Lcom/daaw/q95;
.super Lcom/daaw/tz3;
.source ""


# instance fields
.field public final p:Lcom/daaw/pl7;


# direct methods
.method public constructor <init>(Lcom/daaw/pl7;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/tz3;-><init>()V

    iput-object p1, p0, Lcom/daaw/q95;->p:Lcom/daaw/pl7;

    return-void
.end method


# virtual methods
.method public final T(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V
    .locals 6

    iget-object v0, p0, Lcom/daaw/q95;->p:Lcom/daaw/pl7;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-wide v4, p4

    invoke-interface/range {v0 .. v5}, Lcom/daaw/pl7;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V

    return-void
.end method

.method public final zzd()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/q95;->p:Lcom/daaw/pl7;

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
