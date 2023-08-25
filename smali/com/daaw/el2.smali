.class public final Lcom/daaw/el2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/nt6;


# instance fields
.field public final synthetic a:Lcom/daaw/es6;


# direct methods
.method public constructor <init>(Lcom/daaw/es6;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/el2;->a:Lcom/daaw/es6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(IJLjava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/el2;->a:Lcom/daaw/es6;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sub-long/2addr v1, p2

    invoke-virtual {v0, p1, v1, v2, p4}, Lcom/daaw/es6;->e(IJLjava/lang/String;)Lcom/daaw/rj1;

    return-void
.end method

.method public final b(IJ)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/el2;->a:Lcom/daaw/es6;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sub-long/2addr v1, p2

    invoke-virtual {v0, p1, v1, v2}, Lcom/daaw/es6;->d(IJ)Lcom/daaw/rj1;

    return-void
.end method
