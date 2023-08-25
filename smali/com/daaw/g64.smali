.class public final synthetic Lcom/daaw/g64;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final synthetic a:Lcom/daaw/n64;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/n64;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/g64;->a:Lcom/daaw/n64;

    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Handler;Lcom/daaw/wy8;Lcom/daaw/fj8;Lcom/daaw/du8;Lcom/daaw/kq8;)[Lcom/daaw/i98;
    .locals 6

    iget-object v0, p0, Lcom/daaw/g64;->a:Lcom/daaw/n64;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/n64;->l0(Landroid/os/Handler;Lcom/daaw/wy8;Lcom/daaw/fj8;Lcom/daaw/du8;Lcom/daaw/kq8;)[Lcom/daaw/i98;

    move-result-object p1

    return-object p1
.end method
