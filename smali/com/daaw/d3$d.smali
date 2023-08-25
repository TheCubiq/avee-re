.class public Lcom/daaw/d3$d;
.super Lcom/daaw/d3$g;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/d3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public final a:Lcom/daaw/e3;


# direct methods
.method public constructor <init>(Lcom/daaw/e3;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/daaw/d3$g;-><init>(Lcom/daaw/d3$a;)V

    iput-object p1, p0, Lcom/daaw/d3$d;->a:Lcom/daaw/e3;

    return-void
.end method


# virtual methods
.method public c()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/d3$d;->a:Lcom/daaw/e3;

    invoke-virtual {v0}, Lcom/daaw/e3;->start()V

    return-void
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/d3$d;->a:Lcom/daaw/e3;

    invoke-virtual {v0}, Lcom/daaw/e3;->stop()V

    return-void
.end method
