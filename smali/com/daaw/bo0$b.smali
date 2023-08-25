.class public final Lcom/daaw/bo0$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/o7$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/bo0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/bo0;


# direct methods
.method public constructor <init>(Lcom/daaw/bo0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/bo0$b;->a:Lcom/daaw/bo0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/bo0;Lcom/daaw/bo0$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/bo0$b;-><init>(Lcom/daaw/bo0;)V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/bo0$b;->a:Lcom/daaw/bo0;

    invoke-static {v0}, Lcom/daaw/bo0;->y0(Lcom/daaw/bo0;)Lcom/daaw/n7$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/n7$a;->b(I)V

    iget-object v0, p0, Lcom/daaw/bo0$b;->a:Lcom/daaw/bo0;

    invoke-virtual {v0, p1}, Lcom/daaw/bo0;->F0(I)V

    return-void
.end method

.method public b(IJJ)V
    .locals 8

    iget-object v0, p0, Lcom/daaw/bo0$b;->a:Lcom/daaw/bo0;

    invoke-static {v0}, Lcom/daaw/bo0;->y0(Lcom/daaw/bo0;)Lcom/daaw/n7$a;

    move-result-object v1

    move v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/n7$a;->c(IJJ)V

    iget-object v2, p0, Lcom/daaw/bo0$b;->a:Lcom/daaw/bo0;

    move v3, p1

    move-wide v4, p2

    move-wide v6, p4

    invoke-virtual/range {v2 .. v7}, Lcom/daaw/bo0;->H0(IJJ)V

    return-void
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/bo0$b;->a:Lcom/daaw/bo0;

    invoke-virtual {v0}, Lcom/daaw/bo0;->G0()V

    iget-object v0, p0, Lcom/daaw/bo0$b;->a:Lcom/daaw/bo0;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/daaw/bo0;->z0(Lcom/daaw/bo0;Z)Z

    return-void
.end method
