.class public final synthetic Lcom/daaw/z54;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/m36;


# instance fields
.field public final synthetic a:[B


# direct methods
.method public synthetic constructor <init>([B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/z54;->a:[B

    return-void
.end method


# virtual methods
.method public final zza()Lcom/daaw/p46;
    .locals 2

    iget-object v0, p0, Lcom/daaw/z54;->a:[B

    new-instance v1, Lcom/daaw/yy5;

    invoke-direct {v1, v0}, Lcom/daaw/yy5;-><init>([B)V

    return-object v1
.end method
