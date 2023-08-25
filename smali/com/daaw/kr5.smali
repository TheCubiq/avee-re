.class public final synthetic Lcom/daaw/kr5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ey6;


# instance fields
.field public final synthetic a:Lcom/daaw/qh4;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/qh4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/kr5;->a:Lcom/daaw/qh4;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    iget-object p1, p0, Lcom/daaw/kr5;->a:Lcom/daaw/qh4;

    invoke-virtual {p1}, Lcom/daaw/qh4;->h()Lcom/daaw/ei4;

    move-result-object p1

    return-object p1
.end method
