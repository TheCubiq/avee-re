.class public Lcom/daaw/y7;
.super Lcom/daaw/mn1;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/mn1;-><init>()V

    invoke-virtual {p0}, Lcom/daaw/y7;->t0()V

    return-void
.end method


# virtual methods
.method public final t0()V
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/daaw/mn1;->q0(I)Lcom/daaw/mn1;

    new-instance v1, Lcom/daaw/h00;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lcom/daaw/h00;-><init>(I)V

    invoke-virtual {p0, v1}, Lcom/daaw/mn1;->i0(Lcom/daaw/in1;)Lcom/daaw/mn1;

    move-result-object v1

    new-instance v2, Lcom/daaw/te;

    invoke-direct {v2}, Lcom/daaw/te;-><init>()V

    invoke-virtual {v1, v2}, Lcom/daaw/mn1;->i0(Lcom/daaw/in1;)Lcom/daaw/mn1;

    move-result-object v1

    new-instance v2, Lcom/daaw/h00;

    invoke-direct {v2, v0}, Lcom/daaw/h00;-><init>(I)V

    invoke-virtual {v1, v2}, Lcom/daaw/mn1;->i0(Lcom/daaw/in1;)Lcom/daaw/mn1;

    return-void
.end method
