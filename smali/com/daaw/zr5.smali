.class public final synthetic Lcom/daaw/zr5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ey6;


# instance fields
.field public final synthetic a:Lcom/daaw/aj4;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/aj4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/zr5;->a:Lcom/daaw/aj4;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    iget-object p1, p0, Lcom/daaw/zr5;->a:Lcom/daaw/aj4;

    invoke-virtual {p1}, Lcom/daaw/aj4;->h()Lcom/daaw/zi4;

    move-result-object p1

    return-object p1
.end method
