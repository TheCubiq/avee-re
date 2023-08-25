.class public final Lcom/daaw/vl4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/q03;


# instance fields
.field public final p:Lcom/daaw/sx3;


# direct methods
.method public constructor <init>(Lcom/daaw/sx3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/vl4;->p:Lcom/daaw/sx3;

    return-void
.end method


# virtual methods
.method public final e0(Lcom/daaw/p03;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/vl4;->p:Lcom/daaw/sx3;

    iget-boolean p1, p1, Lcom/daaw/p03;->j:Z

    invoke-virtual {v0, p1}, Lcom/daaw/sx3;->c(Z)V

    return-void
.end method
